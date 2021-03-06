package nl.inergy.lineage;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.lineage.pentaho.Job;
import nl.inergy.lineage.sql.SQLParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pentaho.di.core.NotePadMeta;
import org.pentaho.di.core.exception.KettleDatabaseException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.job.JobHopMeta;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.job.entries.job.JobEntryJob;
import org.pentaho.di.job.entries.sql.JobEntrySQL;
import org.pentaho.di.job.entry.JobEntryBase;
import org.pentaho.di.job.entry.JobEntryCopy;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.stream.Stream;

// TODO: model logic for naming objects into model itself (jobMeta.getName() + "/" + entryJob.getName())

public class JobParser {

    private static final Logger logger = LogManager.getLogger(JobParser.class.getName());

    public static final String DOC_PREFIX = "[DOC]:";
    public static final String ETL_SUBDIR = "/etl/";
    public static final String FILE_URL_PREFIX = "file://";

    private final Backend backend;

    public JobParser(Backend backend) {
        this.backend = backend;
    }

    public void registerJobToBackend(File jobFile) throws KettleXMLException, JSQLParserException, URISyntaxException {
        String jobFileName = jobFile.toPath().toAbsolutePath().toString();
        logger.info(MessageFormat.format("opening file {0}", jobFileName));
        JobMeta jobMeta = new JobMeta(jobFileName, null, null);
        registerJobMetaToBackend(jobMeta);
    }

    private void registerJobMetaToBackend(JobMeta jobMeta) throws KettleXMLException, JSQLParserException, URISyntaxException {
        StringBuilder notes = new StringBuilder();
        for (NotePadMeta note : jobMeta.getNotes()) {
            if (note.getNote().toUpperCase(Locale.ROOT).startsWith(DOC_PREFIX)) {
                // remove [DOC]: prefix and trim
                notes.append(note.getNote().substring(DOC_PREFIX.length()).trim());
                notes.append("\n\n");
            }
        }
        JobEntryCopy start = jobMeta.getStart();
        registerStartWithNotes(jobMeta, start, notes.toString());
        for (JobEntryCopy jobEntryCopy : jobMeta.getJobCopies()) {
            Job job = new Job(jobMeta.getName() + "/" + jobEntryCopy.getName(), jobEntryCopy.getDescription(), jobEntryCopy.getEntry().getReferencedObjectDescriptions());
            if (jobEntryCopy.getEntry() instanceof JobEntrySQL) {
                JobEntrySQL entrySQL = (JobEntrySQL) jobEntryCopy.getEntry();
                copyJobMetaVariablesIntoEntryJobOurselves(jobMeta, entrySQL);
                copyJobMetaNameIntoVariablesOurselves(jobMeta, entrySQL);
                String sql = entrySQL.getSQL();
                try {
                    if (sql == null)
                        sql = entrySQL.buildSqlFromFile();
                    if (sql == null)
                        continue;
                }
                catch (KettleDatabaseException e) {
                    logger.error(MessageFormat.format("error reading SQL from file, context {0}", entrySQL.getParentJobMeta().getName()));
                    continue;
                }
                job.setSql(sql);
                registerSqlJobToBackend(job);
            }
            if (jobEntryCopy.getEntry() instanceof JobEntryJob) {
                JobEntryJob entryJob = (JobEntryJob) jobEntryCopy.getEntry();
                copyJobMetaVariablesIntoEntryJobOurselves(jobMeta, entryJob);
                copyParameterValuesIntoEntryJobOurselves(entryJob);
                if (Paths.get(new URI(entryJob.getRealFilename())).toFile().canRead()) {
                    logger.info(MessageFormat.format("sub job: opening file {0} for {1}", entryJob.getRealFilename(), entryJob.getName()));
                } else {
                    logger.error(MessageFormat.format("sub job: file {0} for {1} can not be read", entryJob.getRealFilename(), entryJob.getName()));
                    continue;
                }
                JobMeta subJobMeta = new JobMeta(entryJob.getRealFilename(), null);
                subJobMeta.setName(jobMeta.getName() + "/" + entryJob.getName());     // copy the name from the job and entry to the sub job metadata
                registerJobMetaToBackend(subJobMeta);
            }
        }
        for (JobHopMeta jobHopMeta : jobMeta.getJobhops()) {
            registerHopMetaToBackend(jobMeta, jobHopMeta);
        }
    }

    // why do we have to do this, and can't Kettle support this somehow?
    // note: .getParentVariableSpace() didn't work either
    private void copyJobMetaVariablesIntoEntryJobOurselves(JobMeta jobMeta, JobEntryBase entryJob) {
        for (String var : jobMeta.listVariables()) {
            String value = jobMeta.getVariable(var);
            entryJob.setVariable(var, value);
            // TODO: find a better solution to this hack
            if (var.equals("Internal.Job.Filename.Directory")) {
                entryJob.setVariable("project_root_dir",
                        value.substring(FILE_URL_PREFIX.length(), value.indexOf(ETL_SUBDIR)+ETL_SUBDIR.length()-1));
            }
        }
    }

    private void copyParameterValuesIntoEntryJobOurselves(JobEntryJob entryJob) {
        for (int i = 0; i < entryJob.parameters.length; i++) {
            String var = entryJob.parameters[i];
            String value = entryJob.parameterValues[i];
            entryJob.setVariable(var, value);
        }
    }

    private void copyJobMetaNameIntoVariablesOurselves(JobMeta jobMeta, JobEntrySQL entrySQL) {
        String lastPart = Stream.of(jobMeta.getName().split("/")).reduce((first, last)->last).get();
        entrySQL.setVariable("sql_script_name", lastPart);
    }

    private void registerHopMetaToBackend(JobMeta jobMeta, JobHopMeta jobHopMeta) {
        backend.registerStep(jobMeta.getName(),
                jobMeta.getName() + "/" + jobHopMeta.getFromEntry().getName());
        backend.registerStep(jobMeta.getName(),
                jobMeta.getName() + "/" + jobHopMeta.getToEntry().getName());
        backend.registerHop(jobMeta.getName(),
                jobMeta.getName() + "/" + jobHopMeta.getFromEntry().getName(),
                jobMeta.getName() + "/" + jobHopMeta.getToEntry().getName());
    }

    private void registerSqlJobToBackend(Job job) throws JSQLParserException {
        backend.registerSqlJob(job.getName(), job.getSql());
        SQLParser parser = new SQLParser(this.backend, job.getName());
        parser.registerSqlToBackend(job.getSql());
    }

    private void registerStartWithNotes(JobMeta jobMeta, JobEntryCopy start, String notes) {
        backend.registerStartWithNotes(jobMeta.getName(), jobMeta.getName() + "/" + start.getName(), notes);
    }
}

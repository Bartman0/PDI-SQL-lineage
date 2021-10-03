package nl.inergy.lineage;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.lineage.pentaho.Job;
import nl.inergy.lineage.sql.SQLParser;
import org.pentaho.di.core.NotePadMeta;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.job.JobHopMeta;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.job.entries.job.JobEntryJob;
import org.pentaho.di.job.entries.sql.JobEntrySQL;
import org.pentaho.di.job.entry.JobEntryCopy;
import java.io.File;
import java.util.Locale;

public class JobParser {

    public static final String DOC_PREFIX = "[DOC]:";

    private final Backend backend;
    private final File jobFile;

    public JobParser(Backend backend, File jobFile) {
        this.backend = backend;
        this.jobFile = jobFile;
    }

    public void registerJobToBackend() throws KettleXMLException, JSQLParserException {
        JobMeta jobMeta = new JobMeta(jobFile.getName(), null, null);
        registerJobMetaToBackend(jobMeta);
    }

    private void registerJobMetaToBackend(JobMeta jobMeta) throws KettleXMLException, JSQLParserException {
        StringBuilder notes = new StringBuilder();
        for (NotePadMeta note : jobMeta.getNotes()) {
            if (note.getNote().toUpperCase(Locale.ROOT).startsWith(DOC_PREFIX)) {
                // remove [DOC]: prefix and trim
                notes.append(note.getNote().substring(DOC_PREFIX.length()).trim());
                notes.append("\n\n");
            }
        }
        JobEntryCopy start = jobMeta.getStart();
        for (JobEntryCopy jobEntryCopy : jobMeta.getJobCopies()) {
            Job job = new Job(jobEntryCopy.getName(), jobEntryCopy.getDescription(), jobEntryCopy.getEntry().getReferencedObjectDescriptions());
            if (jobEntryCopy.getEntry() instanceof JobEntrySQL) {
                JobEntrySQL entrySQL = (JobEntrySQL) jobEntryCopy.getEntry();
                job.setSql(entrySQL.getSQL());
                registerSqlToBackend(entrySQL.getSQL());
            }
            if (jobEntryCopy.getEntry() instanceof JobEntryJob) {
                JobMeta subJobMeta = new JobMeta(jobEntryCopy.getEntry().getRealFilename(), null, null);
                registerJobMetaToBackend(subJobMeta);
            }
        }
        for (JobHopMeta hop : jobMeta.getJobhops()) {
            registerHopMetaToBackend(hop.getFromEntry().getName(), hop.getToEntry().getName());
        }
    }

    private void registerSqlToBackend(String sql) throws JSQLParserException {
        SQLParser parser = new SQLParser(backend, sql);
        parser.registerSqlToBackend();
    }

    private void registerHopMetaToBackend(String fromEntry, String toEntry) {
    }
}

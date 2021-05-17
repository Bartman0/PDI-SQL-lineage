package nl.inergy.lineage.pentaho;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.lineage.sql.SQLParser;
import org.apache.atlas.AtlasClientV2;
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

    private final AtlasClientV2 atlasClient;
    private final File jobFile;

    public JobParser(AtlasClientV2 atlasClient, File jobFile) {
        this.atlasClient = atlasClient;
        this.jobFile = jobFile;
    }

    public void registerJobToAtlas() throws KettleXMLException, JSQLParserException {
        JobMeta jobMeta = new JobMeta(jobFile.getName(), null, null);
        registerJobMetaToAtlas(jobMeta);
    }

    private void registerJobMetaToAtlas(JobMeta jobMeta) throws KettleXMLException, JSQLParserException {
        StringBuilder notes = new StringBuilder();
        for (NotePadMeta note : jobMeta.getNotes()) {
            if (note.getNote().toUpperCase(Locale.ROOT).startsWith(DOC_PREFIX)) {
                // remove [DOC]: prefix and trim
                notes.append(note.getNote().substring(DOC_PREFIX.length()).trim());
                notes.append("\n\n");
            }
        }
        JobEntryCopy start = jobMeta.getStart();
        for (JobEntryCopy job : jobMeta.getJobCopies()) {
            Job atlasJob = new Job(job.getName(), job.getDescription(), job.getEntry().getReferencedObjectDescriptions());
            if (job.getEntry() instanceof JobEntrySQL) {
                JobEntrySQL entrySQL = (JobEntrySQL) job.getEntry();
                atlasJob.setSql(entrySQL.getSQL());
                registerSqlToAtlas(entrySQL.getSQL());
            }
            if (job.getEntry() instanceof JobEntryJob) {
                JobMeta subJobMeta = new JobMeta(job.getEntry().getRealFilename(), null, null);
                registerJobMetaToAtlas(subJobMeta);
            }
        }
        for (JobHopMeta hop : jobMeta.getJobhops()) {
            registerHopMetaToAtlas(hop.getFromEntry().getName(), hop.getToEntry().getName());
        }
    }

    private void registerSqlToAtlas(String sql) throws JSQLParserException {
        SQLParser parser = new SQLParser(atlasClient, sql);
        parser.registerSqlToAtlas();
    }

    private void registerHopMetaToAtlas(String fromEntry, String toEntry) {
    }
}

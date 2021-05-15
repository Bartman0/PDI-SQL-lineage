package nl.inergy.lineage.pentaho;

import org.apache.atlas.AtlasClientV2;
import org.pentaho.di.core.NotePadMeta;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.job.JobHopMeta;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.job.entry.JobEntryCopy;
import java.io.File;
import java.util.Locale;

import static nl.inergy.test.tools.Tools.print;

public class JobParser {
    private final AtlasClientV2 atlasClient;

    public JobParser(AtlasClientV2 atlasClient, File jobFile) throws KettleXMLException {
        this.atlasClient = atlasClient;

        JobMeta jobMeta = new JobMeta(jobFile.getName(), null, null);
        for (NotePadMeta note : jobMeta.getNotes()) {
            if (note.getNote().toUpperCase(Locale.ROOT).startsWith("METADATA:"))
                print(note.getNote());
        }
        JobEntryCopy start = jobMeta.getStart();
        for (JobEntryCopy job : jobMeta.getJobCopies()) {
            print(job.getName());
            print(job.getDescription());
            print(job.getEntry().getReferencedObjectDescriptions());
        }
        for (JobHopMeta hop : jobMeta.getJobhops()) {
            print(hop.getFromEntry().getName() + " --> " + hop.getToEntry().getName());
        }
    }
}

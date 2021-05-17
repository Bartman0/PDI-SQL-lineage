package nl.inergy;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.atlas.Factory;
import nl.inergy.lineage.pentaho.JobParser;
import org.apache.atlas.AtlasClientV2;
import org.apache.atlas.AtlasServiceException;
import org.pentaho.di.core.KettleClientEnvironment;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleXMLException;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@Command(name = "lineage", mixinStandardHelpOptions = true, version = "1.0",
        description = "processes Pentaho jobs and included SQL scripts to build up a data lineage in Apache Atlas/Purview")
public class Lineage implements Runnable {

    @Option(names = {"-s", "--server"}, description = "url of the Apache Atlas/Purview server")
    URL url = new URL("http://localhost:21000");

    @Option(names = {"-u", "--username"}, description = "user name for the Apache Atlas/Purview server")
    String username = "admin";

    @Option(names = {"-P", "--passwd"}, description = "password for the Apache Atlas/Purview server")
    String password = "admin";

    @Parameters(index = "0..*", description = "the files of Pentaho jobs that need to be processed")
    private List<File> jobs = new ArrayList<>();

    public Lineage() throws MalformedURLException {
    }

    public static void main(String[] args) throws MalformedURLException {
        int exitCode = new CommandLine(new Lineage()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        if (jobs.isEmpty()) {
            System.err.println("no job files specified, exiting...");
            System.exit(1);
        }

        AtlasClientV2 atlasClient = initAtlas(url, username, password);
        initKettle();

        jobs.forEach(job -> {
            try {
                final JobParser jobParser = new JobParser(atlasClient, job);
                jobParser.registerJobToAtlas();
            } catch (KettleXMLException | JSQLParserException e) {
                e.printStackTrace();
            }
        });
    }

    private AtlasClientV2 initAtlas(URL url, String username, String password) {
        Factory factory = new Factory();
        AtlasClientV2 client = factory.getClient(new String[]{url.toString()}, new String[]{username, password});
        try {
            client.createAtlasTypeDefs(factory.getTypes());
        } catch (AtlasServiceException e) {
            e.printStackTrace();
        }
        return client;
    }

    private void initKettle() {
        try {
            KettleClientEnvironment.getInstance().setClient(KettleClientEnvironment.ClientType.OTHER);
            KettleEnvironment.init();
        } catch (KettleException e) {
            e.printStackTrace();
        }
    }
}

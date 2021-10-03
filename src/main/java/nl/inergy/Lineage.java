package nl.inergy;

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
        description = "processes Pentaho jobs and included SQL scripts to build up a data lineage in a backend")
public class Lineage {

    @Option(names = {"-s", "--server"}, description = "url of the Apache Atlas/Purview server")
    protected
    URL url = new URL("http://localhost:21000");

    @Option(names = {"-u", "--username"}, description = "user name for the Apache Atlas/Purview server")
    protected
    String username = "admin";

    @Option(names = {"-P", "--passwd"}, description = "password for the Apache Atlas/Purview server")
    protected
    String password = "admin";

    @Parameters(index = "0..*", description = "the files of Pentaho jobs that need to be processed")
    protected
    List<File> jobs = new ArrayList<>();

    public Lineage() throws MalformedURLException {
    }

    public static void main(String[] args) throws MalformedURLException {
        int exitCode = new CommandLine(new Lineage()).execute(args);
        System.exit(exitCode);
    }
}

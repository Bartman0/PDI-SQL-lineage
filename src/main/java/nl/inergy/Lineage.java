package nl.inergy;

import picocli.CommandLine;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@CommandLine.Command(name = "lineage", mixinStandardHelpOptions = true, version = "1.0",
        description = "processes Pentaho jobs and included SQL scripts to build up a data lineage in a backend")
public class Lineage {

    @CommandLine.Option(names = {"-s", "--server"}, description = "url of the backend server")
    public String url = "http://localhost:21000";

    @CommandLine.Option(names = {"-u", "--username"}, description = "user name for the backend server")
    public String username = "admin";

    @CommandLine.Option(names = {"-P", "--passwd"}, description = "password for the backend server")
    public String password = "admin";

    @CommandLine.Option(names = {"-b", "--backend"}, defaultValue = "neo4j", description = "backend server to use: ${COMPLETION-CANDIDATES}")
    public BackendOption backend = BackendOption.neo4j;

    @CommandLine.Parameters(index = "0..*", description = "the files of Pentaho jobs that need to be processed")
    public List<File> jobs = new ArrayList<>();
}

package nl.inergy;

import nl.inergy.lineage.backend.Atlas;
import nl.inergy.lineage.backend.Neo4j;
import picocli.CommandLine;
import java.net.MalformedURLException;

import static nl.inergy.utils.Kettle.initKettle;


public class Main {

    public static void main(String[] args) throws MalformedURLException {
        int exitCode;

        Lineage lineage = new Lineage();
        new CommandLine(lineage).parseArgs(args);

        initKettle();

        if (lineage.jobs.isEmpty()) {
            System.err.println("no job files specified, exiting...");
            System.exit(1);
        }

        switch (lineage.backend) {
            case neo4j:
                exitCode = new CommandLine(new Neo4j()).execute(args);
                break;
            case atlas:
                exitCode = new CommandLine(new Atlas()).execute(args);
                break;
            default:
                exitCode = -1;
                break;
        }
        System.exit(exitCode);
    }
}

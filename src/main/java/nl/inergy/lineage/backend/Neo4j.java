package nl.inergy.lineage.backend;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.lineage.Backend;
import nl.inergy.lineage.JobParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.pentaho.di.core.exception.KettleXMLException;
import java.net.URL;

import static nl.inergy.utils.Kettle.initKettle;


public class Neo4j extends Backend {

    private static final Logger logger = LogManager.getLogger(Neo4j.class.getName());

    private Driver driver;

    @Override
    public void run() {
        if (jobs.isEmpty()) {
            System.err.println("no job files specified, exiting...");
            System.exit(1);
        }

        driver = init(url, username, password);
        initKettle();

        jobs.forEach(job -> {
            try {
                JobParser jobParser = new JobParser(this, job);
                jobParser.registerJobToBackend();
            } catch (KettleXMLException | JSQLParserException e) {
                e.printStackTrace();
            }
        });
    }

    private Driver init(URL url, String username, String password) {
        Driver client = getClient(url.toString(), username, password);
        // TODO initialize types?
        return client;
    }

    public Driver getClient(String uri, String username, String password) {
        if (driver == null) {
            driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password));
        }
        return driver;
    }
}

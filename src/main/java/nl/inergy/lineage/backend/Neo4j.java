package nl.inergy.lineage.backend;

import net.sf.jsqlparser.JSQLParserException;
import nl.inergy.lineage.Backend;
import nl.inergy.lineage.JobParser;
import nl.inergy.metadata.Relationships;
import nl.inergy.metadata.TypeDefs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import org.pentaho.di.core.exception.KettleXMLException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;

import static org.neo4j.driver.Values.parameters;


public class Neo4j extends Backend {

    private static final Logger logger = LogManager.getLogger(Neo4j.class.getName());

    private Driver driver;

    public Neo4j() throws MalformedURLException {
    }

    @Override
    public void run() {
        driver = init(url, username, password);

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

    public void registerTableDependencies(String jobName, HashMap<String, List<String>> tableTargetDependencies) {
        // TODO: relate tables to source tables, and make part of job
        tableTargetDependencies.forEach((target, sources) -> registerTargetAndSources(target, sources));
    }

    private void registerTargetAndSources(String target, List<String> sources) {
        try (Session session = driver.session()) {
            session.writeTransaction(createTable(target));
            sources.forEach((source) -> session.writeTransaction(createTable(source)));
            sources.forEach((source) -> session.writeTransaction(createTableSourceRelation(target, source)));
        }
    }

    private TransactionWork<String> createTableSourceRelation(String target, String source) {
        return tx -> {
            String query = MessageFormat.format("MERGE (t:{} {name:$target}), " +
                    "(s:{} {name:$source}) " +
                    "MERGE (t)-[r:{}]->(s) " +
                    "RETURN id(r)", TypeDefs.TABLE, TypeDefs.TABLE, Relationships.SOURCES_FROM);
            Result result = tx.run(query, parameters("target", target, "source", source));
            logger.info(MessageFormat.format("registered relation from target {}, id: {}", target, result.single().get(0).asString()));
            return result.single().get( 0 ).asString();
        };
    }

    private TransactionWork<String> createTable(String target) {
        return tx -> {
            String query = MessageFormat.format("MERGE (t:{} {name: $name}) " +
                    "ON CREATE SET t.name = $name " +
                    "RETURN id(t)", TypeDefs.TABLE);
            Result result = tx.run(query, parameters("name", target));
            logger.info(MessageFormat.format("registered table target {}, id: {}", target, result.single().get(0).asString()));
            return result.single().get( 0 ).asString();
        };
    }

    public void registerHop(String jobName, String from, String to) {
        // TODO: relate hop to job
    }

    public void registerStartWithNotes(String jobName, String startName, String notes) {
        // TODO: relate start to job
    }

    public void registerSqlJob(String jobName, String sql) {
        // TODO: register job with complete sql
    }
}

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
        tableTargetDependencies.forEach((target, sources) -> registerTargetAndSources(target, sources));
    }

    private void registerTargetAndSources(String target, List<String> sources) {
        try (Session session = driver.session()) {
            session.writeTransaction(createTable(target));
            sources.forEach((source) -> session.writeTransaction(createTable(source)));
            sources.forEach((source) -> session.writeTransaction(createTargetSourceRelation(target, source)));
        }
    }

    private TransactionWork<String> createTargetSourceRelation(String target, String source) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (t:{} {name:$target}), " +
                    "(s:{} {name:$source}) " +
                    "MERGE (t)-[r:{}]->(s) " +
                    "RETURN id(r)", TypeDefs.TABLE, TypeDefs.TABLE, Relationships.SOURCES_FROM);
            Result result = tx.run(query, parameters("target", target, "source", source));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered relation from target {}, id: {}", target, id));
            return id;
        };
    }

    private TransactionWork<String> createTable(String target) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (t:{} {name: $name}) " +
                    "RETURN id(t)", TypeDefs.TABLE);
            Result result = tx.run(query, parameters("name", target));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered table target {}, id: {}", target, id));
            return id;
        };
    }

    public void registerHop(String jobName, String from, String to) {
        // TODO: relate hop to job
        try (Session session = driver.session()) {
            session.writeTransaction(createHop(jobName, from, to));
            session.writeTransaction(createJobHopRelation(jobName, from));
            session.writeTransaction(createJobHopRelation(jobName, to));
        }
    }

    public void registerStartWithNotes(String jobName, String startName, String notes) {
        try (Session session = driver.session()) {
            session.writeTransaction(createJobWithNotes(jobName, notes));
            session.writeTransaction(createStartWithNotes(startName, notes));
            session.writeTransaction(createJobStartRelation(jobName, startName));
        }
    }

    private TransactionWork<String> createJobWithNotes(String jobName, String notes) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (j:{} {name: $name}) " +
                            "ON CREATE SET j.notes = $notes " +
                            "RETURN id(j)", TypeDefs.PENTAHO_JOB);
            Result result = tx.run(query, parameters("name", jobName, "notes", notes));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered job {}, id: {}", jobName, id));
            return id;
        };
    }

    private TransactionWork<String> createStartWithNotes(String startName, String notes) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (s:{} {name: $name}) " +
                            "ON CREATE SET s.notes = $notes " +
                            "RETURN id(s)", TypeDefs.PENTAHO_START);
            Result result = tx.run(query, parameters("name", startName, "notes", notes));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered start node {}, id: {}", startName, id));
            return id;
        };
    }

    private TransactionWork<String> createJobStartRelation(String jobName, String startName) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (j:{} {name:$job}), " +
                            "(s:{} {name:$start}) " +
                            "MERGE (s)-[r:{}]->(j) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, TypeDefs.PENTAHO_START, Relationships.PART_OF);
            Result result = tx.run(query, parameters("job", jobName, "start", startName));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered relation from start {} to {}, id: {}", startName, jobName, id));
            return id;
        };
    }

    public void registerSqlJob(String jobName, String sql) {
        try (Session session = driver.session()) {
            session.writeTransaction(createSqlJob(jobName, sql));
        }
    }

    public TransactionWork<String> createSqlJob(String jobName, String sql) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (j:{} {name: $name}) " +
                            "ON CREATE SET j.sql = $sql " +
                            "RETURN id(j)", TypeDefs.SQL_JOB);
            Result result = tx.run(query, parameters("name", jobName, "sql", sql));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered sql job {}, id: {}", jobName, id));
            return id;
        };
    }

    private TransactionWork<String> createHop(String jobName, String from, String to) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (f:{} {name:$from}), " +
                            "(t:{} {name:$to}) " +
                            "MERGE (f)-[r:{}]->(t) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, TypeDefs.PENTAHO_JOB, Relationships.HOPS_TO);
            Result result = tx.run(query, parameters("job", jobName, "from", from, "to", to));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered relation from {} to {}, id: {}", from, to, id));
            return id;
        };
    }

    private TransactionWork<String> createJobHopRelation(String jobName, String hop) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (j:{} {name:$job}), " +
                            "(h:{} {name:$hop}) " +
                            "MERGE (h)-[r:{}]->(j) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, TypeDefs.PENTAHO_HOP, Relationships.PART_OF);
            Result result = tx.run(query, parameters("job", jobName, "hop", hop));
            String id = result.single().get(0).asString();
            logger.info(MessageFormat.format("registered relation from hop {} to {}, id: {}", hop, jobName, id));
            return id;
        };
    }
}

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
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;

import static org.neo4j.driver.Values.parameters;


public class Neo4j extends Backend {

    private static final Logger logger = LogManager.getLogger(Neo4j.class.getName());

    private Driver driver;

    @Override
    public void run() {
        driver = init(url, username, password);

        jobs.forEach(job -> {
            try {
                JobParser jobParser = new JobParser(this);
                jobParser.registerJobToBackend(job);
            } catch (KettleXMLException | JSQLParserException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
    }

    private Driver init(String url, String username, String password) {
        return getClient(url, username, password);
    }

    public Driver getClient(String uri, String username, String password) {
        if (driver == null) {
            driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password));
        }
        return driver;
    }

    public void registerTableDependencies(String jobName, HashMap<String, List<String>> tableTargetDependencies) {
        tableTargetDependencies.forEach((target, sources) -> registerTargetAndSources(jobName, target, sources));
    }

    private void registerTargetAndSources(String jobName, String target, List<String> sources) {
        try (Session session = driver.session()) {
            session.writeTransaction(createTable(target));
            session.writeTransaction(createJobTableRelation(jobName, target));
            sources.forEach(source -> session.writeTransaction(createTable(source)));
            sources.forEach(source -> session.writeTransaction(createJobTableRelation(jobName, source)));
            sources.forEach(source -> session.writeTransaction(createTargetSourceRelation(target, source)));
        }
    }

    private TransactionWork<String> createTargetSourceRelation(String target, String source) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (t:{0} '{name:$target}'), " +
                    "(s:{0} '{name:$source}') " +
                    "MERGE (t)-[r:{1}]->(s) " +
                    "RETURN id(r)", TypeDefs.TABLE, Relationships.SOURCES_FROM);
            Result result = tx.run(query, parameters("target", target, "source", source));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered relation from target {0} to source {1}, id: {2}", target, source, id));
            return id;
        };
    }

    private TransactionWork<String> createTable(String table) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (t:{0} '{name: $name}') " +
                    "RETURN id(t)", TypeDefs.TABLE);
            Result result = tx.run(query, parameters("name", table));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered table target {0}, id: {1}", table, id));
            return id;
        };
    }

    private TransactionWork<String> createJobTableRelation(String jobName, String tableName) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (j:{0} '{name:$job}'), " +
                            "(t:{1} '{name:$table}') " +
                            "MERGE (t)-[r:{2}]->(j) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, TypeDefs.TABLE, Relationships.PART_OF);
            Result result = tx.run(query, parameters("job", jobName, "table", tableName));
            logger.info(MessageFormat.format("registered relation from table {0} to {1}", tableName, jobName));
            String id = String.valueOf(result.single().get(0));
            return id;
        };
    }

    public void registerStep(String jobName, String step) {
        try (Session session = driver.session()) {
            session.writeTransaction(createStep(step));
        }
    }

    public TransactionWork<String> createStep(String step) {
        return tx -> {
            // hack to resolve type to either job or start based on name
            String type = TypeDefs.PENTAHO_JOB;
            if (step.endsWith("START")) {
                type = TypeDefs.PENTAHO_START;
            }
            String query = MessageFormat.format(
                    "MERGE (s:{0} '{name: $name}') " +
                            "RETURN id(s)", type);
            Result result = tx.run(query, parameters("name", step));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered hop step {0}, id: {1}", step, id));
            return id;
        };
    }

    public void registerHop(String jobName, String from, String to) {
        try (Session session = driver.session()) {
            session.writeTransaction(createJobStepRelation(jobName, from));
            session.writeTransaction(createJobStepRelation(jobName, to));
            session.writeTransaction(createHop(from, to));
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
                    "MERGE (j:{0} '{name: $name}') " +
                            "ON CREATE SET j.notes = $notes " +
                            "RETURN id(j)", TypeDefs.PENTAHO_JOB);
            Result result = tx.run(query, parameters("name", jobName, "notes", notes));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered job {0}, id: {1}", jobName, id));
            return id;
        };
    }

    private TransactionWork<String> createStartWithNotes(String startName, String notes) {
        return tx -> {
            String query = MessageFormat.format(
                    "MERGE (s:{0} '{name: $name}') " +
                            "ON CREATE SET s.notes = $notes " +
                            "RETURN id(s)", TypeDefs.PENTAHO_START);
            Result result = tx.run(query, parameters("name", startName, "notes", notes));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered start node {0}, id: {1}", startName, id));
            return id;
        };
    }

    private TransactionWork<String> createJobStartRelation(String jobName, String startName) {
        return tx -> {
            String query = MessageFormat.format(
                    "MATCH (j:{0} '{name:$job}'), " +
                            "(s:{1} '{name:$start}') " +
                            "MERGE (s)-[r:{2}]->(j) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, TypeDefs.PENTAHO_START, Relationships.PART_OF);
            Result result = tx.run(query, parameters("job", jobName, "start", startName));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered relation from start {0} to {1}, id: {2}", startName, jobName, id));
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
                    "MERGE (j:{0} '{name: $name}') " +
                            "ON CREATE SET j.sql = $sql " +
                            "RETURN id(j)", TypeDefs.PENTAHO_JOB);
            Result result = tx.run(query, parameters("name", jobName, "sql", sql));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered sql job {0}, id: {1}", jobName, id));
            return id;
        };
    }

    private TransactionWork<String> createHop(String from, String to) {
        return tx -> {
            // hack to resolve type to either job or start based on name
            String type = TypeDefs.PENTAHO_JOB;
            if (from.endsWith("START")) {
                type = TypeDefs.PENTAHO_START;
            }
            String query = MessageFormat.format(
                    "MATCH (f:{0} '{name:$from}'), " +
                            "(t:{1} '{name:$to}') " +
                            "MERGE (f)-[r:{2}]->(t) " +
                            "RETURN id(r)", type, TypeDefs.PENTAHO_JOB, Relationships.HOPS_TO);
            Result result = tx.run(query, parameters("from", from, "to", to));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered relation from {0} to {1}, id: {2}", from, to, id));
            return id;
        };
    }

    private TransactionWork<String> createJobStepRelation(String jobName, String step) {
        return tx -> {
            // hack to resolve type to either job or start based on name
            String type = TypeDefs.PENTAHO_JOB;
            if (step.endsWith("START")) {
                type = TypeDefs.PENTAHO_START;
            }
            String query = MessageFormat.format(
                    "MATCH (j:{0} '{name:$job}'), " +
                            "(s:{1} '{name:$step}') " +
                            "MERGE (h)-[r:{2}]->(j) " +
                            "RETURN id(r)", TypeDefs.PENTAHO_JOB, type, Relationships.PART_OF);
            Result result = tx.run(query, parameters("job", jobName, "step", step));
            String id = String.valueOf(result.single().get(0));
            logger.info(MessageFormat.format("registered relation from hop {0} to {1}, id: {2}", step, jobName, id));
            return id;
        };
    }
}

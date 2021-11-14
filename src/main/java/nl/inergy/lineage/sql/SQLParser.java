package nl.inergy.lineage.sql;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statements;
import nl.inergy.lineage.Backend;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SQLParser {
    private final Backend backend;
    private final String jobName;
    private final HashMap<String, Set<String>> tableTargetDependencies = new HashMap<>();

    public SQLParser(Backend backend, String jobName) {
        this.backend = backend;
        this.jobName = jobName;
    }

    public void registerSqlToBackend(String sql) throws JSQLParserException {
        Statements parsedStatements = CCJSqlParserUtil.parseStatements(sql);
        Collections.unmodifiableList(parsedStatements.getStatements()).stream()
                .map(TableDependency::new)
                .filter(tableDependency -> tableDependency.getTarget() != null)
                .forEach(tableDependency -> {
                    Set<String> oldSources = tableTargetDependencies.putIfAbsent(tableDependency.getTarget(), tableDependency.getSources());
                    // if the old sources is null, we are done; if not, extend the set of old sources with the new ones and register that result
                    if (oldSources != null) {
                        oldSources.addAll(tableDependency.getSources());
                        tableTargetDependencies.put(tableDependency.getTarget(), oldSources);
                    }
                });
        backend.registerTableDependencies(jobName, tableTargetDependencies);
    }
}

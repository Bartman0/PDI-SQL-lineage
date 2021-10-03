package nl.inergy.lineage.sql;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statements;
import nl.inergy.lineage.Backend;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SQLParser {
    private final Backend backend;
    private final String sql;
    private final HashMap<String, List<String>> tableTargetDependencies = new HashMap<>();

    public SQLParser(Backend backend, String sql) {
        this.backend = backend;
        this.sql = sql;
    }

    public void registerSqlToBackend() throws JSQLParserException {
        Statements parsedStatements = CCJSqlParserUtil.parseStatements(sql);
        Collections.unmodifiableList(parsedStatements.getStatements()).stream()
                .map(TableDependency::new)
                .forEach(tableDependency -> tableTargetDependencies.put(tableDependency.getTarget(), tableDependency.getSources()));
    }
}

package nl.inergy.lineage.sql;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.Statements;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SQLParser {

    private final String sql;
    private final HashMap<String, List<String>> tableTargetDependencies = new HashMap<>();

    public SQLParser(String sql) throws JSQLParserException {
        this.sql = sql;

        Statements parsedStatements = CCJSqlParserUtil.parseStatements(sql);
        for (Statement statement : Collections.unmodifiableList(parsedStatements.getStatements())) {
            TableDependency tableDependency = new TableDependency(statement);
            tableTargetDependencies.put(tableDependency.getTarget(), tableDependency.getSources());
        }
    }
}

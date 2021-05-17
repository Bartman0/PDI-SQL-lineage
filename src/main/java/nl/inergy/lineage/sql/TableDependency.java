package nl.inergy.lineage.sql;

import net.sf.jsqlparser.statement.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableDependency {
    private final Statement statement;
    private String target = null;
    private final List<String> sources = new ArrayList<>();

    public TableDependency(Statement statement) {
        this.statement = statement;
        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        // TODO will this work, or is more intelligence needed that parses out the type of statement?
        // assume the first table is the target
        target = tableList.get(0);
        sources.addAll(tableList.subList(1, tableList.size()));
    }

    public String getTarget() {
        return target;
    }

    public List<String> getSources() {
        return sources;
    }
}

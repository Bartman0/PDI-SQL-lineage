package nl.inergy.lineage.sql;

import net.sf.jsqlparser.statement.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TableDependency {
    private final Statement statement;
    private String target = null;
    private final List<String> sources = new ArrayList<>();

    public TableDependency(Statement statement) {
        this.statement = statement;
        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        if (tableList.size() > 0) {
            // make all table names lowercase
            tableList = tableList.stream().map(TableDependency::mapTableNameToLowerCase).collect(Collectors.toList());
            // assume the first table is the target
            target = tableList.get(0);
            sources.addAll(tableList.subList(1, tableList.size()));
        }
    }

    static private String mapTableNameToLowerCase(String tableName) {
        String tableNameLowerCase = tableName.toLowerCase(Locale.ROOT);
        // if the name starts with a letter, return the lowercase version
        if (tableNameLowerCase.charAt(0) >= 'a' && tableNameLowerCase.charAt(0) <= 'z')
            return tableNameLowerCase;
        // if not, return the name as-is
        return tableName;
    }

    public String getTarget() {
        return target;
    }

    public List<String> getSources() {
        return sources;
    }
}

package nl.inergy.lineage.pentaho;

public class Job {
    private final String name;
    private final String description;
    private final String[] referencedObjectDescriptions;
    private String sql;

    public Job(String name, String description, String[] referencedObjectDescriptions) {
        this.name = name;
        this.description = description;
        this.referencedObjectDescriptions = referencedObjectDescriptions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return this.sql;
    }
}

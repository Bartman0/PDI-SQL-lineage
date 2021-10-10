package nl.inergy.lineage.pentaho;

public class Job {
    String name;
    String description;
    String[] referencedObjectDescriptions;
    String sql;

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

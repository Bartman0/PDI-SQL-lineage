package nl.inergy.lineage.pentaho;

public class Job {
    String name;
    String description;
    String[] referencedObjectDescriptions;

    public Job(String name, String description, String[] referencedObjectDescriptions) {
        this.name = name;
        this.description = description;
        this.referencedObjectDescriptions = referencedObjectDescriptions;
    }
}

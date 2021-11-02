package nl.inergy.lineage;

import nl.inergy.Lineage;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

// TODO: make abstract class and methods or interface
public class Backend extends Lineage implements Runnable {

    @Override
    public void run() {
        // do nothing
    }

    public void registerTableDependencies(String jobName, HashMap<String, List<String>> tableTargetDependencies) {
        // do nothing
    }

    public void registerStep(String jobName, String step) {
        // do nothing
    }

    public void registerHop(String jobName, String from, String to) {
        // do nothing
    }

    public void registerStartWithNotes(String jobName, String name, String notes) {
        // do nothing
    }

    public void registerSqlJob(String jobName, String sql) {
        // do nothing
    }
}

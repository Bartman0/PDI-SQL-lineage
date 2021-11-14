package nl.inergy.utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * @author Lukas Eder
 */
public class Tools {

    static Properties properties;
    static Connection connection;

    /**
     * Get a fresh connection
     */
    public static Connection connection() {
        if (connection == null) {
            try {
                Class.forName(driver());

                connection = DriverManager.getConnection(
                        url(),
                        username(),
                        password());
                connection.setAutoCommit(false);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return connection;
    }

    public static String driver() {
        return properties().getProperty("db.driver");
    }

    public static String url() {
        return properties().getProperty("db.url");
    }

    public static String username() {
        return properties().getProperty("db.username");
    }

    public static String password() {
        return properties().getProperty("db.password");
    }

    /**
     * Get the connection properties
     */
    public static Properties properties() {
        if (properties == null) {
            try {
                properties = new Properties();
                properties.load(new FileReader("src/main/resources/config.properties"));
//                TODO: waarom werkt dit niet?
//                properties.load(Tools.class.getResourceAsStream("/config.properties"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return properties;
    }

    /**
     * Some pretty printing
     */
    public static void title(String title) {
        String dashes = "=============================================================================================";

        System.out.println();
        System.out.println(title);
        System.out.println(dashes);
        System.out.println();
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}

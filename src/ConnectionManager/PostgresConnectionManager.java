package ConnectionManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by admin on 19-09-2017.
 */
public class PostgresConnectionManager {
    static String connectionString = null;
    static String username = null;
    static String password = null;

    static {
        String filepath = "src" + File.separator + "config.properties";
        InputStream input = null;
        Properties prop = new Properties();
        try {
            input = new FileInputStream(filepath);
            prop.load(input);
            String host = prop.getProperty("host");
            String port = prop.getProperty("port");
            String db = prop.getProperty("database");
             username = prop.getProperty("username");
             password = prop.getProperty("password");
             connectionString = getConnectionString(host, port, db);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getConnectionString(String host, String port, String database) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jdbc:postgresql://");
        stringBuilder.append(host);
        stringBuilder.append(":");
        stringBuilder.append(port);
        stringBuilder.append("/");
        stringBuilder.append(database);
        return stringBuilder.toString();
    }

    public static Connection getPostgresConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(connectionString, username, password);
            return connection;

        } catch (ClassNotFoundException cnfException) {
            System.out.println(cnfException.getMessage());
            cnfException.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

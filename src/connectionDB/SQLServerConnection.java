package connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=dbDoAnJava";
    private static final String username = "sa";
    private static final String password = "kaka3135134162";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

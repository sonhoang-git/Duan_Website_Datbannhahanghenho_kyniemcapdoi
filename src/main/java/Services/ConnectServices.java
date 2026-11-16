package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectServices {
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=RomanticDiningStore" +
            ";encrypt=true;trustServerCertificate=true";

    private final String USER = "sa";

    private final String PASSWORD = "123";

    public ConnectServices() {
    }

    public Connection myConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQL Server JDBC driver not found", e);
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

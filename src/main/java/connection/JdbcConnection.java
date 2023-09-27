package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    public JdbcConnection() {}

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "932305878");
    }

}

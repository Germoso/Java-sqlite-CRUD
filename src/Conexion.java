import java.sql.*;

public class Conexion {
    Connection connection = null;
    public Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:CRUD.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
    }
}

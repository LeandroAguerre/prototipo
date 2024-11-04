import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection cx = null;
    public Connection conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            cx = DriverManager.getConnection("jdbc:sqlite:baseDeDatos.db");
            System.out.println("conexion exitosa");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cx;
    }
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

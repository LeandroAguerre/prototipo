import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioCrud {
    private final Conexion conexion = new Conexion();

    public void crearUsuario(Usuario usuario){
        String sql ="INSERT INTO usuarios(nombre, apellido, valorA, valorB, valor C) VALUES(?,?,?,?,?)";

        try {
            Connection conn = conexion.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,usuario.getNombre());
            pstm.setString(2,usuario.getApellido());
            pstm.setInt(3,usuario.getValorA());
            pstm.setInt(4,usuario.getValorB());
            pstm.setInt(5,usuario.getValorC());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Usuario leerUsuario(int id){
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        Usuario usuario = null;
        try {
            Connection conn = conexion.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()){
                usuario = new Usuario(rs.getString("nombre"),rs.getString("apellido"),rs.getInt("valorA"),rs.getInt("valorB"),rs.getInt("getC"));
                usuario.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return usuario;

    }



}

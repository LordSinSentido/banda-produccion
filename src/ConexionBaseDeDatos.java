
import java.sql.*;

public class ConexionBaseDeDatos {
    Connection conexion = null;
    
    public Connection conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:produccion.db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return conexion;
    }
}
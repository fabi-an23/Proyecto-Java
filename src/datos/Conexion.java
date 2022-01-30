package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @fabian
 * 23-01-2022
 */
public class Conexion {

    private static String bd = "cervezasquilter";
    private static String login = "root";
    private static String pass = "";

    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    public static Connection con = null;
    public static Statement sentencia;
    
    public static boolean listarProductos;
    public static boolean buscarUsuario;
    
    public static Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, login, pass);
            if (con != null) {
                System.out.println("Conexion establecida con " + bd);
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al conectar");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return con;
    }    

    public static void desconectar() throws SQLException {
        con.close();
    }

}

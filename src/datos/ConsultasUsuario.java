package datos;

import interfaz.JIFrame_Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author Fabian
 * 23-01-2022
 */
public class ConsultasUsuario extends Conexion {

    public boolean registrar(Usuario usuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO usuario (rutUsuario, nombreUsuario, password, email, telefono, direccion) values(?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getRun());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getEmail());
            ps.setInt(5, usuario.getTelefono());
            ps.setString(6, usuario.getDireccion());
            ps.execute();
            System.out.println("Usuario creado con exito");
            return true;
        } catch (SQLException e) {
            //imprimimos el error
            System.out.println("Error al crear usuario");
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("aqui3");
            } catch (SQLException e) {
                System.err.println(e);
            }

        }
    }

    public boolean buscarRut(String run) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from usuario where rutUsuario = ?";
        Usuario us = new Usuario();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, run);
            rs = ps.executeQuery(); // Query para que asi me devuelva el resultado
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            //imprimimos el error
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }

        }

    }

    public Usuario buscarDatos(String run) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from usuario where rutUsuario = ?";
        Usuario us = new Usuario();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, run);
            rs = ps.executeQuery(); // Query para que asi me devuelva el resultado
            System.out.println("Se ejecutó consulta para buscar datos de usuario.");
            if (rs.next()) {
                us.setRun(rs.getString(1));
                us.setNombre(rs.getString(2));
                us.setPassword(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setTelefono(Integer.parseInt(rs.getString(5)));
                us.setDireccion(rs.getString(6));
                System.out.println("Busqueda de datos exitosa.");
            }
            con.close();
            return us;
        } catch (Exception e) {
            System.out.println("Error al buscar los datos.");
            System.out.println(e);
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
        
    }

    public boolean validarLogin(String user, String pass) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from usuario where rutUsuario = ? and password = ?";
        Usuario us = new Usuario();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery(); // Query para que asi me devuelva el resultado
            System.out.println("Consulta Login ejecutada");
            if (rs.next()) {
                us.setRun(rs.getString("rutUsuario"));
                us.setNombre(rs.getString("nombreUsuario"));
                us.setPassword(rs.getString("password"));
                us.setEmail(rs.getString("email"));
                us.setTelefono(Integer.parseInt(rs.getString("telefono")));
                us.setDireccion(rs.getString("direccion"));
                System.out.println("Credenciales Correctas.");
                return true;
            }
            System.out.println("Credenciales Incorrectas.");
            con.close();
            return false;
            
        } catch (SQLException e) {
            //imprimimos el error
            System.err.println(e);
            System.out.println("Error al comprobar credenciales.");
            return false;
        } 
    }

    public boolean modificar(Usuario usuario) {
        PreparedStatement ps = null;
        Connection conection = getConexion();

        String sql = "UPDATE usuario SET  password=?, email=?, telefono=?, direccion=?  WHERE rutUsuario=?";

        try {
            ps = conection.prepareStatement(sql);
            ps.setString(1, usuario.getPassword());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getTelefono());
            ps.setString(4, usuario.getDireccion());
            ps.setString(5, usuario.getRun());
            ps.execute();
            System.out.println("Actualización de usuario exitosa");
            conection.close();
            return true;
        } catch (SQLException e) {
            //imprimimos el error
            System.out.println("Error al actualizar usuario");
            System.err.println(e);
            try {
                conection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        } 

    }
}

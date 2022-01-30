package datos;

import interfaz.JIFrame_Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleProducto;
import modelo.Producto;

/**
 *
 * @Fabian
 * 23-01-2022
 */
public class ConsultasCompra extends Conexion {

    public boolean dispProducto(int idProducto, int cantidad) {
        PreparedStatement ps = null;
        String sql = "select * from producto where idProducto = ? and inventario >= ?";
        Connection con = getConexion();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ps.setInt(2, cantidad);
            rs = ps.executeQuery(); // Query para que asi me devuelva el resultado
            System.out.println("Se ejecuto busqueda de disponibilidad");
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
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
    
    public boolean pagarOrden(String rut){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM detallecompra WHERE rutUsuario = ?";
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            System.out.println("Cuenta pagada exitosamente");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int obtenerId() {
        int maxId = 0;
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("SELECT MAX(idDetalle) FROM detallecompra");
            rs = ps.executeQuery();
            while (rs.next()) {
                maxId = rs.getInt(1);
            }
            return maxId;
        } catch (Exception e) {
            return maxId;
        }
    }

    public boolean ingresarOrden(DetalleProducto dp, int maxId) {
        maxId += 1;
        System.out.println(maxId);
        System.out.println(dp.getPrecio());
        System.out.println(dp.getCantidad());
        System.out.println(dp.getTotal());
        System.out.println(dp.getIdProducto());
        System.out.println(dp.getRunUsuario());

        PreparedStatement ps = null;
        //String sql = "INSERT INTO detalleCompra idDetalle, precio, cantidad, total, idProducto, rutUsuario VALUES(default,?,?,?,?,?)";
        Connection con = getConexion();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("INSERT INTO detallecompra (idDetalle, precio, cantidad, total, idProducto, rutUsuario) VALUES(?,?,?,?,?,?)");
            ps.setInt(1, maxId + 1);
            ps.setInt(2, dp.getPrecio());
            ps.setInt(3, dp.getCantidad());
            ps.setInt(4, dp.getTotal());
            ps.setInt(5, dp.getIdProducto());
            ps.setString(6, dp.getRunUsuario());
            ps.execute();
            System.out.println("Ingresando Orden...");
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar la orden");
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

    public int totalOrden(String rutUsuario) {
        PreparedStatement ps = null;
        String sql = "select SUM(total) from detallecompra where rutUsuario = ?";
        Connection con = getConexion();
        ResultSet rs = null;
        int cantidad = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rutUsuario);
            rs = ps.executeQuery();
            System.out.println("Ingresando Orden...");
            if(rs.next()){
                cantidad = rs.getInt(1);
                System.out.println(cantidad);
            }
        } catch (Exception e) {
            System.out.println("Error al Mostrar el total");
        } finally {
            try {
                con.close();
                System.out.println("Cerrando conexión totalOrden");
                
            } catch (SQLException e) {
                System.err.println(e);
            }
             return cantidad;
        }
    }

    /*public void listarProductos(){
        PreparedStatement ps = null;
        String sql = "select * from producto";
        Connection con = getConexion();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // Query para que asi me devuelva el resultado
            System.out.println("Se ejecuto consulta");
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cod Producto");
            modelo.addColumn("Tamaño");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");

            Object[] fila = new Object[5];

            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                modelo.addRow(fila);
                //this.jtbl_Producto.setModel(modelo);
            }
        }  catch (SQLException e) {
            //imprimimos el error
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }

        }
    }*/
}

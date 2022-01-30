package modelo;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @fabian
 * 23-01-2022
 */
public class DetalleProducto{
    
    private int idDetalle;
    private int precio;
    private int cantidad;
    private int total;
    private String runUsuario;
    private int idProducto;

    public DetalleProducto(){
        
    }
    
    public DetalleProducto(int precio, int cantidad, int total, String runUsuario, int idProducto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.runUsuario = runUsuario;
        this.idProducto = idProducto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getRunUsuario() {
        return runUsuario;
    }

    public void setRunUsuario(String runUsuario) {
        this.runUsuario = runUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "idDetalle=" + idDetalle + ", precio=" + precio + ", cantidad=" + cantidad + ", total=" + total + ", runUsuario=" + runUsuario + ", idProducto=" + idProducto + '}';
    }
}

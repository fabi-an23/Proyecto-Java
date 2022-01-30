package modelo;

/*

@fabian
*/

public class Producto {

    private int idProducto;
    private int tamano;
    private String descripcion;
    private int precio;
    private int inventario;
    private int cantidadProducto;

    public Producto() {
    }

    public Producto(int idProducto, int tamano, String descripcion, int precio, int inventario, int cantidadProducto) {
        this.idProducto = idProducto;
        this.tamano = tamano;
        this.descripcion = descripcion;
        this.precio = precio;
        this.inventario = inventario;
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", tamano=" + tamano + ", descripcion=" + descripcion + ", precio=" + precio + ", inventario=" + inventario + ", cantidadProducto=" + cantidadProducto + '}';
    }
    
}

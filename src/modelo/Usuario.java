package modelo;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @fabian
 * 23-01-2022
 */
public class Usuario {

    private String run;
    private String nombre;
    private String password;
    private String email;
    private int telefono;
    private String direccion;

    public Usuario() {
    }

    public Usuario(String run, String nombre, String password, String email, int telefono, String direccion) {
        this.run = run;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "run=" + run + ", nombre=" + nombre + ", password=" + password + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

}

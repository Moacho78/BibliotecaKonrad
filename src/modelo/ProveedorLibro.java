/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migue
 */
public class ProveedorLibro {

    private int proveedorID;
    private String nombre;
    private String telefono;
    private String correo;
    private String contacto;

    // Constructor vacío
    public ProveedorLibro() {
    }

    public ProveedorLibro(int proveedorID, String nombre, String telefono, String correo, String contacto) {
        this.proveedorID = proveedorID;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    // Getters y Setters
    public int getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método toString
    @Override
    public String toString() {
        return "ProveedorLibro{"
                + "proveedorID=" + proveedorID
                + ", nombre='" + nombre + '\''
                + ", telefono='" + telefono + '\''
                + ", correo='" + correo + '\''
                + '}';
    }

    public void insertarProveedor(String nombre, String contacto, String telefono, String email) {

        SQLServerConnection conexionSQL = new SQLServerConnection();
        String sql = "{CALL InsertarProveedor(?, ?, ?, ?)}";

        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {
           stmt.setString(1, nombre);
           stmt.setString(2, contacto);
           stmt.setString(3, telefono);
           stmt.setString(4, email);
            stmt.execute();
            System.out.println("Proveedor insertado correctamente.");
        }  catch (SQLException e) {
            System.err.println("Error al realizar el registro de proveedor: " + e.getMessage());
            e.printStackTrace();
           
        }
    }// cierra  insertar       
}// cierra class 

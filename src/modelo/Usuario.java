/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
import java.sql.Date;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;

public class Usuario {

    private String usuarioID;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Date fechaRegistro;
    private String clave;
    private int rol;
    private String Direccion; 

    // Constructor vacío
    public Usuario() {
    }

    public Usuario(String usuarioID, String nombre, String apellido, String correo, String telefono, Date fechaRegistro, String clave, int rol, String Direccion) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.clave = clave;
        this.rol = rol;
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioID=" + usuarioID + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro + ", clave=" + clave + ", rol=" + rol + '}';
    }

    public Usuario loginUsuario(String Email, String clave) {
        SQLServerConnection conexionSQL = new SQLServerConnection();
        String sql = "{call sp_LoginUsuario(?, ?)}";

        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {
            // Establecer los parámetros
            stmt.setString(1, Email);
            stmt.setString(2, clave);

            // Ejecutar el procedimiento almacenado
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Crear y devolver el objeto Usuario con todas las propiedades
                    return new Usuario(
                            rs.getString("UsuarioID"),
                            rs.getString("Nombre"),
                            rs.getString("Apellido"),
                            rs.getString("Email"),
                            rs.getString("Telefono"),
                            rs.getDate("FechaRegistro"),
                            rs.getString("Clave"),
                            rs.getInt("rol"),
                            rs.getString("Direccion")
                    );
                } else {
                    System.out.println("Credenciales incorrectas.");
                    return null; // O puedes lanzar una excepción
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al realizar el login: " + e.getMessage());
            e.printStackTrace();
            return null; // O lanzar una excepción
        }
    }// cierra login
    
     public void insertarUsuario(String usuarioID, String nombre, String apellido, String email, String telefono, int rol,String clave,String direccion) {
        
         SQLServerConnection conexionSQL = new SQLServerConnection();
         String sql = "{call sp_InsertarUsuario(?, ?, ?, ?, ?, ?,?,?,?)}";
        
        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {
            
            // Obtener la fecha actual del sistema
        LocalDate fechaActual = LocalDate.now();
        Date sqlDate = Date.valueOf(fechaActual);
            // Establecer los parámetros
            stmt.setString(1, usuarioID);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setDate(4, sqlDate);
            stmt.setString(5, email);
            stmt.setString(6, telefono);
            stmt.setInt(7, rol);
            stmt.setString(8, clave);
            stmt.setString(9, direccion);

            // Ejecutar el procedimiento almacenado
            stmt.execute();
            System.out.println("Usuario insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }// cierra insertar usuario 

}// cierra class

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author migue
 */
public class AutorModelo {

    private int autorID;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaRegistro;

    // Constructor vacío
    public AutorModelo() {
    }

    // Constructor con parámetros
    public AutorModelo(int autorID, String nombre, String apellido, String nacionalidad, Date fechaRegistro) {
        this.autorID = autorID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getAutorID() {
        return autorID;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
    }

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Método toString
    @Override
    public String toString() {
        return "Autor{"
                + "autorID=" + autorID
                + ", nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", nacionalidad='" + nacionalidad + '\''
                + '}';
    }

    public void insertarAutor(String nombre, String apellido, String nacionalidad) {

        SQLServerConnection conexionSQL = new SQLServerConnection();
        String sql = "{call sp_InsertarAutor(?, ?, ?, ?)}";

        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {

            // Obtener la fecha actual del sistema
            LocalDate fechaActual = LocalDate.now();
            Date sqlDate = Date.valueOf(fechaActual);

            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, nacionalidad);
            stmt.setDate(4, sqlDate);

            // Ejecutar el procedimiento almacenado
            stmt.execute();
            System.out.println("Autor insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar el autor: " + e.getMessage());
            e.printStackTrace();
        }
    } // cierra insertar autor

}

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
public class EditorialModelo {

    private int editorialID;
    private String nombre;
    private String pais;

    // Constructor vacío
    public EditorialModelo() {
    }

    // Constructor con parámetros
    public EditorialModelo(int editorialID, String nombre, String pais) {
        this.editorialID = editorialID;
        this.nombre = nombre;
        this.pais = pais;
    }

    // Getters y Setters
    public int getEditorialID() {
        return editorialID;
    }

    public void setEditorialID(int editorialID) {
        this.editorialID = editorialID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString
    @Override
    public String toString() {
        return "Editorial{"
                + "editorialID=" + editorialID
                + ", nombre='" + nombre + '\''
                + ", pais='" + pais + '\''
                + '}';
    }

    public void insertarEditorial(String nombre, String pais) {

        SQLServerConnection conexionSQL = new SQLServerConnection();
        String sql = "{call sp_InsertarAutor(?, ?, ?, ?)}";

        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, pais);

            // Ejecutar el procedimiento almacenado
            stmt.execute();
            System.out.println("Editorial insertada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar la editorial: " + e.getMessage());
            e.printStackTrace();
        }
    } // cierra insertar editorial

}

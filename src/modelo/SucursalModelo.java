/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migue
 */
public class SucursalModelo {

    private int sucursalID;
    private String nombre;
    private String ubicacion;

    // Constructor vacío
    public SucursalModelo() {
    }

    // Constructor con parámetros
    public SucursalModelo(int sucursalID, String nombre, String ubicacion) {
        this.sucursalID = sucursalID;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(int sucursalID) {
        this.sucursalID = sucursalID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Sucursal{"
                + "sucursalID=" + sucursalID
                + ", nombre='" + nombre + '\''
                + ", ubicacion='" + ubicacion + '\''
                + '}';
    }

    public void insertarSucursal(String nombre, String direccion) {
        SQLServerConnection conexionSQL = new SQLServerConnection();
        String sql = "{CALL CrearSucursal(?, ?)}";
        try (Connection conexion = conexionSQL.getConexion(); CallableStatement stmt = conexion.prepareCall(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, direccion);
            stmt.execute();
            System.out.println("Sucursal insertadoa correctamente.");
        } catch (SQLException ex) {
            Logger.getLogger(SucursalModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// cierra insertarSucursal

}// cierra class 



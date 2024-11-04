/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
import java.util.Date;

public class HistorialPrestamo {
    private int historialID;
    private int usuarioID;
    private int prestamoID;
    private Date fecha;

    // Constructor vacío
    public HistorialPrestamo() {
    }

    // Constructor con parámetros
    public HistorialPrestamo(int historialID, int usuarioID, int prestamoID, Date fecha) {
        this.historialID = historialID;
        this.usuarioID = usuarioID;
        this.prestamoID = prestamoID;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getHistorialID() {
        return historialID;
    }

    public void setHistorialID(int historialID) {
        this.historialID = historialID;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public int getPrestamoID() {
        return prestamoID;
    }

    public void setPrestamoID(int prestamoID) {
        this.prestamoID = prestamoID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método toString
    @Override
    public String toString() {
        return "HistorialPrestamo{" +
                "historialID=" + historialID +
                ", usuarioID=" + usuarioID +
                ", prestamoID=" + prestamoID +
                ", fecha=" + fecha +
                '}';
    }
}

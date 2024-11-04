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

public class Devolucion {
    private int devolucionID;
    private int prestamoID;
    private Date fechaDevolucion;
    private String estado;

    // Constructor vacío
    public Devolucion() {
    }

    // Constructor con parámetros
    public Devolucion(int devolucionID, int prestamoID, Date fechaDevolucion, String estado) {
        this.devolucionID = devolucionID;
        this.prestamoID = prestamoID;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getDevolucionID() {
        return devolucionID;
    }

    public void setDevolucionID(int devolucionID) {
        this.devolucionID = devolucionID;
    }

    public int getPrestamoID() {
        return prestamoID;
    }

    public void setPrestamoID(int prestamoID) {
        this.prestamoID = prestamoID;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Devolucion{" +
                "devolucionID=" + devolucionID +
                ", prestamoID=" + prestamoID +
                ", fechaDevolucion=" + fechaDevolucion +
                ", estado='" + estado + '\'' +
                '}';
    }
}

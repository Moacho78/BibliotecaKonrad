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

public class Prestamo {
    private int prestamoID;
    private int usuarioID;
    private int ejemplarID;
    private Date fechaPrestamo;
    private Date fechaDevolucionEsperada;
    private Date fechaDevolucionReal;
    private boolean multaAplicada;

    // Constructor vacío
    public Prestamo() {
    }

    // Constructor con parámetros
    public Prestamo(int prestamoID, int usuarioID, int ejemplarID, Date fechaPrestamo,
                   Date fechaDevolucionEsperada, Date fechaDevolucionReal, boolean multaAplicada) {
        this.prestamoID = prestamoID;
        this.usuarioID = usuarioID;
        this.ejemplarID = ejemplarID;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
        this.fechaDevolucionReal = fechaDevolucionReal;
        this.multaAplicada = multaAplicada;
    }

    // Getters y Setters
    public int getPrestamoID() {
        return prestamoID;
    }

    public void setPrestamoID(int prestamoID) {
        this.prestamoID = prestamoID;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public int getEjemplarID() {
        return ejemplarID;
    }

    public void setEjemplarID(int ejemplarID) {
        this.ejemplarID = ejemplarID;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(Date fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    public Date getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(Date fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public boolean isMultaAplicada() {
        return multaAplicada;
    }

    public void setMultaAplicada(boolean multaAplicada) {
        this.multaAplicada = multaAplicada;
    }

    // Método toString
    @Override
    public String toString() {
        return "Prestamo{" +
                "prestamoID=" + prestamoID +
                ", usuarioID=" + usuarioID +
                ", ejemplarID=" + ejemplarID +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucionEsperada=" + fechaDevolucionEsperada +
                ", fechaDevolucionReal=" + fechaDevolucionReal +
                ", multaAplicada=" + multaAplicada +
                '}';
    }
}

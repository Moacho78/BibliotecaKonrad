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

public class Reserva {
    private int reservaID;
    private int usuarioID;
    private int ejemplarID;
    private Date fechaReserva;
    private String estado; // (e.g., Activa, Cancelada)

    // Constructor vacío
    public Reserva() {
    }

    // Constructor con parámetros
    public Reserva(int reservaID, int usuarioID, int ejemplarID, Date fechaReserva, String estado) {
        this.reservaID = reservaID;
        this.usuarioID = usuarioID;
        this.ejemplarID = ejemplarID;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    // Getters y Setters
    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
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
        return "Reserva{" +
                "reservaID=" + reservaID +
                ", usuarioID=" + usuarioID +
                ", ejemplarID=" + ejemplarID +
                ", fechaReserva=" + fechaReserva +
                ", estado='" + estado + '\'' +
                '}';
    }
}

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

public class EventoBiblioteca {
    private int eventoID;
    private int sucursalID;
    private String nombreEvento;
    private Date fechaEvento;

    // Constructor vacío
    public EventoBiblioteca() {
    }

    // Constructor con parámetros
    public EventoBiblioteca(int eventoID, int sucursalID, String nombreEvento, Date fechaEvento) {
        this.eventoID = eventoID;
        this.sucursalID = sucursalID;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
    }

    // Getters y Setters
    public int getEventoID() {
        return eventoID;
    }

    public void setEventoID(int eventoID) {
        this.eventoID = eventoID;
    }

    public int getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(int sucursalID) {
        this.sucursalID = sucursalID;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    // Método toString
    @Override
    public String toString() {
        return "EventoBiblioteca{" +
                "eventoID=" + eventoID +
                ", sucursalID=" + sucursalID +
                ", nombreEvento='" + nombreEvento + '\'' +
                ", fechaEvento=" + fechaEvento +
                '}';
    }
}

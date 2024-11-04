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

public class Sancion {
    private int sancionID;
    private int usuarioID;
    private String motivo;
    private Date fechaAplicacion;
    private String estado; // (e.g., Activa, Inactiva)

    // Constructor vacío
    public Sancion() {
    }

    // Constructor con parámetros
    public Sancion(int sancionID, int usuarioID, String motivo, Date fechaAplicacion, String estado) {
        this.sancionID = sancionID;
        this.usuarioID = usuarioID;
        this.motivo = motivo;
        this.fechaAplicacion = fechaAplicacion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getSancionID() {
        return sancionID;
    }

    public void setSancionID(int sancionID) {
        this.sancionID = sancionID;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
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
        return "Sancion{" +
                "sancionID=" + sancionID +
                ", usuarioID=" + usuarioID +
                ", motivo='" + motivo + '\'' +
                ", fechaAplicacion=" + fechaAplicacion +
                ", estado='" + estado + '\'' +
                '}';
    }
}

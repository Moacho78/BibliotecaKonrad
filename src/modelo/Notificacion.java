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

public class Notificacion {
    private int notificacionID;
    private int usuarioID;
    private String mensaje;
    private Date fechaEnvio;

    // Constructor vacío
    public Notificacion() {
    }

    // Constructor con parámetros
    public Notificacion(int notificacionID, int usuarioID, String mensaje, Date fechaEnvio) {
        this.notificacionID = notificacionID;
        this.usuarioID = usuarioID;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    // Getters y Setters
    public int getNotificacionID() {
        return notificacionID;
    }

    public void setNotificacionID(int notificacionID) {
        this.notificacionID = notificacionID;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Notificacion{" +
                "notificacionID=" + notificacionID +
                ", usuarioID=" + usuarioID +
                ", mensaje='" + mensaje + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                '}';
    }
}

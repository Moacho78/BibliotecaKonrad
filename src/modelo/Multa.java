/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
import java.math.BigDecimal;

public class Multa {
    private int multaID;
    private int usuarioID;
    private int prestamoID;
    private BigDecimal monto;
    private String estado; // (e.g., Pagada, Pendiente)

    // Constructor vacío
    public Multa() {
    }

    // Constructor con parámetros
    public Multa(int multaID, int usuarioID, int prestamoID, BigDecimal monto, String estado) {
        this.multaID = multaID;
        this.usuarioID = usuarioID;
        this.prestamoID = prestamoID;
        this.monto = monto;
        this.estado = estado;
    }

    // Getters y Setters
    public int getMultaID() {
        return multaID;
    }

    public void setMultaID(int multaID) {
        this.multaID = multaID;
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

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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
        return "Multa{" +
                "multaID=" + multaID +
                ", usuarioID=" + usuarioID +
                ", prestamoID=" + prestamoID +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
}

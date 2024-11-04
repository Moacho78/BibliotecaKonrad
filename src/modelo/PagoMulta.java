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
import java.util.Date;

public class PagoMulta {
    private int pagoMultaID;
    private int multaID;
    private Date fechaPago;
    private BigDecimal montoPagado;

    // Constructor vacío
    public PagoMulta() {
    }

    // Constructor con parámetros
    public PagoMulta(int pagoMultaID, int multaID, Date fechaPago, BigDecimal montoPagado) {
        this.pagoMultaID = pagoMultaID;
        this.multaID = multaID;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
    }

    // Getters y Setters
    public int getPagoMultaID() {
        return pagoMultaID;
    }

    public void setPagoMultaID(int pagoMultaID) {
        this.pagoMultaID = pagoMultaID;
    }

    public int getMultaID() {
        return multaID;
    }

    public void setMultaID(int multaID) {
        this.multaID = multaID;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    // Método toString
    @Override
    public String toString() {
        return "PagoMulta{" +
                "pagoMultaID=" + pagoMultaID +
                ", multaID=" + multaID +
                ", fechaPago=" + fechaPago +
                ", montoPagado=" + montoPagado +
                '}';
    }
}

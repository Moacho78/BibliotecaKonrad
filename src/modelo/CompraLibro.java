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

public class CompraLibro {
    private int compraID;
    private int libroID;
    private int proveedorID;
    private Date fechaCompra;
    private int cantidad;
    private BigDecimal costoTotal;

    // Constructor vacío
    public CompraLibro() {
    }

    // Constructor con parámetros
    public CompraLibro(int compraID, int libroID, int proveedorID, Date fechaCompra, int cantidad, BigDecimal costoTotal) {
        this.compraID = compraID;
        this.libroID = libroID;
        this.proveedorID = proveedorID;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.costoTotal = costoTotal;
    }

    // Getters y Setters
    public int getCompraID() {
        return compraID;
    }

    public void setCompraID(int compraID) {
        this.compraID = compraID;
    }

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public int getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    // Método toString
    @Override
    public String toString() {
        return "CompraLibro{" +
                "compraID=" + compraID +
                ", libroID=" + libroID +
                ", proveedorID=" + proveedorID +
                ", fechaCompra=" + fechaCompra +
                ", cantidad=" + cantidad +
                ", costoTotal=" + costoTotal +
                '}';
    }
}

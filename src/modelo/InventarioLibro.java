/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class InventarioLibro {
    private int inventarioID;
    private int libroID;
    private int cantidadDisponible;

    // Constructor vacío
    public InventarioLibro() {
    }

    // Constructor con parámetros
    public InventarioLibro(int inventarioID, int libroID, int cantidadDisponible) {
        this.inventarioID = inventarioID;
        this.libroID = libroID;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y Setters
    public int getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(int inventarioID) {
        this.inventarioID = inventarioID;
    }

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método toString
    @Override
    public String toString() {
        return "InventarioLibro{" +
                "inventarioID=" + inventarioID +
                ", libroID=" + libroID +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}

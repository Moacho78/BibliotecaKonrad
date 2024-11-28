/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class EjemplarModelo {
    private int ejemplarID;
    private int libroID;
    private String ubicacion;
    private String estado; // (e.g., Disponible, Prestado)

    // Constructor vacío
    public EjemplarModelo() {
    }

    // Constructor con parámetros
    public EjemplarModelo(int ejemplarID, int libroID, String ubicacion, String estado) {
        this.ejemplarID = ejemplarID;
        this.libroID = libroID;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getEjemplarID() {
        return ejemplarID;
    }

    public void setEjemplarID(int ejemplarID) {
        this.ejemplarID = ejemplarID;
    }

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
        return "Ejemplar{" +
                "ejemplarID=" + ejemplarID +
                ", libroID=" + libroID +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

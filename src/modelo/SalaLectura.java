/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class SalaLectura {
    private int salaID;
    private int sucursalID;
    private String nombre;
    private int capacidad;

    // Constructor vacío
    public SalaLectura() {
    }

    // Constructor con parámetros
    public SalaLectura(int salaID, int sucursalID, String nombre, int capacidad) {
        this.salaID = salaID;
        this.sucursalID = sucursalID;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public int getSalaID() {
        return salaID;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }

    public int getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(int sucursalID) {
        this.sucursalID = sucursalID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "SalaLectura{" +
                "salaID=" + salaID +
                ", sucursalID=" + sucursalID +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}

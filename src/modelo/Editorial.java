/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class Editorial {
    private int editorialID;
    private String nombre;
    private String pais;

    // Constructor vacío
    public Editorial() {
    }

    // Constructor con parámetros
    public Editorial(int editorialID, String nombre, String pais) {
        this.editorialID = editorialID;
        this.nombre = nombre;
        this.pais = pais;
    }

    // Getters y Setters
    public int getEditorialID() {
        return editorialID;
    }

    public void setEditorialID(int editorialID) {
        this.editorialID = editorialID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString
    @Override
    public String toString() {
        return "Editorial{" +
                "editorialID=" + editorialID +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

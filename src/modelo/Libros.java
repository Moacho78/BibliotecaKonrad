/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author migue
 */
public class Libros {

    private int libroID;
    private String titulo;
    private int categoriaID;
    private int editorialID;
    private Date fechaPublicacion;
    private String descripcion;

    public Libros(int libroID, String titulo, int categoriaID, int editorialID, Date fechaPublicacion, String descripcion) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.categoriaID = categoriaID;
        this.editorialID = editorialID;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
    }// cierra constructor con parametros
    
     public Libros() {
    }// cierra constructor vacio

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public int getEditorialID() {
        return editorialID;
    }

    public void setEditorialID(int editorialID) {
        this.editorialID = editorialID;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   public String toString() {
        return "Libro{" +
                "libroID=" + libroID +
                ", titulo='" + titulo + '\'' +
                ", categoriaID=" + categoriaID +
                ", editorialID=" + editorialID +
                ", fechaPublicacion=" + fechaPublicacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
     
}// cierra class 

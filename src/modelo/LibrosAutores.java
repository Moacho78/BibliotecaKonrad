/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author migue
 */
public class LibrosAutores {
    private int libroId;
    private int autorId;

    // Relación con la clase Libros
    private Libros libro;

    // Relación con la clase Autores
    private AutorModelo autor;

    public LibrosAutores() {
    }

    public LibrosAutores(int libroId, int autorId) {
        this.libroId = libroId;
        this.autorId = autorId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public AutorModelo getAutor() {
        return autor;
    }

    public void setAutor(AutorModelo autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "LibrosAutores{" +
                "libroId=" + libroId +
                ", autorId=" + autorId +
                '}';
    }
}
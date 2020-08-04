package poo.Ejercicios;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;
    private String formato;
    private int nPag;
    private long isbn;
    private int edicion;

    List<Libro> lista = new ArrayList<>();

    public Libro() {
    }

    public Libro(List<Libro> lista) {
        this.lista = lista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Autor: %s%n Titulo: %s%n", autor, titulo);
    }

    public List<Libro> devolverListaLibrosMismoAutor(Libro autor) {
        List<Libro> lista1 = new ArrayList<>();
        for (Libro libro: lista) {
            if (libro.getAutor() == autor.getAutor())
                lista1.add(libro);
        }
        return lista1;
    }
}

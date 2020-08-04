package poo.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestLibro {
    public static void main(String[] args) {
        List<Libro> listaLibros = new ArrayList<>();

        Libro l1 = new Libro();
        l1.setAutor("Manolo");
        l1.setTitulo("Cómo aprobar Programación");
        l1.setEdicion(4);
        l1.setEditorial("IES Virgen del Carmen");
        l1.setFormato("Papel");
        l1.setGenero("Terror");
        l1.setIsbn(234567_2356L);
        l1.setnPag(69);

        Libro l2 = new Libro();
        l2.setAutor("Lola");
        l2.setTitulo("Las flores del campo");
        l2.setEdicion(4);
        l2.setEditorial("IES Virgen del Carmen");
        l2.setFormato("Papel");
        l2.setGenero("Fantasía");
        l2.setIsbn(232367_2356L);
        l2.setnPag(89);


        Libro l3 = new Libro();
        l3.setAutor("Manolo");
        l3.setTitulo("El batido y el bocadillo");
        l3.setEdicion(4);
        l3.setEditorial("IES Virgen del Carmen");
        l3.setFormato("Papel");
        l3.setGenero("Fantasía");
        l3.setIsbn(234567_222356L);
        l3.setnPag(50);

        listaLibros.add(l1);
        listaLibros.add(l2);
        listaLibros.add(l3);

        Libro libro = new Libro(listaLibros);

        System.out.println(libro.devolverListaLibrosMismoAutor(l3));



    }
}

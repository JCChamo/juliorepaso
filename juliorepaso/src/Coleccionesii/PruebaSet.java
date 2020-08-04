package Coleccionesii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaSet {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        Set<String> lista2 = new TreeSet<>();
        Set<String> lista3 = new LinkedHashSet<>();

        lista.add("probando");
        lista.add("dos");
        lista.add("uno");
        lista.add("uno");
        lista.add("listo");
        lista.add("uretra");
        lista.add("ureja");

        lista2.add("probando");
        lista2.add("uno");
        lista2.add("uno");
        lista2.add("dos");
        lista2.add("listo");


        lista3.add("probando");
        lista3.add("uno");
        lista3.add("dos");
        lista3.add("listo");
        lista3.add("listo");

        System.out.println(lista.toString());
        System.out.println(lista2.toString());
        System.out.println(lista3.toString());


    }
}

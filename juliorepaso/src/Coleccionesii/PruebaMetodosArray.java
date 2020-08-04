package Coleccionesii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PruebaMetodosArray {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        String cadena1 = "hola";
        String cadena2 = "holaaa";
        String cadena3 = "holaaaa";

        lista.add(cadena1);
        lista.add(cadena2);
        lista.add(cadena3);
        System.out.println(lista.toString());
        lista.add(2, "patata");
        System.out.println(lista.toString());
        String[] array = new String[4];
        lista.toArray();
        System.out.println(Arrays.toString(lista.toArray()));
    }
}

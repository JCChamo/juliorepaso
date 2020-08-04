package Stringbuilder.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("ficheros/constitucion.txt"))) {
            while (sc.hasNext()){
                String palabra = sc.next();
                lista.add(palabra);
            }
            System.out.println(UtilidadesString.numeroPalabras(lista));
            System.out.println(UtilidadesString.numeroPreposiciones(lista));
            System.out.println(UtilidadesString.numeroArticulosDeterminados(lista));
            System.out.println(UtilidadesString.numeroArticulosIndeterminados(lista));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

}

package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaArrayList {
    public static void main(String[] args) {
        List<String> amigos = Arrays.asList("Paco", "Manolo", "Sergio", "Patricia", "Marta");

//        for (int i = 0; i < amigos.size(); i++)
//            System.out.println(amigos.get(i));

        for (String nombre: amigos)
            System.out.println(nombre);

        amigos.forEach(System.out :: println);

        int[] numeros = {1, 3, 5, 7, 24};
        double suma = 0.0;
        for (double numero:numeros) {
            suma += numero;
        }
        System.out.println(suma);



    }
}

package Colecciones.ejercicios;

import java.util.Arrays;

public class Colecciones {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = 3;
        }
        System.out.println(Arrays.toString(a));
        Arrays.fill(b, 3);
        System.out.println(Arrays.toString(b));
        mostrarDatosArray(a, b);
    }

    public static void mostrarDatosArray(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d %d%n", a[i], b[i]);
        }

    }
}

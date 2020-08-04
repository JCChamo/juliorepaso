package EstructurasDeControl.ejercicios;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        System.out.println("Introduzca un número de tres cifras");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Cifra 1: " + n / 100);
        System.out.println("Cifra 2: " + (n / 10) % 10);
        System.out.println("Cifra 3: " + n % 10);
    }
}

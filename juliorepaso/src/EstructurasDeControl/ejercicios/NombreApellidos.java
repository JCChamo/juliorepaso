package EstructurasDeControl.ejercicios;

import java.util.Scanner;

public class NombreApellidos {
    public static void main(String[] args) {
        System.out.println("Introduce nombre y apellidos");
        Scanner sc = new Scanner(System.in);
        String nomap = sc.nextLine();
        sc.close();
        System.out.println("Hola, " + nomap);
    }
}

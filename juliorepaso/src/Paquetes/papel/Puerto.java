package Paquetes.papel;

import java.util.Scanner;

public class Puerto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce piedra, papel o tijeras (\"fin\" para terminar)");
        String eleccion = sc.nextLine();
        while (!eleccion.equals("fin")) {
            switch (eleccion) {
                case "piedra":
                    System.out.println("papel");
                    break;

                case "papel":
                    System.out.println("tijeras");
                    break;
                default:
                    System.out.println("piedra");
                    break;
            }
            eleccion = sc.nextLine();
        }
    }
}

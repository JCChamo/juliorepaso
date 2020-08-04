package EstructurasDeControl.ejercicios;

import java.util.Scanner;

public class ValidarHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce hora (formato 24 h)");
        int h = sc.nextInt();
        System.out.println("Introduce minutos");
        int m = sc.nextInt();
        System.out.println("Introduce segundos");
        int s = sc.nextInt();
        sc.close();
        if ((h < 1 || h > 24) || (m < 1 || m > 60) || (s < 1 || s > 60))
            System.out.println("Hora no válida");
        else
            System.out.println("Hora válida");
        System.out.printf("Hora - %d:%d:%d", h, m, s);

    }
}

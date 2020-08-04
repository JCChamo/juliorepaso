package Examen.tipob.ej2;

import java.util.Scanner;

public class LeerDecimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una serie de números (0 para terminar)");
        double numero = sc.nextDouble();
        int cont = 0;
        double masGrande = Integer.MIN_VALUE;
        double masPequeño= Integer.MAX_VALUE;
        if (numero == 0) {
            System.out.println("fin de programa");
            return;
        }
        else {
            for (int i = 1; i != 0; i++) {
                cont++;
                if (numero > masGrande && numero != 0)
                    masGrande = numero;
                if (numero < masPequeño && numero !=0)
                    masPequeño = numero;
                numero = sc.nextDouble();


                if (numero == 0) {
                    System.out.println("fin de programa");
                    System.out.printf("Ha introducido %d valores, el más grande es %.2f y el más pequeño es %.2f", cont, masGrande, masPequeño);
                    return;
                }

                }
            }

    }

}

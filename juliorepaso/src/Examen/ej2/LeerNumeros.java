package Examen.ej2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LeerNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce secuencia de números naturales o cero");
        System.out.println("Para acabar introduce un número negativo");
        int n = sc.nextInt();
        int cont = 0;
        int suma = 0;
        if (n < 0) {
            System.out.printf("Introducidos %d números, su suma vale %d y su valor medio es %.2f", cont, suma, calcularValorMedio(cont, suma));
            return;

        } else {
            for (int i = 0; i >= 0; i++) {
                suma+=n;
                cont++;
                n = sc.nextInt();
                if (n < 0) {
                    System.out.printf("Introducidos %d números, su suma vale %d y su valor medio es %.2f", cont--, suma, calcularValorMedio(cont, suma));
                    return;
                }
            }
        }



        }

        public static double calcularValorMedio(int cont,int suma) {
        return suma/cont;
        }
}

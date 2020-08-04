package EstructurasDeControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisoresSeis {
    public static void main(String[] args) {
        System.out.println("Introduce un número entero positivo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Introduce el primer número que quieras que sea divisor");
        int divisor1 = sc.nextInt();
        System.out.println("Introduce el esgundo número que quieras que sea divisor");
        int divisor2 = sc.nextInt();

        //divisiblesPorSeis(n);
        divisiblePorDosNumeros(n, divisor1, divisor2);
    }

    public static void divisiblesPorSeis (int n){
        int numeroDivisible = 0;
        int posicion = 0;
        int valores2[] = new int[100];
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                numeroDivisible = i;
                valores.add(numeroDivisible);
                valores2[posicion] = numeroDivisible;
                posicion++;
            }
        }
        System.out.printf("Los valores divisibles por dos y tres que contiene %d son: %s%n", n,  valores);
        System.out.printf("Los valores divisibles por dos y tres que contiene %d son: ", n);
        for (int i = 0; i < valores2.length; i++) {
            if (valores2[i] != 0)
                System.out.print(valores2[i] + ", ");
        }
    }

    public static void divisiblePorDosNumeros(int n, int valor1, int valor2) {
        int numeroDivisible = 0;
        int posicion = 0;
        int valores2[] = new int[100];
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % valor1 == 0 && i % valor2 == 0) {
                numeroDivisible = i;
                valores.add(numeroDivisible);
                valores2[posicion] = numeroDivisible;
                posicion++;
            }
        }
        System.out.printf("Los valores divisibles por %d y %d que contiene %d son: %s%n", valor1, valor2, n,  valores);

    }
}

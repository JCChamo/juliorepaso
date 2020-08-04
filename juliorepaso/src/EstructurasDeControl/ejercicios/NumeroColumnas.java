package EstructurasDeControl.ejercicios;

import java.util.Scanner;

public class NumeroColumnas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nº columnas");
        int ncol = sc.nextInt();
        System.out.println("Introduce un nº");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n ; i++) {
            int muestra = i;
            System.out.printf("%4d", muestra);
            if (i % ncol == 0)
                System.out.println();
        }
    }
}

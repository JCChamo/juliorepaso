package EstructurasDeControl;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Introduce un número entero positivo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getFactorial(n);

    }

    public static int getFactorial(int n){
        int factorial = 1;
        if (n < 0)
            System.out.println("Número introducido inválido");
        else {
            for (int i = 1; i <= n; i++)
                factorial *= i;
            System.out.printf("El factorial de %d es %d", n, factorial);
        }
        return factorial;
    }
}

package EstructurasDeControl.ejercicios;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        System.out.println("Introduce un valor entero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        sc.close();
        //devolverUnoAlDiez();
        //devolverVeinteAlOchentaSerie();
        //devolverCienAlCincuentaSerie();
        //suma = devolverSumaEnteros(n);
        //suma = devolverSumaCuadradosEnteros(n);
        //System.out.println(suma);
        devolverSumaParesImpares(n);
    }

    public static void devolverUnoAlDiez(){
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            n = i;
            System.out.println(n);
        }
    }

    public static void devolverVeinteAlOchentaSerie(){
        int n = 0;
        for (int i = 20; i <= 80 ; i+=5) {
            n = i;
            System.out.println(n);
        }
    }

    public static void devolverCienAlCincuentaSerie(){
        int n = 0;
        for (int i = 100; i >= 50 ; i-=2) {
            n = i;
            System.out.println(n);
        }
    }

    public static int devolverSumaEnteros(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int devolverSumaCuadradosEnteros(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += Math.pow(i, 2);
        }
        return suma;
    }

    public static void devolverSumaParesImpares(int n) {
        int sumaPares = 0;
        int sumaImpares = 0;
        int cont = 1;
        while (cont <= n) {
            if (cont % 2 == 0)
                sumaPares += cont;
            else if (cont % 2 == 1)
                sumaImpares += cont;

            cont++;
        }
        System.out.printf("Suma de los pares: %d, suma de los impares: %d",
                sumaPares, sumaImpares);
    }
}


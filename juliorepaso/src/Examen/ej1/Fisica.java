package Examen.ej1;

import java.util.Scanner;

/**
 * La clase llamada Física calcula la velocidad y el
 * tiempo de un cuerpo cuando cae al suelo
 * desde cierta altura
 * @author jc
 * @author josecarlos@hotmail.com
 * @version 1.0
 */
public class Fisica {
    final static double ACELERACION_GRAVEDAD = 9.8;

    public static void main(String[] args) {
        System.out.println("Introduzca la altura (metros)");
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        if (!(h>0 && h<1000))
            System.out.println("Altura no válida");
        else {
            System.out.printf("La velocidad cuando el objeto llega al suelo es %.2f metros por segundo%n", calcularVelocidadSuelo(h));
            System.out.printf("El tiempo del objeto en llegar al suelo es %.2f segundos", calcularTiempoSuelo(h));
        }

    }

    /**
     *
     * @param h pasamos parámetro altura (h) de tipo doble
     * @return velocidad del cuerpo al llegar al suelo
     */
    public static double calcularVelocidadSuelo (double h) {
        double velocidad = Math.sqrt(2*ACELERACION_GRAVEDAD*h);
        return velocidad;
    }
    /**
     *
     * @param h pasamos parámetro altura (h) de tipo doble
     * @return tiempo del cuerpo desde que se lanza
     * hasta que llega al suelo
     */
    public static double calcularTiempoSuelo (double h){
        double tiempo = Math.sqrt(2*h/ACELERACION_GRAVEDAD);
        return tiempo;
    }
}

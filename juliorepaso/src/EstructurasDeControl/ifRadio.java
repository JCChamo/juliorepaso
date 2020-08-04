package EstructurasDeControl;

import java.util.Scanner;

public class ifRadio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del radio");
        double radio = sc.nextDouble();

        if (radio < 0)
            System.out.println("Valor del radio inválido");
        else {
            double area = calcularAreaACircunferencia(radio);
            System.out.printf("El área de la circunferencia de radio %.2f es %.2f", radio, area);
        }
    }

    public static double calcularAreaACircunferencia(double radio) {
        return radio*radio*Math.PI;
    }
}

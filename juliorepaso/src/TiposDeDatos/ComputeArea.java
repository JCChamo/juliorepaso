package TiposDeDatos;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        int radio = sc.nextInt();
        double area = 2*Math.PI*radio;
        System.out.printf("El área de la circunferencia con radio %d es %.2f", radio, area);
    }
}

package Examen.tipob.ej1;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor la temperatura (si tiene decimal, separado por coma)");
        double temp = sc.nextDouble();
        System.out.println("Introduce la unidad a convertir (farenheit o centigrados)");
        sc.nextLine();
        String unidad = sc.nextLine();
        sc.close();
        switch (unidad) {
            case "farenheit":
                System.out.printf("%f grados farenheit son %.2f centigrados", temp, convertirFarenheitACentigrados(temp));
                break;
            case "centigrados":
                System.out.printf("%.2f grados centigrados son %.2f farenheit", temp, convertirCentigradosAFarenheit(temp));
                break;
            default:
                System.out.println("Ha introducido una unidad de temperatura inválida");

        }
    }

    public static double convertirFarenheitACentigrados(double temp){
        return (temp-32)*5/9;
    }

    public static double convertirCentigradosAFarenheit(double temp){
        return (temp*9/5+32);
    }
}

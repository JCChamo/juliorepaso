package TiposDeDatos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día de la semana que quieres " +
                "tomar de partida para el cálculo (lunes-domingo)");
        String dia = sc.nextLine();
        System.out.println("Introduzca cuántos días han pasado");
        int sumaDia = sc.nextInt();
        int cuentaDiaFinal = sumaDia % 7;
        //System.out.println(cuentaDiaFinal);
        switch (cuentaDiaFinal) {
            case 0:
                System.out.printf("Dentro de %d días será lunes", sumaDia);
                break;
            case 1:
                System.out.printf("Dentro de %d días será martes", sumaDia);
                break;
            case 2:
                System.out.printf("Dentro de %d días será miércoles", sumaDia);
                break;
            case 3:
                System.out.printf("Dentro de %d días será jueves", sumaDia);
                break;
            case 4:
                System.out.printf("Dentro de %d días será viernes", sumaDia);
                break;
            case 5:
                System.out.printf("Dentro de %d días será sábado", sumaDia);
                break;
            default:
                System.out.printf("Dentro de %d días será domingo", sumaDia);
                break;
        }
    }
}

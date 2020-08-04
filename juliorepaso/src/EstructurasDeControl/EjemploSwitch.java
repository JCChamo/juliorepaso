package EstructurasDeControl;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        System.out.println("Introduce 1, 2 ó 3");

        Scanner sc = new Scanner(System.in);
        int parte = sc.nextInt();
        switch (parte){
            case 1:
                System.out.println("Hoy toca pierna");
                break;

            case 2:
                System.out.println("Hoy toca espalda");
                break;

            case 3:
                System.out.println("Hoy toca pecho");
                break;
            default:
                System.out.println("Vete pa tu casa");
                break;

        }

    }
}

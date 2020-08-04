package EstructurasDeControl;

import java.util.Scanner;

public class NumeroCifras {
    public static void main(String[] args) {
        System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if (n / 10 == 0)
//            System.out.println("Tiene una cifra");
//        else if (n / 100 == 0)
//            System.out.println("Tiene dos cifras");
//        else if (n / 1000 == 0)
//            System.out.println("Tiene tres cifras");
//        else if (n / 10000 == 0)
//            System.out.println("Tiene cuatro cifras");
//        else if (n / 100000 == 0)
//            System.out.println("Tiene cinco cifras");
//        else
//            System.out.println("Tiene más de cinco cifras");
        int cont = 0;
        for (int i = 10; i<= Integer.MAX_VALUE ; i*=10) {
            cont++;
            if (n / i==0)
                break;
        }
        System.out.printf("%d tiene %d cifras", n, cont);
    }


}

package TiposDatos;

import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba \"1\" si quiere convertir euros a dólares, o escriba \"2\" " +
                "si quiere convertir dólares a euros");
        String moneda = sc.nextLine();
        System.out.println("¿Cuánto dinero quieres convertir?");
        double cantidad = sc.nextDouble();
        final double cambio = 1.13;
        double euroADolar = cantidad * cambio;
        double dolarAEuro = cantidad / cambio;
        if (moneda.equals("1"))
            System.out.printf("%.2f euros equivalen a %.2f dólares", cantidad, euroADolar);
        else if (moneda.equals("2"))
        System.out.printf("%.2f dólares equivalen a %.2f euros", cantidad, dolarAEuro);
        else
            System.out.println("No ha elegido una opción de cambio posible");
    }
}

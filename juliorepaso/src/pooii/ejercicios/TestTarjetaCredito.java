package pooii.ejercicios;

import java.util.Scanner;

public class TestTarjetaCredito {
    public static void main(String[] args) {
        String tarjetaCredito = "";
        for (int i = 0; i < 16; i++) {
            int tmp = (int)(Math.random() * 10);
            tarjetaCredito += tmp + "";
        }

        System.out.println("Escriba el titular de la cuenta");
        Scanner sc = new Scanner(System.in);
        String titular = sc.nextLine();
        TarjetaCredito tc = new TarjetaCredito(tarjetaCredito, titular);
        System.out.println(TarjetaCredito.validarTarjeta(tc.getNumeroTarjeta()));
    }
}

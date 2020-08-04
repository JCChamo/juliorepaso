package Stringbuilder.ejercicios;

import java.util.Scanner;

public class TestClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la clave");
        int longitud = sc.nextInt();
        Clave cl = new Clave(Clave.generarClaveSegura(longitud));
        System.out.println(cl.esClaveSegura());
        //String caracteres = cl.FUENTE_CARACTERES;
//        String str = cl.generarClaveSegura(longitud);
//        System.out.println(str);
        System.out.println(cl.getClave());

    }
}

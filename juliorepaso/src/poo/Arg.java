package poo;
//lista de parámetros dinámica
public class Arg {
    public static void main(String[] args) {

        System.out.println("Suma: " + suma(1));
        System.out.println("Suma: " + suma(1, 2));
        System.out.println("Suma: " + suma(1, 2, 6));


    }

    public static int suma (int ... args) {
        int suma = 0;
        for (int i = 0; i < args.length; i++)
            suma += args[i];

        return suma;
    }
}

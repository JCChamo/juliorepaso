package poo.Ejercicios;

public class MetodosClaseMath {
    private static int a = -557;
    private static double b = -345.51;
    private static double c = 200.2;



    public static void main(String[] args) {
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.random());
        System.out.println(Math.round(b));

        System.out.println(Math.sqrt(c));
        System.out.println(Math.cbrt(c));
        System.out.println(Math.cbrt(a));

    }
}

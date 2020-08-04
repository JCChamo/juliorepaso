package poo.Ejercicios;

public class Matematicas {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Matematicas m = new Matematicas();
        m.setA(5.2);
        Matematicas m2 = new Matematicas();
        m2.setA(-10.7);
        System.out.println(m.getA());
        System.out.println(devolverRaizCuadrada(m.getA()));
        System.out.println(devolverRaizCubicaAbs(m.getA()));

        System.out.println(devolverRedondeado(m.getA()));
        System.out.println(devolverRedondeado(m2.getA()));

        System.out.println((int)devolverAleatorio(m.getA()));

        System.out.println(Double.isInfinite(0/5));
        System.out.println(Double.isNaN(Math.sqrt(m2.getA())));
    }

    public static double devolverRaizCuadrada(double a){
        return Math.sqrt(a);
    }

    public static double devolverRaizCubicaAbs(double a){
        return Math.abs(Math.cbrt(a));
    }

    public static long devolverRedondeado(double a) {
        if (a > 0)
            return Math.round(a);
        else
            return Math.abs(Math.round(a));
    }

    public static double devolverAleatorio(double a){
        return Math.round(Math.random() * a);
    }
}

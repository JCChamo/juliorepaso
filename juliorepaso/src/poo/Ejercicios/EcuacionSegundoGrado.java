package poo.Ejercicios;

public class EcuacionSegundoGrado {
    private int a;
    private int b;
    private int c;

    public EcuacionSegundoGrado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double resolverEcuacionSegundoGrado(int a, int b, int c){
        double d = b * b - 4 * a * c;
        if (a==0 && b==0 && c==0)
            return 0.0;
        if (a==0 && b==0 && c!=0)
            return 0.0;
        else
            if (a==0 & b!=0)
                return - c/b;
            else if (d > 0)
                return 0.0;
            else if (d==0)
                return -b / 2 * a;
            else
                d = Math.abs(d);
                return -b + Math.sqrt(d)/2 * a;
    }
}

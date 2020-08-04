package pooii;

public class EjemploVariableInstanciaYClase {
    public static int factorial1(int n){
        int resultado = 1;
        for (int i = 1; i <= n; i++)
            resultado *= i;
        return resultado;
        }

    public int factorial2(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++)
            resultado *= i;
        return resultado;
    }

}

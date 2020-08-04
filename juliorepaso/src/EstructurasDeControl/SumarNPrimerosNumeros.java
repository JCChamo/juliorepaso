package EstructurasDeControl;

public class SumarNPrimerosNumeros {
    public static void main(String[] args) {
        int n = 0;
        int suma = 0;
        int cont = 1;
        while (cont <= n) {
            suma += cont;
            cont++;
        }
        System.out.println(suma);
    }
}

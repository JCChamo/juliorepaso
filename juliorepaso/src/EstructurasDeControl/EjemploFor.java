package EstructurasDeControl;

public class EjemploFor {
    public static void main(String[] args) {
        int n = 5;
        int coicidencia = -1;
        for (int i = 0; i != n; i++) {
            coicidencia = i;
        }
        System.out.println("El número coincide, " + (coicidencia + 1));

    }
}

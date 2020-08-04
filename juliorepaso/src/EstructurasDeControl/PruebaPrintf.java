package EstructurasDeControl;

public class PruebaPrintf {
    public static void main(String[] args) {
        //double a = 1.2598;
        //System.out.printf("%+010.3f", a);
        double b = 1.22134579;
        System.out.printf("%10.2f%n", b);
        String total = "Total:";
        System.out.printf("%-10s%n", total);

        System.out.printf(" %8d %8s %8.1f\n", 1234, "Java", 5.6);
        System.out.printf(" %-8d %-8s %-8.1f \n", 1234, "Java", 5.6);


        int altura = 177;
        int alturaedificio = altura >= 177 ? 300 : altura;
        System.out.println(alturaedificio);
    }
}

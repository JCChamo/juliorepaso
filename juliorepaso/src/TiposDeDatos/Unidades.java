package TiposDatos;

public class Unidades {

    public static double deLibrasAKg (double libras) {
        return libras*0.453592;
    }
    public static double deKgALibras (double kg) {
        return kg/0.453592;
    }

    public static void main(String[] args) {
        double cantidad = Unidades.deLibrasAKg(10);
        System.out.printf("10 libras son %.2f kilogramos", cantidad);
    }
}

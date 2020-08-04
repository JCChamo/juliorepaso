package pooii.ejercicios;

public class TestRectangulo {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(3, 2);
        Rectangulo r3 = new Rectangulo(11, 7);

        System.out.println(Rectangulo.devolverNumeroRectangulos());
        System.out.println(Rectangulo.ClaseInterna.devolverNumeroRectangulos());
    }
}

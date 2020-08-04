package pooii.ejercicios;

import org.w3c.dom.css.Rect;

public class Rectangulo {

    private double ancho = 1;
    private double alto = 1;

    private static int nRectangulos;

    public Rectangulo() {
        nRectangulos++;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        nRectangulos++;
    }

    public static double devolverArea(double ancho, double alto) {
        return ancho * alto;
    }

    public static double devolverPerimetro(double ancho, double alto) {
        return ancho*2 + alto*2;
    }

    public static int devolverNumeroRectangulos() {

        return nRectangulos;
    }

    public static class ClaseInterna{
        public static int devolverNumeroRectangulos() {

            return nRectangulos;
        }
    }
}

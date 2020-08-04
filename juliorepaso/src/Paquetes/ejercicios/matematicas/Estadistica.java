package Paquetes.ejercicios.matematicas;

import java.util.List;

public class Estadistica {

    //Calcular la media, la moda, la varianza y la desviación típica.

    public static double devolverMedia(int[] coleccion) {
        int suma = 0;
        for (int i = 0; i < coleccion.length; i++)
            suma+= coleccion[i];
        return 1.0 * suma / coleccion.length;
    }

    public static double devolverVarianza(int[] coleccion) {
        double suma = 0.0;
        for (int i = 0; i < coleccion.length; i++)
            suma += Math.pow(coleccion[i] - devolverMedia(coleccion), 2);
        return suma / coleccion.length;

    }

    public static double devolverDesviacionTipica(int[] coleccion) {
        return Math.sqrt(devolverVarianza(coleccion));
    }
}

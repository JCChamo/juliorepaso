package Coleccionesii;

import java.util.List;

public class TiposComodin {

    public static double sumaLista(
            List<? extends Number> lista) {
        double suma = 0.0;
        for (Number numero : lista){
            //suma += numero;
        }
        return suma;
    }
}

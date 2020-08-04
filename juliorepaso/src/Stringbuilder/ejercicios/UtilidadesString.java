package Stringbuilder.ejercicios;

import java.util.List;

public class UtilidadesString {
    public static final String[] ARTICULOS_DETERMINADOS = {"el", "la", "lo", "los", "las"};
    public static final String[] ARTICULOS_INDETERMINADOS = {"un", "unos", "una", "unas"};
    public static final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra",
            "de", "desde", "hacia", "hasta", "para", "en", "durante", "mediante", "por",
            "sin", "sobre", "tras"};

    public static int numeroPalabras(List<String> texto){
    return texto.size();
    }

    public static int numeroPreposiciones(List<String> texto){
        int contador = 0;
        for (String palabra:texto) {
            for (String preposicion:PREPOSICIONES) {
                if (palabra.equals(preposicion)) {
                    contador++;
                    //System.out.println(palabra);
                }
            }
        }
        return contador;
    }

    public static int numeroArticulosDeterminados(List<String> texto){
        int contador = 0;
        for (String palabra:texto) {
            for (String articulosDeterminados:ARTICULOS_DETERMINADOS) {
                if (palabra.equals(articulosDeterminados)) {
                    contador++;
                    //System.out.println(palabra);
                }
            }
        }
        return contador;
    }

    public static int numeroArticulosIndeterminados(List<String> texto){
        int contador = 0;
        for (String palabra:texto) {
            for (String articulosIndeterminados:ARTICULOS_INDETERMINADOS) {
                if (palabra.equals(articulosIndeterminados)) {
                    contador++;
                    //System.out.println(palabra);
                }
            }
        }
        return contador;
    }



}

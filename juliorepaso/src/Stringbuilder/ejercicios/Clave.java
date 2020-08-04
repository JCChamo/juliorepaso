package Stringbuilder.ejercicios;

import java.util.Arrays;
import java.util.Random;

/** Clase que contiene métodos para crear una clave de más de ocho caracteres y
 * determina si es segura según unos requisitos.
 * @author jc
 * @version 1.0
 */
public class Clave {
    private String clave;
    private static final String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkK" +
            "lLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789" +
            "¿?()=@.:,;¡!&{}";


    public Clave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Determina si la clave es segura o no
     * @return boolean
     */
    public boolean esClaveSegura(){
        //String unaMinuscula = "[a-z]+";
        boolean ochoCaracteresMinimo = false;
        boolean unaMinusculaMinimo = false;
        boolean unaMayusculaMinimo = false;
        boolean unNumeroMinimo = false;
        boolean unNoAlfanumericoMinimo = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);

            if (clave.length() >= 8)
                ochoCaracteresMinimo = true;

            if (Character.isLowerCase(c))
                unaMinusculaMinimo = true;

            if (Character.isUpperCase(c))
                unaMayusculaMinimo = true;

            if (Character.isDigit(c))
                unNumeroMinimo = true;

            if (!Character.isLetterOrDigit(c))
                unNoAlfanumericoMinimo = true;


        }
        return ochoCaracteresMinimo && unaMinusculaMinimo &&
                unaMayusculaMinimo && unNumeroMinimo &&
                unNoAlfanumericoMinimo;
    }

    /**
     * Genera una clave segura
     * @param longitud de tipo entero
     * @return String
     */
    public static String generarClaveSegura(int longitud) {
        String cont = "";
        String[] nuevo = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(FUENTE_CARACTERES.length());//returns a random number between 0 and the index of the last character of the string
            //nuevo = cont.concat(randomIndex + "");
            char c = FUENTE_CARACTERES.charAt(randomIndex);
            //nuevo[i] = c + "";
            cont += c;
            //System.out.println(FUENTE_CARACTERES.charAt(randomIndex) + "");

        }
//        for (String elemento: nuevo)
//            cont += elemento;
//        System.out.println(cont);
        return cont;
    }
}

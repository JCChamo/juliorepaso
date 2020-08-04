package EstructurasDeControl;
public class numeroConsonantes {

    public static void main(String[]args){
            String palabra = "esternocleidomastoideo";
            int contador=0;
            for (int i=0; i<palabra.length(); i++){
                String letra = palabra.substring(i,i+1);
                if (letra.contains("a") || letra.contains("e") ||
                letra.contains("i") || letra.contains("o") ||
                letra.contains("u") || letra.contains(" "))
                    continue;

            contador++;

            }
        System.out.println("La palabra tiene " + contador + " vocales");
    }
}



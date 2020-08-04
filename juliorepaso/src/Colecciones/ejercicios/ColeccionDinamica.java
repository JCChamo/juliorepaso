package Colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColeccionDinamica {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
//        System.out.println("Introduce cadenas (fin o FIN para terminar)");
//        Scanner sc = new Scanner(System.in);
//        String terminarBucle = "";
//        while (!terminarBucle.equalsIgnoreCase("fin")){
//            terminarBucle = sc.nextLine();
//            lista.add(terminarBucle);
//        }
//        lista.remove(lista.size() - 1);
//        System.out.println(lista.toString());
        List<String> cadenaMasLarga = devolverCadenasMasLargas();
        System.out.println(devolverCadenasMasLargas().toString());
        String cadena = "estuy miy bien jejeje";
        System.out.println(estaLaCadenaEnLaColeccion(cadenaMasLarga, cadena));
        System.out.println(anadirCadenaAColeccion(cadenaMasLarga, "patata"));
        System.out.println(anadirCadenaAColeccion(cadenaMasLarga, "patata"));

    }

    public static List<String> devolverCadenasMasLargas(){
        List<String> cadenasMasLargas = new ArrayList<>();
        cadenasMasLargas.add("hola");
        cadenasMasLargas.add("que");
        cadenasMasLargas.add("tal");
        cadenasMasLargas.add("estoy muy bien");
        cadenasMasLargas.add("estuy muy bien");
        cadenasMasLargas.add("estuy miy bien");
        cadenasMasLargas.add("estuy miy bien jejeje");
        cadenasMasLargas.add("est");

        List<String> nuevoArray = new ArrayList<>();
        //String cadena = "";
        int tamano = 0;
        for (String cadena:cadenasMasLargas) {
//modificación del código del profesor, parece que no tiene fallo (?)
                if (cadena.length() > tamano) {
                    tamano = cadena.length();
                    nuevoArray.clear();
                }
                if (cadena.length() >= tamano)
                nuevoArray.add(cadena);
        }




//Aproximación
//        for (int i = 0; i < cadenasMasLargas.size(); i++) {
//            if (cadenasMasLargas.get(i).length() >= cadena.length())
//                nuevoArray.add(cadenasMasLargas.get(i));
//            cadena = cadenasMasLargas.get(i);
//            if (nuevoArray.get(0).length() < nuevoArray.get(nuevoArray.size()-1).length())
//                nuevoArray.remove(0);
//        }

        return nuevoArray;
    }

    public static boolean estaLaCadenaEnLaColeccion(List<String> cadenaMasLarga, String cadena) {
        for (String elemento : cadenaMasLarga) {
            if (elemento.equals(cadena))
                return true;
        }
        return false;
    }

    public static boolean anadirCadenaAColeccion(List<String> cadenaMasLarga, String cadenaAAnadir){
        return cadenaMasLarga.add(cadenaAAnadir);
    }

    public static boolean eliminarCadenaAColeccion(List<String> cadenaMasLarga, String cadenaAAnadir){
        return cadenaMasLarga.remove(cadenaAAnadir);
    }

}

//Profesor
//if (cadena.length() >= tamanno){
//               if (cadena.length() > tamanno) {
//                   tamanno = cadena.length();
//                   listaCadenasGrandes.clear();
//               }
//               listaCadenasGrandes.add(cadena);

/*si el tamaño de la cadena es mayor o igual que 0 entra en el if
si es mayor, asigno el tamaño de la cadena a "tamaño"
limpio la lista
añado la cadena finalmente*/


package Stringbuilder.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeerNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabras (introduce \"0\" para acabar)");
        String palabra = "";
        List<String> lista = new ArrayList<>();
        int cont = 0;
        while (sc.hasNextLine()) {
            palabra = sc.nextLine();
            if (palabra.equals("0"))
                break;
            lista.add(palabra);
            cont++;
        }
        System.out.println("Palabras leídas: " + cont);
        System.out.println(empiezaPor(lista, 'c').toString());
        System.out.println(noAcabaEnVocal(lista).toString());
        System.out.println(Arrays.toString(devolverLongitudPalabraMasLargaYMasCorta(lista)));
        System.out.printf("¿Está la palabra? %n%s%n", estaPalabraEnLaLista(lista, "alcachofa"));
        System.out.println(estanCaracteresEnLista(lista, "kkk"));

    }
    public static List<String> empiezaPor (List<String> lista, char letra){
        List<String> nombresEmpiezanPor = new ArrayList<>();

        for (String palabra:lista)
            if (palabra.toLowerCase().startsWith(letra + ""))
                nombresEmpiezanPor.add(palabra);

        return nombresEmpiezanPor;
    }

    public static List<String> noAcabaEnVocal (List<String> lista){
        List<String> nombresNoAcabanEnVocal = new ArrayList<>();

        for (String palabra:lista)
            if (!palabra.toLowerCase().matches("^.*[aeiouáéíóúü]$"))
                nombresNoAcabanEnVocal.add(palabra);

        return nombresNoAcabanEnVocal;
    }

    public static int[] devolverLongitudPalabraMasLargaYMasCorta(List<String> lista){
        int[] longitudPalabraMasLargaYMasCorta = new int[2];
        String palabraMasLarga = "";
        String palabraMasCorta = "";
        int enteroMasLargo = Integer.MIN_VALUE;
        int enteroMasCorto = Integer.MAX_VALUE;
        for (String palabra:lista) {
            if (palabra.length() > enteroMasLargo) {
                enteroMasLargo = palabra.length();
                palabraMasLarga = palabra;
                longitudPalabraMasLargaYMasCorta[0] = palabra.length();
            }
            if (palabra.length() < enteroMasCorto) {
                enteroMasCorto = palabra.length();
                palabraMasCorta = palabra;
                longitudPalabraMasLargaYMasCorta[1] = palabra.length();
            }

        }
        return longitudPalabraMasLargaYMasCorta;
    }

    public static boolean estaPalabraEnLaLista(List<String> lista, String palabra){
        return lista.contains(palabra);
    }

    public static List<String> estanCaracteresEnLista(List<String> lista, CharSequence cs){
        List<String> palabrasQueContienenCharSeq = new ArrayList<>();

        for (String palabra:lista)
            if (palabra.contains(cs))
                palabrasQueContienenCharSeq.add(palabra);

        return palabrasQueContienenCharSeq;
    }

}

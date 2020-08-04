package Paquetes.ejercicios.Fecha;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha {
    public static LocalDate devolverDiaMesAno(){
//        int dia = 0, mes = 0, ano = 0, diaMax = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca su fecha de nacimiento");
//        do {
//            System.out.println("Introduce el mes");
//            mes = sc.nextInt();
//        } while (mes < 1 || mes > 12);
//
//        do {
//            System.out.println("Introduce el año");
//            ano = sc.nextInt();
//        } while (ano < 1900 || ano > 4000);
//
//        //cálculo del día máximo
//
//        switch (dia) {
//            case 1:
//            case 3:
//            case 5:
//            case 8:
//            case 10:
//            case 12:
//                diaMax = 31;
//                break;
//            case 2:
//                if (ano % 4 == 0)
//                    diaMax = 29;
//                else
//                    diaMax = 28;
//                break;
//            default:
//                diaMax = 30;
//
//        }
//
//        do {
//            System.out.println("Introduce el día");
//            dia = sc.nextInt();
//        } while (dia < 1 || dia > diaMax);
//
//        sc.close();
//        return LocalDate.of(ano, mes, dia);

        Scanner sc = new Scanner(System.in);

        System.out.println("PORFAVOR INTRODUZCA EL anno ");
        int dia  = sc.nextInt();
        System.out.println("PORFAVOR INTRODUZCA EL mes ");
        int mes = sc.nextInt();
        System.out.println("PORFAVOR INTRODUZCA EL dia ");
        int ano = sc.nextInt();
        LocalDate fecha = LocalDate.of(dia, mes , ano);
        return fecha ;
    }

    public static LocalDate devolverLocalDateActual(){
        return LocalDate.now();
    }

    public static String devolverFechaFormatoEspanol(LocalDate fecha){
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        //fecha = LocalDate.parse(fecha.toString(), fechaFormateada);
        return fechaFormateada.format(fecha);
    }

    public static int devolverAnosTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal){
        Period periodo = Period.between(fechaInicial, fechaFinal);
        return periodo.getYears();
    }
}

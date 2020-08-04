package Paquetes.ejercicios.Fecha;

import java.time.LocalDate;

public class TestFecha {
    public static void main(String[] args) {
        //System.out.printf("Fecha: %s%n", Fecha.devolverDiaMesAno());

        System.out.printf("Fecha actual: %s %n", Fecha.devolverLocalDateActual());

        //LocalDate fecha = LocalDate.parse("2020-05-16");
        //LocalDate fecha = LocalDate.now();
        //System.out.printf("Fecha formateada: %s", Fecha.devolverFechaFormatoEspanol(fecha));

        LocalDate fechaInicial = Fecha.devolverDiaMesAno();
        LocalDate fechaFinal = LocalDate.now();
        System.out.printf("Tienes %d años", Fecha.devolverAnosTranscurridos(fechaInicial, fechaFinal));

    }
}

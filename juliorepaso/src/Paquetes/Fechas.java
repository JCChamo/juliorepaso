package Paquetes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fechas {
    public static void main(String[] args) {
        LocalDate date;
        LocalTime time;
        LocalDateTime dateTime;

        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.printf("%s,%d, %d %n", date.getMonth(), date.getDayOfMonth(), date.getMonthValue());
        LocalTime nuevaHora;
        nuevaHora = time.plusHours(7);
        System.out.println(nuevaHora);

    }
}

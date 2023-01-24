package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, 1, 1);
        LocalTime time = LocalTime.of(16, 45);

        LocalDateTime localDateAndTime1 = LocalDateTime.of(date, time);
        System.out.println(localDateAndTime1);

        LocalDateTime localDateAndTime2 = LocalDateTime.of(2000, 1, 1, 16, 45);
        System.out.println(localDateAndTime2);

        LocalDateTime localDateAndaTime3 =  date.atTime(time);
        System.out.println(localDateAndaTime3);

        LocalDateTime localDateAndaTime4 =  time.atDate(date);
        System.out.println(localDateAndaTime4);

        String formattedDateTime =  localDateAndaTime4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(formattedDateTime);
    }
}

package legacy;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateAndInstantApp {

    public static void main(String[] args) {

        Instant inst = LocalDateTime.of(2030, 10, 1, 10, 0, 0).toInstant(ZoneOffset.UTC);
        System.out.println(inst);

        //Instant to Date
        Date date = Date.from(inst);
        System.out.println(date);

        //Date to Instant
        Instant inst2 = date.toInstant();
        System.out.println(inst2);

        //Date to Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }
}

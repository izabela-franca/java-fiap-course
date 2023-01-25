package legacy;

import java.util.Calendar;

public class CalendarApp {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.MAY, 3, 14, 30, 20);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DATE, 5);
        System.out.println(calendar.getTime());
    }
}

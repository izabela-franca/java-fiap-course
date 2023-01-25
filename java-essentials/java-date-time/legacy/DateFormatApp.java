package legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatApp {

    public static void main(String[] args) throws Exception{

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.APRIL, 10, 8, 0, 0);
        System.out.println(calendar.getTime());

        //Formatting Object to Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formatted =  sdf.format(calendar.getTime());
        System.out.println(formatted);

        //Formatting Date to object
        Date parsedDate = sdf.parse("15/05/2010 14:00:00");
        System.out.println(parsedDate);
    }
}

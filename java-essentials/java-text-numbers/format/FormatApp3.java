package format;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {

    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getInstance();
        String formatted = nf.format(n);

        System.out.println(formatted);

    }
}

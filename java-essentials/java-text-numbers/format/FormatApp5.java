package format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Currency;

public class FormatApp5 {

    public static void main(String[] args) {

        double n = 3879456.21;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        //Tirar separador de milhar
        nf.setGroupingUsed(false);
        //Número mínimo de casas decimais
        nf.setMinimumFractionDigits(4);
        //Número máximo de casas decimais
        nf.setMaximumFractionDigits(4);
        //Formatando moeda
        nf.setCurrency(Currency.getInstance("EUR"));

        new PrintWriter(System.out, true, StandardCharsets.UTF_8).println(nf.format(n));
    }
}

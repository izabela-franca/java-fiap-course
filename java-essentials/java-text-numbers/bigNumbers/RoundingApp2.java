package bigNumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingApp2 {

    public static void main(String[] args) {

        BigDecimal d = BigDecimal.valueOf(10.43);
        //Changing the  number of decimal places
        d = d.setScale(1, RoundingMode.UP);
        System.out.println(d);
    }
}

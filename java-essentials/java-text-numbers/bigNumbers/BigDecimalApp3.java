package bigNumbers;

import java.math.BigDecimal;

public class BigDecimalApp3 {

    public static void main(String[] args) {

        BigDecimal n1 = BigDecimal.valueOf(1.0);
        BigDecimal n2 = BigDecimal.valueOf(1);

        System.out.println(n1 == n2);   //Do not use it with BigDecimals
        System.out.println(n1.equals(n2));  //Do not use it with BigDecimals

        System.out.println(n1.compareTo(n2));   //It returns 0 if they have the same value
    }
}

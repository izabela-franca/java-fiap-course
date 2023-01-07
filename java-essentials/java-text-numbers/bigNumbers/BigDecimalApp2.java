package bigNumbers;

import java.math.BigDecimal;

public class BigDecimalApp2 {

    public static void main(String[] args) {

        //double amount = 1.09 - 0.62 + 0.54;

        BigDecimal amount = new BigDecimal("1.09");
        //Or
        BigDecimal amount2 = BigDecimal.valueOf(1.09);

        amount = amount.subtract(BigDecimal.valueOf(0.62));
        amount = amount.add(BigDecimal.valueOf(0.54));
        System.out.println(amount);
    }
}

package bigNumbers;

import java.math.BigDecimal;

public class BigDecimalApp1 {

    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("12345678987654321.123456");
        System.out.println(big);
        big = big.multiply(BigDecimal.TWO);
        System.out.println(big);
    }
}

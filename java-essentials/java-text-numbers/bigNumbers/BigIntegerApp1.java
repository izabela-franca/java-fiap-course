package bigNumbers;

import java.math.BigInteger;

public class BigIntegerApp1 {

    public static void main(String[] args) {

        BigInteger big = new BigInteger("123456789876543212345678987654321");
        System.out.println(big);
        big = big.add(BigInteger.TEN);
        System.out.println(big);
    }
}

package basic;

import java.util.Arrays;
import java.util.Random;

public class App7 {

    public static void main(String[] args) {

        Random random = new Random();

        //Retornando Stream de números aleatórios
        int[] array = random
                .ints(10, 0, 11)
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}

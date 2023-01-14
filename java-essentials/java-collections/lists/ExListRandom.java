package lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ExListRandom {

    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(generate(10));

    }

    private static List<Integer> generate(int number) {
        var numbers = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++) {
            numbers.add(random.nextInt(0, 101));
        }

        numbers.sort(Comparator.naturalOrder());
        return numbers;
    }
}

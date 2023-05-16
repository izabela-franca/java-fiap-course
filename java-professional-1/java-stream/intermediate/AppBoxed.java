package intermediate;

import java.util.Arrays;
import java.util.List;

public class AppBoxed {

    public static void main(String[] args) {

        var numbers = List.of(1, 2, 3, 4, 5);

        //Tranformando uma Stream em uma IntStream (mapToInt)
        var array = numbers
                .stream()
                .mapToInt(i -> i)
                .toArray();

        //Tranformando uma IntStream em uma Stream (boxed)
        var s = Arrays
                .stream(array)
                .boxed()
                .toList();

        System.out.println(s);
    }
}

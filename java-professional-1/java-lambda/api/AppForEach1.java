package api;

import java.util.List;

public class AppForEach1 {

    public static void main(String[] args) {

        var numbers = List.of(1, 2, 3, 4, 5, 6);

        //Iterando sobre coleções usando Lambda Expressions - Utiliza Consumer
        numbers.forEach(n -> System.out.println(n));

        //Usando method references
        numbers.forEach(System.out::println);
    }
}

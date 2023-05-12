package basic;

import java.util.Comparator;
import java.util.List;

public class App3 {

    public static void main(String[] args) {

        var people = List.of(
          new Person("Izabela", 31),
          new Person("Diego", 31),
          new Person("Vilma", 58),
          new Person ("Ismael", 65)
        );

        //Filtrando dados
        people
                .stream()
                .map(p -> p.age)
                .filter(a -> a >= 40)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

    record Person (String name, int age) {}
}

package api;

import java.util.Arrays;
import java.util.Comparator;

public class AppSort2 {

    public static void main(String[] args) {

        var people = Arrays.asList(
          new Person("Izabela", 31),
          new Person("Diego", 36),
          new Person("Vilma", 59),
          new Person("Ismael", 63),
          new Person("Diego", 31)
        );

        people.sort(Comparator.comparing(Person::name));    //people.sort((p1, p2) -> p1.name().compareTo(p2.name));
        //Ordenando por um segundo critério de ordenação
        people.sort(Comparator.comparing(Person::name).thenComparing(Person::age));
        people.forEach(p -> System.out.println(p.name + " - " + p.age));

        System.out.println("---------------");

        people.sort(Comparator.comparing(Person::name).reversed());
        people.forEach(p -> System.out.println(p.name + " - " + p.age));

    }

    record Person(String name, int age) {}
}

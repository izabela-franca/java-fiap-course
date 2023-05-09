import java.util.List;
import java.util.stream.Collectors;

public class App5 {

    public static void main(String[] args) {

        var people = List.of(
          new Person("Izabela", 31),
          new Person("Diego", 31),
          new Person("Vilma", 58),
          new Person ("Ismael", 65)
        );

        List<String> names = people
                .stream()
                .map(Person::name)
                .map(String::toUpperCase)
                .filter( n -> n.startsWith("I"))
                .toList();

        System.out.println(names);
    }

    record Person (String name, int age) {}
}

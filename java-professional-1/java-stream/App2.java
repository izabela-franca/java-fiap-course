import java.util.List;

public class App2 {

    public static void main(String[] args) {

        var people = List.of(
          new Person("Izabela", 31),
          new Person("Diego", 31),
          new Person("Vilma", 58),
          new Person ("Ismael", 65)
        );

        //Encadeando operações de stream
        people
                .stream()
                .map(p -> p.name())     //operação intermediária
                .map(n -> n.toUpperCase())   //operação intermediária
                .sorted()    //operação intermediária
                .forEach(n -> System.out.println(n));   //operação terminal

    }

    record Person (String name, int age) {}
}

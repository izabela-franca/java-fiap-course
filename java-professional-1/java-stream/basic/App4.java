package basic;

import java.util.List;

public class App4 {

    public static void main(String[] args) {

        var people = List.of(
          new Person("Izabela", 31),
          new Person("Diego", 31),
          new Person("Vilma", 58),
          new Person ("Ismael", 65)
        );

        //Encadeando operações de stream
        int max = people
                .stream()
                .mapToInt(Person::age)
                .max()  //Operação terminal - encontrando o maior valor
                .orElse(0);

        int min = people
                .stream()
                .mapToInt(Person::age)
                .min()  //Operação terminal - encontrando o menor valor
                .orElse(0);

        double avg = people
                .stream()
                .mapToInt(Person::age)
                .average()  //Operação terminal - calculando a média
                .orElse(0);

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }

    record Person (String name, int age) {}
}

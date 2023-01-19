package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExPerson {

    public static void main(String[] args) {

        var people  = List.of(
                new Person(1, "Izabela"),
                new Person(2, "Diego"),
                new Person(3, "Luiza"),
                new Person(4, "Pedro")
        );

        Map<Long, String> map = new HashMap<>();

        for (Person person : people) {
            map.put(person.id(), person.name());
        }

        System.out.println(map);
    }
}

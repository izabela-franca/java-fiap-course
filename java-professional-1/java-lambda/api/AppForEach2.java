package api;

import java.util.Map;

public class AppForEach2 {

    public static void main(String[] args) {

        var people = Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Murilo",
                4, "Ismael",
                5, "Vilma"
        );

        people.keySet().forEach(System.out::println);
        people.values().forEach(k -> System.out.println(k));

        //Maps, ao usar forEach(), utilizam BiConsumer
        people.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

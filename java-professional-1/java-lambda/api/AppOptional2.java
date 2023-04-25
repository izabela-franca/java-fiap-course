package api;

import java.util.Map;

public class AppOptional2 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        var name = people.getNameById(3);

        //Refatorando com Lambda Expressions e ifPresent()
        name.ifPresent(n -> {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        });

        //Simplificando ainda mais
        people.getNameById(2).ifPresent(n -> System.out.println(n.toUpperCase()));
    }
}

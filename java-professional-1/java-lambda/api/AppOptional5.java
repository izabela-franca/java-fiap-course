package api;

import java.util.Map;

public class AppOptional5 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        //Filtrando dados
        people
                .getNameById(2)
                .filter(n -> n.startsWith("I"))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nome não começa com I"));
    }
}

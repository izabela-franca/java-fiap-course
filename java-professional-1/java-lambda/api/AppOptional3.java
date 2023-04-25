package api;

import java.util.Map;

public class AppOptional3 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        var name = people.getNameById(3);

        //Utilizando o ifPresentOrElse()
        people
                .getNameById(6)
                .ifPresentOrElse(
                        n -> System.out.println(n.toUpperCase()),
                        () -> System.out.println("Id não encontrado")
                );
    }
}

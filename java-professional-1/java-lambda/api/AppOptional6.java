package api;

import java.util.Map;

public class AppOptional6 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        //Transformando os dados
        int count = people
                .getNameById(2)
                .map(n -> n.length())
                .orElse(0);

        System.out.println(count);
    }
}

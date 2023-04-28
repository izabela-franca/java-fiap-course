/*
O Optional foi introduzido para representar um valor ausente dentro de um retorno de método
*/

package api;

import java.util.Map;

public class AppOptional1 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        var name = people.getNameById(3);

        //Acessando uma informação dentro do Optional
        if (name.isPresent()) {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        }
    }
}

package api;

import java.util.Map;

public class AppOptional4 {

    public static void main(String[] args) {

        People people = new People(Map.of(
                1, "Izabela",
                2, "Diego",
                3, "Ismael",
                4, "Vilma"
        ));

        String name = people.getNameById(6).orElse("X");    //Caso não possua valor, retornará "X"
        System.out.println(name);

        String name2 = people.getNameById(6).orElseGet(() -> "X");   //Recebe um Supplier, ou seja, podemos colocar uma Lambda expression toda
        System.out.println(name2);

        String name3 = people.getNameById(6).orElseThrow(() -> new RuntimeException("ID não encontrado")); //Lançará uma excessão se não existir o valor
        System.out.println(name3);
    }
}

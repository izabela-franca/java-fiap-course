/*
O Optional foi introduzido para representar um valor ausente dentro de um retorno de método
É um container que reprensenta informações retornadas, podendo ou não estar presentes.
*/

package api;

import java.util.Map;

public class AppOptional1 {
https://github.com/izabela-franca/java-insider-course/blob/main/java-professional-1/java-lambda/api/AppOptional1.java
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

package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ExListOperations {

    public static void main(String[] args) {

        var numbers = new ArrayList<>(Arrays.asList(3, 6, 2, 4, 9, 7, 1, 5, 8, 0));

        //Somando 2 em cada um dos números
        numbers.replaceAll(n -> n + 2);

        //Removendo os números pares da lista
        numbers.removeIf(n -> n % 2 == 0);

        //Ordenando a lista em ordem numérica decrescente
        numbers.sort(Comparator.reverseOrder());

        //Imprimindo
        numbers.forEach(System.out::println);
    }
}

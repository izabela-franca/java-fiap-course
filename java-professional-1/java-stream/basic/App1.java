package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App1 {

    public static void main(String[] args) {

        //Opção 1: criando uma Stream
        Stream<String> s1 = Stream.of("A", "B", "C");

        //Opção 2: criando uma Stream para arrays
        String[] array = {"A", "B", "C"};
        Stream<String> s2 = Arrays.stream(array);

        //Opção 3: Criando uma Stream para coleções de dados
        List<String> list = List.of("A", "B", "C");
        Stream<String> s3 = list.stream();

        //Operação terminal
        s1.forEach(System.out::println);
    }
}

package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AppSort1 {

    public static void main(String[] args) {

        var letters = new ArrayList<>(Arrays.asList('C', 'B', 'E', 'F', 'A', 'D'));
        System.out.println(letters);

        //Comparator é uma FunctionalInterface, portanto podemos usá-lo em uma Lambda Expression

        //letters.sort((l1, l2) -> l1.compareTo(l2));
        letters.sort(Character::compareTo);
        System.out.println(letters);

        letters.sort((l1, l2) -> -l1.compareTo(l2));
        System.out.println(letters);

        //Também podemos usar métodos da própria classe Comparator
        letters.sort(Comparator.naturalOrder());
        System.out.println(letters);
        letters.sort(Comparator.reverseOrder());
        System.out.println(letters);

    }
}

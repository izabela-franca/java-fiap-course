package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp1 {

    public static void main(String[] args) {

        //Out of order
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------");

        //In Order
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("E");
        set2.add("I");
        set2.add("O");
        set2.add("U");

        for (String s2 : set2) {
            System.out.println(s2);
        }
    }
}

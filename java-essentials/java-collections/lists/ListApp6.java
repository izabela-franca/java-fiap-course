package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListApp6 {

    public static void main(String[] args) {

        var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println(list);

        var list2 = new ArrayList<>(List.of("banana", "avocado", "papaya", "grapes", "mango"));
        Collections.sort(list2);
        System.out.println(list2);
    }
}

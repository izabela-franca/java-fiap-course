package lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp5 {

    public static void main(String[] args) {

        var list1 = new ArrayList<>(List.of('A', 'B','C'));
        var list2 = new ArrayList<>(List.of( 'C', 'D', 'E'));

       // list1.retainAll(list2);
       // System.out.println(list1);

        //list1.addAll(list2);
        //System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}

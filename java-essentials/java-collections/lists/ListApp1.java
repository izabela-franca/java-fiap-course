package lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp1 {

    public static void main(String[] args) {

        //Option 1
        var l1 = new ArrayList<Integer>();
        //Option 2
        List<Integer> l2 = new ArrayList<>();   //list of objects

        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(7);
        l1.remove(1);

        for (Integer i : l1) {
            System.out.println(i);
        }

        //Accessing an element by index
        //System.out.println(l1.get(1));
    }
}

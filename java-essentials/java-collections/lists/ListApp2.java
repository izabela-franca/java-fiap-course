package lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp2 {

    public static void main(String[] args) {

        //Immutable list
        var list = List.of("A", "B", "C", "D");

        //Mutable
        var list2 = new ArrayList<>(List.of("E", "F", "G", "H"));
    }
}

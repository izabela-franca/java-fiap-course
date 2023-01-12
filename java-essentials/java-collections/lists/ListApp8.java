package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListApp8 {

    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
                new ListPerson("Maria" , 45),
                new ListPerson("Paulo", 36),
                new ListPerson("Pedro", 40)
        ));

        //Sorting by age
       // Collections.sort(people);   //We have to implement the class Comparable

        //Sorting by name
        Collections.sort(people, new PersonComparator());

        for(var p: people) {
            System.out.format("==> %s\n", p);
        }
    }
}

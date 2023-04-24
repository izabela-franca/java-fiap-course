package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppRemoveIf1 {

    public static void main(String[] args) {

        var letters = new ArrayList<>(Arrays.asList('A', 'b', 'C', 'd', 'E', 'f'));
        System.out.println(letters);

        /*
        Iterator<Character> iterator = letters.iterator();
        while (iterator.hasNext()) {
            var c = iterator.next();
            if (Character.isLowerCase(c)) {
                iterator.remove();
            }
        }
        */

        //letters.removeIf( c -> Character.isLowerCase(c));
        letters.removeIf(Character::isLowerCase);
    }
}

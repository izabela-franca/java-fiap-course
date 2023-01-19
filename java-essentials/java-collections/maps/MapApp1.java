package maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp1 {

    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();

        //Adding elements
        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        map.put(4, 'D');
        map.put(5, 'E');

        System.out.println(map);

        //Accessing elements
        Character char3 = map.get(3);
        System.out.println(char3);

        System.out.println(map.getOrDefault(6, 'X'));

        //map.size();
        //map.putAll();
        //map.clear


    }
}

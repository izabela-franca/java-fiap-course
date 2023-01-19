package maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp3 {

    public static void main(String[] args) {

        Map<Name, Integer> map = new HashMap<>();
        map.put(new Name("João", "Oliveira"), 49);
        map.put(new Name("Maria", "Lopes"), 45);
        map.put(new Name("Pedro", "Ferrara"), 15);
        map.put(new Name("Pedro", "Ferrara"), 15);  //equals and hashCode are necessary to avoid repetition

        System.out.println(map);
    }
}

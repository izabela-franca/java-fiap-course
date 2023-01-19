package maps;

import javax.naming.InterruptedNamingException;
import java.util.*;

public class MapApp2 {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 500);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 700);

        //Iterating only Keys
        Set<String> keys = scoreMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //Iterating only Values
        Collection<Integer> values = scoreMap.values();
        for (int value : values) {
            System.out.println(value);
        }

        //Iterating both
        var entries = scoreMap.entrySet();
        for (var entry : entries) {
            System.out.format("%s --> %d\n", entry.getKey(), entry.getValue());
        }
    }
}

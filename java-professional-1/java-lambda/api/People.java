package api;

import java.util.Map;
import java.util.Optional;

public class People {

    private final Map<Integer, String> map;

    public People(Map<Integer, String> map) {
        this.map = map;
    }

    //Optional - Serve para representar retornos opcionais, ou seja, pode ter ou não um valor a ser retornado
    public Optional<String> getNameById(int id) {
        for (var entry : map.entrySet()) {
            if (entry.getKey().equals(id)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }
}

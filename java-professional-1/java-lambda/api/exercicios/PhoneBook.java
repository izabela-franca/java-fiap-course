package api.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private final Map<String, String> entries = new HashMap<>();

    public PhoneBook() {
        entries.put("izabela", "123-456");
        entries.put("diego", "456-789");
        entries.put("vilma", "789-123");
    }

    public Optional<String> findByname(String name) {
        return Optional.ofNullable(entries.get(name));
    }
}

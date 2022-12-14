package record;

import java.util.Objects;

public record PersonRecord(String firstName, String lastName, int age) {

    //Modifying a record
    public PersonRecord {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
    }

    //Modifying the constructor
    public PersonRecord(String firstName, String lastName) {
        this(firstName, lastName, 0);
        System.out.println("Person record created");
    }
}

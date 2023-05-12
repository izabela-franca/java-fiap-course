package intermediate;

import java.time.Year;
import java.util.List;

public record Student(
        String name,
        Year yearOfBirth,
        List<Double> grades
) {

    public static List<Student> list() {
        return List.of(
                new Student("Izabela", Year.of(2001), List.of(9.5, 9.2)),
                new Student("Diego", Year.of(2003), List.of(8.9, 10.0)),
                new Student("Pedro", Year.of(2007), List.of(9.3, 9.7)),
                new Student("Luiza", Year.of(2005), List.of(8.5, 8.)),
                new Student("Helena", Year.of(2002), List.of(9.0, 9.8))
        );
    }
}

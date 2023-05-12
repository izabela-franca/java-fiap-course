package intermediate;

public class AppFilter {

    public static void main(String[] args) {

        var students = Student
                .list()
                .stream()
                .filter(s -> s.yearOfBirth().getValue() >= 2004)
                .toList();

        System.out.println(students);

        var grades = Student
                .list()
                .stream()
                .flatMap(s -> s.grades().stream())
                .filter(g -> g >= 9.0)
                .toList();

        System.out.println(grades);
    }
}

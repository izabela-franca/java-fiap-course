package intermediate;

public class AppFlatMap {

    public static void main(String[] args) {

        var grades = Student
                .list()
                .stream()
                .map(Student::grades)
                .flatMap(l -> l.stream())
                .toList();

        System.out.println(grades);
    }
}

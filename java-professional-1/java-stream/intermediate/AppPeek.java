package intermediate;

public class AppPeek {

    public static void main(String[] args) {

        var average = Student
                .list()
                .stream()
                .peek(s -> System.out.println("Stream inicial: " + s))
                .flatMap(s -> s.grades().stream())
                .peek(s -> System.out.println("Após flatMap(): " + s))
                .mapToDouble(d -> d)
                .peek(s -> System.out.println("Após mapToDouble(): " + s))
                .average()
                .orElse(0);

        System.out.println(average);
    }
}

package intermediate;

import java.util.Comparator;

public class AppSorted {

    public static void main(String[] args) {

        //Ordenando dados dentro de uma Stream
        var namesA = Student
                .list()
                .stream()
                .map(Student::name)
                .sorted()
                .toList();
        System.out.println(namesA);

        //Ordenando de formas decrescente dados dentro de uma Stream
        var namesD = Student
                .list()
                .stream()
                .map(Student::name)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(namesD);
    }
}

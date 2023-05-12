package intermediate;

import java.time.Year;
import java.util.Arrays;

public class AppMap {

    public static void main(String[] args) {

        var years = Student
                .list()
                .stream()
                .map(Student::yearOfBirth)
                .mapToInt(Year::getValue)   //mapeando para tipos primitivos
                .toArray();     //não mais toList(), mas agora toArray()

        System.out.println(Arrays.toString(years));
    }
}

package interfaces;

import java.util.function.Function;

public class AppFunction {

    public static void main(String[] args) {

        Person p1 = new Person("Izabela", "França");

        System.out.println(map(p1, Person::getFirstName));      //Method Reference
        System.out.println(map(p1, p -> p.getLastName()));      //Lambda Expression
        System.out.println(map(p1, p -> p.getFirstName() + " " + p.getLastName()));
    }

    public static String map(Person person, Function<Person, String> function) {
        return function.apply(person);
    }

    static class Person {

        private final String  firstName;
        private final String  lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}

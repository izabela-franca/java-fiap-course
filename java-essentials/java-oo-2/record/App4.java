package record;

public class App4 {

    public static void main(String[] args) {

        Person person = new Person("Izabela", "França", 31);
        System.out.println(person);
        //Accessing
        person.getAge();

        PersonRecord personRecord = new PersonRecord("Diego", "Doce", 31);
        System.out.println(personRecord);
        //Accessing
        personRecord.age();

        PersonRecord personRecord2 = new PersonRecord("Vilma", "da Silva");
        System.out.println(personRecord2);
    }
}

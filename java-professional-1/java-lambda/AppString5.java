public class AppString5 {

    public static void main(String[] args) {

        //createAndPrint(n -> new Person(n), "Izabela");

        //Method Reference - em um construtor
        createAndPrint(Person::new, "Izabela");
    }

    public static void createAndPrint(PersonCreator creator, String name) {
        System.out.println(creator.create(name));
    }
}

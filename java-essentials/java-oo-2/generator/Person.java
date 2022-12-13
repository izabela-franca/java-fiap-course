package generator;

public class Person {

    //Attributes
    private int id;

    //Constructor
    public Person(Generator g) {
        this.id = g.next();
    }

    //Methods
    public int getId() {
        return id;
    }
}

package wrappers;

public class WrapperApp5 {

    public static void main(String[] args) {

        Person p1 = new Person(null, 60.0); //Wrappers are allowed to use null (primitive data types are not)
        System.out.println(p1);

        System.out.println(p1.getAge() + 10);   //ERROR
    }
}

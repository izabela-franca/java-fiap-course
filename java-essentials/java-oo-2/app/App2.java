package app;

import pets2.Cat;
import pets2.Dog;
import pets2.Fish;
import pets2.Pet;

public class App2 {

    public static void main(String[] args) {

        //Polymorphism
        Pet d = new Dog();
        //d.feed();

        Pet c = new Cat();
        //c.feed();

        feedPet(d);
        feedPet(c);
        feedPet(new Fish());
    }

    private static void feedPet(Pet p) {
        p.feed();
    }
}

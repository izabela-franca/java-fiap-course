package exercises.pets;

public class ExPet {

    public static void main(String[] args) {

        System.out.println("---> Dog");
        Dog pet1 = new Dog();
        pet1.setColor("black");
        pet1.talk();
        pet1.walk();

        System.out.println("---> Cat");
        Cat pet2 = new Cat();
        pet2.setColor("White");
        pet2.talk();
        pet2.walk();

        System.out.println("---> Fish");
        Fish pet3 = new Fish();
        pet3.setColor("Orange");
        pet3.swim();
    }
}

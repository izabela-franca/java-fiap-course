package enums;

public class EnumApp3 {

    public static void main(String[] args) {

        Dog d = new Dog();
        talk(d);
        talk(MyPets.CAT);
        talk(MyPets.HAMSTER);
    }

    private static void talk(Pet pet) {
        System.out.println(pet.talk());
    }

}

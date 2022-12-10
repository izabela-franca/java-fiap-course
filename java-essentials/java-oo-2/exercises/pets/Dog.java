package exercises.pets;

public class Dog extends TerrestrialAnimal{

    @Override
    public void talk() {
        System.out.println("Woof woof!");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog's sleeping.");
    }
}

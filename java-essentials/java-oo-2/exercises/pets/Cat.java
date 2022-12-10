package exercises.pets;

public class Cat extends TerrestrialAnimal{

    @Override
    public void talk() {
        System.out.println("Meow meow!");
    }

    //An implementation is necessary due to the fact that the super class is abstract
    @Override
    public void sleep(int time) {
        System.out.println("Cat's sleeping.");
    }
}

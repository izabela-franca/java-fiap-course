package exercises.pets;

public abstract class Pet { //Abstract class: it cannot be instantiated

    private String color;
    private int amountEaten;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed(int amount) {
        amountEaten += amount;
    }

    public int getAmountEaten() {
        return amountEaten;
    }

    //An abstract method doesn't need implementation
    public abstract void sleep(int time);
}

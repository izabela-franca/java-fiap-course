package exercises.shapes;

public class Circle implements Shape{

    //Attributes
    private final double radius;

    //Constructor
    public Circle (double radius) {
        this.radius = radius;
    }

    //Method
    @Override
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }
}

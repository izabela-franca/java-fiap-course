package exercises.shapes;

public class Rectangle implements Shape{

    //Attributes
    private final double width;
    private final double height;

    //Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Method
    @Override
    public double surfaceArea() {
        return width * height;
    }
}

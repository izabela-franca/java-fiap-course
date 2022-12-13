package exercises.shapes;

public class ExShapes {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println(c.surfaceArea());

        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.surfaceArea());

        Square s =  new Square(7);
        System.out.println(s.surfaceArea());

        Calculator calculator = new Calculator();
        calculator.sumSurfaceArea(c);
        calculator.sumSurfaceArea(r);
        double result = calculator.sumSurfaceArea(s);
        System.out.println(result);
    }
}

package regular;

public class Car {

    private int speed;
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void accelerate() {
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    //Regular Inner Class
    private class Engine {
        public void injectFuel() {
            speed+=10;
        }
    }
}

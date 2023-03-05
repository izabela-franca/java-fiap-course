package regular;

public class Car {

    private int speed;
    private Engine engine = new Engine();
    private boolean on;

    public void accelerate() {
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    //Regular Inner Class
    private class Engine {
        private boolean on;

        public void injectFuel() {
            speed+=10;
        }

        public boolean isAllOn() {
            return this.on && Car.this.on;
        }
    }

    //Regular Inner Class
    //Possível instanciar a partir de um código externo (public)
    public class Door {
        private boolean isOpen;

        public void open() {
            isOpen = true;
        }

        public void close() {
            isOpen = false;
        }
    }
}

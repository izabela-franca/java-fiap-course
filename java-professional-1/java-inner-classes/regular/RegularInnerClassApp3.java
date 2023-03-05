package regular;

public class RegularInnerClassApp3 {

    public static void main(String[] args) {

        Car car = new Car();

        //Instanciando uma Inner Class pública
        Car.Door door = car.new Door();
        door.open();
    }
}

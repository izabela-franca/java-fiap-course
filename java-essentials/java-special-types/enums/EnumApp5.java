package enums;

import static enums.Car.Brand.BMW;

public class EnumApp5 {

    public static void main(String[] args) {

        Car c = new Car(Car.Brand.HONDA);       //first we access the class (only if the enum is inside de class)
        System.out.println(c.getBrand());

        //Static import
        Car c2 = new Car(BMW);
        System.out.println(c2.getBrand());
    }
}

public class ExLamp {

    public static void main(String[] args) {

        Lamp l1 = new Lamp(true);
        Lamp l2 = new Lamp(false);

        l1.showState();
        l1.turnOff();
        l1.showState();

        System.out.println("-------------");

        l2.showState();
        l2.turnOn();
        l2.showState();
    }
}

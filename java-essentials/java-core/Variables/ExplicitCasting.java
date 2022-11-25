public class ExplicitCasting {

    public static void main(String[] args) {

        double d = 240.56;
        int i = (int) d;

        System.out.println(d);
        System.out.println(i);

        long l = 30000000000000L;
        int i2 = (int) l;
        System.out.println(l);
        System.out.println(i2);

        long l2 = 10L;
        byte i3 = (byte) l2;
        System.out.println(l2);
        System.out.println(i3);
    }
}

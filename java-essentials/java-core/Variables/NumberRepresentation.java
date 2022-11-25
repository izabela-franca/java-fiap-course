public class NumberRepresentation {

    public static void main(String[] args) {

        //Adding and L at the end of the number to represent it as long
        long a = 20_000_000_000L;

        double b = 435.567650;

        //Adding and 0b at the beginning of the number to represent it as binary
        int c = 0b1010_1111_0101;
        System.out.println(c);

        //Adding and 0x at the beginning of the number to represent it as hexadecimal
        int d = 0x12AF2020;
        System.out.println(d);

        //Adding and 0 at the beginning of the number to represent it as octal
        int e = 0444;
        System.out.println(e);

    }
}

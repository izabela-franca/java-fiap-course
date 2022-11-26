public class OpIncrement {

    public static void main(String[] args) {

        int a = 2;
        int b = 3 + ++a;

        int c = 2;
        int d = 3 + c++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

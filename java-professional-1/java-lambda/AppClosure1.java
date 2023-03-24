public class AppClosure1 {

    public static void main(String[] args) {

        Operation sum = (n1, n2) -> n1 + n2;
        System.out.println(sum.calculate(5,4));
    }
}

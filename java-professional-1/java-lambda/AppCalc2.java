public class AppCalc2 {

    public static void main(String[] args) {

        //Simplificando uma expressão Lambda
        run((n1, n2) -> n1 + n2);
        run((n1, n2) -> n1 * n2);
    }

    private static void run(Operation operation) {
        int r = operation.calculate(5, 4);
        System.out.println(r);
    }
}

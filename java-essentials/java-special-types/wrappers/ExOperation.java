package wrappers;

public class ExOperation {

    public static void main(String[] args) {

        Operation op = new OperationImpl();
        int result1 = op.execute(4, 6);
        System.out.println(result1);

        int result2 = op.execute(4, null);
        System.out.println(result2);
    }
}

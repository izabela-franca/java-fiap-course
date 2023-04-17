package lambda;

public class AppString4 {

    public static void main(String[] args) {

        //transformAndPrint(n -> String.valueOf(n), 100);

        //Method Reference - chamada em método estático
        transformAndPrint(String::valueOf, 100);

    }

    public static void transformAndPrint(NumberTransformer transformer, int number) {
        System.out.println(transformer.tranform(number));
    }
}

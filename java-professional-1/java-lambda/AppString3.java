/*
Quando temos uma expressão Lambda com apenas uma linha, que recebe um parâmetro e este parâmetro é utilizado na execução da expressão, podemos usar Method Reference
 */

public class AppString3 {

    public static void main(String[] args) {

        //transformAndPrint(s -> s.toUpperCase(), "java");

        //Method Reference - no próprio parâmetro
        transformAndPrint(String::toUpperCase, "java");
        transformAndPrint(String::toLowerCase, "JAVA");
    }

    private static void transformAndPrint(TextTransformer transformer, String text) {
        System.out.println(transformer.transform(text));
    }
}

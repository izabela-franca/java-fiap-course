package lambda;

public class AppString1 {

    public static void main(String[] args) {

        //Expressão Lambda sem parâmetro
        print(() -> "Hi!");
        print(() -> "Hello!");

        //Se houver apenas um parâmetro e este não for ambíguo, podemos retirar o tipo e os ()
        print(s -> s.toUpperCase(), "abc");
        print(s -> new StringBuilder(s).reverse().toString(), "abc");
    }

    public static void print(TextProvider textProvider) {
        System.out.println(textProvider.getText());
    }

    public static void print(TextTransformer textTransformer, String text) {
        System.out.println(textTransformer.transform(text));
    }
}

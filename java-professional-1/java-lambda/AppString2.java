public class AppString2 {

    public static void main(String[] args) {

        //Expressão Lambda sendo usada como um parâmetro
        print(
                s -> {
                    char[] chars = s.toCharArray();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < chars.length; i+=2 ) {
                        sb.append(chars[i]);
                    }
                    return sb.toString();
                },
                "java rocks!"
        );
    }

    public static void print(TextTransformer textTransformer, String text) {
        System.out.println(textTransformer.transform(text));
    }
}

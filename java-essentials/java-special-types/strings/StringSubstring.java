package strings;

public class StringSubstring {

    public static void main(String[] args) {

        String str1 = "I love Java!";

        String substr1 = str1.substring(6).trim();
        System.out.println(substr1);

        String substr2 = str1.substring(0, 6);
        System.out.println(substr2);
    }
}

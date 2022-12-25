package strings;

public class StringIndexOf {

    public static void main(String[] args) {

        String str1 = "I love Java!";
        int position = str1.indexOf("love");
        System.out.println(position);

        String str2 = "Java is the greatest programming language in the world!";
        int position2 = str2.indexOf("the");
        System.out.println(position2);
        int position3 = str2.lastIndexOf("the");
        System.out.println(position3);
    }
}

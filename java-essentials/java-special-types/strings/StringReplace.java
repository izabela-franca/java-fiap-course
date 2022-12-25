package strings;

public class StringReplace {

    public static void main(String[] args) {

        String str = "My password is java.";
        String replacedStr = str.replace("java", "****");
        System.out.println(replacedStr);

    }
}

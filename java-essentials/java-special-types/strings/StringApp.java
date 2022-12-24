package strings;

public class StringApp {

    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "B";
        String s4 = new String("B");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        System.out.println("------------------");

        System.out.println(s1.equals(s2));  //the right wayStringApp to compare strings
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
}

package strings;

public class StringCompare {

    public static void main(String[] args) {

        String str1= "bed";
        String str2 = "chair";

        int comparing = str1.compareTo(str2);

        if (comparing < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (comparing > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println("They are at the same postion.");
        }

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class RegexApp5 {

    public static void main(String[] args) {

        //Splitting Strings
        String text = "a-b-c-d";
        String[] tokens = text.split("-");
        System.out.println(Arrays.toString(tokens));

        String text2 = "a1b2c3d4";
        String[] tokens2 = text2.split("\\d");
        System.out.println(Arrays.toString(tokens2));

        //Another Option - using Scanner
        Scanner scanner = new Scanner(text2);
        scanner.useDelimiter("\\d");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        //Converting to an Integer
        Scanner scanner2 = new Scanner("1,2,3,4");
        scanner2.useDelimiter(",");
        while (scanner2.hasNextInt()) {
            int e = scanner2.nextInt();
            System.out.println(e);
        }
    }
}

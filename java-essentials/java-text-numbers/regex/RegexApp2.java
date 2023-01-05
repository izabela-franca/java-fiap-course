import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp2 {

    public static void main(String[] args) {

        printMatchers("abcabc", "ab");
        System.out.println("-------------");
        printMatchers("fdklj3l20sxj280z1kj", "\\d\\d\\d");
        System.out.println("-------------");
        printMatchers("fdklj3l20sxj280z1kj", "([a-z])+");
        System.out.println("-------------");
        printMatchers("fdklj3l20sxj280z1kj", "\\d([a-z])+");

    }

    private static void printMatchers(String text, String regex) {
        //Creating regex to represent what you are searching
        Pattern p = Pattern.compile(regex);
        //Searching for the pattern
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.format("%d -> '%s'\n", m.start(), m.group());
        }
    }
}

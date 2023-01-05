public class ExRemoveElements {

    public static void main(String[] args) {

        String text = "htos5hufsd56598dsjd1";

        System.out.println(text.replaceAll("\\d", ""));
        System.out.println(text.replaceAll("\\D", ""));
        System.out.println(text.replaceAll("[^0-9]", ""));
    }
}

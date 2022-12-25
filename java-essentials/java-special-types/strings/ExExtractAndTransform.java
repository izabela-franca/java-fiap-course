package strings;

public class ExExtractAndTransform {

    public static void main(String[] args) {

        String converted = uppercase("java is cool.", "java");
        System.out.println(converted);
    }

    private static String uppercase(String s, String piece){
        int position = s.indexOf(piece);

        if (position < 0) {
            return s;
        }

        String extracted = s.substring(position, position + piece.length());
        String transformed = extracted.toUpperCase();

        return s.substring(0, position) + transformed + s.substring(position + piece.length());
    }
}

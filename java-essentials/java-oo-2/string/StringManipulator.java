package string;

public interface StringManipulator {

    String join(String s1, String s2);

    String takeFirst(String s, int length);

    //Implementing methods in an interface
    default String upper(String s) {
        return  s.toUpperCase();
    }

    //Static - it belongs to the interface itself
    static String lower(String s) {
        return s.toLowerCase();
    }

}

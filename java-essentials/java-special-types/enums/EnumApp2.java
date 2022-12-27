package enums;

public class EnumApp2 {

    public static void main(String[] args) {

        Month m = Month.AUGUST;
        System.out.println(m.getMonthNum());
        System.out.println(m);
        System.out.println(m.name());
        System.out.println(m.ordinal());

        Month m2 = Month.valueOf("JANUARY");
        System.out.println(m2.getMonthNum());

        Month m3 = Enum.valueOf(Month.class, "MARCH");
        System.out.println(m3.name());
    }
}

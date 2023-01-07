package bigNumbers;

public class RoundingApp1 {

    public static void main(String[] args) {

        double d1 = 10.5;
        long v1 = Math.round(d1);
        long f1 = (long) Math.floor(d1);
        long c1 = (long) Math.ceil(d1);
        System.out.println("Math.round =>" + v1);
        System.out.println("Math.floor => " + f1);
        System.out.println("Math.ceil => " + c1);

        System.out.println("--------------------");

        double d2 = 10.4;
        long v2 = Math.round(d2);
        long f2 = (long) Math.floor(d2);
        long c2 = (long) Math.ceil(d2);
        System.out.println("Math.round =>" +  + v2);
        System.out.println("Math.floor => " + f2);
        System.out.println("Math.ceil => " + c2);
    }
}

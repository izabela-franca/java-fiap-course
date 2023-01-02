package wrappers;

public class WrapperApp1 {

    public static void main(String[] args) {

        int i = 10;

        //Creating an Integer wrapper
        Integer x = Integer.valueOf(i);
        System.out.println(x);
        System.out.println(x.intValue());

        Double y = Double.valueOf(10.5);
        System.out.println(y);
    }

    //We use Wrappers when we need to run an application that doesn't read primitive data types
}

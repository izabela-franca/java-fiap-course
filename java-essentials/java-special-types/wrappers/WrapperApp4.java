package wrappers;

public class WrapperApp4 {

    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = 1000;
        Integer i6 = 1000;

        System.out.println(i1 == i2);   //false
        System.out.println(i2 == i3);   //false
        System.out.println(i3 == i4);   //true
        System.out.println(i5 == i6);   //false

        //Comparing Wrappers correctly
        System.out.println(i1.equals(i2));   //true
        System.out.println(i2.equals(i3));   //true
        System.out.println(i3.equals(i4));   //true
        System.out.println(i5.equals(i6));   //true
    }
}

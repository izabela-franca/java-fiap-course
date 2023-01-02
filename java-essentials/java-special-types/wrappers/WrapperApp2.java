package wrappers;

public class WrapperApp2 {

    public static void main(String[] args) {

        //primitive date type -> object
        Integer x = Integer.valueOf("10");
        System.out.println(x);

        //primitive data type -> primitive data type
        int y = Integer.parseInt("10");
        System.out.println(y);

        //Three different ways
        Boolean a = Boolean.valueOf(true);  //returned as an object
        Boolean b = Boolean.valueOf("true");    //returned as an object
        boolean c = Boolean.parseBoolean("true");   //returned as a primitive data type
    }
}

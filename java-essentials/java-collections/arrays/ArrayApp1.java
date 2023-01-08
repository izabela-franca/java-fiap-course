package arrays;

public class ArrayApp1 {

    public static void main(String[] args) {

        //Creating arrays
        int[] array = new int[5];
        array[0] = 2;
        array[4] = 8;

        //Creating arrays - hard coded
        int[] array2 = new int[] {1, 3, 5, 7, 9};

        //Creating arrays - simple
        int[] array3 = {2, 4, 6, 8};

        //Accessing arrays
        System.out.println(array[0]);
        System.out.println(array2[2]);
        System.out.println(array3[1]);

    }
}

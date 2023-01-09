package arrays;

import java.util.Arrays;

public class ArrayApp8 {

    public static void main(String[] args) {

        String[] array = new String[5];

        //Inserting
        Arrays.fill(array, "abc");
        Arrays.fill(array,1, 3, "def");
        System.out.println(Arrays.toString(array));

        //Sorting arrays
        array[0] = "C";
        array[1] = "A";
        array[2] = "E";
        array[3] = "D";
        array[4] = "B";

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Looking for an element
        System.out.println(Arrays.binarySearch(array, "D"));    //the array needs to be sorted

        //Copying arrays
        String[] array2 = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array2));

    }
}

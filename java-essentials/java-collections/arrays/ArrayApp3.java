package arrays;

public class ArrayApp3 {

    public static void main(String[] args) {

        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};

        //Loop in arrays using For
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }

        System.out.println("---------------");

        // Loop in arrays using Enhanced For - commonly used
        for (int n: primeNumbers) {
            System.out.println(n);
        }
    }
}

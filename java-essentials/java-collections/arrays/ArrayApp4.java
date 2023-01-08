package arrays;

public class ArrayApp4 {

    public static void main(String[] args) {

        int sum = sum(new int[] {5, 6, 3});
        System.out.println(sum);

        int sum2 = sum2(5, 6, 3);
        System.out.println(sum2);

    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int n: numbers) {
            sum+= n;
        }
        return  sum;
    }

    //Varargs
    private static int sum2(int... numbers) {
        int sum = 0;
        for (int n: numbers) {
            sum+= n;
        }
        return  sum;
    }
}

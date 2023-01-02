package wrappers;

import java.util.Scanner;

public class ExNumber {

    public static void main(String[] args) {
        int n = asKNumber();

        System.out.println("Binary => " + Integer.toBinaryString(n));
        System.out.println("Hex => " + Integer.toHexString(n));
        System.out.println("Octal => " + Integer.toOctalString(n));
    }

    private static int asKNumber() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Number: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ignored) {
            }
        }
    }
}

package exercises;

import java.util.Scanner;

public class ExSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 =  readNumber(scanner);
        int number2 = readNumber(scanner);

        System.out.println("Sum: " + (number1 + number2));
    }

    private static int readNumber(Scanner scanner) {
        System.out.print("Choose a number: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 10;
        }
    }
}

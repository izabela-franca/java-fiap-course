package strings;

import java.util.Scanner;

public class ExReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto qualquer: ");
        System.out.print("==>");
        String text = scanner.nextLine();

        System.out.println("==> " + new StringBuilder(text).reverse());
    }
}

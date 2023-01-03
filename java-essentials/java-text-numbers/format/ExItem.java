package format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ExItem {

    public static void main(String[] args) {

        Item i1 = new Item("Laptop", 599.99, "USD");
        Item i2 = new Item("Keyboard", 25.50, "BRL");
        Item i3 = new Item("Mouse", 9.80, "EUR");

        PrintWriter out = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        out.println(i1);
        out.println(i2);
        out.println(i3);
    }
}

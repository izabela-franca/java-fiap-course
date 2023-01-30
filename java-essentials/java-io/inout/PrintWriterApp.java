package inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterApp {

    public static void main(String[] args) throws IOException {

        try(PrintWriter out = new PrintWriter("java-essentials/java-io/examples/out4.txt", StandardCharsets.UTF_8)) {
            out.println("Hi!");
            out.println("I'm Java.");
            out.flush();
        }
    }
}

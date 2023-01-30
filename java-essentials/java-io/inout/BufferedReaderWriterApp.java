package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedReaderWriterApp {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("java-essentials/java-io/examples/out3.txt", StandardCharsets.UTF_8))) {
            IOOperations.write(out, "Refactoring!");
            out.flush();
        }

        try (BufferedReader in = new BufferedReader(new FileReader("java-essentials/java-io/examples/out3.txt", StandardCharsets.UTF_8))) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}

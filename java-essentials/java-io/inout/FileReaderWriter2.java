package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter2 {

    public static void main(String[] args) throws IOException {

        //Text to File
        try (FileWriter out = new FileWriter("java-essentials/java-io/examples/out3.txt", StandardCharsets.UTF_8)) {
            IOOperations.write(out, "Refactoring!");
        }

        //File to Text
        try (FileReader in = new FileReader("java-essentials/java-io/examples/out3.txt", StandardCharsets.UTF_8)) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}

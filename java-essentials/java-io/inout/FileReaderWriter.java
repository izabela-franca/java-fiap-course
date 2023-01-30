package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {

    public static void main(String[] args) throws IOException {

        //Text to File
        try (FileWriter out = new FileWriter("java-essentials/java-io/examples/out1.txt", StandardCharsets.UTF_8)) {
            out.write("Hello, world!");
        }

        //File to Text
        try (FileReader in = new FileReader("java-essentials/java-io/examples/out1.txt", StandardCharsets.UTF_8)) {
            int c = in.read();
            StringBuilder text = new StringBuilder();
            while (c > -1) {
                text.append((char) c);
                c = in.read();
            }
            System.out.println(text);
        }
    }
}

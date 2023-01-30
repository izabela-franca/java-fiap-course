package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutputStreamReaderWriterApp {

    private static final byte[] BYTES= {
        106, 97, 118,97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47
    };

    public static void main(String[] args) throws IOException {

        //Bytes to Text (using Decorator)
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8))) {
            System.out.println(reader.readLine());
        }

        /*Step by step
        InputStream in = new ByteArrayInputStream(BYTES);   --> Get the bytes
        InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);  --> Array into a sequence of characters
        BufferedReader reader = new BufferedReader(isr);  --> Reads the sequence of characters
        reader.readLine();
         */
    }
}

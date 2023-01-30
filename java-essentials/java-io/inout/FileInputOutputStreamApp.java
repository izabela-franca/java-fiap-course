package inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamApp {

    public static void main(String[] args) throws IOException {

        try (
            FileInputStream in = new FileInputStream("java-essentials/java-io/examples/file2.txt");
            FileOutputStream out = new FileOutputStream("java-essentials/java-io/examples/file1.txt");
        ) {
           byte[] bytes = IOOperations.read(in);
           IOOperations.write(out, bytes);
        }
    }
}

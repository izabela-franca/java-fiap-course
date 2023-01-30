package inout;

import java.io.*;

public class StringReaderWriterApp {

    public static void main(String[] args) throws IOException {

        try (Writer out = new StringWriter()) {
            IOOperations.write(out, "Hello!");
        }

        try (Reader in = new StringReader("An example of a String.")) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }

    }
}

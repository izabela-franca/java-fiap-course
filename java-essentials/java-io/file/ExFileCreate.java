package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExFileCreate {

    public static void main(String[] args) throws IOException {

        Path dir = Path.of("C:", "Users", "ifran", "Desktop", "Programação", "Linguagem Java", "Java Insider", "java-essentials", "java-io", "examples");
        String fileName = "file_" + System.currentTimeMillis() + ".txt";
        Files.createFile(dir.resolve(fileName));
    }
}

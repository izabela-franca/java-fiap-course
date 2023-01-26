package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp2 {

    public static void main(String[] args) throws IOException {

        //Creating directories
        Path root = Path.of("C:", "Users", "ifran", "Desktop", "Programação", "Linguagem Java", "Java Insider", "java-essentials", "java-io", "examples");
        Path d1 = root.resolve("d1");
        //Option1
        if (!Files.exists(d1)) {
            Files.createDirectory(d1);
        }
        //Option2
        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3")));

        //Creating files
        Files.createFile(d3.resolve("d3.txt"));
        Files.createFile(d3.getParent().resolve("d2.txt"));
        Files.createFile(d3.getParent().getParent().resolve("d1.txt"));
    }
}

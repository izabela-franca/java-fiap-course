package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileApp5 {

    public static void main(String[] args) throws IOException {

        Path from = Path.of("C:", "Users", "ifran", "Desktop", "Programação", "Linguagem Java", "Java Insider", "java-essentials", "java-io", "examples", "file1.txt");

        //Copying contents in the same directory
        Path to1 = from.getParent().resolve("file2.txt");
        Files.copy(from, to1, StandardCopyOption.REPLACE_EXISTING);

        //Copying contents in different directories
        Path to2 = from.getParent().resolve(Path.of("files", "file2.txt"));
        Files.copy(from, to2, StandardCopyOption.REPLACE_EXISTING);

        //Moving files
        Files.move(from, to2, StandardCopyOption.REPLACE_EXISTING);
    }
}

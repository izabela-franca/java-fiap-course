package file;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp {

    public static void main(String[] args) {

        Path file1 = Path.of("C:", "Users", "ifran", "Desktop", "NIO.2.txt");
        System.out.println(Files.exists(file1));

        System.out.println(Files.isDirectory(file1));
        System.out.println(Files.isRegularFile(file1));

        System.out.println("------------------");

        Path file2 = Path.of("C:", "Users", "ifran", "Desktop", "Programação", "Linguagem Java", "Java Insider", "java-essentials", "java-io", "examples", "file2.txt");
        System.out.println(Files.exists(file2));

        System.out.println(Files.isDirectory(file2));
        System.out.println(Files.isRegularFile(file2));

    }
}

package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp3 {

    public static void main(String[] args) throws IOException {

        //Creating temporary directories
        Path tempDir = Files.createTempDirectory("app_");
        System.out.println(tempDir);

        Path tempDir2 = Files.createTempDirectory(Path.of(""), "app_");

        //Creating temporary files
        Path tempFile = Files.createTempFile("app_", null);
        Path tempFile2 = Files.createTempFile(Path.of(""), "app_", null);
    }
}

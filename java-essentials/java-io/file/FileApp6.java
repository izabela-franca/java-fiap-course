package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp6 {

    public static void main(String[] args) throws IOException {

        //Iterating files and directories
        try (var files = Files.newDirectoryStream(Path.of("java-essentials", "java-io"), "*")) {
            for(Path path : files) {
                System.out.println(path);
            }
        }
    }
}

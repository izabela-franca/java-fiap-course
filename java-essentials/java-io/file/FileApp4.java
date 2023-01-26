package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp4 {

    public static void main(String[] args)throws IOException {

        Path file = Path.of("myfile.txt");
        //Files.createFile(file);

        //Deleting files
        Files.deleteIfExists(file);
    }
}

package inout;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesApp {

    public static void main(String[] args)throws IOException {


        try (FileWriter out = new FileWriter("java-essentials/java-io/examples/out2.txt", StandardCharsets.UTF_8)) {
             out.write("Practicing Try With Resourcers");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //close() is automatically called
    }
}

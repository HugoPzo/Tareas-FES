import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        AFD6 afd6 = new AFD6();
        Path file_entry_path =  Paths.get("./test.txt");

        System.out.println("----------------------------------");

        try(Stream<String> lines = Files.lines(file_entry_path)) {
            lines.forEach(line -> {

            });

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("----------------------------------");


    }
}

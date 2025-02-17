import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        AFD2 afd = new AFD2();
        Path file_entry_path = Paths.get("AutomataNum2/test.txt");


        System.out.println("--------------------------------------");

        try(Stream<String> lines = Files.lines(file_entry_path)) {
            lines.forEach(line -> {
                if (afd.process(line)) {
                    System.out.println("Opcion valida: " + line);
                } else {
                    System.out.println("Opcion Invalida: " + line);
                }
            });

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------------------");
    }
}

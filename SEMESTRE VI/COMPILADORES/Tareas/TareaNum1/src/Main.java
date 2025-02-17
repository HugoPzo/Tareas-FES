import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        AFD afd = new AFD();
        Path file_entry_path = Paths.get("./test.txt");
        Path file_out_path = Paths.get("./testResult.txt");

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
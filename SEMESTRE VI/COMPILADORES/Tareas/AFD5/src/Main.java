import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        AFD5 afd5 = new AFD5();
        Path file_entry_path = Paths.get("./test.txt");


        System.out.println("--------------------------------------");

        try(Stream<String> lines = Files.lines(file_entry_path)) {

            lines.forEach(line -> {
                ArrayList<String> lista_palabras = new ArrayList<>();
                lista_palabras = afd5.getWords(line);

                for (String palabra : lista_palabras) {
                    if(afd5.processWords(palabra)) {
                        System.out.println("Fin de instruccion: " + palabra);
                    }

                }

            });

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------------------");
    }
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        WordsChecker word_checker = new WordsChecker();
        Path file_entry_path = Paths.get("./test.txt");


        System.out.println("--------------------------------------");

        try(Stream<String> lines = Files.lines(file_entry_path)) {

            lines.forEach(line -> {

                for (String word : word_checker.getWords(line)) {
                    if(word_checker.processWords(word)) {
                        System.out.println(" - '" + word + "' es valida - ");
                    };
                }

                System.out.println();
            });

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------------------");
    }
}


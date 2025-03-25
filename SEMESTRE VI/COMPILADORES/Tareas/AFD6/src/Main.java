import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Path file_path = Paths.get("/home/hugo/Documentos/ESCUELA/SEMESTRE VI/COMPILADORES/Tareas/AFD6/text.txt");
        StringBuilder inputText = new StringBuilder();

        try (Scanner scanner = new Scanner(file_path.toFile())) {
            while (scanner.hasNextLine()) {
                inputText.append(scanner.nextLine()).append("\n");
            }

        }catch (IOException e){
            System.out.println("Error reading file" + e.getMessage());
            return;
        }

        AFD6 afd6 = new AFD6();

        ArrayList<String> listTokens = afd6.catchTokens(inputText.toString());
        List<String> tokens = afd6.analyzeTokens(listTokens);

        for (String token : tokens) {
            System.out.println(token + " - Token");
        }

    }
}

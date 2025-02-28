import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        AFD5 afd5 = new AFD5();
        Path file_entry_path = Paths.get("./test.txt");


        System.out.println("--------------------------------------");

        try{

            BufferedReader reader = Files.newBufferedReader(file_entry_path);
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            reader.close();

            String text = stringBuilder.toString(); // Texto completo en string sin espacios

            List processedText = afd5.processText(text);
            ArrayList<String> processedTokens = afd5.processTokens(processedText);
            System.out.println(processedTokens);

            for (String token : processedTokens) {
                if (afd5.readTokens(token)){
                    System.out.println(token + " -> " + "Es valido");
                }else {
                    System.out.println(token + " -> " + "No es valido");
                }
            }



        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------------------");
    }
}


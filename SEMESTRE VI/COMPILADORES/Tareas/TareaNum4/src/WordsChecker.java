import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;
import java.util.stream.Stream;

public class WordsChecker {

    private enum State {
        Q0, Q1, REJECT
    }

    private State currentState;

    public WordsChecker() {
        this.currentState = State.Q0;
    }


    public boolean processWords(String line) {
        currentState = State.Q0;
        for (char c : line.toCharArray()) {
            switch (currentState) {

                case Q0:
                    if (Character.isLetter(c)) {
                        currentState = State.Q0;
                    } else if (c == ' ') {
                        currentState = State.Q0;
                    } else {
                        currentState = State.REJECT;
                    }

                    break;
            }
        }

        if (currentState == State.REJECT) {
            return false;
        }

        return currentState == State.Q0;
    }

    public ArrayList<String> getWords(String line) {
        ArrayList<String> lista_palabras = new ArrayList<>();
        WordsChecker word_checker = new WordsChecker();
        String currentWord = "";
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                currentWord += c;
            } else if (Character.isWhitespace(c)) {
                lista_palabras.add(currentWord);
                currentWord = "";
            }
        }
        lista_palabras.add(currentWord);

        System.out.println(lista_palabras);
        return lista_palabras;
    }

}
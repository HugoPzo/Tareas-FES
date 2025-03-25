import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class AFD6 {

    public enum State {
        START, VARIABLE, TOKEN, REJECT
    }

    private static final int[][] TRANSITION_TABLE = {
            // L | D/_ | ; | Otro
            {  1,  -1,  -2,  3}, // State 0 - START
            {  1,   1,  -2,  3}, // State 1 - VARIABLE
            {  3,   3,  -2,  3}, // State 2 - TOKEN
            {  3,   3,  -2,  3}, // State 3 - Unexpected Input
    };

    private static int getCharType(char c) {
        if(Character.isLetter(c)) return 0;
        if(Character.isDigit(c) || c == '_') return 1;
        if(c == ';') return 2;
        if(Character.isDefined(c)) return 3;

        return 4;
    }

    public ArrayList<String> catchTokens(String text) {
        // Recibimos las palabras en una lista
        ArrayList<String> list_tokens = new ArrayList<>();

        // Iteramos por cada palabra para procesarla
        for (Object word : text.split(" |\n")) {
            // Si encontramos un (;) dentro de una palabra la separamos y la añadimos a la lista
            for (String letter : word.toString().split("(?<=;)|(?=;)")) {
                list_tokens.add(letter);
            }
        }
        return list_tokens;
    }


    public static List<String> analyzeTokens(ArrayList<String> tokens) {
        System.out.println(tokens);
        List<String> list_tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        int state = 0;

        for (String word : tokens) {
            state = 0;
            token.setLength(0);
            for (char c : word.toCharArray()) {
                int type = getCharType(c);

                if (type >= TRANSITION_TABLE[state].length) {
                    state = 0;
                    continue;
                }
                int nextState = TRANSITION_TABLE[state][type];

                if (nextState == -1) {
                    token.setLength(0);
                    state = 0;
                    break;
                }

                if (nextState == -2) {
                    token.append(c);
                    token.setLength(0);
                    state = 0;
                    continue;
                }

                token.append(c);
                state = nextState;
            }
            if (token.length() > 0) {
                list_tokens.add(token.toString());
            }
        }
        System.out.println(list_tokens);

        if (token.length() > 0) {
            list_tokens.add(token.toString());
        }

        return list_tokens;
    }
}

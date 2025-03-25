import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class AFD5 {

    private enum State {
        Q0, Q1, Q2, REJECT
    }

    private State currentState;

    public AFD5() {
        this.currentState = State.Q0;
    }

    // Procesamos el texto completo
    public List processText(String text) {

        // Iniciamos la lista de palabras
        List list_words = new ArrayList();
        String text_regex = "[ \n\t\r]";
        String[] currentWord;

        // Separamos el texto completo, unimos tab, space, jump
        String[] words = text.split(text_regex);

        // Añadimos a lista palabra por palabra
        for(String word : words) {
            list_words.add(word);
        }

        return list_words;
    }

    // Prpocesamos los token en busce de (;)
    public ArrayList<String> processTokens(List list_words) {
        // Recibimos las palabras en una lista
        ArrayList<String> list_tokens = new ArrayList<>();

        // Iteramos por cada palabra para procesarla
        for (Object word : list_words) {
            // Si encontramos un (;) dentro de una palabra la separamos y la añadimos a la lista
            for (String letter : word.toString().split("(?<=;)|(?=;)")) {
                list_tokens.add(letter);
            }
        }
        return list_tokens;
    }

    // Leemos y validamos cada token
    public Boolean readTokens(String token) {
        currentState = State.Q0;

        for(Character c : token.toCharArray()) {
            switch(currentState) {
                case Q0:
                    if(Character.isLetter(c)) {
                        currentState = State.Q1;
                    }else if(c == ';'){
                        currentState = State.Q2;
                    }else{
                        currentState = State.REJECT;
                    }
                    break;

                case Q1:
                    if(Character.isLetter(c) || Character.isDigit(c) || c == '_') {
                        currentState = State.Q1;
                    }else if(c == ';'){
                        currentState = State.Q2;
                    }else {
                        currentState = State.REJECT;
                    }
                    break;

                case Q2:
                    currentState = State.REJECT;
            }
        }


        if(currentState == State.REJECT) {
            return false;
        }

        return currentState == State.Q1 || currentState == State.Q2;
    }

}

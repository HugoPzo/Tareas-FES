import java.util.ArrayList;

public class AFD5 {

    private enum State {
        Q0, Q1, REJECT
    }

    private State currentState;

    public AFD5() {
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
                    } else if (c == ';'){
                        currentState = State.Q1;
                    }else {
                        currentState = State.REJECT;
                    }

                    break;

                case Q1:
                    currentState = State.REJECT;
            }
        }

        if (currentState == State.REJECT) {
            return false;
        }

        return currentState == State.Q1;
    }


    public ArrayList<String> getWords(String line) {
        ArrayList<String> lista_palabras = new ArrayList<>();
        AFD5 afd5 = new AFD5();
        String currentWord = "";
        for (char c : line.toCharArray()) {

            if (Character.isLetter(c) || Character.isDigit(c) || c == ';') {
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

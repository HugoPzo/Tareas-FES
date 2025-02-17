public class AFD6 {

    private enum State {
        Q0, Q1, REJECT
    }

    private State currentState;

    public AFD6(){
        currentState = State.Q0;
    }

    public static boolean isLetter(char c){
        int asciiValue = (int)c;
        if (asciiValue >= 'A' && asciiValue <= 'Z' || asciiValue >= 'a' && asciiValue <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char c){
        int asciiValue = (int)c;
        if (asciiValue >= '0' && asciiValue <= '9') {
            return true;
        }
        return false;
    }

    public boolean process(String cadena){
        currentState = State.Q0; // Reiniciamos el estado inicial
        for (char c : cadena.toCharArray()){
            switch (currentState){
                case Q0:
                    if (isLetter(c)){
                        currentState = State.Q1;
                    } else {
                        currentState = State.REJECT;
                    }
                    break;

                case Q1:
                    // SE ACEPTA CARACTERES ESPECIALES Y
                    if (isLetter(c)){
                        currentState = State.Q1;
                    } else if (isDigit(c)){
                        currentState = State.Q1;
                    } else if (c == '_'){
                        currentState = State.Q1;
                    } else {
                        currentState = State.REJECT;
                    }


                    break;

                default:
                    currentState = State.REJECT;
            }
        }

        if (currentState == State.REJECT){
            return false;
        }

        return currentState == State.Q1;
    }


}

// AUTOMATA - (a*(ba)*)


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class AFD2 {

    // ESTADOS - PROPIOS TIPOS DE DATO
    private enum State {
        Q0, Q1, Q2, REJECT
    }

    // ESTADO ACTUAL
    private State currentState;

    // CONSTRUCTOR
    public AFD2() {
        this.currentState = State.Q0; // Estado Inicial
    }

    // METODO PARA PROCESAR LA ENTRADA (CADENA)
    public boolean process(String cadena) {
        currentState = State.Q0; // Reiniciamos al estado inicial

        for(char c : cadena.toCharArray()) {
            switch (currentState) {
                case Q0: // Estado inicial (esperando 'a' o 'ba')
                    if (c == 'a'){
                        currentState = State.Q0;
                    }else if (c == 'b'){
                        currentState = State.Q1;
                    }else{
                        currentState = State.REJECT;
                    }

                    break;

                case Q1:
                    if(c == 'a'){
                        currentState = State.Q2; // Si recibimos 'a'
                    }else{
                        currentState = State.REJECT;
                    }

                    break;

                case Q2:
                    if(c == 'b'){
                        currentState = State.Q1; // Si recibimos 'b'
                    } else {
                        currentState = State.REJECT;
                    }

                    break;

                default:
                    currentState = State.REJECT;
            }
        }

        // SI ES INVALIDA LA SINTAXIS, MANDAMOS FALSO
        if (currentState == State.REJECT) {
            return false;
        }

        // PUEDE HABER DISTINTAS SALIDAS
        return currentState == State.Q2 || currentState == State.Q0 ;
    }
}



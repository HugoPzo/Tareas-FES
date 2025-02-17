// AUTOMATA - (a*ba)


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Struct;
import java.util.List;
import java.util.stream.Stream;

public class AFD {

    // ESTADOS - PROPIOS TIPOS DE DATO
    private enum State {
        Q0, Q1, Q2, REJECT
    }

    // ESTADO ACTUAL
    private State currentState;

    // CONSTRUCTOR
    public AFD() {
        this.currentState = State.Q0; // Estado Inicial
    }

    // METODO PARA PROCESAR LA ENTRADA (CADENA)
    public boolean process(String cadena) {
        currentState = State.Q0; // Reiniciamos al estado inicial

        for(char c : cadena.toCharArray()) {
            switch (currentState) {
                case Q0: // Estado inicial (esperando 'a' o 'b')
                    if (c == 'a'){
                        currentState = State.Q0;
                    }else if (c == 'b'){
                        currentState = State.Q1;
                    }else{
                        currentState = State.REJECT;
                    }

                    break;

                case Q1: // Estado Q1 (esperando 'a')
                    if(c == 'a'){
                        currentState = State.Q2;
                    }else {
                        currentState = State.REJECT;
                    }
                    break;

                case Q2: // Estado Q2 (esperando finalizar)

                    // SI RECIBIMOS ALGUN CARACTER 'REJECT´
                    currentState = State.REJECT;


                    break;

                default:
                    currentState = State.REJECT;
            }
        }

        if (currentState == State.REJECT) {
            return false;
        }

        return currentState == State.Q2;
    }

}



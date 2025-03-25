package codigo;

import jflex.Main; // Importar JFlex
import jflex.exceptions.SilentExit;

import java.io.*;

// Si lo ejecutamos, se creara un Lexer - clase que usa java para analizar todas las cadenas
// dadas

public class Principal {
    public static void main(String[] args) {
        // Ruta de nuestro archivo 'Lexer.flex'
        String ruta = "/home/hugo/Documentos/ESCUELA/SEMESTRE VI/COMPILADORES/Tareas/AFD7/src/codigo/Lexer.flex";
        generarLexer(ruta);
        analizarTexto();
    }

    // Metodo Generador del analizador lexico
    public static void generarLexer(String ruta){
        File file = new File(ruta); // Ruta del archivo .flex
        try {
            Main.generate(new String[]{file.getPath()}); // Generar el analizador lexico, convertir a string
        } catch (SilentExit e) {
            throw new RuntimeException(e);
        }
    }

    public static void analizarTexto(){
        // Archivo del txt a analizar
        File file = new File("/home/hugo/Documentos/ESCUELA/SEMESTRE VI/COMPILADORES" +
                "/Tareas/AFD7/src/codigo/test_analizar.txt");
        File file_texto_analizado = new File("/home/hugo/Documentos/ESCUELA/SEMESTRE VI" +
                "/COMPILADORES/Tareas/AFD7/src/codigo/test_analizado.txt");
        try {
            Reader lector = new BufferedReader(new FileReader(file));
            Lexer lexer = new Lexer(lector); // Clase Lexer
            String resultado = ""; // Resultado de la cadena analizada
            while (true){
                // Este método lee el siguiente token del código fuente y lo devuelve como un
                //  objeto de tipo Tokens (o el tipo que hayas definido en tu analizador léxico).
                // Si el archivo de entrada se termina, yylex() devuelve null,
                // indicando que no hay más tokens para analizar.
                Tokens tokens = lexer.yylex();
                if (tokens == null){
                    resultado += "FIN";
                    try {
                        // Escribimos el resultado del analizador lexico en un archivo nuevo
                        PrintWriter writer = new PrintWriter(file_texto_analizado);
                        writer.print(resultado);
                        writer.close();
                        // Return para salir del while
                        return;
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    return;
                }
                // En caso de cada token, definimos el resultado
                switch (tokens){
                    case ERROR:
                        resultado += lexer.lexeme + ": Simbolo no definido\n";
                        break;
                    case Variable: case Numero: case Reservadas:
                        resultado += lexer.lexeme + ": Es un " + tokens.name() + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens.name() + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

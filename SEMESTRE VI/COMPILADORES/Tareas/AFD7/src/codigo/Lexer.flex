package codigo;
import static codigo.Tokens.*; // Clase enumeracion de todos los Tokens

%%
%class Lexer // Clase Lexer
%type Tokens
L=[a-zA-Z_]+ // Lenguaje - analizar la palabra hasta encontrar un espacio
D=[0-9]+ // Digitos - analizar los digitos hasta encontrar un espacio
espacio=[ ,\t,\r,\n]+ // Espacios Ignorados
%{
    public String lexeme;
%}
%% // Palabras reservadas en nuestro codigo
int |
if |
else |
while {lexeme=yytext(); return Reservadas;} // yytext - analizador de cadena
{espacio} {/*Ignore*/} // Los espacios se ignoran
"//".* {/*Ignore*/} // Los comentarios se ignoran
"=" {return Igual;} // Simbolos matematicos
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
{L}({L}|{D})* {lexeme=yytext(); return Variable;} // Regla sintactica de las variables
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;} // Numeros
 . {return ERROR;} // Regresa error en caso de no encontrar ningun caso
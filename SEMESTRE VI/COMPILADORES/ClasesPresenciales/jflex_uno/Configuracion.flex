package mx.unam.aragon.lexico;
%%
%type Tokens
L=[a-zA-Z]
D=[0-9]
WHITE=[\t\r\n]
%{
    // propiedad
    public String lexema;
%}
%%
class Lexico{
    type Tokens
    L = [a-zA-Z]
    D = [0-9]


}
package compiladores_2023b;

import static compiladores_2023b.Tokens.*;


%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{/*una clase publica de tipo string que se llamara lexem*/
    public String lexeme;
%}
%%
/*hasta aqui*/
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte |string| int | char | long | float | double | boolean |void) {lexeme=yytext(); return T_dato;}

/*Modificadores de acceso*/
( private |public| protected| static) {lexeme=yytext(); return Modificadores_acceso;}

/*declaracion de clase*/
( class | Enums | abstract ) {lexeme=yytext(); return Clase;}

/* Tipo de dato String */
/*se pone el yytext para recuperar el simbolo y nos muestre null*/
( string ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Palabra reservada switch */
( switch ) {lexeme=yytext(); return Switch;}

/* Palabra reservada caso */
( case ) {lexeme=yytext(); return Case;}

/* Palabra reservada ?: */
( "?:" ) {lexeme=yytext(); return Op_condicional;}

/* Palabra reservada break */
( "break" ) {lexeme=yytext(); return Break;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Punto */
( "." ) {lexeme=yytext(); return Punto;}
/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

( "main" ) {lexeme=yytext(); return Main;}

/* Marcador de inicio de algoritmo */
( "package" ) {lexeme=yytext(); return M_Package;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Identificador una regla sintactica que es empezando por una letra eseguida de otra letra o numero */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero empieza con un digito que sigue con otro digito ya sea positivo o negativo*/
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

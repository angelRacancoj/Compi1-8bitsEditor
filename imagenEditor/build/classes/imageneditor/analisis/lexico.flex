package imageneditor.analisis;

import java_cup.runtime.*;
import imageneditor.exceptions.InputsVaciosException;

%%

%public
%class Lexer
%cup
%cupdebug
%line
%column

LineTerminator = \r|\n|\r\n|null
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment   = "/*" [^*] ~"*/"  //"$*" [^*] ~"*$"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?

entero = [-]? [:digit:]+
cadena = "\"" [^*] ~"\""
identificador = [:jletter:]([:jletterdigit:] | [-] | [_])*
hexaCode = [#][:jletterdigit:][:jletterdigit:][:jletterdigit:][:jletterdigit:][:jletterdigit:][:jletterdigit:]

%{
	StringBuilder string = new StringBuilder();

  	private Symbol symbol(int type) {
    	return new Symbol(type, yyline+1, yycolumn+1);
  	}

  	private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline+1, yycolumn+1, value);
  	}

  	private void error(String message) throws InputsVaciosException {
    	System.out.println("Error en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
      throw new InputsVaciosException("Error en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
  	}

	private void imprimirToken(String textSalida){
		System.out.println("Leido: >> " + textSalida + " <<");
	}
%}

%%

<YYINITIAL>{

  "PINTAR"          {imprimirToken(yytext()); return symbol(sym.Pintar, yytext());}
  "INSTRUCCIONES"   {imprimirToken(yytext()); return symbol(sym.Instrucciones, yytext());}
  "VARS"            {imprimirToken(yytext()); return symbol(sym.Vars, yytext());}
  "VAR"             {imprimirToken(yytext()); return symbol(sym.NewVar, yytext());}
  "COLORES"         {imprimirToken(yytext()); return symbol(sym.Colores, yytext());}
  "dimension"       {imprimirToken(yytext()); return symbol(sym.Dimension, yytext());}
  "cuadro"          {imprimirToken(yytext()); return symbol(sym.Cuadro, yytext());}
  "HEX"             {imprimirToken(yytext()); return symbol(sym.Hex, yytext());}
  "Red"             {imprimirToken(yytext()); return symbol(sym.Red, yytext());}
  "Blue"            {imprimirToken(yytext()); return symbol(sym.Blue, yytext());}
  "Green"           {imprimirToken(yytext()); return symbol(sym.Green, yytext());}
  "tipo"            {imprimirToken(yytext()); return symbol(sym.Tipo, yytext());}
  "Fondo"           {imprimirToken(yytext()); return symbol(sym.Fondo, yytext());}
  "tamanio"         {imprimirToken(yytext()); return symbol(sym.Tamanio, yytext());}
  "nombre"          {imprimirToken(yytext()); return symbol(sym.Nombre, yytext());}
  "LIENZOS"         {imprimirToken(yytext()); return symbol(sym.Lienzos, yytext());}
  "="               {imprimirToken(yytext()); return symbol(sym.Igual, yytext());}
  "-"               {imprimirToken(yytext()); return symbol(sym.Menos, yytext());}
  "+"               {imprimirToken(yytext()); return symbol(sym.Mas, yytext());}
  ","               {imprimirToken(yytext()); return symbol(sym.Coma, yytext());}
  ".."              {imprimirToken(yytext()); return symbol(sym.Intervalo, yytext());}
  ":"               {imprimirToken(yytext()); return symbol(sym.DosPuntos, yytext());}
  ";"               {imprimirToken(yytext()); return symbol(sym.PuntoYComa, yytext());}
  "("               {imprimirToken(yytext()); return symbol(sym.ParAbierto, yytext());}
  ")"               {imprimirToken(yytext()); return symbol(sym.ParCerrado, yytext());}
  "{"               {imprimirToken(yytext()); return symbol(sym.CorAbierto, yytext());}
  "}"               {imprimirToken(yytext()); return symbol(sym.CorCerrado, yytext());}
  "["               {imprimirToken(yytext()); return symbol(sym.LlaveAbierta, yytext());}
  "]"               {imprimirToken(yytext()); return symbol(sym.LlaveCerrada, yytext());}
  {Comment}         {imprimirToken(yytext()); return symbol(sym.Comment, yytext());}
  {hexaCode}        {imprimirToken(yytext()); return symbol(sym.HexaCode, yytext());}
  {entero}          {imprimirToken(yytext()); return symbol(sym.Entero, yytext());}
  {cadena}          {imprimirToken(yytext()); return symbol(sym.Cadena, yytext());}
  {identificador}   {imprimirToken(yytext()); return symbol(sym.Identificador, yytext());}
  {WhiteSpace}      {/*Nothing to do*/}
  {LineTerminator}  {/*Nothing to do*/}
}

[^] {error("Simbolo invalido << "+ yytext()+" >>");}
<<EOF>>                 { return symbol(sym.EOF); }
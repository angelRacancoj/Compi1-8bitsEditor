
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package imageneditor.analisis;

import java_cup.runtime.*;
import imageneditor.DefaultValue;
import imageneditor.objectsManager.canvasManager;
import imageneditor.exceptions.InputsVaciosException;
import imageneditor.exceptions.errorsSaver;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class canvas extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public canvas() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public canvas(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public canvas(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\011\000\002\002" +
    "\003\000\002\003\005\000\002\003\003\000\002\013\007" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\004\003\000\002\004\003\000\002\005" +
    "\005\000\002\006\005\000\002\007\007\000\002\011\005" +
    "\000\002\011\003\000\002\012\007\000\002\012\007\000" +
    "\002\012\007\000\002\012\005\000\002\012\005\000\002" +
    "\012\005\000\002\010\015\000\002\010\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\006\003\005\033\006\001\002\000\004\002" +
    "\123\001\002\000\004\002\uffff\001\002\000\004\021\007" +
    "\001\002\000\004\027\010\001\002\000\004\033\011\001" +
    "\002\000\004\042\013\001\002\000\006\025\121\034\ufffd" +
    "\001\002\000\004\027\017\001\002\000\004\034\015\001" +
    "\002\000\004\034\016\001\002\000\004\002\000\001\002" +
    "\000\004\033\020\001\002\000\014\003\027\012\021\013" +
    "\025\017\024\020\022\001\002\000\004\027\117\001\002" +
    "\000\004\027\115\001\002\000\006\025\113\034\ufff5\001" +
    "\002\000\004\027\071\001\002\000\004\027\042\001\002" +
    "\000\006\025\040\034\ufff6\001\002\000\004\034\ufff3\001" +
    "\002\000\004\034\037\001\002\000\006\025\035\034\ufff7" +
    "\001\002\000\006\025\033\034\ufff4\001\002\000\014\003" +
    "\027\012\021\013\025\017\024\020\022\001\002\000\004" +
    "\034\ufff8\001\002\000\014\003\027\012\021\013\025\017" +
    "\024\020\022\001\002\000\004\034\ufffb\001\002\000\006" +
    "\025\ufffc\034\ufffc\001\002\000\014\003\027\012\021\013" +
    "\025\017\024\020\022\001\002\000\004\034\ufffa\001\002" +
    "\000\004\033\043\001\002\000\012\011\045\014\047\015" +
    "\050\016\046\001\002\000\004\034\070\001\002\000\004" +
    "\027\066\001\002\000\004\027\062\001\002\000\004\027" +
    "\056\001\002\000\004\027\052\001\002\000\004\034\uffee" +
    "\001\002\000\004\045\053\001\002\000\006\025\054\034" +
    "\uffe9\001\002\000\010\014\047\015\050\016\046\001\002" +
    "\000\004\034\uffec\001\002\000\004\045\057\001\002\000" +
    "\006\025\060\034\uffea\001\002\000\010\014\047\015\050" +
    "\016\046\001\002\000\004\034\uffed\001\002\000\004\045" +
    "\063\001\002\000\006\025\064\034\uffe8\001\002\000\010" +
    "\014\047\015\050\016\046\001\002\000\004\034\uffeb\001" +
    "\002\000\004\040\067\001\002\000\004\034\uffef\001\002" +
    "\000\006\025\ufff0\034\ufff0\001\002\000\004\033\072\001" +
    "\002\000\006\007\074\010\073\001\002\000\004\027\104" +
    "\001\002\000\004\027\075\001\002\000\004\045\076\001" +
    "\002\000\004\025\077\001\002\000\004\010\100\001\002" +
    "\000\004\027\101\001\002\000\004\045\102\001\002\000" +
    "\004\034\103\001\002\000\006\025\uffe6\034\uffe6\001\002" +
    "\000\004\045\105\001\002\000\004\025\106\001\002\000" +
    "\004\007\107\001\002\000\004\027\110\001\002\000\004" +
    "\045\111\001\002\000\004\034\112\001\002\000\006\025" +
    "\uffe7\034\uffe7\001\002\000\014\003\027\012\021\013\025" +
    "\017\024\020\022\001\002\000\004\034\ufff9\001\002\000" +
    "\004\041\116\001\002\000\006\025\ufff2\034\ufff2\001\002" +
    "\000\004\041\120\001\002\000\006\025\ufff1\034\ufff1\001" +
    "\002\000\004\042\013\001\002\000\004\034\ufffe\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\013\013\011\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\004\027\005" +
    "\030\006\025\007\022\010\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\004" +
    "\033\005\030\006\025\007\022\010\031\001\001\000\002" +
    "\001\001\000\014\004\035\005\030\006\025\007\022\010" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\004\040\005\030\006\025\007\022\010\031\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\011\043\012\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\054\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\060\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\064\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\004\113\005" +
    "\030\006\025\007\022\010\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\003\121\013\011\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$canvas$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$canvas$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$canvas$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	errorsSaver errors;
	canvasManager newCanvasM;
	String id = "";
	String name = "";
	String type = "";
	int red = DefaultValue.INVALID_CL_CODE;
	int blue = DefaultValue.INVALID_CL_CODE;
	int green = DefaultValue.INVALID_CL_CODE;
	String hexaC = "";
	int cuadros = DefaultValue.NO_INICIO_DIMENSION;
	int dimesion = DefaultValue.NO_INICIO_DIMENSION;


	public canvas(Lexer lex, canvasManager canvasM, errorsSaver errors){
		super(lex);
		this.newCanvasM = canvasM;
		this.errors = errors;
	}

	public void syntax_error(Symbol cur_token) {
		String message = "Estructura invalida en posición " + cur_token.right
			 + ", token: " + cur_token.value;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<");	 
		System.out.println(message);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		errors.addCanvasError("(Canvas)" +message);
	}

	private void setNameLienzo(String nameLienzo) throws InputsVaciosException{
		if (name.equals("")) {
			name = nameLienzo;
		} else {
			throw new InputsVaciosException("Lienzo's name " + nameLienzo + " already set");
		}
	}

	private void setTypeLienzo(String typeLienzo) throws InputsVaciosException{
		if (type.equals("")) {
			type = typeLienzo;
		} else {
			throw new InputsVaciosException("Lienzo's type " + typeLienzo + " already set");
		}
	}

	private void setCuadros(int CuadroCl) throws InputsVaciosException {
		if (cuadros == DefaultValue.NO_INICIO_DIMENSION) {
			cuadros = CuadroCl;
		} else {
			throw new InputsVaciosException("Cuadro parameter " + CuadroCl + " can't set");
		}
	}

	private void setDimension(int DimensionCl) throws InputsVaciosException {
		if (dimesion == DefaultValue.NO_INICIO_DIMENSION) {
			dimesion = DimensionCl;
		} else {
			throw new InputsVaciosException("Dimension parameter " + DimensionCl + " can't set");
		}
	}

	private void setRedCode(int RedCl) throws InputsVaciosException {
		if ((red == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			red = RedCl;
		} else {
			throw new InputsVaciosException("Red code " + RedCl + " can't set");
		}
	}

	private void setBlueCode(int BlueCl) throws InputsVaciosException {
		if ((blue == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			blue = BlueCl;
		} else {
			throw new InputsVaciosException("Red code " + BlueCl + " can't set");
		}
	}

	private void setGreenCode(int GreenCl) throws InputsVaciosException {
		if ((green == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			green = GreenCl;
		} else {
			throw new InputsVaciosException("Red code " + GreenCl + " can't set");
		}
	}

	private void setHexa(String hexaCd) throws InputsVaciosException{
		if (hexaC.equals("") && (red == DefaultValue.INVALID_CL_CODE) && (blue == DefaultValue.INVALID_CL_CODE) && (green == DefaultValue.INVALID_CL_CODE)) {
			hexaC = hexaCd;
		} else {
			throw new InputsVaciosException("Hexa code " + hexaCd + " can't set");
		}
	}

	private void setlienzo(String idLienzo) throws InputsVaciosException {
		if (!name.equals("") && !type.equals("") && (((red != DefaultValue.INVALID_CL_CODE) && 
			(blue != DefaultValue.INVALID_CL_CODE) && (green != DefaultValue.INVALID_CL_CODE)&& 
			(hexaC.equals(""))) || ((red == DefaultValue.INVALID_CL_CODE) && (blue == DefaultValue.INVALID_CL_CODE) 
			&& (green == DefaultValue.INVALID_CL_CODE)&& (!hexaC.equals("")))) && 
			(cuadros != DefaultValue.NO_INICIO_DIMENSION) && (dimesion != DefaultValue.NO_INICIO_DIMENSION)) {
			
			if (((red != DefaultValue.INVALID_CL_CODE) && (blue != DefaultValue.INVALID_CL_CODE) && (green != DefaultValue.INVALID_CL_CODE)&& (hexaC.equals("")))) {
				newCanvasM.addLienzo(idLienzo, name, type, red, green, blue, cuadros, dimesion);
			} else if (((red == DefaultValue.INVALID_CL_CODE) && (blue == DefaultValue.INVALID_CL_CODE) && (green == DefaultValue.INVALID_CL_CODE)&& (!hexaC.equals("")))) {
				newCanvasM.addLienzo(idLienzo, name, type, hexaC, cuadros, dimesion);
			}
		} else {
			throw new InputsVaciosException("Missing parameter at " + idLienzo + " lienzo");
		}
		cleanValues();
	}

	private void cleanValues(){
		id = "";
		name = "";
		type = "";
		red = DefaultValue.INVALID_CL_CODE;
		blue = DefaultValue.INVALID_CL_CODE;
		green = DefaultValue.INVALID_CL_CODE;
		hexaC = "";
		cuadros = DefaultValue.NO_INICIO_DIMENSION;
		dimesion = DefaultValue.NO_INICIO_DIMENSION;

	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$canvas$actions {
  private final canvas parser;

  /** Constructor */
  CUP$canvas$actions(canvas parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$canvas$do_action_part00000000(
    int                        CUP$canvas$act_num,
    java_cup.runtime.lr_parser CUP$canvas$parser,
    java.util.Stack            CUP$canvas$stack,
    int                        CUP$canvas$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$canvas$result;

      /* select the action based on the action number */
      switch (CUP$canvas$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= CANVAS EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-1)).value;
		RESULT = start_val;
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$canvas$parser.done_parsing();
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // CANVAS ::= CorAbierto Lienzos DosPuntos CorAbierto CUERPO CorCerrado CorCerrado 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CANVAS",0, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-6)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CANVAS ::= error 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 System.out.println("error: "+e); errors.addCanvasError("(Canvas)Error desde el inicio: " + e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CANVAS",0, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= LIENZO Coma CUERPO 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= LIENZO 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LIENZO ::= Identificador DosPuntos CorAbierto CARACTERISTICAS CorCerrado 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-4)).value;
		 setlienzo(e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("LIENZO",9, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CARACTERISTICAS ::= NOMBRE Coma CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CARACTERISTICAS ::= TIPO Coma CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CARACTERISTICAS ::= FONDO Coma CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CARACTERISTICAS ::= TAMANIO Coma CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CARACTERISTICAS ::= NOMBRE 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CARACTERISTICAS ::= TIPO 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CARACTERISTICAS ::= FONDO 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CARACTERISTICAS ::= TAMANIO 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // CARACTERISTICAS ::= error 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 errors.addCanvasError("(Canvas)Error en las caracteristicas: " + e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NOMBRE ::= Nombre DosPuntos Cadena 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setNameLienzo(e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("NOMBRE",3, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // TIPO ::= Tipo DosPuntos Cadena 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setTypeLienzo(e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // FONDO ::= Fondo DosPuntos CorAbierto COLOR CorCerrado 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("FONDO",5, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // COLOR ::= Hex DosPuntos HexaCode 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setHexa(e); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("COLOR",7, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // COLOR ::= CLRGB 
            {
              String RESULT =null;

              CUP$canvas$result = parser.getSymbolFactory().newSymbol("COLOR",7, ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CLRGB ::= Red DosPuntos Entero Coma CLRGB 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-2)).value;
		 setRedCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // CLRGB ::= Blue DosPuntos Entero Coma CLRGB 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-2)).value;
		 setBlueCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CLRGB ::= Green DosPuntos Entero Coma CLRGB 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-2)).value;
		 setGreenCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-4)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CLRGB ::= Red DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setRedCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CLRGB ::= Blue DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setBlueCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CLRGB ::= Green DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.peek()).value;
		 setGreenCode(Integer.parseInt(e)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("CLRGB",8, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-2)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // TAMANIO ::= Tamanio DosPuntos CorAbierto Cuadro DosPuntos Entero Coma Dimension DosPuntos Entero CorCerrado 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-5)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-5)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-1)).value;
		 setCuadros(Integer.parseInt(e1)); setDimension(Integer.parseInt(e2)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("TAMANIO",6, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-10)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // TAMANIO ::= Tamanio DosPuntos CorAbierto Dimension DosPuntos Entero Coma Cuadro DosPuntos Entero CorCerrado 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-5)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-5)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-5)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-1)).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$canvas$stack.elementAt(CUP$canvas$top-1)).value;
		 setCuadros(Integer.parseInt(e2)); setDimension(Integer.parseInt(e1)); 
              CUP$canvas$result = parser.getSymbolFactory().newSymbol("TAMANIO",6, ((java_cup.runtime.Symbol)CUP$canvas$stack.elementAt(CUP$canvas$top-10)), ((java_cup.runtime.Symbol)CUP$canvas$stack.peek()), RESULT);
            }
          return CUP$canvas$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$canvas$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$canvas$do_action(
    int                        CUP$canvas$act_num,
    java_cup.runtime.lr_parser CUP$canvas$parser,
    java.util.Stack            CUP$canvas$stack,
    int                        CUP$canvas$top)
    throws java.lang.Exception
    {
              return CUP$canvas$do_action_part00000000(
                               CUP$canvas$act_num,
                               CUP$canvas$parser,
                               CUP$canvas$stack,
                               CUP$canvas$top);
    }
}

}


//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jan 30 12:09:31 CST 2024
//----------------------------------------------------

package compiladores_2023b;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jan 30 12:09:31 CST 2024
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\002\004\000\002\002\006\000\002\015" +
    "\010\000\002\015\007\000\002\003\004\000\002\003\003" +
    "\000\002\003\004\000\002\003\003\000\002\003\004\000" +
    "\002\003\003\000\002\003\004\000\002\003\003\000\002" +
    "\003\005\000\002\003\004\000\002\003\003\000\002\004" +
    "\005\000\002\004\007\000\002\004\007\000\002\004\006" +
    "\000\002\004\006\000\002\004\005\000\002\004\007\000" +
    "\002\004\007\000\002\004\006\000\002\004\006\000\002" +
    "\004\010\000\002\004\010\000\002\004\011\000\002\004" +
    "\011\000\002\006\011\000\002\013\003\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\006\000" +
    "\002\013\007\000\002\007\015\000\002\010\011\000\002" +
    "\011\013\000\002\012\011\000\002\014\012\000\002\014" +
    "\011\000\002\005\005\000\002\005\004\000\002\005\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\213\000\004\014\005\001\002\000\004\002\215\001" +
    "\002\000\004\053\006\001\002\000\004\052\007\001\002" +
    "\000\006\015\012\017\011\001\002\000\004\002\000\001" +
    "\002\000\004\053\211\001\002\000\004\017\013\001\002" +
    "\000\004\053\014\001\002\000\004\045\015\001\002\000" +
    "\016\004\027\022\024\023\023\024\021\027\017\030\031" +
    "\001\002\000\022\004\ufff6\022\ufff6\023\ufff6\024\ufff6\026" +
    "\ufff6\027\ufff6\030\ufff6\046\ufff6\001\002\000\004\043\203" +
    "\001\002\000\022\004\ufff3\022\ufff3\023\ufff3\024\ufff3\026" +
    "\ufff3\027\ufff3\030\ufff3\046\ufff3\001\002\000\004\043\171" +
    "\001\002\000\022\004\ufffc\022\ufffc\023\ufffc\024\ufffc\026" +
    "\ufffc\027\ufffc\030\ufffc\046\ufffc\001\002\000\004\053\152" +
    "\001\002\000\006\041\136\053\135\001\002\000\022\004" +
    "\ufff8\022\ufff8\023\ufff8\024\ufff8\026\ufff8\027\ufff8\030\ufff8" +
    "\046\ufff8\001\002\000\022\004\ufffa\022\ufffa\023\ufffa\024" +
    "\ufffa\026\ufffa\027\ufffa\030\ufffa\046\ufffa\001\002\000\006" +
    "\041\120\053\121\001\002\000\022\004\027\022\024\023" +
    "\023\024\021\026\102\027\017\030\031\046\117\001\002" +
    "\000\004\043\032\001\002\000\006\022\034\053\035\001" +
    "\002\000\004\044\073\001\002\000\004\053\064\001\002" +
    "\000\004\031\036\001\002\000\004\054\037\001\002\000" +
    "\004\052\040\001\002\000\006\042\042\053\043\001\002" +
    "\000\004\052\054\001\002\000\006\044\uffe3\052\uffe3\001" +
    "\002\000\004\037\044\001\002\000\012\021\046\042\047" +
    "\053\050\054\045\001\002\000\006\044\uffe1\052\uffe1\001" +
    "\002\000\006\021\051\053\052\001\002\000\006\044\uffe2" +
    "\052\uffe2\001\002\000\006\044\uffe0\052\uffe0\001\002\000" +
    "\006\044\uffdf\052\uffdf\001\002\000\004\021\053\001\002" +
    "\000\006\044\uffde\052\uffde\001\002\000\006\041\056\053" +
    "\057\001\002\000\004\044\uffd8\001\002\000\004\053\063" +
    "\001\002\000\006\040\060\041\061\001\002\000\004\054" +
    "\062\001\002\000\004\044\uffd6\001\002\000\004\044\uffd7" +
    "\001\002\000\004\044\uffd5\001\002\000\004\031\065\001" +
    "\002\000\004\054\066\001\002\000\004\052\067\001\002" +
    "\000\006\042\042\053\043\001\002\000\004\052\071\001" +
    "\002\000\006\041\056\053\057\001\002\000\004\044\uffd9" +
    "\001\002\000\004\045\074\001\002\000\016\004\027\022" +
    "\024\023\023\024\021\027\017\030\031\001\002\000\022" +
    "\004\027\022\024\023\023\024\021\026\102\027\017\030" +
    "\031\046\104\001\002\000\022\004\ufff7\022\ufff7\023\ufff7" +
    "\024\ufff7\026\ufff7\027\ufff7\030\ufff7\046\ufff7\001\002\000" +
    "\022\004\ufff4\022\ufff4\023\ufff4\024\ufff4\026\ufff4\027\ufff4" +
    "\030\ufff4\046\ufff4\001\002\000\022\004\ufffd\022\ufffd\023" +
    "\ufffd\024\ufffd\026\ufffd\027\ufffd\030\ufffd\046\ufffd\001\002" +
    "\000\022\004\ufff9\022\ufff9\023\ufff9\024\ufff9\026\ufff9\027" +
    "\ufff9\030\ufff9\046\ufff9\001\002\000\004\045\107\001\002" +
    "\000\022\004\ufffb\022\ufffb\023\ufffb\024\ufffb\026\ufffb\027" +
    "\ufffb\030\ufffb\046\ufffb\001\002\000\022\004\uffda\022\uffda" +
    "\023\uffda\024\uffda\026\uffda\027\uffda\030\uffda\046\uffda\001" +
    "\002\000\004\026\102\001\002\000\022\004\ufff5\022\ufff5" +
    "\023\ufff5\024\ufff5\026\ufff5\027\ufff5\030\ufff5\046\ufff5\001" +
    "\002\000\016\004\027\022\024\023\023\024\021\027\017" +
    "\030\031\001\002\000\022\004\027\022\024\023\023\024" +
    "\021\026\102\027\017\030\031\046\111\001\002\000\004" +
    "\027\112\001\002\000\004\043\113\001\002\000\006\042" +
    "\042\053\043\001\002\000\004\044\115\001\002\000\004" +
    "\052\116\001\002\000\022\004\uffdb\022\uffdb\023\uffdb\024" +
    "\uffdb\026\uffdb\027\uffdb\030\uffdb\046\uffdb\001\002\000\004" +
    "\002\uffff\001\002\000\004\053\133\001\002\000\012\031" +
    "\125\040\122\041\124\052\123\001\002\000\004\054\131" +
    "\001\002\000\022\004\ufff2\022\ufff2\023\ufff2\024\ufff2\026" +
    "\ufff2\027\ufff2\030\ufff2\046\ufff2\001\002\000\004\052\130" +
    "\001\002\000\004\054\126\001\002\000\004\052\127\001" +
    "\002\000\022\004\ufff0\022\ufff0\023\ufff0\024\ufff0\026\ufff0" +
    "\027\ufff0\030\ufff0\046\ufff0\001\002\000\022\004\uffef\022" +
    "\uffef\023\uffef\024\uffef\026\uffef\027\uffef\030\uffef\046\uffef" +
    "\001\002\000\004\052\132\001\002\000\022\004\ufff1\022" +
    "\ufff1\023\ufff1\024\ufff1\026\ufff1\027\ufff1\030\ufff1\046\ufff1" +
    "\001\002\000\004\052\134\001\002\000\022\004\uffee\022" +
    "\uffee\023\uffee\024\uffee\026\uffee\027\uffee\030\uffee\046\uffee" +
    "\001\002\000\012\031\144\040\141\041\143\052\142\001" +
    "\002\000\004\053\137\001\002\000\004\052\140\001\002" +
    "\000\022\004\uffe9\022\uffe9\023\uffe9\024\uffe9\026\uffe9\027" +
    "\uffe9\030\uffe9\046\uffe9\001\002\000\004\054\150\001\002" +
    "\000\022\004\uffed\022\uffed\023\uffed\024\uffed\026\uffed\027" +
    "\uffed\030\uffed\046\uffed\001\002\000\004\052\147\001\002" +
    "\000\004\054\145\001\002\000\004\052\146\001\002\000" +
    "\022\004\uffeb\022\uffeb\023\uffeb\024\uffeb\026\uffeb\027\uffeb" +
    "\030\uffeb\046\uffeb\001\002\000\022\004\uffea\022\uffea\023" +
    "\uffea\024\uffea\026\uffea\027\uffea\030\uffea\046\uffea\001\002" +
    "\000\004\052\151\001\002\000\022\004\uffec\022\uffec\023" +
    "\uffec\024\uffec\026\uffec\027\uffec\030\uffec\046\uffec\001\002" +
    "\000\006\031\154\040\153\001\002\000\004\021\163\001" +
    "\002\000\004\021\155\001\002\000\006\021\156\053\157" +
    "\001\002\000\004\052\162\001\002\000\004\021\160\001" +
    "\002\000\004\052\161\001\002\000\022\004\uffe5\022\uffe5" +
    "\023\uffe5\024\uffe5\026\uffe5\027\uffe5\030\uffe5\046\uffe5\001" +
    "\002\000\022\004\uffe7\022\uffe7\023\uffe7\024\uffe7\026\uffe7" +
    "\027\uffe7\030\uffe7\046\uffe7\001\002\000\006\021\164\053" +
    "\165\001\002\000\004\052\170\001\002\000\004\021\166" +
    "\001\002\000\004\052\167\001\002\000\022\004\uffe6\022" +
    "\uffe6\023\uffe6\024\uffe6\026\uffe6\027\uffe6\030\uffe6\046\uffe6" +
    "\001\002\000\022\004\uffe8\022\uffe8\023\uffe8\024\uffe8\026" +
    "\uffe8\027\uffe8\030\uffe8\046\uffe8\001\002\000\006\042\042" +
    "\053\043\001\002\000\004\044\173\001\002\000\004\045" +
    "\174\001\002\000\016\004\027\022\024\023\023\024\021" +
    "\027\017\030\031\001\002\000\022\004\027\022\024\023" +
    "\023\024\021\026\102\027\017\030\031\046\176\001\002" +
    "\000\024\004\uffe4\022\uffe4\023\uffe4\024\uffe4\025\177\026" +
    "\uffe4\027\uffe4\030\uffe4\046\uffe4\001\002\000\004\045\200" +
    "\001\002\000\016\004\027\022\024\023\023\024\021\027" +
    "\017\030\031\001\002\000\022\004\027\022\024\023\023" +
    "\024\021\026\102\027\017\030\031\046\202\001\002\000" +
    "\022\004\uffdd\022\uffdd\023\uffdd\024\uffdd\026\uffdd\027\uffdd" +
    "\030\uffdd\046\uffdd\001\002\000\006\042\042\053\043\001" +
    "\002\000\004\044\205\001\002\000\004\045\206\001\002" +
    "\000\016\004\027\022\024\023\023\024\021\027\017\030" +
    "\031\001\002\000\022\004\027\022\024\023\023\024\021" +
    "\026\102\027\017\030\031\046\210\001\002\000\022\004" +
    "\uffdc\022\uffdc\023\uffdc\024\uffdc\026\uffdc\027\uffdc\030\uffdc" +
    "\046\uffdc\001\002\000\004\045\212\001\002\000\016\004" +
    "\027\022\024\023\023\024\021\027\017\030\031\001\002" +
    "\000\022\004\027\022\024\023\023\024\021\026\102\027" +
    "\017\030\031\046\214\001\002\000\004\002\ufffe\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\213\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\003\027\004\021" +
    "\006\025\007\024\010\015\012\017\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\004\077\006\102\007\100\010\075\011\104\012\076\001" +
    "\001\000\002\001\001\000\004\014\032\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\040\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\067\001\001\000\002\001\001\000\004\005\071\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\074\004" +
    "\021\006\025\007\024\010\015\012\017\001\001\000\016" +
    "\004\077\006\102\007\100\010\075\011\104\012\076\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\105\001\001\000\002\001\001" +
    "\000\016\003\107\004\021\006\025\007\024\010\015\012" +
    "\017\001\001\000\016\004\077\006\102\007\100\010\075" +
    "\011\104\012\076\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\113\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\171\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\174\004\021\006" +
    "\025\007\024\010\015\012\017\001\001\000\016\004\077" +
    "\006\102\007\100\010\075\011\104\012\076\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\003\200\004\021" +
    "\006\025\007\024\010\015\012\017\001\001\000\016\004" +
    "\077\006\102\007\100\010\075\011\104\012\076\001\001" +
    "\000\002\001\001\000\004\013\203\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\003\206\004\021\006\025" +
    "\007\024\010\015\012\017\001\001\000\016\004\077\006" +
    "\102\007\100\010\075\011\104\012\076\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\212\004\021\006" +
    "\025\007\024\010\015\012\017\001\001\000\016\004\077" +
    "\006\102\007\100\010\075\011\104\012\076\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
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
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Int Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= Int Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= Int Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= Int Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= Int Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CLASES ::= Clase Identificador Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASES",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLASES ::= Modificadores_acceso Clase Identificador Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLASES",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= M_Package Identificador P_coma CLASES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


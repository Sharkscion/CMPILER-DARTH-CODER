/**
 * Define a grammar called Hello
 */
grammar Calculator;

//@members {
//	public String getErrorMessage(RecognitionException e,
//	String[] tokenNames)
//	{
//		List stack = getRuleInvocationStack(e, this.getClass().getName());
//		String msg = null;
//		System.out.println("HELOOO ERROR:> ");
//		if ( e instanceof NoViableAltException ) {
//			NoViableAltException nvae = (NoViableAltException)e;
//			msg = " no viable alt; token="+e.token+
//			" (decision="+nvae.decisionNumber+
//			" state "+nvae.stateNumber+")"+
//			" decision=<<"+nvae.grammarDecisionDescription+">>";
//		}
//		else {
//			msg = super.getErrorMessage(e, tokenNames);
//		}
//		return stack+" "+msg;
//	}
//	public String getTokenErrorDisplay(Token t) {
//		return t.toString();
//	}
//}


//@parser::members {
//	
//	System.out.println("JSHD");
//  @Override
//  public void reportError(RecognitionException e) {
//    throw new RuntimeException("I quit!\n" + e.getMessage()); 
//  }
//}
//
//@lexer::members {
//  @Override
//  public void reportError(RecognitionException e) {
//    throw new RuntimeException("I quit!\n" + e.getMessage()); 
//  }
//}
//@lexer::members { 
//    private CustomErrorTracker errorTracker;
//    private String[] token_names;
//	private String error_header;
//	private String error_message;
//	private RecognitionException reg_error;     
//
//	public String[] getTokenNames(){
//		return this.token_names;
//	}
//	public void setTokenNames(String[] token_names){
//		this.token_names = token_names;
//	}
//	
//	public String getErrorHeader(){
//		return this.error_header;
//	}
//	public void setErrorHeader(String error_header){
//		return this.error_header = error_header;
//	}
//	
//	public String getErrorMessage(){
//		return this.error_message;
//	}
//	public void setErrorMessage(String error_message){
//		return this.error_message = error_message;
//	}
//	
//	public RecognitionError getRecognitionError(){
//		return this.reg_error;
//	}
//	public void setRecognitionError(RecognitionError reg_error){
//		this.reg_error = reg_error;	
//	}
//	
//    @Override    
//    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
//        String hdr = getErrorHeader(e);
//        String msg = getErrorMessage(e, tokenNames);
//        throw new RuntimeException(hdr + ":" + msg + " : parser error");
//    }
//}

INT		: [0-9]+;
DOUBLE	: [0-9]+'.'[0-9]+;
NL		: '\n';
WS		: [ \t\r]+	-> skip;

PLUS	: '+';
MINUS	: '-';
MULT	: '*';
DIV		: '/';
LPAR	: '(';
RPAR	: ')';
EQUAL	: '=';

start
	: plusOrMinus NL? # Calculate
	;
	
plusOrMinus
	: plusOrMinus PLUS multOrDiv	#Plus
	| plusOrMinus MINUS multOrDiv	#Minus
	| multOrDiv						#ToMultOrDiv
	;

multOrDiv
	: multOrDiv MULT INT			#Multiplication
	| multOrDiv DIV INT				#Division
	| INT							#Int
	;




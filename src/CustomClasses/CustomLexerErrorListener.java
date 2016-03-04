package CustomClasses;

import java.util.BitSet;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class CustomLexerErrorListener extends LexerErrorListener{
	
	private boolean isDone;
	public CustomLexerErrorListener() {
		super();
		isDone = false;
	}
	
	 @Override
	    public void syntaxError ( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e )
	    {
		 	errorCount++;
		 	if(!isDone) {
		 		System.out.println("@LEXICAL ERROR: ");
		 		isDone = true;
		 	}
		 	System.out.println("LINE: "+ line + " chaPositionInLine: "+ charPositionInLine + " MESSAGE: "+ msg);
		 	
	    }

	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3,
			boolean arg4, BitSet arg5, ATNConfigSet arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2,
			int arg3, BitSet arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2,
			int arg3, int arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

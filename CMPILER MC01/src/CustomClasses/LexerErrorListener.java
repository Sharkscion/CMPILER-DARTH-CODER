package CustomClasses;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class LexerErrorListener extends BaseErrorListener
{
    private List<SyntaxErrorItem> items;
    private int errorCount;
    
    public LexerErrorListener ( )
    {
        this.items = new ArrayList<SyntaxErrorItem>();
        errorCount = 0;
    }
    
    @Override
    public void syntaxError ( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e )
    {
    	errorCount ++;
        this.items.add ( new SyntaxErrorItem ( line, charPositionInLine, msg, offendingSymbol, e ) );
      //  System.out.println("@LEXICAL ERROR: ["+line+":"+charPositionInLine+"] "+msg);
    }
    
    public void setErrorCount(int count){
    	this.errorCount = count;
    }
    
    public int getErrorCountNum() {
    	return errorCount;
    }
    
    public boolean hasErrors () 
    {  	
    	boolean isResult;
    	if(this.errorCount!= 0)
    		isResult = true;
    	else isResult = false;
    	return isResult;
    }
    
    public int getErrorCount(){
    	return this.items.size();
    }
    
    @Override
    public String toString( )
    {
        if ( !hasErrors() ) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for ( SyntaxErrorItem s : items )
        {
            builder.append ( String.format ( "%s",s ) );
        }
        return builder.toString();
    }
}
 
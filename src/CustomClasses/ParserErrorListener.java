package CustomClasses;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserErrorListener extends BaseErrorListener
{
    private List<SyntaxErrorItem> items;
    
    public ParserErrorListener ( )
    {
        this.items = new ArrayList<SyntaxErrorItem>();
    }
    
    @Override
    public void syntaxError ( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e )
    {
    	//System.out.println("LINE: "+ line + " chaPositionInLine: "+ charPositionInLine + " MESSAGE: "+ msg);
        items.add ( new SyntaxErrorItem ( line, charPositionInLine, msg, offendingSymbol, e ) );
    }
 
    public boolean hasErrors ( )
    {
    	if(this.items.size()>0)
    		return true;
   
        return false;
    }
    
    public int getErrorCount() {
    	return items.size();
    }
    
    @Override
    public String toString( )
    {
        if ( !hasErrors() ) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for ( SyntaxErrorItem s : items )
        {
            builder.append ( String.format ( "%s\n", s ) );
        }
        return builder.toString();
    }
}
 
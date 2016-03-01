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
    
    public LexerErrorListener ( )
    {
        this.items = new ArrayList<SyntaxErrorItem>();
    }
    
    @Override
    public void syntaxError ( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e )
    {
    	System.out.println("HELLO LEXICAL ERROR");
        this.items.add ( new SyntaxErrorItem ( line, charPositionInLine, msg, offendingSymbol, e ) );
    }
 
    public boolean hasErrors ( )
    {
    	System.out.println("LEXER ERROR COUNT: "+ this.items.size());
        return this.items.size() > 0;
    }
    
    @Override
    public String toString( )
    {
        if ( !hasErrors() ) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for ( SyntaxErrorItem s : items )
        {
            builder.append ( String.format ( "%s\n HELLLO LEXER \n", s ) );
        }
        return builder.toString();
    }
}
 
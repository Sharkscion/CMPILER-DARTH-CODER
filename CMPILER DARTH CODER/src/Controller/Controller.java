package Controller;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ANTLRGeneratedClasses.Darth_CoderBaseVisitor;
import ANTLRGeneratedClasses.Darth_CoderLexer;
import ANTLRGeneratedClasses.Darth_CoderParser;
import ANTLRGeneratedClasses.Darth_CoderVisitor;
import Model.Darth_CoderBaseVisitorImpl;
import Model.LexerErrorListener;
import Model.ParserErrorListener;
import Observer.Observer;

public class Controller {

	private LexerErrorListener lexerErrorListener;
	private ParserErrorListener parserErrorListener;
	private Darth_CoderBaseVisitorImpl darth_CoderBaseVisitorImpl;
	private ParseTreeWalker parseTreeWalker;
	private Darth_CoderLexer lexer;
	private Darth_CoderParser parser;
	private ANTLRInputStream inputStream;
	private CommonTokenStream tokenStream;
	private ParseTree parseTree;
	
	
    public Controller(){
        darth_CoderBaseVisitorImpl = new Darth_CoderBaseVisitorImpl();
        Thread t = new Thread();
        t.interrupt();
    }
    
    public void registerObserver(Observer o){
    	darth_CoderBaseVisitorImpl.registerObserver(o);
    }
    
	public void executeCode(String sourceCode){
		
		inputStream = new ANTLRInputStream(sourceCode);
		lexerErrorListener = new LexerErrorListener();
		
    	//split each input into tokens
		lexer = new Darth_CoderLexer(inputStream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(lexerErrorListener);
		
		//register tokens
		tokenStream = new CommonTokenStream(lexer);
    	
		parserErrorListener = new ParserErrorListener();
		
		//parser translates the token into another structure
		parser = new Darth_CoderParser(tokenStream);
		parser.removeErrorListeners();
		parser.addErrorListener(parserErrorListener);
		parseTree = parser.start();
		checkForErrors();
	}
	
	public void checkForErrors(){
		if(lexerErrorListener.hasErrors()){	
			System.out.println("HAS ERRORS LEXER");
			darth_CoderBaseVisitorImpl.notifyObserverErrorLog(0,0,"LEXEICAL ERROR: "+ lexerErrorListener.toString());
		}else{
			if(parserErrorListener.hasErrors()){
				darth_CoderBaseVisitorImpl.notifyObserverErrorLog(0,0,"PARSER ERROR: "+ parserErrorListener.toString());
			}
			
			if(!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()){
				try{
					parseTreeWalker = new ParseTreeWalker();//parseTree 
				    darth_CoderBaseVisitorImpl.visit(parseTree);
				}catch(Exception e){
					if(e instanceof ArithmeticException){
						darth_CoderBaseVisitorImpl.notifyObserverErrorLog(0,0,"PARSER ERROR: "+ e.getMessage());
					}							
				}
			}
		}
	}
}

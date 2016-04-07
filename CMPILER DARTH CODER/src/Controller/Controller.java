package Controller;

import java.util.ArrayList;

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
import Observer.ObserverLine;
import Observer.SubjectLine;

public class Controller implements SubjectLine{

	private LexerErrorListener lexerErrorListener;
	private ParserErrorListener parserErrorListener;
	private Darth_CoderBaseVisitorImpl darth_CoderBaseVisitorImpl;
	private ParseTreeWalker parseTreeWalker;
	private Darth_CoderLexer lexer;
	private Darth_CoderParser parser;
	private ANTLRInputStream inputStream;
	private CommonTokenStream tokenStream;
	private ParseTree parseTree;
	private ArrayList<ObserverLine> oLineList;
	
	
    public Controller(){
        darth_CoderBaseVisitorImpl = new Darth_CoderBaseVisitorImpl();
        Thread t = new Thread();
        t.interrupt();
    }
    
    public void registerObserver(Observer o){
    	darth_CoderBaseVisitorImpl.registerObserver(o);
    }
    
	public void executeCode(String sourceCode){

		this.oLineList = new ArrayList<ObserverLine>();
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
					registerObserver(darth_CoderBaseVisitorImpl);
					darth_CoderBaseVisitorImpl.visit(parseTree);
					notifyObserver(true);
					
				}catch(Exception e){
					if(e instanceof ArithmeticException){
						darth_CoderBaseVisitorImpl.notifyObserverErrorLog(0,0,"PARSER ERROR: "+ e.getMessage());
					}							
				}
			}
		}
	}
	

	@Override
	public void registerObserver(ObserverLine o) {
		// TODO Auto-generated method stub
		oLineList.add(o);
		
	}

	@Override
	public void unRegisterObserver(ObserverLine o) {
		// TODO Auto-generated method stub
		oLineList.remove(o);
		
	}

	@Override
	public void notifyObserver(boolean isRunByLine) {
		// TODO Auto-generated method stub
		for(ObserverLine ol : oLineList)
			ol.runLineByLine(isRunByLine);
		
	}
}

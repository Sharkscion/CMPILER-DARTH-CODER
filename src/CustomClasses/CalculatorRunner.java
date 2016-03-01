package CustomClasses;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ANTLRGeneratedClasses.CalculatorLexer;
import ANTLRGeneratedClasses.CalculatorParser;


public class CalculatorRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ANTLRInputStream input = new ANTLRInputStream("4+-2-5");
		
		LexerErrorListener lexerErrorListener = new LexerErrorListener();
		CalculatorLexer lexer = new CalculatorLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(lexerErrorListener);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ParserErrorListener parserErrorListener = new ParserErrorListener();
		CalculatorParser parser = new CalculatorParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(parserErrorListener);
		ParseTree tree = null;
		
		//problem: only checks once dahil sa if HAHAHA so i guess dapt nasa loob toh ng loop somewhere HAHA 
		if ( lexerErrorListener.hasErrors()) 
			System.err.printf( "%s\n Lexer Error \n", lexerErrorListener ); // Or parse the errors: up to you
		else{
			tree = parser.start();
			if(parserErrorListener.hasErrors())
				System.err.printf( "%s\n Parser Error \n", parserErrorListener ); // Or parse the errors: up to you
		}
		
		if(!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()){
			ParseTreeWalker walker = new ParseTreeWalker(); 
		    CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
			Double result = calcVisitor.visit(tree);
			System.out.println("Result: " + result);
			System.out.println(tree.toStringTree(parser));
		}

	}

}

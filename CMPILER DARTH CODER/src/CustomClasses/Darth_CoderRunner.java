package CustomClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ANTLRGeneratedClasses.Darth_CoderLexer;
import ANTLRGeneratedClasses.Darth_CoderParser;

public class Darth_CoderRunner {

	public static Darth_CoderParser parser;
	
	public static void main(String[] args) throws Exception {
		
		Charset charset = Charset.forName("US-ASCII");
        File inputFile = new File("src/input.txt");
        
		try {
			
			Boolean[] bool = {true,true,true,true,true};
			
			FileInputStream fis = new FileInputStream(inputFile);
			
	    	ANTLRInputStream input = new ANTLRInputStream(fis);
	    	
	    	LexerErrorListener lexerErrorListener = new LexerErrorListener();
	    	//split each input into tokens
			Darth_CoderLexer lexer = new Darth_CoderLexer(input);
			lexer.removeErrorListeners();
			lexer.addErrorListener(lexerErrorListener);
			//register tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	
			ParserErrorListener parserErrorListener = new ParserErrorListener();
			
			//parser translates the token into another structure
			parser = new Darth_CoderParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(parserErrorListener);
			ParseTree tree = parser.start();
			
		
	        
			if(lexerErrorListener.hasErrors()){
				System.err.println("@LEXICAL ERROR: ");
				System.err.println(lexerErrorListener);
			}else{
				if(parserErrorListener.hasErrors()){
					System.err.println("@PARSER ERROR: ");
					System.err.println(parserErrorListener);
				}
				
				if(!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()){
					try{
						ParseTreeWalker walker = new ParseTreeWalker(); 
					    Darth_CoderBaseVisitorImpl visitor = new Darth_CoderBaseVisitorImpl();
//						Value result = visitor.visit(tree);
//						System.out.println("Result: " + result);
					    visitor.visit(tree);
						
					}catch(Exception e){
						if(e instanceof ArithmeticException){
							System.err.println("PARSER ERROR: "+e.getMessage());
						}							
					}
				}
			}
			
		
			
			 //show AST in GUI
	        JFrame frame = new JFrame("Antlr AST");
	        TreeViewer viewr = new TreeViewer(Arrays.asList(
	                parser.getRuleNames()),tree);
	        viewr.setScale(1);//scale a little
	        JScrollPane scrollpane = new JScrollPane(viewr);
	        frame.add(scrollpane);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(200,200);
	        frame.setVisible(true);
	        
			System.out.println(tree.toStringTree(parser));			
	    
	    
	} catch (IOException x) {
	    System.err.format("IOException: %s%n", x);
	}
	}
}

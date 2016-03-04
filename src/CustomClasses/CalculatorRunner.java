package CustomClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ANTLRGeneratedClasses.CalculatorLexer;
import ANTLRGeneratedClasses.CalculatorParser;

public class CalculatorRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
//		ArrayList<FileInput> inputList = new ArrayList <FileInput>();
//		Charset charset = Charset.forName("US-ASCII");
//        File inputFile = new File("src/input.txt");
//		try (BufferedReader reader = Files.newBufferedReader(inputFile.toPath(), charset)) {
//		    String line = null;
//		    
//		    //read the equations from the text file  and store it in a list
//		    while ((line = reader.readLine()) != null) {
//		       FileInput fInput = new FileInput();
//		       fInput.setInput(line);
//		       inputList.add(fInput);		    	
//		    }
//		    
//		    int nIndex = 0;
//		    //parse the equationsin the list
//		    while(!inputList.isEmpty())
//		    {
//		    	FileInput fInput =  inputList.get(nIndex);
//		    	ANTLRInputStream input = new ANTLRInputStream(fInput.getInput());
//		    	
//		    	LexerErrorListener lexerErrorListener = new LexerErrorListener();
//		    	
//		    	//split each input into tokens
//				CalculatorLexer lexer = new CalculatorLexer(input);
//				lexer.removeErrorListeners();
//				lexer.addErrorListener(lexerErrorListener);
//				//register tokens
//				CommonTokenStream tokens = new CommonTokenStream(lexer);
//		    	
//				ParserErrorListener parserErrorListener = new ParserErrorListener();
//				
//				//parser translates the token into another structure
//				CalculatorParser parser = new CalculatorParser(tokens);
//				parser.removeErrorListeners();
//				parser.addErrorListener(parserErrorListener);
//				ParseTree tree = null;
//				
//		    	nIndex++;
//		    }
//			
//		    
//		    
//		} catch (IOException x) {
//		    System.err.format("IOException: %s%n", x);
//		}
//	
//		

		ANTLRInputStream input = new ANTLRInputStream("4+f");
    	
    	LexerErrorListener lexerErrorListener = new LexerErrorListener();
    	
    	//split each input into tokens
		CalculatorLexer lexer = new CalculatorLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(lexerErrorListener);
		
		
		if( lexerErrorListener.hasErrors() == true){
			System.out.println("LEXICAL ERROR NA MALUPIT");
		}
		else{
			
			
			System.out.println("PassedElse");
			//register tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ParserErrorListener parserErrorListener = new ParserErrorListener();
			//parser translates the token into another structure
			CalculatorParser parser = new CalculatorParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(parserErrorListener);
			ParseTree tree = null;
			tree = parser.start();
		
			//parser.setErrorHandler(ANTLRErrorStrategy);
			System.out.println("LexerNum: " + lexerErrorListener.getErrorCountNum());
			System.out.println("Another LexerNum: " + lexerErrorListener.getErrorCount());
			System.out.println("PaserNum: " + parserErrorListener.getErrorCount());
			
			if(parserErrorListener.hasErrors())
				System.err.printf( "%s\n Parser Error \n", parserErrorListener ); // Or parse the errors: up to you
		
			//System.out.println("HELLO PARSER2 : "+ lexerErrorListener.getErrorCount());
			
			if(!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()){
				
				ParseTreeWalker walker = new ParseTreeWalker(); 
			    CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
				int result = calcVisitor.visit(tree);
				System.out.println("Result: " + result);
				System.out.println(tree.toStringTree(parser));
			}
		
		
		}
		
		

	}

}

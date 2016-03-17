package CustomClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.antlr.v4.misc.Utils.Filter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ANTLRGeneratedClasses.CalculatorLexer;
import ANTLRGeneratedClasses.CalculatorParser;

public class AvrilCalculatorRunner {

	public static CalculatorParser parser;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Double.PO
		
	//	int i = 3*-+7;
	//	System.out.println("RESULT OF I ->"+ i);
		ArrayList<FileInput> inputList = new ArrayList <FileInput>();
		Charset charset = Charset.forName("US-ASCII");
        File inputFile = new File("src/input.txt");
		try (BufferedReader reader = Files.newBufferedReader(inputFile.toPath(), charset)) {
		    String line = null;
		    
		    //read the equations from the text file  and store it in a list
		    while ((line = reader.readLine()) != null) {
		       FileInput fInput = new FileInput();
		       fInput.setInput(line);
		       inputList.add(fInput);		    	
		    }
		    
		    int nIndex = -1;
		    //parse the equations in the list
		    while(nIndex != inputList.size()-1)
		    {
		    	nIndex++;
		    	System.out.printf("["+(nIndex+1)+"]");
		    	FileInput fInput =  inputList.get(nIndex);
		    	ANTLRInputStream input = new ANTLRInputStream(fInput.getInput());
		    
		    	LexerErrorListener lexerErrorListener = new LexerErrorListener();
		    	CustomLexerErrorListener listener = new CustomLexerErrorListener();
		    	//split each input into tokens
				CalculatorLexer lexer = new CalculatorLexer(input);
				lexer.removeErrorListeners();
				//lexer.addErrorListener(lexerErrorListener);
				lexer.addErrorListener(listener);
				//register tokens
				CommonTokenStream tokens = new CommonTokenStream(lexer);
		    	
				ParserErrorListener parserErrorListener = new ParserErrorListener();
				
				//parser translates the token into another structure
				parser = new CalculatorParser(tokens);
				
				parser.removeErrorListeners();
				parser.addErrorListener(parserErrorListener);
				parser.setErrorHandler(new BailErrorStrategy());
				ParseTree tree = parser.start();
				
				if(listener.hasErrors()){
					System.out.println(listener);
				}else{
					if(parserErrorListener.hasErrors()){
						System.out.println("@PARSER ERROR: ");
						System.out.println(parserErrorListener);
					}
					
					if(!listener.hasErrors() && !parserErrorListener.hasErrors()){
						try{
							ParseTreeWalker walker = new ParseTreeWalker(); 
						    CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
							int result = calcVisitor.visit(tree);
							System.out.println("Result: " + result);
							
						}catch(Exception e){
							if(e instanceof ArithmeticException){
								System.out.println("PARSER ERROR: ");
							    System.out.println(e.getMessage());
							}
							
//							if(e instanceof InputMismatchException)
//								System.out.println("PARSER ERROR: "+e.getMessage());
						}
					}
				}
				//System.out.println(tree.toStringTree(parser));
						
		    }   
		    
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
}

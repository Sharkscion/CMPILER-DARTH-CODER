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
import ANTLRGeneratedClasses.Darth_CoderLexer;
import ANTLRGeneratedClasses.Darth_CoderParser;

public class Darth_CoderRunner {

	public static Darth_CoderParser parser;
	
	public static void main(String[] args) throws Exception {
		
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
		    	System.out.printf("["+(nIndex+1)+"]\n");
		    	FileInput fInput =  inputList.get(nIndex);
		    	ANTLRInputStream input = new ANTLRInputStream(fInput.getInput());
		    	
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
					System.out.println("@LEXICAL ERROR: ");
					System.out.println(lexerErrorListener);
				}else{
					if(parserErrorListener.hasErrors()){
						System.out.println("@PARSER ERROR: ");
						System.out.println(parserErrorListener);
					}
					
					if(!lexerErrorListener.hasErrors() && !parserErrorListener.hasErrors()){
						try{
							ParseTreeWalker walker = new ParseTreeWalker(); 
						    Darth_CoderBaseVisitorImpl visitor = new Darth_CoderBaseVisitorImpl();
							int result = visitor.visit(tree);
							System.out.println("Result: " + result);
							
						}catch(Exception e){
							if(e instanceof ArithmeticException){
								System.out.println("PARSER ERROR: "+e.getMessage());
							}							
						}
					}
				}
				System.out.println(tree.toStringTree(parser));			
		    }   
		    
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
}

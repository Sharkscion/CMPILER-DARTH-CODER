

package CustomClasses;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ANTLRGeneratedClasses.CalculatorLexer;
import ANTLRGeneratedClasses.CalculatorParser;

public class CalculatorRunner {

	public static CalculatorParser parser;
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<FileInput> inputList = new ArrayList <FileInput>();
		//Charset charset = Charset.forName("US-ASCII");
		InputStream in = CalculatorRunner.class.getClassLoader().getResourceAsStream("./input.txt");
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
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
		    	//in = null;
		    	ANTLRInputStream input = new ANTLRInputStream(fInput.getInput());
		    	
		    	LexerErrorListener lexerErrorListener = new LexerErrorListener();
		    	//split each input into tokens
				CalculatorLexer lexer = new CalculatorLexer(input);
				lexer.removeErrorListeners();
				lexer.addErrorListener(lexerErrorListener);
				//register tokens
				CommonTokenStream tokens = new CommonTokenStream(lexer);
		    	
				ParserErrorListener parserErrorListener = new ParserErrorListener();
				
				//parser translates the token into another structure
				parser = new CalculatorParser(tokens);
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
						    CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
							int result = calcVisitor.visit(tree);
							System.out.println("Result: " + result);
							
						}catch(Exception e){
							if(e instanceof ArithmeticException){
								System.out.println("PARSER ERROR: "+e.getMessage());
							}							
						}
					}
				}
				 reader.close();
				 in.close();
				//System.out.println(tree.toStringTree(parser));			
		    }   
		    
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		
	}
}

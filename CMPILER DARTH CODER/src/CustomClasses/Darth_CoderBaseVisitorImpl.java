package CustomClasses;

import org.antlr.v4.runtime.RecognitionException;

import ANTLRGeneratedClasses.Darth_CoderBaseVisitor;
import ANTLRGeneratedClasses.Darth_CoderParser;

public class Darth_CoderBaseVisitorImpl extends Darth_CoderBaseVisitor<Integer>{
	
	/*@Override
	public Integer visitCalculate(Darth_CoderParser.CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }
	
	@Override
	public Integer visitPlus(Darth_CoderParser.PlusContext ctx) {
		return visit(ctx.plusOrMinus()) + visit(ctx.multOrDiv());
	}
	
	@Override
	public Integer visitMinus(Darth_CoderParser.MinusContext ctx) {
		return visit(ctx.plusOrMinus()) - visit(ctx.multOrDiv());
	}
	
	@Override
    public Integer visitMultiplication(Darth_CoderParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()) * visit(ctx.unarySign());
    }

    @Override
    public Integer visitDivision(Darth_CoderParser.DivisionContext ctx) {
    	int divisor = visit(ctx.unarySign());
    	return visit(ctx.multOrDiv()) / divisor;  
    }
    
    @Override
    public Integer visitModulo(Darth_CoderParser.ModuloContext ctx) {
		return visit(ctx.multOrDiv()) % visit(ctx.unarySign());
    	
    }
	
    @Override
    public Integer visitChangeMinusSign(Darth_CoderParser.ChangeMinusSignContext ctx){
    	return -1* visit(ctx.atom());
    }
    
    @Override
    public Integer visitChangePlusSign(Darth_CoderParser.ChangePlusSignContext ctx){
    	return 1* visit(ctx.atom());
    }
  
    @Override
    public Integer visitInt(Darth_CoderParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }
    
    public Integer visitBraces(Darth_CoderParser.BracesContext ctx) {
    	return visit(ctx.plusOrMinus());
    }
    
    /*@Override 
    public String visitVariableIdentifier(Darth_CoderParser.VariableIdentifierContext ctx) {
    	return visitChildren(ctx); 
    }*/
	

}

package CustomClasses;

import org.antlr.v4.runtime.RecognitionException;

import ANTLRGeneratedClasses.CalculatorBaseVisitor;
import ANTLRGeneratedClasses.CalculatorParser;

public class CalculatorBaseVisitorImpl extends CalculatorBaseVisitor<Integer>{
	
	@Override
	public Integer visitCalculate(CalculatorParser.CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }
	
	@Override
	public Integer visitPlus(CalculatorParser.PlusContext ctx) {
		return visit(ctx.plusOrMinus()) + visit(ctx.multOrDiv());
	}
	
	@Override
	public Integer visitMinus(CalculatorParser.MinusContext ctx) {
		return visit(ctx.plusOrMinus()) - visit(ctx.multOrDiv());
	}
	
	@Override
    public Integer visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()) * visit(ctx.unarySign());
    }

    @Override
    public Integer visitDivision(CalculatorParser.DivisionContext ctx) {
    	int divisor = visit(ctx.unarySign());
    	return visit(ctx.multOrDiv()) / divisor;  
    }
    
    @Override
    public Integer visitModulo(CalculatorParser.ModuloContext ctx) {
		return visit(ctx.multOrDiv()) % visit(ctx.unarySign());
    	
    }
	
    @Override
    public Integer visitChangeMinusSign(CalculatorParser.ChangeMinusSignContext ctx){
    	return -1* visit(ctx.atom());
    }
    
    @Override
    public Integer visitChangePlusSign(CalculatorParser.ChangePlusSignContext ctx){
    	return 1* visit(ctx.atom());
    }
  
    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }
    
    public Integer visitBraces(CalculatorParser.BracesContext ctx) {
    	return visit(ctx.plusOrMinus());
    }
	

}

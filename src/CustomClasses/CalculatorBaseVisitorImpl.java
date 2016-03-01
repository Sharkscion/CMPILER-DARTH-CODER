package CustomClasses;
import ANTLRGeneratedClasses.CalculatorBaseVisitor;
import ANTLRGeneratedClasses.CalculatorParser;
import ANTLRGeneratedClasses.CalculatorParser.CalculateContext;
import ANTLRGeneratedClasses.CalculatorParser.DivisionContext;
import ANTLRGeneratedClasses.CalculatorParser.IntContext;
import ANTLRGeneratedClasses.CalculatorParser.MinusContext;
import ANTLRGeneratedClasses.CalculatorParser.MultiplicationContext;
import ANTLRGeneratedClasses.CalculatorParser.PlusContext;


public class CalculatorBaseVisitorImpl extends CalculatorBaseVisitor<Double>{
	
	@Override
	public Double visitCalculate(CalculatorParser.CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }
	
	@Override
	public Double visitPlus(CalculatorParser.PlusContext ctx) {
		return visit(ctx.plusOrMinus()) + visit(ctx.multOrDiv());
	}
	
	@Override
	public Double visitMinus(CalculatorParser.MinusContext ctx) {
		return visit(ctx.plusOrMinus()) - visit(ctx.multOrDiv());
	}
	
	@Override
    public Double visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()) * Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitDivision(CalculatorParser.DivisionContext ctx) {
    	Double divisor = Double.parseDouble(ctx.INT().getText());
    	
		return visit(ctx.multOrDiv()) / divisor;
    }
	
    @Override
    public Double visitInt(CalculatorParser.IntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }
	

}

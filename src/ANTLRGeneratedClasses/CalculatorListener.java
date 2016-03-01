package ANTLRGeneratedClasses;
// Generated from Calculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalculatorParser.IntContext ctx);
}
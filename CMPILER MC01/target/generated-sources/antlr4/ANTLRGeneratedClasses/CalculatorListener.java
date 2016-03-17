// Generated from Calculator.g4 by ANTLR 4.4

	package ANTLRGeneratedClasses;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangeMinusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void enterChangeMinusSign(@NotNull CalculatorParser.ChangeMinusSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangeMinusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void exitChangeMinusSign(@NotNull CalculatorParser.ChangeMinusSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToUnaryMinus}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterToUnaryMinus(@NotNull CalculatorParser.ToUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToUnaryMinus}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitToUnaryMinus(@NotNull CalculatorParser.ToUnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull CalculatorParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull CalculatorParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(@NotNull CalculatorParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(@NotNull CalculatorParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangePlusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void enterChangePlusSign(@NotNull CalculatorParser.ChangePlusSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangePlusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void exitChangePlusSign(@NotNull CalculatorParser.ChangePlusSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull CalculatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull CalculatorParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(@NotNull CalculatorParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(@NotNull CalculatorParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull CalculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull CalculatorParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull CalculatorParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull CalculatorParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull CalculatorParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull CalculatorParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(@NotNull CalculatorParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(@NotNull CalculatorParser.ToAtomContext ctx);
}
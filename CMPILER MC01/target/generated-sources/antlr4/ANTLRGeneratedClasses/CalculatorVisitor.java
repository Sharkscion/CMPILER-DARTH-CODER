// Generated from Calculator.g4 by ANTLR 4.4

	package ANTLRGeneratedClasses;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(@NotNull CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(@NotNull CalculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeMinusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMinusSign(@NotNull CalculatorParser.ChangeMinusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToUnaryMinus}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToUnaryMinus(@NotNull CalculatorParser.ToUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(@NotNull CalculatorParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(@NotNull CalculatorParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangePlusSign}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangePlusSign(@NotNull CalculatorParser.ChangePlusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull CalculatorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(@NotNull CalculatorParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(@NotNull CalculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalculatorParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalculatorParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(@NotNull CalculatorParser.ToAtomContext ctx);
}
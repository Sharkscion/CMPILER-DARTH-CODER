// Generated from Darth_Coder.g4 by ANTLR 4.5.2

	package ANTLRGeneratedClasses;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Darth_CoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Darth_CoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link Darth_CoderParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(Darth_CoderParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link Darth_CoderParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(Darth_CoderParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link Darth_CoderParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(Darth_CoderParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link Darth_CoderParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(Darth_CoderParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link Darth_CoderParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(Darth_CoderParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToUnaryMinus}
	 * labeled alternative in {@link Darth_CoderParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToUnaryMinus(Darth_CoderParser.ToUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link Darth_CoderParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(Darth_CoderParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link Darth_CoderParser#multOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(Darth_CoderParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeMinusSign}
	 * labeled alternative in {@link Darth_CoderParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMinusSign(Darth_CoderParser.ChangeMinusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangePlusSign}
	 * labeled alternative in {@link Darth_CoderParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangePlusSign(Darth_CoderParser.ChangePlusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link Darth_CoderParser#unarySign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(Darth_CoderParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Darth_CoderParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(Darth_CoderParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableIdentifier}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(Darth_CoderParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionIdentifier}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(Darth_CoderParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterIdentifier}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterIdentifier(Darth_CoderParser.CharacterIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringIdentifier}
	 * labeled alternative in {@link Darth_CoderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringIdentifier(Darth_CoderParser.StringIdentifierContext ctx);
}
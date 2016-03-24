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
	 * Visit a parse tree produced by {@link Darth_CoderParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Darth_CoderParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Darth_CoderParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#epsilon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon(Darth_CoderParser.EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(Darth_CoderParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#scan_imperial_credit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_imperial_credit(Darth_CoderParser.Scan_imperial_creditContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#scan_galactic_credit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_galactic_credit(Darth_CoderParser.Scan_galactic_creditContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#scan_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_unit(Darth_CoderParser.Scan_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#scan_legion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_legion(Darth_CoderParser.Scan_legionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Darth_CoderParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileConditionCodeBlock}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileConditionCodeBlock(Darth_CoderParser.WhileConditionCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCodeBlock}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCodeBlock(Darth_CoderParser.WhileCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Darth_CoderParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileCodeBlockCondition}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileCodeBlockCondition(Darth_CoderParser.DoWhileCodeBlockConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileCodeBlock}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileCodeBlock(Darth_CoderParser.DoWhileCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileCondition}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileCondition(Darth_CoderParser.DoWhileConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(Darth_CoderParser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForConditionCodeBlock}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditionCodeBlock(Darth_CoderParser.ForConditionCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCondition}
	 * labeled alternative in {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(Darth_CoderParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(Darth_CoderParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_conditional(Darth_CoderParser.If_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#elseIf_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf_conditional(Darth_CoderParser.ElseIf_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#else_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_conditional(Darth_CoderParser.Else_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link Darth_CoderParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(Darth_CoderParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToCondition2}
	 * labeled alternative in {@link Darth_CoderParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToCondition2(Darth_CoderParser.ToCondition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ToCondition3}
	 * labeled alternative in {@link Darth_CoderParser#condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToCondition3(Darth_CoderParser.ToCondition3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link Darth_CoderParser#condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(Darth_CoderParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link Darth_CoderParser#condition3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(Darth_CoderParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToCondition4}
	 * labeled alternative in {@link Darth_CoderParser#condition3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToCondition4(Darth_CoderParser.ToCondition4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ToGenComparison}
	 * labeled alternative in {@link Darth_CoderParser#condition4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToGenComparison(Darth_CoderParser.ToGenComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link Darth_CoderParser#condition4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(Darth_CoderParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#gen_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_comparison(Darth_CoderParser.Gen_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#func_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dec(Darth_CoderParser.Func_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Darth_CoderParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Darth_CoderParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(Darth_CoderParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecFourTypes}
	 * labeled alternative in {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecFourTypes(Darth_CoderParser.VarDecFourTypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecWithValues}
	 * labeled alternative in {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecWithValues(Darth_CoderParser.ArrayDecWithValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecNoValues}
	 * labeled alternative in {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecNoValues(Darth_CoderParser.ArrayDecNoValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecVarIdenFourTypes}
	 * labeled alternative in {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecVarIdenFourTypes(Darth_CoderParser.VarDecVarIdenFourTypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecBoolean}
	 * labeled alternative in {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecBoolean(Darth_CoderParser.VarDecBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#boolean_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_statement(Darth_CoderParser.Boolean_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#boolean_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_assignment(Darth_CoderParser.Boolean_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Darth_CoderParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignment(Darth_CoderParser.Array_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#reg_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_assignment(Darth_CoderParser.Reg_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#array_iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_iden(Darth_CoderParser.Array_idenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#func_iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_iden(Darth_CoderParser.Func_idenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#var_iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_iden(Darth_CoderParser.Var_idenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Increment}
	 * labeled alternative in {@link Darth_CoderParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(Darth_CoderParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decrement}
	 * labeled alternative in {@link Darth_CoderParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(Darth_CoderParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link Darth_CoderParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(Darth_CoderParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToExpr2}
	 * labeled alternative in {@link Darth_CoderParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToExpr2(Darth_CoderParser.ToExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link Darth_CoderParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(Darth_CoderParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToGenVar}
	 * labeled alternative in {@link Darth_CoderParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToGenVar(Darth_CoderParser.ToGenVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link Darth_CoderParser#gen_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(Darth_CoderParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToVar}
	 * labeled alternative in {@link Darth_CoderParser#gen_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToVar(Darth_CoderParser.ToVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Darth_CoderParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link Darth_CoderParser#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(Darth_CoderParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link Darth_CoderParser#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(Darth_CoderParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#array_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_open(Darth_CoderParser.Array_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#array_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_close(Darth_CoderParser.Array_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(Darth_CoderParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(Darth_CoderParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Darth_CoderParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(Darth_CoderParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#galactic_credit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGalactic_credit(Darth_CoderParser.Galactic_creditContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#imperial_credit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImperial_credit(Darth_CoderParser.Imperial_creditContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(Darth_CoderParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#legion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegion(Darth_CoderParser.LegionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Darth_CoderParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(Darth_CoderParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#character_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_literal(Darth_CoderParser.Character_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(Darth_CoderParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#float_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_literal(Darth_CoderParser.Float_literalContext ctx);
}
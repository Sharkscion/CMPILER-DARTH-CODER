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
	 * Visit a parse tree produced by {@link Darth_CoderParser#iterative_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative_con(Darth_CoderParser.Iterative_conContext ctx);
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
	 * Visit a parse tree produced by {@link Darth_CoderParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Darth_CoderParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition2(Darth_CoderParser.Condition2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#condition3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition3(Darth_CoderParser.Condition3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#condition4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition4(Darth_CoderParser.Condition4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#gen_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_comparison(Darth_CoderParser.Gen_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(Darth_CoderParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_op(Darth_CoderParser.Equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#logi_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogi_op(Darth_CoderParser.Logi_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#logi_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogi_op2(Darth_CoderParser.Logi_op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(Darth_CoderParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(Darth_CoderParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#not_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal(Darth_CoderParser.Not_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#equal_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_equal(Darth_CoderParser.Equal_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than(Darth_CoderParser.Less_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than(Darth_CoderParser.Greater_thanContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#greater_than_or_equal_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_or_equal_to(Darth_CoderParser.Greater_than_or_equal_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#less_than_or_equal_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_or_equal_to(Darth_CoderParser.Less_than_or_equal_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(Darth_CoderParser.NotContext ctx);
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
	 * Visit a parse tree produced by {@link Darth_CoderParser#func_iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_iden(Darth_CoderParser.Func_idenContext ctx);
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
	 * Visit a parse tree produced by {@link Darth_CoderParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(Darth_CoderParser.Var_decContext ctx);
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
	 * Visit a parse tree produced by {@link Darth_CoderParser#var_iden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_iden(Darth_CoderParser.Var_idenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr(Darth_CoderParser.IncrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Darth_CoderParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(Darth_CoderParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#gen_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_var(Darth_CoderParser.Gen_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Darth_CoderParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(Darth_CoderParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#mul_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(Darth_CoderParser.Mul_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#uni_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUni_op(Darth_CoderParser.Uni_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link Darth_CoderParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Darth_CoderParser.ArrayContext ctx);
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
	 * Visit a parse tree produced by the {@code SingleLiteral}
	 * labeled alternative in {@link Darth_CoderParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLiteral(Darth_CoderParser.SingleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreLiterals}
	 * labeled alternative in {@link Darth_CoderParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreLiterals(Darth_CoderParser.MoreLiteralsContext ctx);
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
	 * Visit a parse tree produced by the {@code StrngLiteral}
	 * labeled alternative in {@link Darth_CoderParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrngLiteral(Darth_CoderParser.StrngLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link Darth_CoderParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(Darth_CoderParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link Darth_CoderParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(Darth_CoderParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link Darth_CoderParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(Darth_CoderParser.FloatLiteralContext ctx);
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
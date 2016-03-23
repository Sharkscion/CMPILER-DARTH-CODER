package CustomClasses;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;

import ANTLRGeneratedClasses.Darth_CoderBaseVisitor;
import ANTLRGeneratedClasses.Darth_CoderParser;

public class Darth_CoderBaseVisitorImpl extends Darth_CoderBaseVisitor<Value>{
	
	 // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
	
	@Override 
	public Value visitStart(Darth_CoderParser.StartContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitCode_block(Darth_CoderParser.Code_blockContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitEpsilon(Darth_CoderParser.EpsilonContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitComment(Darth_CoderParser.CommentContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitScan_imperial_credit(Darth_CoderParser.Scan_imperial_creditContext ctx) { 
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.nextFloat());
		
		memory.put(ctx.var_iden().VAR_IDEN().getText(), value);
		
		//System.out.println(value);
		System.out.println(ctx.var_iden().VAR_IDEN().getText() + ": " + memory.get(ctx.var_iden().VAR_IDEN().getText()));
		
		return value; 
	}

	@Override 
	public Value visitScan_galactic_credit(Darth_CoderParser.Scan_galactic_creditContext ctx) { 
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.nextInt());
		
		memory.put(ctx.var_iden().VAR_IDEN().getText(), value);
		
		//System.out.println(value);
		System.out.println(ctx.var_iden().VAR_IDEN().getText() + ": " + memory.get(ctx.var_iden().VAR_IDEN().getText()));
		
		return value;
	}

	@Override 
	public Value visitScan_unit(Darth_CoderParser.Scan_unitContext ctx) {
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.next());
		
		memory.put(ctx.var_iden().VAR_IDEN().getText(), value);
		
		//System.out.println(value);
		System.out.println(ctx.var_iden().VAR_IDEN().getText() + ": " + memory.get(ctx.var_iden().VAR_IDEN().getText()));
		
		return value;
	}
	
	@Override 
	public Value visitScan_legion(Darth_CoderParser.Scan_legionContext ctx) { 
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.nextLine());
		
		memory.put(ctx.var_iden().VAR_IDEN().getText(), value);
		
		//System.out.println(value);
		System.out.println(ctx.var_iden().VAR_IDEN().getText() + ": " + memory.get(ctx.var_iden().VAR_IDEN().getText()));
		
		return value;
	}

	@Override 
	public Value visitPrint(Darth_CoderParser.PrintContext ctx) { 
		// expr? CHARACTER_LITERAL? string_literal? var_iden? func_call?
		
		Value v = null;
		
		if(ctx.expr() != null) {
			v = this.visit(ctx.expr());
			
			System.out.println("Printing expr: " + v);
		}
		else if(ctx.var_iden() != null) {
			v = this.visit(ctx.var_iden());
			
			System.out.println("Var_iden: " + ctx.var_iden().VAR_IDEN().getText());
			
			if(memory.containsKey(ctx.var_iden().VAR_IDEN().getText())) {
				System.out.println("Var_iden value: " + memory.get(ctx.var_iden().VAR_IDEN().getText()));
			}
			else {
				System.out.println("variable has not been declared.");
			}
			
			
		}
		
		
		
		return v; 
	}
	
	@Override 
	public Value visitIterative_con(Darth_CoderParser.Iterative_conContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitFunc_call(Darth_CoderParser.Func_callContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitIf_conditional(Darth_CoderParser.If_conditionalContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitElseIf_conditional(Darth_CoderParser.ElseIf_conditionalContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitElse_conditional(Darth_CoderParser.Else_conditionalContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitCondition(Darth_CoderParser.ConditionContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitCondition2(Darth_CoderParser.Condition2Context ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitCondition3(Darth_CoderParser.Condition3Context ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitCondition4(Darth_CoderParser.Condition4Context ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitGen_comparison(Darth_CoderParser.Gen_comparisonContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitRel_op(Darth_CoderParser.Rel_opContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitEqual_op(Darth_CoderParser.Equal_opContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitLogi_op(Darth_CoderParser.Logi_opContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitLogi_op2(Darth_CoderParser.Logi_op2Context ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitOr(Darth_CoderParser.OrContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override
	public Value visitAnd(Darth_CoderParser.AndContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitNot_equal(Darth_CoderParser.Not_equalContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitEqual_equal(Darth_CoderParser.Equal_equalContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitLess_than(Darth_CoderParser.Less_thanContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Value visitGreater_than(Darth_CoderParser.Greater_thanContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitGreater_than_or_equal_to(Darth_CoderParser.Greater_than_or_equal_toContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitLess_than_or_equal_to(Darth_CoderParser.Less_than_or_equal_toContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitNot(Darth_CoderParser.NotContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitFunc_dec(Darth_CoderParser.Func_decContext ctx) {
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitReturn_statement(Darth_CoderParser.Return_statementContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitFunc_iden(Darth_CoderParser.Func_idenContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitParameter(Darth_CoderParser.ParameterContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitConstant_declaration(Darth_CoderParser.Constant_declarationContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitVar_dec(Darth_CoderParser.Var_decContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitBoolean_statement(Darth_CoderParser.Boolean_statementContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitBoolean_assignment(Darth_CoderParser.Boolean_assignmentContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override
	public Value visitStatement(Darth_CoderParser.StatementContext ctx) {
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitArray_assignment(Darth_CoderParser.Array_assignmentContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitReg_assignment(Darth_CoderParser.Reg_assignmentContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitVar_iden(Darth_CoderParser.Var_idenContext ctx) { 
		return new Value(ctx.VAR_IDEN().getText()); 
	}
	
	@Override 
	public Value visitIncr(Darth_CoderParser.IncrContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitExpr(Darth_CoderParser.ExprContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitExpr2(Darth_CoderParser.Expr2Context ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitGen_var(Darth_CoderParser.Gen_varContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitVar(Darth_CoderParser.VarContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitAdd_sub(Darth_CoderParser.Add_subContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitMul_div(Darth_CoderParser.Mul_divContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitUni_op(Darth_CoderParser.Uni_opContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitArray(Darth_CoderParser.ArrayContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitArray_open(Darth_CoderParser.Array_openContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitArray_close(Darth_CoderParser.Array_closeContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitEqual(Darth_CoderParser.EqualContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitIndex(Darth_CoderParser.IndexContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitSingleLiteral(Darth_CoderParser.SingleLiteralContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitMoreLiterals(Darth_CoderParser.MoreLiteralsContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitData_type(Darth_CoderParser.Data_typeContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override
	public Value visitGalactic_credit(Darth_CoderParser.Galactic_creditContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override 
	public Value visitImperial_credit(Darth_CoderParser.Imperial_creditContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitUnit(Darth_CoderParser.UnitContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Value visitLegion(Darth_CoderParser.LegionContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Value visitString_literal(Darth_CoderParser.String_literalContext ctx) { 
		String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        //System.out.println("String Literal: " + str);
        return new Value(str);
	}
	
	@Override 
	public Value visitCharacter_literal(Darth_CoderParser.Character_literalContext ctx) { 
		String character = ctx.getText();
		
		Character c = character.substring(1, character.length() - 1).replace("\'\'", "\'").toCharArray()[0];
		return new Value(Character.valueOf(c));
	}
	
	@Override 
	public Value visitInt_literal(Darth_CoderParser.Int_literalContext ctx) {
		return new Value(Integer.valueOf(ctx.getText())); 
	}
	
	@Override 
	public Value visitFloat_literal(Darth_CoderParser.Float_literalContext ctx) { 
		return new Value(Double.valueOf(ctx.getText())); 
	}
}

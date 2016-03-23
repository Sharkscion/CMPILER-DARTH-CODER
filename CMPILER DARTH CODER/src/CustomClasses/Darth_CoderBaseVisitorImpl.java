package CustomClasses;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.management.RuntimeOperationsException;

import org.antlr.v4.runtime.ANTLRInputStream;

import ANTLRGeneratedClasses.Darth_CoderBaseVisitor;
import ANTLRGeneratedClasses.Darth_CoderParser;
import ANTLRGeneratedClasses.Darth_CoderParser.ConditionContext;

public class Darth_CoderBaseVisitorImpl extends Darth_CoderBaseVisitor<Value>{
	
	 // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
    private Boolean isEvaluated;
	
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

        isEvaluated = false;
        Value evaluated = this.visit(ctx.condition());
        if(evaluated.asBoolean()) {
              isEvaluated = true;
              this.visit(ctx.code_block());
        }else{
        	this.visit(ctx.elseIf_conditional());
        }

        return Value.VOID; 
	}
	
	@Override 
	public Value visitElseIf_conditional(Darth_CoderParser.ElseIf_conditionalContext ctx) { 
		
		Value evaluated = this.visit(ctx.condition());
		if(!isEvaluated && ctx.code_block() != null && evaluated.asBoolean()){
			isEvaluated = true;
			this.visit(ctx.code_block());
		}else{
			this.visit(ctx.else_conditional());
		}
		
	    return Value.VOID; 
	}
	
	@Override 
	public Value visitElse_conditional(Darth_CoderParser.Else_conditionalContext ctx) { 
		
		if(!isEvaluated && ctx.code_block() != null){
			isEvaluated = true;
			this.visit(ctx.code_block());
		}
		
	    return Value.VOID; 
	}

	@Override 
	public Value visitAndExpr(Darth_CoderParser.AndExprContext ctx) { 
		Value left = this.visit(ctx.condition());
		Value right = this.visit(ctx.condition2());
		
		return new Value(left.asBoolean() && right.asBoolean());
	}
	@Override
	public Value visitOrExpr(Darth_CoderParser.OrExprContext ctx) { 
		Value left = this.visit(ctx.condition2());
		Value right = this.visit(ctx.condition3());
		
		return new Value(left.asBoolean() || right.asBoolean());
	}
	
	@Override 
	public Value visitEqualityExpr(Darth_CoderParser.EqualityExprContext ctx) { 
		Value left = this.visit(ctx.condition3());
		Value right = this.visit(ctx.condition4());
		
		
		if(left.isBoolean() && right.isBoolean()){
			switch(ctx.op.getType()){
				case Darth_CoderParser.NOT_EQUAL:				
					return new Value(left.asBoolean() != right.asBoolean());
				case Darth_CoderParser.EQUAL_EQUAL:
					return new Value(left.asBoolean() == right.asBoolean());
				default:
					 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			}
		}else{
			
			 if(left.isDouble() || right.isDouble()){
				double dLeft = Double.parseDouble(left.toString());
				double dRight = Double.parseDouble(right.toString());
				switch(ctx.op.getType()){
					case Darth_CoderParser.NOT_EQUAL:				
						return new Value(dLeft != dRight);
					case Darth_CoderParser.EQUAL_EQUAL:
						return new Value(dLeft == dRight);
					default:
						 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				}
			 } 
			 else{
				 switch(ctx.op.getType()){
					case Darth_CoderParser.NOT_EQUAL:				
						return new Value(left.asInt() != right.asInt());
					case Darth_CoderParser.EQUAL_EQUAL:
						return new Value(left.asInt() == right.asInt());
					default:
						 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				}
			 }	
		}
	}

	@Override 
	public Value visitRelationalExpr(Darth_CoderParser.RelationalExprContext ctx) { 
		Value left = this.visit(ctx.condition4());
		Value right = this.visit(ctx.gen_comparison());

		double dLeft = Double.parseDouble(left.toString());
		double dRight = Double.parseDouble(right.toString());
		 
		switch(ctx.op.getType()){
			case Darth_CoderParser.LESS_THAN:
				
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft < dRight);
				 } 
				 else{
					 return new Value(left.asInt() < right.asInt());
				 }
			case Darth_CoderParser.GREATER_THAN:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft > dRight);
				 } 
				 else{
					 return new Value(left.asInt() > right.asInt());
				 }
			case Darth_CoderParser.GREATER_THAN_EQUAL_TO:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft >= dRight);
				 } 
				 else{
					 return new Value(left.asInt() >= right.asInt());
				 }
			case Darth_CoderParser.LESS_THAN_EQUAL_TO:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft <= dRight);
				 } 
				 else{
					 return new Value(left.asInt() <= right.asInt());
				 }
			default:
				 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));

		}
	}

	@Override
	public Value visitNotBracketCond(Darth_CoderParser.NotBracketCondContext ctx) { 
		Value v = this.visit(ctx.condition());
		return new Value(!v.asBoolean()); 
	}
	
	@Override 
	public Value visitBracketCond(Darth_CoderParser.BracketCondContext ctx) { 
		Value v = this.visit(ctx.condition());
		return new Value(v.asBoolean()); 
	}


	
//	@Override 
//	public Value visitCondition(Darth_CoderParser.ConditionContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitCondition2(Darth_CoderParser.Condition2Context ctx) { 
//		return visitChildren(ctx); 
//	}
//
//	@Override 
//	public Value visitCondition3(Darth_CoderParser.Condition3Context ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override public Value visitCondition4(Darth_CoderParser.Condition4Context ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitGen_comparison(Darth_CoderParser.Gen_comparisonContext ctx) { 
//		return visitChildren(ctx); 
//	}
	
//	@Override 
//	public Value visitRel_op(Darth_CoderParser.Rel_opContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitEqual_op(Darth_CoderParser.Equal_opContext ctx) { 
//		return visitChildren(ctx);
//	}
//	
//	@Override 
//	public Value visitLogi_op(Darth_CoderParser.Logi_opContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitLogi_op2(Darth_CoderParser.Logi_op2Context ctx) { 
//		return visitChildren(ctx); 
//	}
	
//	
//	@Override 
//	public Value visitOr(Darth_CoderParser.OrContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override
//	public Value visitAnd(Darth_CoderParser.AndContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitNot_equal(Darth_CoderParser.Not_equalContext ctx) {
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitEqual_equal(Darth_CoderParser.Equal_equalContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitLess_than(Darth_CoderParser.Less_thanContext ctx) { 
//		
//		return visitChildren(ctx); 
//	}
//	
//	@Override public Value visitGreater_than(Darth_CoderParser.Greater_thanContext ctx) {
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitGreater_than_or_equal_to(Darth_CoderParser.Greater_than_or_equal_toContext ctx) { 
//		return visitChildren(ctx); 
//	}
//	
//	@Override 
//	public Value visitLess_than_or_equal_to(Darth_CoderParser.Less_than_or_equal_toContext ctx) { 
//		return visitChildren(ctx);
//	}
//	
//	@Override 
//	public Value visitNot(Darth_CoderParser.NotContext ctx) { 
//		return visitChildren(ctx);
//	}
//	
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
	public Value visitAdditiveExpr(Darth_CoderParser.AdditiveExprContext ctx) { 
		Value left = this.visit(ctx.expr());
		Value right = this.visit(ctx.expr2());

		double dLeft = Double.parseDouble(left.toString());
		double dRight = Double.parseDouble(right.toString());
		 
		switch(ctx.op.getType()){
			case Darth_CoderParser.PLUS:
				 if(left.isString() || right.isString())
					 return new Value(left.asString() + right.asString());
				 else if (!left.isString() && !right.isString()){
					 
					 if(left.isDouble() || right.isDouble()){
						 return new Value(dLeft + dRight);
					 } 
					 else{
						 return new Value(left.asInt() + right.asInt());
					 }
				 }
				
			case Darth_CoderParser.MINUS:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft - dRight);
				 }
				 else
					 return new Value(left.asInt() - right.asInt());
				
			default:
				 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			
		}
	}
	
	@Override 
	public Value visitMultiplicativeExpr(Darth_CoderParser.MultiplicativeExprContext ctx) { 
		Value left = this.visit(ctx.expr2());
		Value right = this.visit(ctx.gen_var());

		double dLeft = Double.parseDouble(left.toString());
		double dRight = Double.parseDouble(right.toString());
		 
		switch(ctx.op.getType()){
			case Darth_CoderParser.MULT:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft * dRight);
				 }
				 else
					 return new Value(left.asInt() * right.asInt());
			case Darth_CoderParser.DIV:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft / dRight);
				 }
				 else
					 return new Value(left.asInt() / right.asInt());
			case Darth_CoderParser.MOD:
				 if(left.isDouble() || right.isDouble()){
					 return new Value(dLeft % dRight);
				 }
				 else
					 return new Value(left.asInt() % right.asInt());
			default:
				 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
		}
	}
	
	@Override 
	public Value visitUnaryExpr(Darth_CoderParser.UnaryExprContext ctx) { 
		Value operand = this.visit(ctx.var());
		
		switch(ctx.op.getType()){
			case Darth_CoderParser.NOT:
				 return new Value(!operand.asBoolean());
			case Darth_CoderParser.PLUS:
				 if(operand.isDouble()){
					 return new Value(operand.asDouble());
				 }
				 else
					 return new Value(operand.asInt());
			case Darth_CoderParser.MINUS:
				 if(operand.isDouble()){
					 return new Value(-1*operand.asDouble());
				 }
				 else
					 return new Value(-1*operand.asInt());
			default:
				 throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
		}
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

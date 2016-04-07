package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ANTLRGeneratedClasses.Darth_CoderBaseVisitor;
import ANTLRGeneratedClasses.Darth_CoderParser;
import ANTLRGeneratedClasses.Darth_CoderParser.ValueContext;
import Observer.Observer;
import Observer.ObserverLine;
import Observer.Subject;

public class Darth_CoderBaseVisitorImpl extends Darth_CoderBaseVisitor<Value> implements Subject, ObserverLine{
	
	// used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;
    // used to manage variables and their values
    private VariableManager varManager = new VariableManager();
    
    // used to denote which conditional statements where evaluated (for if else)
    private Boolean isEvaluated;
	private ArrayList<Observer> obList;
	private int row;
	private int col;
	private boolean isLineByLine;
	public Darth_CoderBaseVisitorImpl() {
		obList = new ArrayList<Observer>();
		row = 0;
		col = 0;
		this.isLineByLine = false;
	}
	
	public void setLineByLine(boolean isLine){
		isLineByLine = isLine;
	}
	
	public boolean isLineByLine(){
		return isLineByLine;
	}
	
	@Override 
	public Value visitStart(Darth_CoderParser.StartContext ctx) { 
		
		if(ctx.code_block() != null){
			
			Task task = new Task();
			if(isLineByLine == false){
				System.out.println("HELLO");
				notifyObserverSymbol("", "", ctx.start.getLine());
				
				Thread t = new Thread(task);
				t.start();
			}

			if(isLineByLine == true)
			{
				System.out.println("GE");
				task.kill();
			}
			
			return this.visit(ctx.code_block());
		}else
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
		value = new Value (sc.nextDouble());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		if(!varManager.isVariableExists(id)){
			Variable var = new Variable(Variable.IC, id);
			varManager.addVariable(var);
			varManager.addVariableValue(var.getVariableName(), value);
			notifyObserverSymbol(id, value.asString(), row);
		}else{
			
			notifyObserverErrorLog(row, col,"DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		return value; 
	}

	@Override 
	public Value visitScan_galactic_credit(Darth_CoderParser.Scan_galactic_creditContext ctx) { 
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.nextInt());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		if(!varManager.isVariableExists(id)){
			Variable var = new Variable(Variable.GC, id);
			varManager.addVariable(var);
			varManager.addVariableValue(var.getVariableName(), value);
			notifyObserverSymbol(id, value.asString(), row);
		}else{
			notifyObserverErrorLog(row, col, "DUPLICATE LOCAL VARIABLE: "+id);
		}
	
		return value;
	}

	@Override 
	public Value visitScan_unit(Darth_CoderParser.Scan_unitContext ctx) {
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.next());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		if(!varManager.isVariableExists(id)){
			Variable var = new Variable(Variable.UN, id);
			varManager.addVariable(var);
			varManager.addVariableValue(var.getVariableName(), value);
			notifyObserverSymbol(id, value.asString(), row);
		}else{
		
			notifyObserverErrorLog(row, col, "DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		return value;
	}
	
	@Override 
	public Value visitScan_legion(Darth_CoderParser.Scan_legionContext ctx) { 
		Value value = null;
		
		Scanner sc = new Scanner(System.in);
		value = new Value (sc.nextLine());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		if(!varManager.isVariableExists(id)){
			Variable var = new Variable(Variable.LE, id);
			varManager.addVariable(var);
			varManager.addVariableValue(var.getVariableName(), value);
			notifyObserverSymbol(id, value.asString(), row);
		}else{
			
			notifyObserverErrorLog(row, col, "DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		return value;
	}

	@Override 
	public Value visitPrint(Darth_CoderParser.PrintContext ctx) { 
		// expr? CHARACTER_LITERAL? string_literal? var_iden? func_call?
		
		Value v = null;
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(ctx.expr() != null) {
			v = this.visit(ctx.expr());
			notifyObserverOutput(v.toString());
		}
		else if(ctx.var_iden() != null) {
			v = this.visit(ctx.var_iden());
			String id = ctx.var_iden().VAR_IDEN().getText();
			
			if(varManager.isVariableExists(id)){
				
				Value val = varManager.getVariableValue(id);
				
				if(val != null){
					notifyObserverSymbol(id, val.asString(), row);
					notifyObserverOutput(val.toString());
				}
				else{
					notifyObserverErrorLog(row, col, "NULL VALUE: " + id);
				}				
			}else{
				notifyObserverErrorLog(row, col, "VAR_IDEN UNDECLARED VARIABLE: " + id);
			}		
			
		}else if(ctx.array_iden() != null){
			String id = ctx.array_iden().var_iden().VAR_IDEN().getText();
			v = this.visit(ctx.array_iden());
			if(v != null){
				notifyObserverSymbol(id, v.asString(), row);
				notifyObserverOutput(v.toString());
			}else{
				notifyObserverErrorLog(row, col, "NULL VALUE: "+ id);
			}
		}
		
		return v; 
	}
	
	@Override 
	public Value visitWhileConditionCodeBlock(Darth_CoderParser.WhileConditionCodeBlockContext ctx) { 
		Value evaluated = this.visit(ctx.condition());
		
		while(evaluated.asBoolean()) {
			this.visit(ctx.code_block());
			
			evaluated = this.visit(ctx.condition());
		}
		
		return Value.VOID;
	}
	
	@Override public Value visitWhileCodeBlock(Darth_CoderParser.WhileCodeBlockContext ctx) {
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		notifyObserverErrorLog(row, col, "NO CONDITION, INFINITE LOOP~");		
		return Value.VOID; 
	}
	
	@Override public Value visitWhile(Darth_CoderParser.WhileContext ctx) { 
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		notifyObserverErrorLog(row, col, "THERE AIN'T ANYTHING HERE, INFINITE LOOP~");	
		return Value.VOID;
	}
	
	@Override public Value visitDoWhileCodeBlockCondition(Darth_CoderParser.DoWhileCodeBlockConditionContext ctx) { 
		
		this.visit(ctx.code_block());
		
		Value evaluated = this.visit(ctx.condition());
		
		while(evaluated.asBoolean()) {
			this.visit(ctx.code_block());
			evaluated = this.visit(ctx.condition());
		}
		
		return Value.VOID;
		
	}
	
	@Override public Value visitDoWhileCodeBlock(Darth_CoderParser.DoWhileCodeBlockContext ctx) { 
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		notifyObserverErrorLog(row, col, "NO CONDITION, INFINITE LOOP~");				
		return Value.VOID;
	}
	
	@Override public Value visitDoWhileCondition(Darth_CoderParser.DoWhileConditionContext ctx) { 
		
		
		Value evaluated = this.visit(ctx.condition());
		
		while(evaluated.asBoolean()) {
			evaluated = this.visit(ctx.condition());
		}
		
		return Value.VOID;
	}
	
	@Override public Value visitDoWhile(Darth_CoderParser.DoWhileContext ctx) { 
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		notifyObserverErrorLog(row, col, "THERE AIN'T ANYTHING HERE, INFINITE LOOP~");	
		return Value.VOID; 
	}
	
	@Override 
	public Value visitForConditionCodeBlock(Darth_CoderParser.ForConditionCodeBlockContext ctx) { 
		
		Value start = this.visit(ctx.reg_assignment());
		Value evaluated = this.visit(ctx.condition());
		
		while(evaluated.asBoolean()) {
			this.visit(ctx.code_block());
			
			start = this.visit(ctx.incr());
			evaluated = this.visit(ctx.condition());
		}
		
		return Value.VOID;
	}
	
	@Override public Value visitForCondition(Darth_CoderParser.ForConditionContext ctx) { 
		Value start = this.visit(ctx.reg_assignment());
		Value evaluated = this.visit(ctx.condition());
		
		while(evaluated.asBoolean()) {
			
			start = this.visit(ctx.incr());
			
			evaluated = this.visit(ctx.condition());
		}
		
		return Value.VOID;
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
		
		if(left.isBoolean() && right.isBoolean()){
			return new Value(left.asBoolean() && right.asBoolean());
		}
		else{
			row = ctx.start.getLine();
			col = ctx.start.getCharPositionInLine();
			notifyObserverErrorLog(row, col,"OPERATOR && IS UNDEFINED FOR THE ARGUMENT TYPE(S) " + left.getType() + ", "+right.getType());	
			throw new RuntimeException("WRONG DATA TYPE");	 
		}
	}
	@Override
	public Value visitOrExpr(Darth_CoderParser.OrExprContext ctx) { 
		Value left = this.visit(ctx.condition2());
		Value right = this.visit(ctx.condition3());
		
		if(left.isBoolean() && right.isBoolean()){
			return new Value(left.asBoolean() || right.asBoolean());
		}
		else{
			row = ctx.start.getLine();
			col = ctx.start.getCharPositionInLine();
			notifyObserverErrorLog(row,col, "OPERATOR || IS UNDEFINED FOR THE ARGUMENT TYPE(S) " + left.getType() + ", "+right.getType());	
			throw new RuntimeException("WRONG DATA TYPE");	 
		}
	}
	
	@Override 
	public Value visitEqualityExpr(Darth_CoderParser.EqualityExprContext ctx) { 
		Value left = this.visit(ctx.condition3());
		Value right = this.visit(ctx.condition4());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(left.isBoolean() && right.isBoolean()){
			switch(ctx.op.getType()){
				case Darth_CoderParser.NOT_EQUAL:				
					return new Value(left.asBoolean() != right.asBoolean());
				case Darth_CoderParser.EQUAL_EQUAL:
					return new Value(left.asBoolean() == right.asBoolean());
				default:{
					notifyObserverErrorLog(row, col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
					throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				}
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
					default:{
						notifyObserverErrorLog(row, col, "UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
						throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
					}
				}
			 } 
			 else{
				 switch(ctx.op.getType()){
					case Darth_CoderParser.NOT_EQUAL:				
						return new Value(left.asInt() != right.asInt());
					case Darth_CoderParser.EQUAL_EQUAL:
						return new Value(left.asInt() == right.asInt());
					default:{
						notifyObserverErrorLog(row, col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
						throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
					}
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
			default:{
				row = ctx.start.getLine();
				col = ctx.start.getCharPositionInLine();
				notifyObserverErrorLog(row, col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));	
				throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			}
		}
	}

	@Override 
	public Value visitVar(Darth_CoderParser.VarContext ctx) { 
		
		if(ctx.literal() != null){
			return this.visit(ctx.literal());
		}else if(ctx.func_call() != null){
			return this.visit(ctx.func_call());
		}else if(ctx.expr() != null){
			return this.visit(ctx.expr());
		}else if(ctx.var_iden()!= null){
			return this.visit(ctx.var_iden());
		}else 
			return this.visit(ctx.array_iden());
	}


	
	@Override public Value visitIncrement(Darth_CoderParser.IncrementContext ctx) { 
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		Value value = new Value (Integer.parseInt(varManager.getVariableValue(id).toString()) + 1);
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)) {
			if(varManager.isDataTypeMatch(id, value)) {
				varManager.editVariableValue(id, value);
				notifyObserverSymbol(id, value.asString(), row);
			}else{
				String varType = varManager.getVariable(id).getType();
				String valType = value.getType();
				
				notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+value + " IS "+valType);	
			}
		}else{

			notifyObserverErrorLog(row, col,"UNDECLARED VARIABLE: "+ id);
		}

		return value;
		
	}
	
	@Override public Value visitDecrement(Darth_CoderParser.DecrementContext ctx) { 
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		Value value = new Value (Integer.parseInt(varManager.getVariableValue(id).toString()) - 1);
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)) {
			if(varManager.isDataTypeMatch(id, value)) {
				varManager.editVariableValue(id, value);
				notifyObserverSymbol(id, value.asString(), row);
			}else{
				String varType = varManager.getVariable(id).getType();
				String valType = value.getType();
				
				notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+value + " IS "+valType);	
			}
		}else{
			
			notifyObserverErrorLog(row, col, "UNDECLARED VARIABLE: "+ id);
		}

		return value;
 
	}

	@Override 
	public Value visitTrue(Darth_CoderParser.TrueContext ctx) { 
		return new Value(true); 
	}
	
	@Override 
	public Value visitFalse(Darth_CoderParser.FalseContext ctx) { 
		return new Value(false); 
	}

	@Override 
	public Value visitGen_comparison(Darth_CoderParser.Gen_comparisonContext ctx) { 
		
		if(ctx.expr() != null)
			return this.visit(ctx.expr());
		else if(ctx.NOT() != null && ctx.condition() != null){
			Value v = this.visit(ctx.condition());
			return new Value(!v.asBoolean()); 
		}else if(ctx.NOT() == null && ctx.condition()!= null){
			Value v = this.visit(ctx.condition());
			return new Value(v.asBoolean());
		}else if(ctx.var_iden() != null){
			return this.visit(ctx.var_iden());
		}else if(ctx.side() != null){
			return this.visit(ctx.side());
		}else if(ctx.array_iden() != null)
			return this.visit(ctx.array_iden());
		else
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
	public Value visitVarDecFourTypes(Darth_CoderParser.VarDecFourTypesContext ctx) { 
		
		String id = ctx.reg_assignment().var_iden().VAR_IDEN().getText();
		Value v = this.visit(ctx.reg_assignment().expr());
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		if(!varManager.isVariableExists(id)){
			
			if(ctx.data_type().imperial_credit() != null) {
				Variable var = new Variable(Variable.IC,id);
				varManager.addVariable(var);
				
				if(v.isDouble()) {
					varManager.addVariableValue(var.getVariableName(), v);
					notifyObserverSymbol(id, v.toString(), row);
				}
			}else if(ctx.data_type().galactic_credit() != null){
				Variable var = new Variable(Variable.GC,id);
				varManager.addVariable(var);
				
				if(v.isInt()) {
					varManager.addVariableValue(var.getVariableName(), v);
					notifyObserverSymbol(id, v.toString(), row);
				}
			}else if(ctx.data_type().unit() != null){
				Variable var = new Variable(Variable.UN,id);
				varManager.addVariable(var);
				
				if(v.isChar()) {
					varManager.addVariableValue(var.getVariableName(), v);
					notifyObserverSymbol(id, v.toString(), row);
				}
			}else if(ctx.data_type().legion() != null){
				Variable var = new Variable(Variable.LE,id);
				varManager.addVariable(var);
				
				if(v.isString()) {
					varManager.addVariableValue(var.getVariableName(), v);
					notifyObserverSymbol(id, v.toString(), row);
				}
			}
		}else{
			notifyObserverErrorLog(row, col, "DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		if(!varManager.isDataTypeMatch(id, v)) {	
			String varType = varManager.getVariable(id).getType();
			String valType = v.getType();
			notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
		}
	
		return v;
	}
	
	@Override 
	public Value visitArrayDecNoValues(Darth_CoderParser.ArrayDecNoValuesContext ctx) { 
	
		String id = ctx.var_iden().VAR_IDEN().getText();
		Value index = this.visit(ctx.index());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(!varManager.isVariableExists(id)){
			
			if(index != null){
				boolean hasError = false;
				Array a = null;
				if(ctx.data_type().imperial_credit() != null){
					if(index.isInt()){
						a = new Array(Variable.IC, id);
						a.setSize(index.asInt());
						varManager.addVariable(a);
						notifyObserverSymbol(id+"("+index.toString()+")", "no value", row);
					}else{
						hasError = true;
					}
				}else if(ctx.data_type().galactic_credit() != null){
					if(index.isInt()){
						a = new Array(Variable.GC, id);
						a.setSize(index.asInt());
						varManager.addVariable(a);
						notifyObserverSymbol(id+"("+index.toString()+")", "no value", row);
					}else{
						hasError = true;
					}
				}else if(ctx.data_type().unit() != null){
					if(index.isInt()){
						a = new Array(Variable.UN, id);
						a.setSize(index.asInt());
						varManager.addVariable(a);
						notifyObserverSymbol(id+"("+index.toString()+")", "no value", row);
					}else{
						hasError = true;
					}
				}else if(ctx.data_type().legion() != null){
					if(index.isInt()){
						a = new Array(Variable.LE, id);
						a.setSize(index.asInt());
						varManager.addVariable(a);
						notifyObserverSymbol(id+"("+index.toString()+")", "no value", row);
					}else{
						hasError = true;
					}
				}
				
				if(hasError){
					notifyObserverErrorLog(row, col,"SYNTAX ERROR: INVALID TOKEN TYPE "+ index.getType() + " SHOULD BE GalacticCredit");
				}	
			}
			
			
		}else{
			notifyObserverErrorLog(row,col, "DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		return Value.VOID; 
	}

	@Override 
	public Value visitArrayDecWithValues(Darth_CoderParser.ArrayDecWithValuesContext ctx) { 
	
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(!varManager.isVariableExists(id)){
			Array arr = null;
			int arrSize = 0;
			
			if(ctx.data_type().imperial_credit()!= null){
				arr = new Array(Variable.IC, id);
			}else if(ctx.data_type().galactic_credit()!= null){
				arr = new Array(Variable.GC, id);
			}else if(ctx.data_type().unit()!= null){
				arr = new Array(Variable.UN, id);
			}else if(ctx.data_type().legion()!= null){
				arr = new Array(Variable.LE, id);
			}		
			
			if(arr != null){
				int counter = 0;
				int addCounter = 0;
				String varType = arr.getType();
				
				List<Darth_CoderParser.ValueContext> vList = ctx.value();
				for(Darth_CoderParser.ValueContext value: vList) {
					
					counter++;
					Value v = this.visit(value.var());
					String valType = v.getType();
					
					switch(arr.getType()){
						case Variable.IC:
							if(!v.getType().equals(Variable.UN) &&  !v.getType().equals(Variable.LE) &&
							   !v.getType().equals(Variable.SIDE)){
								Double dVal = Double.parseDouble(v.toString());
								arr.addArrayValue(new Value(dVal));
								notifyObserverSymbol(id+"("+arrSize+")", dVal.toString(), row);
								
								arrSize++;
								addCounter++;
							} else{
								
								int line = ctx.start.getLine();
								int col = ctx.start.getCharPositionInLine();
								notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
							}break;
						case Variable.LE:
							if(v.getType().equals(Variable.LE) || v.getType().equals(Variable.UN)){
								arr.addArrayValue(new Value(v.toString()));
								notifyObserverSymbol(id+"("+arrSize+")", v.toString(), row);
								
								arrSize++;
								addCounter++;
							} else{
								notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
							}break;
						case Variable.GC:
							if(v.getType().equals(Variable.GC)){
								arr.addArrayValue(new Value(v.asInt()));
								notifyObserverSymbol(id+"("+arrSize+")", v.toString(), row);
								
								arrSize++;
								addCounter++;
							} else{
								notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
							}break;
						case Variable.UN:
							if(v.getType().equals(Variable.UN)){
								arr.addArrayValue(new Value(v.asChar()));
								notifyObserverSymbol(id+"("+arrSize+")", v.toString(), row);
								
								arrSize++;
								addCounter++;
							} else{
								notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
							}break;
						default:
							notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);						
					}
				}

				if(counter == addCounter){
					arr.setSize(arrSize);
					varManager.addVariable(arr);
				}
			}
			
			
		}else{
			notifyObserverErrorLog(row, col,"DUPLICATE LOCAL VARIABLE: "+id);
		}

		return Value.VOID;
	}
	
	@Override 
	public Value visitArray_assignment(Darth_CoderParser.Array_assignmentContext ctx) { 
	
		String id = ctx.array_iden().var_iden().VAR_IDEN().getText();
		Value index = this.visit(ctx.array_iden().index());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)){
			if(index.isInt()){
				Array arr = (Array) varManager.getVariable(id);
				if(!arr.isIndexOutOfBounds(index.asInt())){
					boolean hasError = true;
					Value v = this.visit(ctx.var());
					switch(arr.getType()){
						case Variable.IC:
							if(!v.getType().equals(Variable.UN) &&  !v.getType().equals(Variable.LE) &&
							   !v.getType().equals(Variable.SIDE)){
								Double dVal = Double.parseDouble(v.toString());
								arr.editArrayValue(index.asInt(),new Value(dVal));
								
								notifyObserverSymbol(id+"("+index.toString()+")", dVal.toString(), row);
								
								hasError = false;
							} break;
						case Variable.LE:
							if(v.getType().equals(Variable.LE) || v.getType().equals(Variable.UN)){
								arr.editArrayValue(index.asInt(),new Value(v.toString()));
								notifyObserverSymbol(id+"("+index.toString()+")", v.toString(), row);
								
								hasError = false;
							}break;
						case Variable.GC:
							if(v.getType().equals(Variable.GC)){
								arr.editArrayValue(index.asInt(),new Value(v.asInt()));
								notifyObserverSymbol(id+"("+index.toString()+")", v.toString(), row);
								
								hasError = false;
							}break;
						case Variable.UN:
							if(v.getType().equals(Variable.UN)){
								arr.editArrayValue(index.asInt(),new Value(v.asChar()));
								notifyObserverSymbol(id+"("+index.toString()+")", v.toString(), row);
								
								hasError = false;
							}break;
						default:{
							String varType = arr.getType();
							String valType = v.getType();
							notifyObserverErrorLog(row,col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
						}
					}
					
					if(hasError){
						String varType = arr.getType();
						String valType = v.getType();
						notifyObserverErrorLog(row,col,"DATA TYPE MISMATCH: "+ id + " IS " + varType + " WHILE "+v + " IS "+valType);
					}
				}else{
					notifyObserverErrorLog(row,col,"INDEX OUT OF BOUND: "+ index + " array size: "+ arr.getSize());
				}
				
			}else{
				notifyObserverErrorLog(row,col,"SYNTAX ERROR: INVALID TOKEN TYPE "+ index.getType() + " should be GalacticCredit");
			}
				
		}else{
			notifyObserverErrorLog(row,col,"UNDECLARED VARIABLE: "+id);
		}
		
		return visitChildren(ctx); 
	}

	
	@Override public Value visitVarDecVarIdenFourTypes(Darth_CoderParser.VarDecVarIdenFourTypesContext ctx) { 
		
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(!varManager.isVariableExists(id)){
		
			if(ctx.data_type().imperial_credit() != null) {
				Variable var = new Variable(Variable.IC, id);
				varManager.addVariable(var);
				varManager.addVariableValue(var.getVariableName(), null);
				notifyObserverSymbol(id, var.toString(), row);
			}
			else if(ctx.data_type().galactic_credit() != null) {
				Variable var = new Variable(Variable.GC, id);
				varManager.addVariable(var);
				varManager.addVariableValue(var.getVariableName(), null);
				notifyObserverSymbol(id, var.toString(), row);
			}
			else if(ctx.data_type().unit() != null) {
				Variable var = new Variable(Variable.UN, id);
				varManager.addVariable(var);
				varManager.addVariableValue(var.getVariableName(), null);
				notifyObserverSymbol(id, var.toString(), row);
			}
			else if(ctx.data_type().legion() != null) {
				Variable var = new Variable(Variable.LE, id);
				varManager.addVariable(var);
				varManager.addVariableValue(var.getVariableName(), null);
				notifyObserverSymbol(id, var.toString(), row);
			}
		}else{
			notifyObserverErrorLog(row, col,"DUPLICATE LOCAL VARIABLE: "+id);
		}
		
		return Value.VOID;
	}
	
	@Override public Value visitVarDecBoolean(Darth_CoderParser.VarDecBooleanContext ctx) { 
		Value v = null;
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(ctx.boolean_statement().var_iden() != null){
			String id = ctx.boolean_statement().var_iden().VAR_IDEN().getText();
			if(!varManager.isVariableExists(id)){
				Variable var = new Variable(Variable.SIDE,id);
				varManager.addVariable(var);
				varManager.addVariableValue(var.getVariableName(), null);
				notifyObserverSymbol(id, var.toString(), row);
				return Value.VOID;
			}else{
				notifyObserverErrorLog(row, col,"DUPLICATE LOCAL VARIABLE: "+id);
			}
		}else if (ctx.boolean_statement().boolean_assignment() != null){
			
			String id = ctx.boolean_statement().boolean_assignment().var_iden().VAR_IDEN().getText();
			
			if(!varManager.isVariableExists(id)){
				
				if(ctx.boolean_statement().boolean_assignment().LIGHT_SIDE() != null){
					Variable var = new Variable(Variable.SIDE,id);
					v = new Value(true);
					varManager.addVariable(var);
					varManager.addVariableValue(var.getVariableName(),v);
					notifyObserverSymbol(id, var.toString(), row);
					
				}else if(ctx.boolean_statement().boolean_assignment().DARK_SIDE() != null){
					Variable var = new Variable(Variable.SIDE,id);
					v = new Value(false);
					varManager.addVariable(var);
					varManager.addVariableValue(var.getVariableName(),v);
					notifyObserverSymbol(id, var.toString(), row);
					
				}else{
 					String varType = varManager.getVariable(id).getType();
					String valType = ctx.boolean_statement().boolean_assignment().getText();
					notifyObserverErrorLog(row,col,"DATA TYPE MISMATCH: "+ id + " is " + varType + " while "+v + " is "+valType);
				}
			}else{
				notifyObserverErrorLog(row,col,"DUPLICATE LOCAL VARIABLE: "+id);
			}
		}
		
		return v;
	}


	@Override 
	public Value visitBoolean_statement(Darth_CoderParser.Boolean_statementContext ctx) { 
		return visitChildren(ctx); 
	}

	
	@Override
	public Value visitStatement(Darth_CoderParser.StatementContext ctx) {
		return visitChildren(ctx); 
	}


	
	@Override 
	public Value visitReg_assignment(Darth_CoderParser.Reg_assignmentContext ctx) { 
	
		String id = ctx.var_iden().VAR_IDEN().getText();
		Value value = this.visit(ctx.expr());
	
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)){
			
			if(varManager.isDataTypeMatch(id, value)){
				varManager.editVariableValue(id, value);
				notifyObserverSymbol(id, value.toString(), row);
				
			}else{
				String varType = varManager.getVariable(id).getType();
				String valType = value.getType();
				notifyObserverErrorLog(row, col,"DATA TYPE MISMATCH: "+ id + " is " + varType + " while "+value + " is "+valType);
			}
		}else{
			notifyObserverErrorLog(row, col, "UNDECLARED VARIABLE: "+ id);
		}

		return value;
		
	}
	@Override 
	public Value visitBoolean_assignment(Darth_CoderParser.Boolean_assignmentContext ctx) { 

		String id = ctx.var_iden().VAR_IDEN().getText();
		Value value = null;
	
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)){
			
			if(ctx.LIGHT_SIDE() != null){
				value = new Value(true);
				varManager.editVariableValue(id, value);
				notifyObserverSymbol(id, value.toString(), row);
				
			}else if(ctx.DARK_SIDE() != null){
				value = new Value(false);
				varManager.editVariableValue(id, value);
				notifyObserverSymbol(id, value.toString(), row);
				
			}else{
				String varType = varManager.getVariable(id).getType();
				String valType = value.getType();
				notifyObserverErrorLog(row,col,"DATA TYPE MISMATCH: "+ id + " is " + varType + " while "+value + " is "+valType);
			}
		}else{
			notifyObserverErrorLog(row,col,"UNDECLARED VARIABLE: "+ id);
		}

		return value; 
	}

	
	@Override 
	public Value visitArray_iden(Darth_CoderParser.Array_idenContext ctx) { 
		
		Value index = this.visit(ctx.index());
		Value arrVal = null;
		String id = ctx.var_iden().VAR_IDEN().getText();
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(index.isInt()){
			if(varManager.isVariableExists(id)){
				Array a = (Array) varManager.getVariable(id);
				if(!a.isIndexOutOfBounds(index.asInt())){	
					arrVal = a.getArrayValue(index.asInt());
				}else{
					notifyObserverErrorLog(row,col,"INDEX OUT OF BOUND: "+ index + " array size: "+ a.getSize());
				}
			}else{
				notifyObserverErrorLog(row,col,"UNDECLARED VARIABLE: "+ id);
			}
		
		}else{
			notifyObserverErrorLog(row,col,"SYNTAX ERROR: INVALID TOKEN TYPE "+ index.getType() + " should be GalacticCredit");
		}
		
		return arrVal; 
	}

	
	@Override 
	public Value visitVar_iden(Darth_CoderParser.Var_idenContext ctx) { 
		String id = ctx.VAR_IDEN().getText();
		Value value = null;
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
		if(varManager.isVariableExists(id)){
			value = varManager.getVariableValue(id);
		}else{
			notifyObserverErrorLog(row,col,"UNDECLARED VARIABLE: " + id);
		}
		if(value == null) {
			notifyObserverErrorLog(row,col,"NULL VALUE: "+value.toString());
		
		}
		
		return value;
	}
	
	@Override 
	public Value visitAdditiveExpr(Darth_CoderParser.AdditiveExprContext ctx) { 
		Value left = this.visit(ctx.expr());
		Value right = this.visit(ctx.expr2());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();

		switch(ctx.op.getType()){
			case Darth_CoderParser.PLUS:
				 if(left.isString() || right.isString()){
					 return new Value(left.asString() + right.asString());
				 } 
				 else if (!left.isString() && !right.isString()){
					 if(left.isDouble() || right.isDouble()){
						 double dLeft = Double.parseDouble(left.toString());
						 double dRight = Double.parseDouble(right.toString());
						 return new Value(dLeft + dRight);
					 } 
					 else{
						 return new Value(left.asInt() + right.asInt());
					 }
				 }
				
			case Darth_CoderParser.MINUS:
				 if(left.isDouble() || right.isDouble()){
					 double dLeft = Double.parseDouble(left.toString());
					 double dRight = Double.parseDouble(right.toString());
					 return new Value(dLeft - dRight);
				 }
				 else
					 return new Value(left.asInt() - right.asInt());
				
			default:{
				notifyObserverErrorLog(row,col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			}
		}
	}
	
	@Override 
	public Value visitMultiplicativeExpr(Darth_CoderParser.MultiplicativeExprContext ctx) { 
		Value left = this.visit(ctx.expr2());
		Value right = this.visit(ctx.gen_var());

		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
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
			default:{
				notifyObserverErrorLog(row,col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			}
		}
	}
	
	@Override 
	public Value visitUnaryExpr(Darth_CoderParser.UnaryExprContext ctx) { 
		Value operand = this.visit(ctx.var());
		
		row = ctx.start.getLine();
		col = ctx.start.getCharPositionInLine();
		
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
			default:{
				notifyObserverErrorLog(row,col,"UNKNOWN OPERATOR: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
				throw new RuntimeException("unknown operator: " + Darth_CoderParser.VOCABULARY.getDisplayName(ctx.op.getType()));
			}
		}
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
		
		if(ctx.INT_LITERAL() != null){
			return new Value(Integer.valueOf(ctx.INT_LITERAL().getText())); 
		}
		else if (ctx.var_iden() != null){
			return this.visit(ctx.var_iden());
		}else{
			return this.visit(ctx.expr());
		}
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
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
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

	@Override
	public void registerObserver(Observer o) {
		obList.add(o);		
	}

	@Override
	public void unRegisterObserver(Observer o) {
		obList.remove(o);
	}

	@Override
	public void notifyObserverOutput(String log) {
		for(Observer o : obList)
			o.updateConsole(log);
	}

	
	@Override
	public void notifyObserverErrorLog(int row, int col, String log) {
		for(Observer o : obList)
			o.updateLogArea(row, col,log);	
	}

	@Override
	public void notifyObserverSymbol(String varname, String val, int position) {
		// TODO Auto-generated method stub
		for(Observer o : obList)
			o.updateSymbolTable(varname, val, position, isLineByLine);
	}

	@Override
	public void runLineByLine(boolean isLineByLine) {
		// TODO Auto-generated method stub
		this.isLineByLine = isLineByLine;
	}
}

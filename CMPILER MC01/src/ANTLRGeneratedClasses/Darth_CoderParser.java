// Generated from Darth_Coder.g4 by ANTLR 4.5.2

	package ANTLRGeneratedClasses;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Darth_CoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LITERAL=1, FLOAT_LITERAL=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, 
		MOD=9, LPAR=10, RPAR=11, EQUAL=12, NOT=13, SINGLE_QUOTE=14, DOUBLE_QUOTE=15, 
		INCREMENT_OPERATOR=16, DECREMENT_OPERATOR=17, VAR_IDEN=18, FUNC_IDEN=19, 
		CHARACTER_LITERAL=20, STRING_LITERAL=21, TERMINAL=22, GALACTIC_CREDIT=23, 
		IMPERIAL_CREDIT=24, UNIT=25, LEGION=26, SIDE=27, LIGHT_SIDE=28, DARK_SIDE=29, 
		CONST_DEC=30, VOID=31, IF=32, ELSE_IF=33, ELSE=34, FOR=35, DO=36, WHILE=37, 
		BREAK=38, RETURN=39, ARRAY_OPEN=40, ARRAY_CLOSE=41, OPEN_BRACKET=42, CLOSE_BRACKET=43, 
		OPEN_SQUARE_BRACKET=44, CLOSE_SQUARE_BRACKET=45, COMMA=46, LESS_THAN=47, 
		GREATER_THAN=48, LESS_THAN_EQUAL_TO=49, GREATER_THAN_EQUAL_TO=50, NOT_EQUAL=51, 
		EQUAL_EQUAL=52, AND=53, OR=54, END_TRANSMISSION=55, INITIATE=56, SCAN_INTEGER=57, 
		SCAN_FLOAT=58, SCAN_CHAR=59, SCAN_STRING=60, PRINT=61;
	public static final int
		RULE_start = 0, RULE_code_block = 1, RULE_epsilon = 2, RULE_scan_imperial_credit = 3, 
		RULE_scan_galactic_credit = 4, RULE_scan_unit = 5, RULE_scan_legion = 6, 
		RULE_print = 7, RULE_iterative_con = 8, RULE_func_call = 9, RULE_if_conditional = 10, 
		RULE_elseIf_conditional = 11, RULE_else_conditional = 12, RULE_condition = 13, 
		RULE_condition2 = 14, RULE_condition3 = 15, RULE_condition4 = 16, RULE_gen_comparison = 17, 
		RULE_rel_op = 18, RULE_equal_op = 19, RULE_logi_op = 20, RULE_logi_op2 = 21, 
		RULE_or = 22, RULE_and = 23, RULE_not_equal = 24, RULE_equal_equal = 25, 
		RULE_less_than = 26, RULE_greater_than = 27, RULE_greater_than_or_equal_to = 28, 
		RULE_less_than_or_equal_to = 29, RULE_not = 30, RULE_func_dec = 31, RULE_return_statement = 32, 
		RULE_func_iden = 33, RULE_parameter = 34, RULE_constant_declaration = 35, 
		RULE_var_dec = 36, RULE_boolean_statement = 37, RULE_boolean_assignment = 38, 
		RULE_statement = 39, RULE_array_assignment = 40, RULE_reg_assignment = 41, 
		RULE_var_iden = 42, RULE_incr = 43, RULE_expr = 44, RULE_expr2 = 45, RULE_gen_var = 46, 
		RULE_var = 47, RULE_add_sub = 48, RULE_mul_div = 49, RULE_uni_op = 50, 
		RULE_array = 51, RULE_array_open = 52, RULE_array_close = 53, RULE_equal = 54, 
		RULE_index = 55, RULE_value = 56, RULE_data_type = 57, RULE_galactic_credit = 58, 
		RULE_imperial_credit = 59, RULE_unit = 60, RULE_legion = 61, RULE_literal = 62, 
		RULE_string_literal = 63, RULE_character_literal = 64, RULE_int_literal = 65, 
		RULE_float_literal = 66;
	public static final String[] ruleNames = {
		"start", "code_block", "epsilon", "scan_imperial_credit", "scan_galactic_credit", 
		"scan_unit", "scan_legion", "print", "iterative_con", "func_call", "if_conditional", 
		"elseIf_conditional", "else_conditional", "condition", "condition2", "condition3", 
		"condition4", "gen_comparison", "rel_op", "equal_op", "logi_op", "logi_op2", 
		"or", "and", "not_equal", "equal_equal", "less_than", "greater_than", 
		"greater_than_or_equal_to", "less_than_or_equal_to", "not", "func_dec", 
		"return_statement", "func_iden", "parameter", "constant_declaration", 
		"var_dec", "boolean_statement", "boolean_assignment", "statement", "array_assignment", 
		"reg_assignment", "var_iden", "incr", "expr", "expr2", "gen_var", "var", 
		"add_sub", "mul_div", "uni_op", "array", "array_open", "array_close", 
		"equal", "index", "value", "data_type", "galactic_credit", "imperial_credit", 
		"unit", "legion", "literal", "string_literal", "character_literal", "int_literal", 
		"float_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'='", "'!'", "'''", "'\"'", "'++'", "'--'", null, null, null, 
		null, "'.'", "'GalacticCredit'", "'ImperialCredit'", "'Unit'", "'Legion'", 
		"'Side'", "'LightSide'", "'DarkSide'", "'Declare'", "'Void'", "'ForceInstance'", 
		"'InstanceVariant'", "'NoVariant'", "'ForceCommand'", "'ForceOrder'", 
		"'ForceAnalyze'", "'Order_66'", "'Transmit'", null, null, "'{'", "'}'", 
		"'['", "']'", "','", null, null, "'<='", "'>='", "'!='", "'=='", "'&&'", 
		"'||'", "'End_Transmission'", "'Initiate'", "'EncodeGalacticCredit'", 
		"'EncodeImperialCredit'", "'EncodeUnit'", "'EncodeLegion'", "'Decode'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_LITERAL", "FLOAT_LITERAL", "NL", "WS", "PLUS", "MINUS", "MULT", 
		"DIV", "MOD", "LPAR", "RPAR", "EQUAL", "NOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
		"INCREMENT_OPERATOR", "DECREMENT_OPERATOR", "VAR_IDEN", "FUNC_IDEN", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", "UNIT", 
		"LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", "IF", 
		"ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", 
		"ARRAY_CLOSE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", 
		"CLOSE_SQUARE_BRACKET", "COMMA", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL_TO", 
		"GREATER_THAN_EQUAL_TO", "NOT_EQUAL", "EQUAL_EQUAL", "AND", "OR", "END_TRANSMISSION", 
		"INITIATE", "SCAN_INTEGER", "SCAN_FLOAT", "SCAN_CHAR", "SCAN_STRING", 
		"PRINT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Darth_Coder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Darth_CoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode INITIATE() { return getToken(Darth_CoderParser.INITIATE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(INITIATE);
			setState(135);
			match(OPEN_BRACKET);
			setState(136);
			code_block();
			setState(137);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Reg_assignmentContext reg_assignment() {
			return getRuleContext(Reg_assignmentContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public Iterative_conContext iterative_con() {
			return getRuleContext(Iterative_conContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public Scan_imperial_creditContext scan_imperial_credit() {
			return getRuleContext(Scan_imperial_creditContext.class,0);
		}
		public Scan_galactic_creditContext scan_galactic_credit() {
			return getRuleContext(Scan_galactic_creditContext.class,0);
		}
		public Scan_unitContext scan_unit() {
			return getRuleContext(Scan_unitContext.class,0);
		}
		public Scan_legionContext scan_legion() {
			return getRuleContext(Scan_legionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				var_dec();
				setState(140);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				reg_assignment();
				setState(143);
				match(TERMINAL);
				setState(144);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				array_assignment();
				setState(147);
				match(TERMINAL);
				setState(148);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				if_conditional();
				setState(151);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				iterative_con();
				setState(154);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				func_call();
				setState(157);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				incr();
				setState(160);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				scan_imperial_credit();
				setState(163);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				scan_galactic_credit();
				setState(166);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(168);
				scan_unit();
				setState(169);
				code_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				scan_legion();
				setState(172);
				code_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(174);
				print();
				setState(175);
				code_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(177);
				epsilon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpsilonContext extends ParserRuleContext {
		public EpsilonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epsilon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpsilonContext epsilon() throws RecognitionException {
		EpsilonContext _localctx = new EpsilonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_epsilon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_imperial_creditContext extends ParserRuleContext {
		public TerminalNode SCAN_FLOAT() { return getToken(Darth_CoderParser.SCAN_FLOAT, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Scan_imperial_creditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_imperial_credit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitScan_imperial_credit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_imperial_creditContext scan_imperial_credit() throws RecognitionException {
		Scan_imperial_creditContext _localctx = new Scan_imperial_creditContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scan_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SCAN_FLOAT);
			setState(183);
			match(OPEN_SQUARE_BRACKET);
			setState(184);
			expr(0);
			setState(185);
			match(CLOSE_SQUARE_BRACKET);
			setState(186);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_galactic_creditContext extends ParserRuleContext {
		public TerminalNode SCAN_INTEGER() { return getToken(Darth_CoderParser.SCAN_INTEGER, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Scan_galactic_creditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_galactic_credit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitScan_galactic_credit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_galactic_creditContext scan_galactic_credit() throws RecognitionException {
		Scan_galactic_creditContext _localctx = new Scan_galactic_creditContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scan_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SCAN_INTEGER);
			setState(189);
			match(OPEN_SQUARE_BRACKET);
			setState(190);
			expr(0);
			setState(191);
			match(CLOSE_SQUARE_BRACKET);
			setState(192);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_unitContext extends ParserRuleContext {
		public TerminalNode SCAN_CHAR() { return getToken(Darth_CoderParser.SCAN_CHAR, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(Darth_CoderParser.CHARACTER_LITERAL, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Scan_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitScan_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_unitContext scan_unit() throws RecognitionException {
		Scan_unitContext _localctx = new Scan_unitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scan_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SCAN_CHAR);
			setState(195);
			match(OPEN_SQUARE_BRACKET);
			setState(196);
			match(CHARACTER_LITERAL);
			setState(197);
			match(CLOSE_SQUARE_BRACKET);
			setState(198);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scan_legionContext extends ParserRuleContext {
		public TerminalNode SCAN_STRING() { return getToken(Darth_CoderParser.SCAN_STRING, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Darth_CoderParser.STRING_LITERAL, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Scan_legionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_legion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitScan_legion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_legionContext scan_legion() throws RecognitionException {
		Scan_legionContext _localctx = new Scan_legionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scan_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SCAN_STRING);
			setState(201);
			match(OPEN_SQUARE_BRACKET);
			setState(202);
			match(STRING_LITERAL);
			setState(203);
			match(CLOSE_SQUARE_BRACKET);
			setState(204);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Darth_CoderParser.PRINT, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(Darth_CoderParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Darth_CoderParser.STRING_LITERAL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PRINT);
			setState(207);
			match(OPEN_SQUARE_BRACKET);
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(208);
				expr(0);
				}
				break;
			}
			setState(212);
			_la = _input.LA(1);
			if (_la==CHARACTER_LITERAL) {
				{
				setState(211);
				match(CHARACTER_LITERAL);
				}
			}

			setState(215);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(214);
				match(STRING_LITERAL);
				}
			}

			setState(217);
			match(CLOSE_SQUARE_BRACKET);
			setState(218);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iterative_conContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Darth_CoderParser.WHILE, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public TerminalNode DO() { return getToken(Darth_CoderParser.DO, 0); }
		public List<TerminalNode> TERMINAL() { return getTokens(Darth_CoderParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(Darth_CoderParser.TERMINAL, i);
		}
		public TerminalNode FOR() { return getToken(Darth_CoderParser.FOR, 0); }
		public Reg_assignmentContext reg_assignment() {
			return getRuleContext(Reg_assignmentContext.class,0);
		}
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public Iterative_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative_con; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitIterative_con(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iterative_conContext iterative_con() throws RecognitionException {
		Iterative_conContext _localctx = new Iterative_conContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterative_con);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(WHILE);
				setState(221);
				match(OPEN_SQUARE_BRACKET);
				setState(222);
				condition(0);
				setState(223);
				match(CLOSE_SQUARE_BRACKET);
				setState(224);
				match(OPEN_BRACKET);
				setState(225);
				code_block();
				setState(226);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(WHILE);
				setState(229);
				match(OPEN_SQUARE_BRACKET);
				setState(230);
				match(CLOSE_SQUARE_BRACKET);
				setState(231);
				match(OPEN_BRACKET);
				setState(232);
				code_block();
				setState(233);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(WHILE);
				setState(236);
				match(OPEN_SQUARE_BRACKET);
				setState(237);
				match(CLOSE_SQUARE_BRACKET);
				setState(238);
				match(OPEN_BRACKET);
				setState(239);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(DO);
				setState(241);
				match(OPEN_BRACKET);
				setState(242);
				code_block();
				setState(243);
				match(CLOSE_BRACKET);
				setState(244);
				match(WHILE);
				setState(245);
				match(OPEN_SQUARE_BRACKET);
				setState(246);
				condition(0);
				setState(247);
				match(CLOSE_SQUARE_BRACKET);
				setState(248);
				match(TERMINAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(DO);
				setState(251);
				match(OPEN_BRACKET);
				setState(252);
				code_block();
				setState(253);
				match(CLOSE_BRACKET);
				setState(254);
				match(WHILE);
				setState(255);
				match(OPEN_SQUARE_BRACKET);
				setState(256);
				match(CLOSE_SQUARE_BRACKET);
				setState(257);
				match(TERMINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(DO);
				setState(260);
				match(OPEN_BRACKET);
				setState(261);
				match(CLOSE_BRACKET);
				setState(262);
				match(WHILE);
				setState(263);
				match(OPEN_SQUARE_BRACKET);
				setState(264);
				condition(0);
				setState(265);
				match(CLOSE_SQUARE_BRACKET);
				setState(266);
				match(TERMINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				match(DO);
				setState(269);
				match(OPEN_BRACKET);
				setState(270);
				match(CLOSE_BRACKET);
				setState(271);
				match(WHILE);
				setState(272);
				match(OPEN_SQUARE_BRACKET);
				setState(273);
				match(CLOSE_SQUARE_BRACKET);
				setState(274);
				match(TERMINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				match(FOR);
				setState(276);
				match(OPEN_SQUARE_BRACKET);
				setState(277);
				reg_assignment();
				setState(278);
				match(TERMINAL);
				setState(279);
				condition(0);
				setState(280);
				match(TERMINAL);
				setState(281);
				incr();
				setState(282);
				match(CLOSE_SQUARE_BRACKET);
				setState(283);
				match(OPEN_BRACKET);
				setState(284);
				code_block();
				setState(285);
				match(CLOSE_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(287);
				match(FOR);
				setState(288);
				match(OPEN_SQUARE_BRACKET);
				setState(289);
				reg_assignment();
				setState(290);
				match(TERMINAL);
				setState(291);
				condition(0);
				setState(292);
				match(TERMINAL);
				setState(293);
				incr();
				setState(294);
				match(CLOSE_SQUARE_BRACKET);
				setState(295);
				match(OPEN_BRACKET);
				setState(296);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Func_idenContext func_iden() {
			return getRuleContext(Func_idenContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_call);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				func_iden();
				setState(301);
				match(OPEN_SQUARE_BRACKET);
				setState(302);
				value();
				setState(303);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				func_iden();
				setState(306);
				match(OPEN_SQUARE_BRACKET);
				setState(307);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_conditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Darth_CoderParser.IF, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public ElseIf_conditionalContext elseIf_conditional() {
			return getRuleContext(ElseIf_conditionalContext.class,0);
		}
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitIf_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_conditional);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(IF);
				setState(312);
				match(OPEN_SQUARE_BRACKET);
				setState(313);
				condition(0);
				setState(314);
				match(CLOSE_SQUARE_BRACKET);
				setState(315);
				match(OPEN_BRACKET);
				setState(316);
				code_block();
				setState(317);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(IF);
				setState(320);
				match(OPEN_SQUARE_BRACKET);
				setState(321);
				condition(0);
				setState(322);
				match(CLOSE_SQUARE_BRACKET);
				setState(323);
				match(OPEN_BRACKET);
				setState(324);
				code_block();
				setState(325);
				match(CLOSE_BRACKET);
				setState(326);
				elseIf_conditional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIf_conditionalContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(Darth_CoderParser.ELSE_IF, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public ElseIf_conditionalContext elseIf_conditional() {
			return getRuleContext(ElseIf_conditionalContext.class,0);
		}
		public Else_conditionalContext else_conditional() {
			return getRuleContext(Else_conditionalContext.class,0);
		}
		public ElseIf_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitElseIf_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIf_conditionalContext elseIf_conditional() throws RecognitionException {
		ElseIf_conditionalContext _localctx = new ElseIf_conditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIf_conditional);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(ELSE_IF);
				setState(331);
				match(OPEN_SQUARE_BRACKET);
				setState(332);
				condition(0);
				setState(333);
				match(CLOSE_SQUARE_BRACKET);
				setState(334);
				match(OPEN_BRACKET);
				setState(335);
				code_block();
				setState(336);
				match(CLOSE_BRACKET);
				setState(337);
				elseIf_conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(ELSE_IF);
				setState(340);
				match(OPEN_SQUARE_BRACKET);
				setState(341);
				condition(0);
				setState(342);
				match(CLOSE_SQUARE_BRACKET);
				setState(343);
				match(OPEN_BRACKET);
				setState(344);
				code_block();
				setState(345);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				else_conditional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_conditionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Darth_CoderParser.ELSE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public Else_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitElse_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionalContext else_conditional() throws RecognitionException {
		Else_conditionalContext _localctx = new Else_conditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ELSE);
			setState(351);
			match(OPEN_BRACKET);
			setState(352);
			code_block();
			setState(353);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Logi_op2Context logi_op2() {
			return getRuleContext(Logi_op2Context.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			condition2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(358);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(359);
					logi_op2();
					setState(360);
					condition2(0);
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Condition2Context extends ParserRuleContext {
		public Condition3Context condition3() {
			return getRuleContext(Condition3Context.class,0);
		}
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public Logi_opContext logi_op() {
			return getRuleContext(Logi_opContext.class,0);
		}
		public Condition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCondition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition2Context condition2() throws RecognitionException {
		return condition2(0);
	}

	private Condition2Context condition2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Condition2Context _localctx = new Condition2Context(_ctx, _parentState);
		Condition2Context _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			condition3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition2);
					setState(370);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(371);
					logi_op();
					setState(372);
					condition3(0);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Condition3Context extends ParserRuleContext {
		public Condition4Context condition4() {
			return getRuleContext(Condition4Context.class,0);
		}
		public Condition3Context condition3() {
			return getRuleContext(Condition3Context.class,0);
		}
		public Equal_opContext equal_op() {
			return getRuleContext(Equal_opContext.class,0);
		}
		public Condition3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCondition3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition3Context condition3() throws RecognitionException {
		return condition3(0);
	}

	private Condition3Context condition3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Condition3Context _localctx = new Condition3Context(_ctx, _parentState);
		Condition3Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(380);
			condition4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition3);
					setState(382);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(383);
					equal_op();
					setState(384);
					condition4(0);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Condition4Context extends ParserRuleContext {
		public Gen_comparisonContext gen_comparison() {
			return getRuleContext(Gen_comparisonContext.class,0);
		}
		public Condition4Context condition4() {
			return getRuleContext(Condition4Context.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Condition4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCondition4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition4Context condition4() throws RecognitionException {
		return condition4(0);
	}

	private Condition4Context condition4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Condition4Context _localctx = new Condition4Context(_ctx, _parentState);
		Condition4Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(392);
			gen_comparison();
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition4);
					setState(394);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(395);
					rel_op();
					setState(396);
					gen_comparison();
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Gen_comparisonContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public Gen_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGen_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_comparisonContext gen_comparison() throws RecognitionException {
		Gen_comparisonContext _localctx = new Gen_comparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gen_comparison);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				not();
				setState(405);
				match(OPEN_SQUARE_BRACKET);
				setState(406);
				condition(0);
				setState(407);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(OPEN_SQUARE_BRACKET);
				setState(410);
				condition(0);
				setState(411);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				var_iden();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Less_thanContext less_than() {
			return getRuleContext(Less_thanContext.class,0);
		}
		public Greater_thanContext greater_than() {
			return getRuleContext(Greater_thanContext.class,0);
		}
		public Greater_than_or_equal_toContext greater_than_or_equal_to() {
			return getRuleContext(Greater_than_or_equal_toContext.class,0);
		}
		public Less_than_or_equal_toContext less_than_or_equal_to() {
			return getRuleContext(Less_than_or_equal_toContext.class,0);
		}
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rel_op);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case ARRAY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				less_than();
				}
				break;
			case ARRAY_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				greater_than();
				}
				break;
			case GREATER_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				greater_than_or_equal_to();
				}
				break;
			case LESS_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				less_than_or_equal_to();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_opContext extends ParserRuleContext {
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public Equal_equalContext equal_equal() {
			return getRuleContext(Equal_equalContext.class,0);
		}
		public Equal_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitEqual_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_opContext equal_op() throws RecognitionException {
		Equal_opContext _localctx = new Equal_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equal_op);
		try {
			setState(424);
			switch (_input.LA(1)) {
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				not_equal();
				}
				break;
			case EQUAL_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				equal_equal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logi_opContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public Logi_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logi_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLogi_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logi_opContext logi_op() throws RecognitionException {
		Logi_opContext _localctx = new Logi_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logi_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			and();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logi_op2Context extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public Logi_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logi_op2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLogi_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logi_op2Context logi_op2() throws RecognitionException {
		Logi_op2Context _localctx = new Logi_op2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_logi_op2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Darth_CoderParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Darth_CoderParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL() { return getToken(Darth_CoderParser.NOT_EQUAL, 0); }
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitNot_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(NOT_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_equalContext extends ParserRuleContext {
		public TerminalNode EQUAL_EQUAL() { return getToken(Darth_CoderParser.EQUAL_EQUAL, 0); }
		public Equal_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitEqual_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_equalContext equal_equal() throws RecognitionException {
		Equal_equalContext _localctx = new Equal_equalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equal_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(EQUAL_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_thanContext extends ParserRuleContext {
		public TerminalNode ARRAY_OPEN() { return getToken(Darth_CoderParser.ARRAY_OPEN, 0); }
		public Less_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLess_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_thanContext less_than() throws RecognitionException {
		Less_thanContext _localctx = new Less_thanContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_less_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ARRAY_OPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_thanContext extends ParserRuleContext {
		public TerminalNode ARRAY_CLOSE() { return getToken(Darth_CoderParser.ARRAY_CLOSE, 0); }
		public Greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGreater_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greater_thanContext greater_than() throws RecognitionException {
		Greater_thanContext _localctx = new Greater_thanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ARRAY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_than_or_equal_toContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN_EQUAL_TO() { return getToken(Darth_CoderParser.GREATER_THAN_EQUAL_TO, 0); }
		public Greater_than_or_equal_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than_or_equal_to; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGreater_than_or_equal_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greater_than_or_equal_toContext greater_than_or_equal_to() throws RecognitionException {
		Greater_than_or_equal_toContext _localctx = new Greater_than_or_equal_toContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_greater_than_or_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(GREATER_THAN_EQUAL_TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_than_or_equal_toContext extends ParserRuleContext {
		public TerminalNode LESS_THAN_EQUAL_TO() { return getToken(Darth_CoderParser.LESS_THAN_EQUAL_TO, 0); }
		public Less_than_or_equal_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than_or_equal_to; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLess_than_or_equal_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_than_or_equal_toContext less_than_or_equal_to() throws RecognitionException {
		Less_than_or_equal_toContext _localctx = new Less_than_or_equal_toContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_less_than_or_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LESS_THAN_EQUAL_TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Darth_CoderParser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_decContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Func_idenContext func_iden() {
			return getRuleContext(Func_idenContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Func_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFunc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decContext func_dec() throws RecognitionException {
		Func_decContext _localctx = new Func_decContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_func_dec);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				data_type();
				setState(449);
				func_iden();
				setState(450);
				match(OPEN_SQUARE_BRACKET);
				setState(451);
				parameter();
				setState(452);
				match(CLOSE_SQUARE_BRACKET);
				setState(453);
				match(OPEN_BRACKET);
				setState(454);
				code_block();
				setState(456);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(455);
					return_statement();
					}
				}

				setState(458);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				data_type();
				setState(461);
				func_iden();
				setState(462);
				match(OPEN_SQUARE_BRACKET);
				setState(463);
				match(CLOSE_SQUARE_BRACKET);
				setState(464);
				match(OPEN_BRACKET);
				setState(465);
				code_block();
				setState(467);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(466);
					return_statement();
					}
				}

				setState(469);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				data_type();
				setState(472);
				func_iden();
				setState(473);
				match(OPEN_SQUARE_BRACKET);
				setState(474);
				parameter();
				setState(475);
				match(CLOSE_SQUARE_BRACKET);
				setState(476);
				match(OPEN_BRACKET);
				setState(478);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(477);
					return_statement();
					}
				}

				setState(480);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				data_type();
				setState(483);
				func_iden();
				setState(484);
				match(OPEN_SQUARE_BRACKET);
				setState(485);
				match(CLOSE_SQUARE_BRACKET);
				setState(486);
				match(OPEN_BRACKET);
				setState(488);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(487);
					return_statement();
					}
				}

				setState(490);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Darth_CoderParser.RETURN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_return_statement);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(RETURN);
				setState(495);
				literal();
				setState(496);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(RETURN);
				setState(499);
				var_iden();
				setState(500);
				match(TERMINAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(RETURN);
				setState(503);
				expr(0);
				setState(504);
				match(TERMINAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_idenContext extends ParserRuleContext {
		public TerminalNode FUNC_IDEN() { return getToken(Darth_CoderParser.FUNC_IDEN, 0); }
		public Func_idenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_iden; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFunc_iden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_idenContext func_iden() throws RecognitionException {
		Func_idenContext _localctx = new Func_idenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_func_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(FUNC_IDEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDEN() { return getToken(Darth_CoderParser.VAR_IDEN, 0); }
		public TerminalNode COMMA() { return getToken(Darth_CoderParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameter);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				data_type();
				setState(511);
				match(VAR_IDEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				data_type();
				setState(514);
				match(VAR_IDEN);
				setState(515);
				match(COMMA);
				setState(516);
				parameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST_DEC() { return getToken(Darth_CoderParser.CONST_DEC, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(CONST_DEC);
			setState(521);
			data_type();
			setState(522);
			statement();
			setState(523);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public TerminalNode SIDE() { return getToken(Darth_CoderParser.SIDE, 0); }
		public Boolean_statementContext boolean_statement() {
			return getRuleContext(Boolean_statementContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_var_dec);
		try {
			setState(533);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
			case IMPERIAL_CREDIT:
			case UNIT:
			case LEGION:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				data_type();
				setState(526);
				statement();
				setState(527);
				match(TERMINAL);
				}
				break;
			case SIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(SIDE);
				setState(530);
				boolean_statement();
				setState(531);
				match(TERMINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_statementContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public Boolean_assignmentContext boolean_assignment() {
			return getRuleContext(Boolean_assignmentContext.class,0);
		}
		public Boolean_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitBoolean_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_statementContext boolean_statement() throws RecognitionException {
		Boolean_statementContext _localctx = new Boolean_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolean_statement);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				boolean_assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_assignmentContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public TerminalNode LIGHT_SIDE() { return getToken(Darth_CoderParser.LIGHT_SIDE, 0); }
		public TerminalNode DARK_SIDE() { return getToken(Darth_CoderParser.DARK_SIDE, 0); }
		public Boolean_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitBoolean_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_assignmentContext boolean_assignment() throws RecognitionException {
		Boolean_assignmentContext _localctx = new Boolean_assignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_boolean_assignment);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				var_iden();
				setState(540);
				match(EQUAL);
				setState(541);
				match(LIGHT_SIDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				var_iden();
				setState(544);
				match(EQUAL);
				setState(545);
				match(DARK_SIDE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public Reg_assignmentContext reg_assignment() {
			return getRuleContext(Reg_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				reg_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				array_assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_assignmentContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			var_iden();
			setState(555);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reg_assignmentContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Reg_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitReg_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_assignmentContext reg_assignment() throws RecognitionException {
		Reg_assignmentContext _localctx = new Reg_assignmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_reg_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			var_iden();
			setState(558);
			match(EQUAL);
			setState(559);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_idenContext extends ParserRuleContext {
		public TerminalNode VAR_IDEN() { return getToken(Darth_CoderParser.VAR_IDEN, 0); }
		public Var_idenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_iden; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVar_iden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idenContext var_iden() throws RecognitionException {
		Var_idenContext _localctx = new Var_idenContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_var_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(VAR_IDEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode INCREMENT_OPERATOR() { return getToken(Darth_CoderParser.INCREMENT_OPERATOR, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public TerminalNode DECREMENT_OPERATOR() { return getToken(Darth_CoderParser.DECREMENT_OPERATOR, 0); }
		public IncrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitIncr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrContext incr() throws RecognitionException {
		IncrContext _localctx = new IncrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_incr);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				var_iden();
				setState(564);
				match(INCREMENT_OPERATOR);
				setState(565);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				var_iden();
				setState(568);
				match(DECREMENT_OPERATOR);
				setState(569);
				match(TERMINAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(576);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(577);
					add_sub();
					setState(578);
					expr2(0);
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public Gen_varContext gen_var() {
			return getRuleContext(Gen_varContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586);
			gen_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(588);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(589);
					mul_div();
					setState(590);
					gen_var();
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Gen_varContext extends ParserRuleContext {
		public Uni_opContext uni_op() {
			return getRuleContext(Uni_opContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Gen_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGen_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_varContext gen_var() throws RecognitionException {
		Gen_varContext _localctx = new Gen_varContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_gen_var);
		try {
			setState(601);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				uni_op();
				setState(598);
				var();
				}
				break;
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case FUNC_IDEN:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_var);
		try {
			setState(609);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				literal();
				}
				break;
			case FUNC_IDEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				func_call();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				match(OPEN_SQUARE_BRACKET);
				setState(606);
				expr(0);
				setState(607);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_subContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Darth_CoderParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Darth_CoderParser.MINUS, 0); }
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitAdd_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_divContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(Darth_CoderParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(Darth_CoderParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Darth_CoderParser.MOD, 0); }
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitMul_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uni_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Darth_CoderParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(Darth_CoderParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Darth_CoderParser.MINUS, 0); }
		public Uni_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uni_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitUni_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Uni_opContext uni_op() throws RecognitionException {
		Uni_opContext _localctx = new Uni_opContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_uni_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array1Context extends ArrayContext {
		public Array_openContext array_open() {
			return getRuleContext(Array_openContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Array_closeContext array_close() {
			return getRuleContext(Array_closeContext.class,0);
		}
		public Array1Context(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array2Context extends ArrayContext {
		public Array_openContext array_open() {
			return getRuleContext(Array_openContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Array_closeContext array_close() {
			return getRuleContext(Array_closeContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(Darth_CoderParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Array2Context(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_array);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new Array1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				array_open();
				setState(618);
				index();
				setState(619);
				array_close();
				}
				break;
			case 2:
				_localctx = new Array2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				array_open();
				setState(622);
				index();
				setState(623);
				array_close();
				setState(624);
				equal();
				setState(625);
				match(OPEN_BRACKET);
				setState(627);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(626);
					value();
					}
				}

				setState(629);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_openContext extends ParserRuleContext {
		public TerminalNode ARRAY_OPEN() { return getToken(Darth_CoderParser.ARRAY_OPEN, 0); }
		public Array_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_open; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_openContext array_open() throws RecognitionException {
		Array_openContext _localctx = new Array_openContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_array_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(ARRAY_OPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_closeContext extends ParserRuleContext {
		public TerminalNode ARRAY_CLOSE() { return getToken(Darth_CoderParser.ARRAY_CLOSE, 0); }
		public Array_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_close; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_closeContext array_close() throws RecognitionException {
		Array_closeContext _localctx = new Array_closeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_array_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(ARRAY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(Darth_CoderParser.INT_LITERAL, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(INT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleLiteralContext extends ValueContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SingleLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitSingleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreLiteralsContext extends ValueContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Darth_CoderParser.COMMA, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode WS() { return getToken(Darth_CoderParser.WS, 0); }
		public MoreLiteralsContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitMoreLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_value);
		int _la;
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new SingleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				literal();
				}
				break;
			case 2:
				_localctx = new MoreLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				literal();
				setState(643);
				match(COMMA);
				setState(645);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(644);
					match(WS);
					}
				}

				setState(647);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Galactic_creditContext galactic_credit() {
			return getRuleContext(Galactic_creditContext.class,0);
		}
		public Imperial_creditContext imperial_credit() {
			return getRuleContext(Imperial_creditContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public LegionContext legion() {
			return getRuleContext(LegionContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_data_type);
		try {
			setState(655);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				galactic_credit();
				}
				break;
			case IMPERIAL_CREDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				imperial_credit();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				unit();
				}
				break;
			case LEGION:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				legion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Galactic_creditContext extends ParserRuleContext {
		public TerminalNode GALACTIC_CREDIT() { return getToken(Darth_CoderParser.GALACTIC_CREDIT, 0); }
		public Galactic_creditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_galactic_credit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGalactic_credit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Galactic_creditContext galactic_credit() throws RecognitionException {
		Galactic_creditContext _localctx = new Galactic_creditContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(GALACTIC_CREDIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imperial_creditContext extends ParserRuleContext {
		public TerminalNode IMPERIAL_CREDIT() { return getToken(Darth_CoderParser.IMPERIAL_CREDIT, 0); }
		public Imperial_creditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperial_credit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitImperial_credit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imperial_creditContext imperial_credit() throws RecognitionException {
		Imperial_creditContext _localctx = new Imperial_creditContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(IMPERIAL_CREDIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(Darth_CoderParser.UNIT, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegionContext extends ParserRuleContext {
		public TerminalNode LEGION() { return getToken(Darth_CoderParser.LEGION, 0); }
		public LegionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLegion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegionContext legion() throws RecognitionException {
		LegionContext _localctx = new LegionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LEGION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrngLiteralContext extends LiteralContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public StrngLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitStrngLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends LiteralContext {
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public CharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends LiteralContext {
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_literal);
		try {
			setState(669);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StrngLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				string_literal();
				}
				break;
			case CHARACTER_LITERAL:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				character_literal();
				}
				break;
			case INT_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				int_literal();
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				float_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(Darth_CoderParser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_literalContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(Darth_CoderParser.CHARACTER_LITERAL, 0); }
		public Character_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitCharacter_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_literalContext character_literal() throws RecognitionException {
		Character_literalContext _localctx = new Character_literalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_character_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(CHARACTER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(Darth_CoderParser.INT_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(INT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(Darth_CoderParser.FLOAT_LITERAL, 0); }
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFloat_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 14:
			return condition2_sempred((Condition2Context)_localctx, predIndex);
		case 15:
			return condition3_sempred((Condition3Context)_localctx, predIndex);
		case 16:
			return condition4_sempred((Condition4Context)_localctx, predIndex);
		case 44:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 45:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition2_sempred(Condition2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition3_sempred(Condition3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition4_sempred(Condition4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u02aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00b5\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\t\u00d4\n\t\3\t\5\t\u00d7\n\t\3\t\5\t\u00da\n\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u012d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0138\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u015f\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u016d\n\17\f\17\16"+
		"\17\u0170\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0179\n\20\f\20"+
		"\16\20\u017c\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0185\n\21"+
		"\f\21\16\21\u0188\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0191"+
		"\n\22\f\22\16\22\u0194\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u01a1\n\23\3\24\3\24\3\24\3\24\5\24\u01a7\n\24\3\25"+
		"\3\25\5\25\u01ab\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u01cb\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01d6\n!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u01e1\n!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01eb\n!\3"+
		"!\3!\5!\u01ef\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01fd"+
		"\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0209\n$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u0218\n&\3\'\3\'\5\'\u021c\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0226\n(\3)\3)\3)\5)\u022b\n)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u023e\n-\3.\3.\3.\3.\3.\3.\3.\7.\u0247\n.\f.\16"+
		".\u024a\13.\3/\3/\3/\3/\3/\3/\3/\7/\u0253\n/\f/\16/\u0256\13/\3\60\3\60"+
		"\3\60\3\60\5\60\u025c\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0264\n"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u0276\n\65\3\65\3\65\5\65\u027a\n\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3:\3:\5:\u0288\n:\3:\3:\5:\u028c\n:\3;\3;\3;\3"+
		";\5;\u0292\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u02a0\n@\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3D\2\b\34\36 \"Z\\E\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\2\5\3\2\7\b\3\2\t\13\4\2\7\b\17\17\u02ab\2\u0088\3"+
		"\2\2\2\4\u00b4\3\2\2\2\6\u00b6\3\2\2\2\b\u00b8\3\2\2\2\n\u00be\3\2\2\2"+
		"\f\u00c4\3\2\2\2\16\u00ca\3\2\2\2\20\u00d0\3\2\2\2\22\u012c\3\2\2\2\24"+
		"\u0137\3\2\2\2\26\u014a\3\2\2\2\30\u015e\3\2\2\2\32\u0160\3\2\2\2\34\u0165"+
		"\3\2\2\2\36\u0171\3\2\2\2 \u017d\3\2\2\2\"\u0189\3\2\2\2$\u01a0\3\2\2"+
		"\2&\u01a6\3\2\2\2(\u01aa\3\2\2\2*\u01ac\3\2\2\2,\u01ae\3\2\2\2.\u01b0"+
		"\3\2\2\2\60\u01b2\3\2\2\2\62\u01b4\3\2\2\2\64\u01b6\3\2\2\2\66\u01b8\3"+
		"\2\2\28\u01ba\3\2\2\2:\u01bc\3\2\2\2<\u01be\3\2\2\2>\u01c0\3\2\2\2@\u01ee"+
		"\3\2\2\2B\u01fc\3\2\2\2D\u01fe\3\2\2\2F\u0208\3\2\2\2H\u020a\3\2\2\2J"+
		"\u0217\3\2\2\2L\u021b\3\2\2\2N\u0225\3\2\2\2P\u022a\3\2\2\2R\u022c\3\2"+
		"\2\2T\u022f\3\2\2\2V\u0233\3\2\2\2X\u023d\3\2\2\2Z\u023f\3\2\2\2\\\u024b"+
		"\3\2\2\2^\u025b\3\2\2\2`\u0263\3\2\2\2b\u0265\3\2\2\2d\u0267\3\2\2\2f"+
		"\u0269\3\2\2\2h\u0279\3\2\2\2j\u027b\3\2\2\2l\u027d\3\2\2\2n\u027f\3\2"+
		"\2\2p\u0281\3\2\2\2r\u028b\3\2\2\2t\u0291\3\2\2\2v\u0293\3\2\2\2x\u0295"+
		"\3\2\2\2z\u0297\3\2\2\2|\u0299\3\2\2\2~\u029f\3\2\2\2\u0080\u02a1\3\2"+
		"\2\2\u0082\u02a3\3\2\2\2\u0084\u02a5\3\2\2\2\u0086\u02a7\3\2\2\2\u0088"+
		"\u0089\7:\2\2\u0089\u008a\7,\2\2\u008a\u008b\5\4\3\2\u008b\u008c\7-\2"+
		"\2\u008c\3\3\2\2\2\u008d\u008e\5J&\2\u008e\u008f\5\4\3\2\u008f\u00b5\3"+
		"\2\2\2\u0090\u0091\5T+\2\u0091\u0092\7\30\2\2\u0092\u0093\5\4\3\2\u0093"+
		"\u00b5\3\2\2\2\u0094\u0095\5R*\2\u0095\u0096\7\30\2\2\u0096\u0097\5\4"+
		"\3\2\u0097\u00b5\3\2\2\2\u0098\u0099\5\26\f\2\u0099\u009a\5\4\3\2\u009a"+
		"\u00b5\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\5\4\3\2\u009d\u00b5\3"+
		"\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\5\4\3\2\u00a0\u00b5\3\2\2\2\u00a1"+
		"\u00a2\5X-\2\u00a2\u00a3\5\4\3\2\u00a3\u00b5\3\2\2\2\u00a4\u00a5\5\b\5"+
		"\2\u00a5\u00a6\5\4\3\2\u00a6\u00b5\3\2\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9"+
		"\5\4\3\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\5\4\3\2\u00ac"+
		"\u00b5\3\2\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\5\4\3\2\u00af\u00b5\3"+
		"\2\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\5\4\3\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b5\5\6\4\2\u00b4\u008d\3\2\2\2\u00b4\u0090\3\2\2\2\u00b4\u0094\3\2"+
		"\2\2\u00b4\u0098\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4"+
		"\u00a1\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00aa\3\2"+
		"\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\7\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9"+
		"\u00ba\7.\2\2\u00ba\u00bb\5Z.\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\7\30\2"+
		"\2\u00bd\t\3\2\2\2\u00be\u00bf\7;\2\2\u00bf\u00c0\7.\2\2\u00c0\u00c1\5"+
		"Z.\2\u00c1\u00c2\7/\2\2\u00c2\u00c3\7\30\2\2\u00c3\13\3\2\2\2\u00c4\u00c5"+
		"\7=\2\2\u00c5\u00c6\7.\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\7/\2\2\u00c8"+
		"\u00c9\7\30\2\2\u00c9\r\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7.\2\2"+
		"\u00cc\u00cd\7\27\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\7\30\2\2\u00cf\17"+
		"\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d3\7.\2\2\u00d2\u00d4\5Z.\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\7\26"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00da\7\27\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7\30\2\2\u00dd\21\3\2\2\2\u00de"+
		"\u00df\7\'\2\2\u00df\u00e0\7.\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\7"+
		"/\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7-\2\2\u00e5"+
		"\u012d\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7\u00e8\7.\2\2\u00e8\u00e9\7/\2"+
		"\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7-\2\2\u00ec\u012d"+
		"\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00ef\7.\2\2\u00ef\u00f0\7/\2\2\u00f0"+
		"\u00f1\7,\2\2\u00f1\u012d\7-\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7,\2\2"+
		"\u00f4\u00f5\5\4\3\2\u00f5\u00f6\7-\2\2\u00f6\u00f7\7\'\2\2\u00f7\u00f8"+
		"\7.\2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7\30\2\2"+
		"\u00fb\u012d\3\2\2\2\u00fc\u00fd\7&\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff"+
		"\5\4\3\2\u00ff\u0100\7-\2\2\u0100\u0101\7\'\2\2\u0101\u0102\7.\2\2\u0102"+
		"\u0103\7/\2\2\u0103\u0104\7\30\2\2\u0104\u012d\3\2\2\2\u0105\u0106\7&"+
		"\2\2\u0106\u0107\7,\2\2\u0107\u0108\7-\2\2\u0108\u0109\7\'\2\2\u0109\u010a"+
		"\7.\2\2\u010a\u010b\5\34\17\2\u010b\u010c\7/\2\2\u010c\u010d\7\30\2\2"+
		"\u010d\u012d\3\2\2\2\u010e\u010f\7&\2\2\u010f\u0110\7,\2\2\u0110\u0111"+
		"\7-\2\2\u0111\u0112\7\'\2\2\u0112\u0113\7.\2\2\u0113\u0114\7/\2\2\u0114"+
		"\u012d\7\30\2\2\u0115\u0116\7%\2\2\u0116\u0117\7.\2\2\u0117\u0118\5T+"+
		"\2\u0118\u0119\7\30\2\2\u0119\u011a\5\34\17\2\u011a\u011b\7\30\2\2\u011b"+
		"\u011c\5X-\2\u011c\u011d\7/\2\2\u011d\u011e\7,\2\2\u011e\u011f\5\4\3\2"+
		"\u011f\u0120\7-\2\2\u0120\u012d\3\2\2\2\u0121\u0122\7%\2\2\u0122\u0123"+
		"\7.\2\2\u0123\u0124\5T+\2\u0124\u0125\7\30\2\2\u0125\u0126\5\34\17\2\u0126"+
		"\u0127\7\30\2\2\u0127\u0128\5X-\2\u0128\u0129\7/\2\2\u0129\u012a\7,\2"+
		"\2\u012a\u012b\7-\2\2\u012b\u012d\3\2\2\2\u012c\u00de\3\2\2\2\u012c\u00e6"+
		"\3\2\2\2\u012c\u00ed\3\2\2\2\u012c\u00f2\3\2\2\2\u012c\u00fc\3\2\2\2\u012c"+
		"\u0105\3\2\2\2\u012c\u010e\3\2\2\2\u012c\u0115\3\2\2\2\u012c\u0121\3\2"+
		"\2\2\u012d\23\3\2\2\2\u012e\u012f\5D#\2\u012f\u0130\7.\2\2\u0130\u0131"+
		"\5r:\2\u0131\u0132\7/\2\2\u0132\u0138\3\2\2\2\u0133\u0134\5D#\2\u0134"+
		"\u0135\7.\2\2\u0135\u0136\7/\2\2\u0136\u0138\3\2\2\2\u0137\u012e\3\2\2"+
		"\2\u0137\u0133\3\2\2\2\u0138\25\3\2\2\2\u0139\u013a\7\"\2\2\u013a\u013b"+
		"\7.\2\2\u013b\u013c\5\34\17\2\u013c\u013d\7/\2\2\u013d\u013e\7,\2\2\u013e"+
		"\u013f\5\4\3\2\u013f\u0140\7-\2\2\u0140\u014b\3\2\2\2\u0141\u0142\7\""+
		"\2\2\u0142\u0143\7.\2\2\u0143\u0144\5\34\17\2\u0144\u0145\7/\2\2\u0145"+
		"\u0146\7,\2\2\u0146\u0147\5\4\3\2\u0147\u0148\7-\2\2\u0148\u0149\5\30"+
		"\r\2\u0149\u014b\3\2\2\2\u014a\u0139\3\2\2\2\u014a\u0141\3\2\2\2\u014b"+
		"\27\3\2\2\2\u014c\u014d\7#\2\2\u014d\u014e\7.\2\2\u014e\u014f\5\34\17"+
		"\2\u014f\u0150\7/\2\2\u0150\u0151\7,\2\2\u0151\u0152\5\4\3\2\u0152\u0153"+
		"\7-\2\2\u0153\u0154\5\30\r\2\u0154\u015f\3\2\2\2\u0155\u0156\7#\2\2\u0156"+
		"\u0157\7.\2\2\u0157\u0158\5\34\17\2\u0158\u0159\7/\2\2\u0159\u015a\7,"+
		"\2\2\u015a\u015b\5\4\3\2\u015b\u015c\7-\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015f\5\32\16\2\u015e\u014c\3\2\2\2\u015e\u0155\3\2\2\2\u015e\u015d\3"+
		"\2\2\2\u015f\31\3\2\2\2\u0160\u0161\7$\2\2\u0161\u0162\7,\2\2\u0162\u0163"+
		"\5\4\3\2\u0163\u0164\7-\2\2\u0164\33\3\2\2\2\u0165\u0166\b\17\1\2\u0166"+
		"\u0167\5\36\20\2\u0167\u016e\3\2\2\2\u0168\u0169\f\4\2\2\u0169\u016a\5"+
		",\27\2\u016a\u016b\5\36\20\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\35\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0171\u0172\b\20\1\2\u0172\u0173\5 \21\2\u0173"+
		"\u017a\3\2\2\2\u0174\u0175\f\4\2\2\u0175\u0176\5*\26\2\u0176\u0177\5 "+
		"\21\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\37\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017e\b\21\1\2\u017e\u017f\5\"\22\2\u017f\u0186\3\2\2\2\u0180"+
		"\u0181\f\4\2\2\u0181\u0182\5(\25\2\u0182\u0183\5\"\22\2\u0183\u0185\3"+
		"\2\2\2\u0184\u0180\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187!\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\b\22\1\2"+
		"\u018a\u018b\5$\23\2\u018b\u0192\3\2\2\2\u018c\u018d\f\4\2\2\u018d\u018e"+
		"\5&\24\2\u018e\u018f\5$\23\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193#\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0195\u01a1\5Z.\2\u0196\u0197\5> \2\u0197\u0198\7"+
		".\2\2\u0198\u0199\5\34\17\2\u0199\u019a\7/\2\2\u019a\u01a1\3\2\2\2\u019b"+
		"\u019c\7.\2\2\u019c\u019d\5\34\17\2\u019d\u019e\7/\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u01a1\5V,\2\u01a0\u0195\3\2\2\2\u01a0\u0196\3\2\2\2\u01a0\u019b"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1%\3\2\2\2\u01a2\u01a7\5\66\34\2\u01a3"+
		"\u01a7\58\35\2\u01a4\u01a7\5:\36\2\u01a5\u01a7\5<\37\2\u01a6\u01a2\3\2"+
		"\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\'\3\2\2\2\u01a8\u01ab\5\62\32\2\u01a9\u01ab\5\64\33\2\u01aa\u01a8\3\2"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01ab)\3\2\2\2\u01ac\u01ad\5\60\31\2\u01ad+\3"+
		"\2\2\2\u01ae\u01af\5.\30\2\u01af-\3\2\2\2\u01b0\u01b1\78\2\2\u01b1/\3"+
		"\2\2\2\u01b2\u01b3\7\67\2\2\u01b3\61\3\2\2\2\u01b4\u01b5\7\65\2\2\u01b5"+
		"\63\3\2\2\2\u01b6\u01b7\7\66\2\2\u01b7\65\3\2\2\2\u01b8\u01b9\7*\2\2\u01b9"+
		"\67\3\2\2\2\u01ba\u01bb\7+\2\2\u01bb9\3\2\2\2\u01bc\u01bd\7\64\2\2\u01bd"+
		";\3\2\2\2\u01be\u01bf\7\63\2\2\u01bf=\3\2\2\2\u01c0\u01c1\7\17\2\2\u01c1"+
		"?\3\2\2\2\u01c2\u01c3\5t;\2\u01c3\u01c4\5D#\2\u01c4\u01c5\7.\2\2\u01c5"+
		"\u01c6\5F$\2\u01c6\u01c7\7/\2\2\u01c7\u01c8\7,\2\2\u01c8\u01ca\5\4\3\2"+
		"\u01c9\u01cb\5B\"\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\7-\2\2\u01cd\u01ef\3\2\2\2\u01ce\u01cf\5t;\2\u01cf"+
		"\u01d0\5D#\2\u01d0\u01d1\7.\2\2\u01d1\u01d2\7/\2\2\u01d2\u01d3\7,\2\2"+
		"\u01d3\u01d5\5\4\3\2\u01d4\u01d6\5B\"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7-\2\2\u01d8\u01ef\3\2\2\2\u01d9"+
		"\u01da\5t;\2\u01da\u01db\5D#\2\u01db\u01dc\7.\2\2\u01dc\u01dd\5F$\2\u01dd"+
		"\u01de\7/\2\2\u01de\u01e0\7,\2\2\u01df\u01e1\5B\"\2\u01e0\u01df\3\2\2"+
		"\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7-\2\2\u01e3\u01ef"+
		"\3\2\2\2\u01e4\u01e5\5t;\2\u01e5\u01e6\5D#\2\u01e6\u01e7\7.\2\2\u01e7"+
		"\u01e8\7/\2\2\u01e8\u01ea\7,\2\2\u01e9\u01eb\5B\"\2\u01ea\u01e9\3\2\2"+
		"\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7-\2\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01c2\3\2\2\2\u01ee\u01ce\3\2\2\2\u01ee\u01d9\3\2\2\2\u01ee"+
		"\u01e4\3\2\2\2\u01efA\3\2\2\2\u01f0\u01f1\7)\2\2\u01f1\u01f2\5~@\2\u01f2"+
		"\u01f3\7\30\2\2\u01f3\u01fd\3\2\2\2\u01f4\u01f5\7)\2\2\u01f5\u01f6\5V"+
		",\2\u01f6\u01f7\7\30\2\2\u01f7\u01fd\3\2\2\2\u01f8\u01f9\7)\2\2\u01f9"+
		"\u01fa\5Z.\2\u01fa\u01fb\7\30\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f0\3\2"+
		"\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fdC\3\2\2\2\u01fe\u01ff"+
		"\7\25\2\2\u01ffE\3\2\2\2\u0200\u0201\5t;\2\u0201\u0202\7\24\2\2\u0202"+
		"\u0209\3\2\2\2\u0203\u0204\5t;\2\u0204\u0205\7\24\2\2\u0205\u0206\7\60"+
		"\2\2\u0206\u0207\5F$\2\u0207\u0209\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0203"+
		"\3\2\2\2\u0209G\3\2\2\2\u020a\u020b\7 \2\2\u020b\u020c\5t;\2\u020c\u020d"+
		"\5P)\2\u020d\u020e\7\30\2\2\u020eI\3\2\2\2\u020f\u0210\5t;\2\u0210\u0211"+
		"\5P)\2\u0211\u0212\7\30\2\2\u0212\u0218\3\2\2\2\u0213\u0214\7\35\2\2\u0214"+
		"\u0215\5L\'\2\u0215\u0216\7\30\2\2\u0216\u0218\3\2\2\2\u0217\u020f\3\2"+
		"\2\2\u0217\u0213\3\2\2\2\u0218K\3\2\2\2\u0219\u021c\5V,\2\u021a\u021c"+
		"\5N(\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021cM\3\2\2\2\u021d\u021e"+
		"\5V,\2\u021e\u021f\7\16\2\2\u021f\u0220\7\36\2\2\u0220\u0226\3\2\2\2\u0221"+
		"\u0222\5V,\2\u0222\u0223\7\16\2\2\u0223\u0224\7\37\2\2\u0224\u0226\3\2"+
		"\2\2\u0225\u021d\3\2\2\2\u0225\u0221\3\2\2\2\u0226O\3\2\2\2\u0227\u022b"+
		"\5V,\2\u0228\u022b\5T+\2\u0229\u022b\5R*\2\u022a\u0227\3\2\2\2\u022a\u0228"+
		"\3\2\2\2\u022a\u0229\3\2\2\2\u022bQ\3\2\2\2\u022c\u022d\5V,\2\u022d\u022e"+
		"\5h\65\2\u022eS\3\2\2\2\u022f\u0230\5V,\2\u0230\u0231\7\16\2\2\u0231\u0232"+
		"\5Z.\2\u0232U\3\2\2\2\u0233\u0234\7\24\2\2\u0234W\3\2\2\2\u0235\u0236"+
		"\5V,\2\u0236\u0237\7\22\2\2\u0237\u0238\7\30\2\2\u0238\u023e\3\2\2\2\u0239"+
		"\u023a\5V,\2\u023a\u023b\7\23\2\2\u023b\u023c\7\30\2\2\u023c\u023e\3\2"+
		"\2\2\u023d\u0235\3\2\2\2\u023d\u0239\3\2\2\2\u023eY\3\2\2\2\u023f\u0240"+
		"\b.\1\2\u0240\u0241\5\\/\2\u0241\u0248\3\2\2\2\u0242\u0243\f\4\2\2\u0243"+
		"\u0244\5b\62\2\u0244\u0245\5\\/\2\u0245\u0247\3\2\2\2\u0246\u0242\3\2"+
		"\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"[\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\b/\1\2\u024c\u024d\5^\60\2\u024d"+
		"\u0254\3\2\2\2\u024e\u024f\f\4\2\2\u024f\u0250\5d\63\2\u0250\u0251\5^"+
		"\60\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255]\3\2\2\2\u0256\u0254\3\2\2\2"+
		"\u0257\u0258\5f\64\2\u0258\u0259\5`\61\2\u0259\u025c\3\2\2\2\u025a\u025c"+
		"\5`\61\2\u025b\u0257\3\2\2\2\u025b\u025a\3\2\2\2\u025c_\3\2\2\2\u025d"+
		"\u0264\5~@\2\u025e\u0264\5\24\13\2\u025f\u0260\7.\2\2\u0260\u0261\5Z."+
		"\2\u0261\u0262\7/\2\2\u0262\u0264\3\2\2\2\u0263\u025d\3\2\2\2\u0263\u025e"+
		"\3\2\2\2\u0263\u025f\3\2\2\2\u0264a\3\2\2\2\u0265\u0266\t\2\2\2\u0266"+
		"c\3\2\2\2\u0267\u0268\t\3\2\2\u0268e\3\2\2\2\u0269\u026a\t\4\2\2\u026a"+
		"g\3\2\2\2\u026b\u026c\5j\66\2\u026c\u026d\5p9\2\u026d\u026e\5l\67\2\u026e"+
		"\u027a\3\2\2\2\u026f\u0270\5j\66\2\u0270\u0271\5p9\2\u0271\u0272\5l\67"+
		"\2\u0272\u0273\5n8\2\u0273\u0275\7,\2\2\u0274\u0276\5r:\2\u0275\u0274"+
		"\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7-\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u026b\3\2\2\2\u0279\u026f\3\2\2\2\u027ai\3\2\2\2"+
		"\u027b\u027c\7*\2\2\u027ck\3\2\2\2\u027d\u027e\7+\2\2\u027em\3\2\2\2\u027f"+
		"\u0280\7\16\2\2\u0280o\3\2\2\2\u0281\u0282\7\3\2\2\u0282q\3\2\2\2\u0283"+
		"\u028c\5~@\2\u0284\u0285\5~@\2\u0285\u0287\7\60\2\2\u0286\u0288\7\6\2"+
		"\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a"+
		"\5r:\2\u028a\u028c\3\2\2\2\u028b\u0283\3\2\2\2\u028b\u0284\3\2\2\2\u028c"+
		"s\3\2\2\2\u028d\u0292\5v<\2\u028e\u0292\5x=\2\u028f\u0292\5z>\2\u0290"+
		"\u0292\5|?\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2"+
		"\2\u0291\u0290\3\2\2\2\u0292u\3\2\2\2\u0293\u0294\7\31\2\2\u0294w\3\2"+
		"\2\2\u0295\u0296\7\32\2\2\u0296y\3\2\2\2\u0297\u0298\7\33\2\2\u0298{\3"+
		"\2\2\2\u0299\u029a\7\34\2\2\u029a}\3\2\2\2\u029b\u02a0\5\u0080A\2\u029c"+
		"\u02a0\5\u0082B\2\u029d\u02a0\5\u0084C\2\u029e\u02a0\5\u0086D\2\u029f"+
		"\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2"+
		"\2\2\u02a0\177\3\2\2\2\u02a1\u02a2\7\27\2\2\u02a2\u0081\3\2\2\2\u02a3"+
		"\u02a4\7\26\2\2\u02a4\u0083\3\2\2\2\u02a5\u02a6\7\3\2\2\u02a6\u0085\3"+
		"\2\2\2\u02a7\u02a8\7\4\2\2\u02a8\u0087\3\2\2\2\'\u00b4\u00d3\u00d6\u00d9"+
		"\u012c\u0137\u014a\u015e\u016e\u017a\u0186\u0192\u01a0\u01a6\u01aa\u01ca"+
		"\u01d5\u01e0\u01ea\u01ee\u01fc\u0208\u0217\u021b\u0225\u022a\u023d\u0248"+
		"\u0254\u025b\u0263\u0275\u0279\u0287\u028b\u0291\u029f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		CHARACTER_LITERAL=20, COMMENT_LINE=21, STRING_LITERAL=22, TERMINAL=23, 
		GALACTIC_CREDIT=24, IMPERIAL_CREDIT=25, UNIT=26, LEGION=27, SIDE=28, LIGHT_SIDE=29, 
		DARK_SIDE=30, CONST_DEC=31, VOID=32, IF=33, ELSE_IF=34, ELSE=35, FOR=36, 
		DO=37, WHILE=38, BREAK=39, RETURN=40, ARRAY_OPEN=41, ARRAY_CLOSE=42, OPEN_BRACKET=43, 
		CLOSE_BRACKET=44, OPEN_SQUARE_BRACKET=45, CLOSE_SQUARE_BRACKET=46, COMMA=47, 
		LESS_THAN=48, GREATER_THAN=49, LESS_THAN_EQUAL_TO=50, GREATER_THAN_EQUAL_TO=51, 
		NOT_EQUAL=52, EQUAL_EQUAL=53, AND=54, OR=55, END_TRANSMISSION=56, INITIATE=57, 
		SCAN_INTEGER=58, SCAN_FLOAT=59, SCAN_CHAR=60, SCAN_STRING=61, PRINT=62;
	public static final int
		RULE_start = 0, RULE_code_block = 1, RULE_epsilon = 2, RULE_comment = 3, 
		RULE_scan_imperial_credit = 4, RULE_scan_galactic_credit = 5, RULE_scan_unit = 6, 
		RULE_scan_legion = 7, RULE_print = 8, RULE_iterative_con = 9, RULE_func_call = 10, 
		RULE_if_conditional = 11, RULE_elseIf_conditional = 12, RULE_else_conditional = 13, 
		RULE_condition = 14, RULE_condition2 = 15, RULE_condition3 = 16, RULE_condition4 = 17, 
		RULE_gen_comparison = 18, RULE_rel_op = 19, RULE_equal_op = 20, RULE_logi_op = 21, 
		RULE_logi_op2 = 22, RULE_or = 23, RULE_and = 24, RULE_not_equal = 25, 
		RULE_equal_equal = 26, RULE_less_than = 27, RULE_greater_than = 28, RULE_greater_than_or_equal_to = 29, 
		RULE_less_than_or_equal_to = 30, RULE_not = 31, RULE_func_dec = 32, RULE_return_statement = 33, 
		RULE_func_iden = 34, RULE_parameter = 35, RULE_constant_declaration = 36, 
		RULE_var_dec = 37, RULE_boolean_statement = 38, RULE_boolean_assignment = 39, 
		RULE_statement = 40, RULE_array_assignment = 41, RULE_reg_assignment = 42, 
		RULE_var_iden = 43, RULE_incr = 44, RULE_expr = 45, RULE_expr2 = 46, RULE_gen_var = 47, 
		RULE_var = 48, RULE_add_sub = 49, RULE_mul_div = 50, RULE_uni_op = 51, 
		RULE_array = 52, RULE_array_open = 53, RULE_array_close = 54, RULE_equal = 55, 
		RULE_index = 56, RULE_value = 57, RULE_data_type = 58, RULE_galactic_credit = 59, 
		RULE_imperial_credit = 60, RULE_unit = 61, RULE_legion = 62, RULE_literal = 63, 
		RULE_string_literal = 64, RULE_character_literal = 65, RULE_int_literal = 66, 
		RULE_float_literal = 67;
	public static final String[] ruleNames = {
		"start", "code_block", "epsilon", "comment", "scan_imperial_credit", "scan_galactic_credit", 
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
		null, null, "'.'", "'GalacticCredit'", "'ImperialCredit'", "'Unit'", "'Legion'", 
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
		"COMMENT_LINE", "STRING_LITERAL", "TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", 
		"UNIT", "LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", 
		"IF", "ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", 
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
		public Func_decContext func_dec() {
			return getRuleContext(Func_decContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
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
			setState(144);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
			case IMPERIAL_CREDIT:
			case UNIT:
			case LEGION:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				func_dec();
				setState(137);
				start();
				}
				break;
			case INITIATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(INITIATE);
				setState(140);
				match(OPEN_BRACKET);
				setState(141);
				code_block();
				setState(142);
				match(CLOSE_BRACKET);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				var_dec();
				setState(147);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				reg_assignment();
				setState(150);
				match(TERMINAL);
				setState(151);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				array_assignment();
				setState(154);
				match(TERMINAL);
				setState(155);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				if_conditional();
				setState(158);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				iterative_con();
				setState(161);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				func_call();
				setState(164);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				incr();
				setState(167);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				scan_imperial_credit();
				setState(170);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				scan_galactic_credit();
				setState(173);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(175);
				scan_unit();
				setState(176);
				code_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				scan_legion();
				setState(179);
				code_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(181);
				print();
				setState(182);
				code_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(184);
				comment();
				setState(185);
				code_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT_LINE() { return getToken(Darth_CoderParser.COMMENT_LINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(COMMENT_LINE);
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
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
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
		enterRule(_localctx, 8, RULE_scan_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SCAN_FLOAT);
			setState(195);
			match(OPEN_SQUARE_BRACKET);
			setState(196);
			var_iden();
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

	public static class Scan_galactic_creditContext extends ParserRuleContext {
		public TerminalNode SCAN_INTEGER() { return getToken(Darth_CoderParser.SCAN_INTEGER, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
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
		enterRule(_localctx, 10, RULE_scan_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SCAN_INTEGER);
			setState(201);
			match(OPEN_SQUARE_BRACKET);
			setState(202);
			var_iden();
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

	public static class Scan_unitContext extends ParserRuleContext {
		public TerminalNode SCAN_CHAR() { return getToken(Darth_CoderParser.SCAN_CHAR, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_scan_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(SCAN_CHAR);
			setState(207);
			match(OPEN_SQUARE_BRACKET);
			setState(208);
			var_iden();
			setState(209);
			match(CLOSE_SQUARE_BRACKET);
			setState(210);
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
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_scan_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(SCAN_STRING);
			setState(213);
			match(OPEN_SQUARE_BRACKET);
			setState(214);
			var_iden();
			setState(215);
			match(CLOSE_SQUARE_BRACKET);
			setState(216);
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
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PRINT);
			setState(219);
			match(OPEN_SQUARE_BRACKET);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(220);
				expr(0);
				}
				break;
			}
			setState(224);
			_la = _input.LA(1);
			if (_la==CHARACTER_LITERAL) {
				{
				setState(223);
				match(CHARACTER_LITERAL);
				}
			}

			setState(227);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(226);
				match(STRING_LITERAL);
				}
			}

			setState(230);
			_la = _input.LA(1);
			if (_la==VAR_IDEN) {
				{
				setState(229);
				var_iden();
				}
			}

			setState(233);
			_la = _input.LA(1);
			if (_la==FUNC_IDEN) {
				{
				setState(232);
				func_call();
				}
			}

			setState(235);
			match(CLOSE_SQUARE_BRACKET);
			setState(236);
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
		enterRule(_localctx, 18, RULE_iterative_con);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(WHILE);
				setState(239);
				match(OPEN_SQUARE_BRACKET);
				setState(240);
				condition(0);
				setState(241);
				match(CLOSE_SQUARE_BRACKET);
				setState(242);
				match(OPEN_BRACKET);
				setState(243);
				code_block();
				setState(244);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(WHILE);
				setState(247);
				match(OPEN_SQUARE_BRACKET);
				setState(248);
				match(CLOSE_SQUARE_BRACKET);
				setState(249);
				match(OPEN_BRACKET);
				setState(250);
				code_block();
				setState(251);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(WHILE);
				setState(254);
				match(OPEN_SQUARE_BRACKET);
				setState(255);
				match(CLOSE_SQUARE_BRACKET);
				setState(256);
				match(OPEN_BRACKET);
				setState(257);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(DO);
				setState(259);
				match(OPEN_BRACKET);
				setState(260);
				code_block();
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(DO);
				setState(269);
				match(OPEN_BRACKET);
				setState(270);
				code_block();
				setState(271);
				match(CLOSE_BRACKET);
				setState(272);
				match(WHILE);
				setState(273);
				match(OPEN_SQUARE_BRACKET);
				setState(274);
				match(CLOSE_SQUARE_BRACKET);
				setState(275);
				match(TERMINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(DO);
				setState(278);
				match(OPEN_BRACKET);
				setState(279);
				match(CLOSE_BRACKET);
				setState(280);
				match(WHILE);
				setState(281);
				match(OPEN_SQUARE_BRACKET);
				setState(282);
				condition(0);
				setState(283);
				match(CLOSE_SQUARE_BRACKET);
				setState(284);
				match(TERMINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(DO);
				setState(287);
				match(OPEN_BRACKET);
				setState(288);
				match(CLOSE_BRACKET);
				setState(289);
				match(WHILE);
				setState(290);
				match(OPEN_SQUARE_BRACKET);
				setState(291);
				match(CLOSE_SQUARE_BRACKET);
				setState(292);
				match(TERMINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(FOR);
				setState(294);
				match(OPEN_SQUARE_BRACKET);
				setState(295);
				reg_assignment();
				setState(296);
				match(TERMINAL);
				setState(297);
				condition(0);
				setState(298);
				match(TERMINAL);
				setState(299);
				incr();
				setState(300);
				match(CLOSE_SQUARE_BRACKET);
				setState(301);
				match(OPEN_BRACKET);
				setState(302);
				code_block();
				setState(303);
				match(CLOSE_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				match(FOR);
				setState(306);
				match(OPEN_SQUARE_BRACKET);
				setState(307);
				reg_assignment();
				setState(308);
				match(TERMINAL);
				setState(309);
				condition(0);
				setState(310);
				match(TERMINAL);
				setState(311);
				incr();
				setState(312);
				match(CLOSE_SQUARE_BRACKET);
				setState(313);
				match(OPEN_BRACKET);
				setState(314);
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
		enterRule(_localctx, 20, RULE_func_call);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				func_iden();
				setState(319);
				match(OPEN_SQUARE_BRACKET);
				setState(320);
				value();
				setState(321);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				func_iden();
				setState(324);
				match(OPEN_SQUARE_BRACKET);
				setState(325);
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
		enterRule(_localctx, 22, RULE_if_conditional);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(IF);
				setState(330);
				match(OPEN_SQUARE_BRACKET);
				setState(331);
				condition(0);
				setState(332);
				match(CLOSE_SQUARE_BRACKET);
				setState(333);
				match(OPEN_BRACKET);
				setState(334);
				code_block();
				setState(335);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(IF);
				setState(338);
				match(OPEN_SQUARE_BRACKET);
				setState(339);
				condition(0);
				setState(340);
				match(CLOSE_SQUARE_BRACKET);
				setState(341);
				match(OPEN_BRACKET);
				setState(342);
				code_block();
				setState(343);
				match(CLOSE_BRACKET);
				setState(344);
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
		enterRule(_localctx, 24, RULE_elseIf_conditional);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(ELSE_IF);
				setState(349);
				match(OPEN_SQUARE_BRACKET);
				setState(350);
				condition(0);
				setState(351);
				match(CLOSE_SQUARE_BRACKET);
				setState(352);
				match(OPEN_BRACKET);
				setState(353);
				code_block();
				setState(354);
				match(CLOSE_BRACKET);
				setState(355);
				elseIf_conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(ELSE_IF);
				setState(358);
				match(OPEN_SQUARE_BRACKET);
				setState(359);
				condition(0);
				setState(360);
				match(CLOSE_SQUARE_BRACKET);
				setState(361);
				match(OPEN_BRACKET);
				setState(362);
				code_block();
				setState(363);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
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
		enterRule(_localctx, 26, RULE_else_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ELSE);
			setState(369);
			match(OPEN_BRACKET);
			setState(370);
			code_block();
			setState(371);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			condition2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(376);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(377);
					logi_op2();
					setState(378);
					condition2(0);
					}
					} 
				}
				setState(384);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			condition3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition2);
					setState(388);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(389);
					logi_op();
					setState(390);
					condition3(0);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			condition4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition3);
					setState(400);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(401);
					equal_op();
					setState(402);
					condition4(0);
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(410);
			gen_comparison();
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition4);
					setState(412);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(413);
					rel_op();
					setState(414);
					gen_comparison();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 36, RULE_gen_comparison);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				not();
				setState(423);
				match(OPEN_SQUARE_BRACKET);
				setState(424);
				condition(0);
				setState(425);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(OPEN_SQUARE_BRACKET);
				setState(428);
				condition(0);
				setState(429);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
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
		enterRule(_localctx, 38, RULE_rel_op);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case ARRAY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				less_than();
				}
				break;
			case ARRAY_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				greater_than();
				}
				break;
			case GREATER_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				greater_than_or_equal_to();
				}
				break;
			case LESS_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
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
		enterRule(_localctx, 40, RULE_equal_op);
		try {
			setState(442);
			switch (_input.LA(1)) {
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				not_equal();
				}
				break;
			case EQUAL_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
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
		enterRule(_localctx, 42, RULE_logi_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		enterRule(_localctx, 44, RULE_logi_op2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		enterRule(_localctx, 46, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 48, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 50, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		enterRule(_localctx, 52, RULE_equal_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		enterRule(_localctx, 54, RULE_less_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 56, RULE_greater_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		enterRule(_localctx, 58, RULE_greater_than_or_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
		enterRule(_localctx, 60, RULE_less_than_or_equal_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		enterRule(_localctx, 62, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		enterRule(_localctx, 64, RULE_func_dec);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				data_type();
				setState(467);
				func_iden();
				setState(468);
				match(OPEN_SQUARE_BRACKET);
				setState(469);
				parameter();
				setState(470);
				match(CLOSE_SQUARE_BRACKET);
				setState(471);
				match(OPEN_BRACKET);
				setState(472);
				code_block();
				setState(474);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(473);
					return_statement();
					}
				}

				setState(476);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				data_type();
				setState(479);
				func_iden();
				setState(480);
				match(OPEN_SQUARE_BRACKET);
				setState(481);
				match(CLOSE_SQUARE_BRACKET);
				setState(482);
				match(OPEN_BRACKET);
				setState(483);
				code_block();
				setState(485);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(484);
					return_statement();
					}
				}

				setState(487);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				data_type();
				setState(490);
				func_iden();
				setState(491);
				match(OPEN_SQUARE_BRACKET);
				setState(492);
				parameter();
				setState(493);
				match(CLOSE_SQUARE_BRACKET);
				setState(494);
				match(OPEN_BRACKET);
				setState(496);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(495);
					return_statement();
					}
				}

				setState(498);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				data_type();
				setState(501);
				func_iden();
				setState(502);
				match(OPEN_SQUARE_BRACKET);
				setState(503);
				match(CLOSE_SQUARE_BRACKET);
				setState(504);
				match(OPEN_BRACKET);
				setState(506);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(505);
					return_statement();
					}
				}

				setState(508);
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
		enterRule(_localctx, 66, RULE_return_statement);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(RETURN);
				setState(513);
				literal();
				setState(514);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(RETURN);
				setState(517);
				var_iden();
				setState(518);
				match(TERMINAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(RETURN);
				setState(521);
				expr(0);
				setState(522);
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
		enterRule(_localctx, 68, RULE_func_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 70, RULE_parameter);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				data_type();
				setState(529);
				match(VAR_IDEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				data_type();
				setState(532);
				match(VAR_IDEN);
				setState(533);
				match(COMMA);
				setState(534);
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
		enterRule(_localctx, 72, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(CONST_DEC);
			setState(539);
			data_type();
			setState(540);
			statement();
			setState(541);
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
		enterRule(_localctx, 74, RULE_var_dec);
		try {
			setState(551);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
			case IMPERIAL_CREDIT:
			case UNIT:
			case LEGION:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				data_type();
				setState(544);
				statement();
				setState(545);
				match(TERMINAL);
				}
				break;
			case SIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(SIDE);
				setState(548);
				boolean_statement();
				setState(549);
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
		enterRule(_localctx, 76, RULE_boolean_statement);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
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
		enterRule(_localctx, 78, RULE_boolean_assignment);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				var_iden();
				setState(558);
				match(EQUAL);
				setState(559);
				match(LIGHT_SIDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				var_iden();
				setState(562);
				match(EQUAL);
				setState(563);
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
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				reg_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
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
		enterRule(_localctx, 82, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			var_iden();
			setState(573);
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
		enterRule(_localctx, 84, RULE_reg_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			var_iden();
			setState(576);
			match(EQUAL);
			setState(577);
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
		enterRule(_localctx, 86, RULE_var_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 88, RULE_incr);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				var_iden();
				setState(582);
				match(INCREMENT_OPERATOR);
				setState(583);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				var_iden();
				setState(586);
				match(DECREMENT_OPERATOR);
				setState(587);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(592);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(594);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(595);
					add_sub();
					setState(596);
					expr2(0);
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(604);
			gen_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(606);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(607);
					mul_div();
					setState(608);
					gen_var();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 94, RULE_gen_var);
		try {
			setState(619);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				uni_op();
				setState(616);
				var();
				}
				break;
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case VAR_IDEN:
			case FUNC_IDEN:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
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
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_var);
		try {
			setState(628);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				literal();
				}
				break;
			case FUNC_IDEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				func_call();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				match(OPEN_SQUARE_BRACKET);
				setState(624);
				expr(0);
				setState(625);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case VAR_IDEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				var_iden();
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
		enterRule(_localctx, 98, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		enterRule(_localctx, 100, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		enterRule(_localctx, 102, RULE_uni_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_array);
		int _la;
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				array_open();
				setState(637);
				index();
				setState(638);
				array_close();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				array_open();
				setState(641);
				index();
				setState(642);
				array_close();
				setState(643);
				equal();
				setState(644);
				match(OPEN_BRACKET);
				setState(646);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << VAR_IDEN) | (1L << FUNC_IDEN) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
					{
					setState(645);
					value();
					}
				}

				setState(648);
				match(CLOSE_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				array_open();
				setState(651);
				index();
				setState(652);
				array_close();
				setState(653);
				equal();
				setState(654);
				var();
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
		enterRule(_localctx, 106, RULE_array_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
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
		enterRule(_localctx, 108, RULE_array_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
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
		enterRule(_localctx, 110, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_index);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				var_iden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				expr(0);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SingleLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitSingleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreLiteralsContext extends ValueContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 114, RULE_value);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new SingleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				var();
				}
				break;
			case 2:
				_localctx = new MoreLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				var();
				setState(671);
				match(COMMA);
				setState(673);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(672);
					match(WS);
					}
				}

				setState(675);
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
		enterRule(_localctx, 116, RULE_data_type);
		try {
			setState(683);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				galactic_credit();
				}
				break;
			case IMPERIAL_CREDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				imperial_credit();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				unit();
				}
				break;
			case LEGION:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
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
		enterRule(_localctx, 118, RULE_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
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
		enterRule(_localctx, 120, RULE_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		enterRule(_localctx, 122, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 124, RULE_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		enterRule(_localctx, 126, RULE_literal);
		try {
			setState(697);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StrngLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				string_literal();
				}
				break;
			case CHARACTER_LITERAL:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				character_literal();
				}
				break;
			case INT_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				int_literal();
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
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
		enterRule(_localctx, 128, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 130, RULE_character_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		enterRule(_localctx, 132, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		enterRule(_localctx, 134, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15:
			return condition2_sempred((Condition2Context)_localctx, predIndex);
		case 16:
			return condition3_sempred((Condition3Context)_localctx, predIndex);
		case 17:
			return condition4_sempred((Condition4Context)_localctx, predIndex);
		case 45:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 46:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u02c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u0093\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00bf\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00e0\n\n\3\n\5"+
		"\n\u00e3\n\n\3\n\5\n\u00e6\n\n\3\n\5\n\u00e9\n\n\3\n\5\n\u00ec\n\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013f\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u015d\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0171\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u017f\n\20\f\20\16\20\u0182\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u018b\n\21\f\21\16\21\u018e\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0197\n\22\f\22\16\22\u019a\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u01a3\n\23\f\23\16\23\u01a6\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01b3\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u01b9\n\25\3\26\3\26\5\26\u01bd\n\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01dd\n\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e8\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01f3\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01fd\n"+
		"\"\3\"\3\"\5\"\u0201\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u020f"+
		"\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u021b\n%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u022a\n\'\3(\3(\5(\u022e\n(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u0238\n)\3*\3*\3*\5*\u023d\n*\3+\3+\3+\3,\3,\3,\3,\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0250\n.\3/\3/\3/\3/\3/\3/\3/\7/\u0259\n/"+
		"\f/\16/\u025c\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0265\n\60\f"+
		"\60\16\60\u0268\13\60\3\61\3\61\3\61\3\61\5\61\u026e\n\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u0277\n\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0289\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0293\n\66\3\67\3\67\38\38\3"+
		"9\39\3:\3:\3:\5:\u029e\n:\3;\3;\3;\3;\5;\u02a4\n;\3;\3;\5;\u02a8\n;\3"+
		"<\3<\3<\3<\5<\u02ae\n<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u02bc\n"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3E\2\b\36 \"$\\^F\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\2\5\3\2\7\b\3\2\t\13\4\2\7\b\17\17\u02ce"+
		"\2\u0092\3\2\2\2\4\u00be\3\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2\n\u00c4"+
		"\3\2\2\2\f\u00ca\3\2\2\2\16\u00d0\3\2\2\2\20\u00d6\3\2\2\2\22\u00dc\3"+
		"\2\2\2\24\u013e\3\2\2\2\26\u0149\3\2\2\2\30\u015c\3\2\2\2\32\u0170\3\2"+
		"\2\2\34\u0172\3\2\2\2\36\u0177\3\2\2\2 \u0183\3\2\2\2\"\u018f\3\2\2\2"+
		"$\u019b\3\2\2\2&\u01b2\3\2\2\2(\u01b8\3\2\2\2*\u01bc\3\2\2\2,\u01be\3"+
		"\2\2\2.\u01c0\3\2\2\2\60\u01c2\3\2\2\2\62\u01c4\3\2\2\2\64\u01c6\3\2\2"+
		"\2\66\u01c8\3\2\2\28\u01ca\3\2\2\2:\u01cc\3\2\2\2<\u01ce\3\2\2\2>\u01d0"+
		"\3\2\2\2@\u01d2\3\2\2\2B\u0200\3\2\2\2D\u020e\3\2\2\2F\u0210\3\2\2\2H"+
		"\u021a\3\2\2\2J\u021c\3\2\2\2L\u0229\3\2\2\2N\u022d\3\2\2\2P\u0237\3\2"+
		"\2\2R\u023c\3\2\2\2T\u023e\3\2\2\2V\u0241\3\2\2\2X\u0245\3\2\2\2Z\u024f"+
		"\3\2\2\2\\\u0251\3\2\2\2^\u025d\3\2\2\2`\u026d\3\2\2\2b\u0276\3\2\2\2"+
		"d\u0278\3\2\2\2f\u027a\3\2\2\2h\u027c\3\2\2\2j\u0292\3\2\2\2l\u0294\3"+
		"\2\2\2n\u0296\3\2\2\2p\u0298\3\2\2\2r\u029d\3\2\2\2t\u02a7\3\2\2\2v\u02ad"+
		"\3\2\2\2x\u02af\3\2\2\2z\u02b1\3\2\2\2|\u02b3\3\2\2\2~\u02b5\3\2\2\2\u0080"+
		"\u02bb\3\2\2\2\u0082\u02bd\3\2\2\2\u0084\u02bf\3\2\2\2\u0086\u02c1\3\2"+
		"\2\2\u0088\u02c3\3\2\2\2\u008a\u008b\5B\"\2\u008b\u008c\5\2\2\2\u008c"+
		"\u0093\3\2\2\2\u008d\u008e\7;\2\2\u008e\u008f\7-\2\2\u008f\u0090\5\4\3"+
		"\2\u0090\u0091\7.\2\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0093\3\3\2\2\2\u0094\u0095\5L\'\2\u0095\u0096\5\4\3\2\u0096"+
		"\u00bf\3\2\2\2\u0097\u0098\5V,\2\u0098\u0099\7\31\2\2\u0099\u009a\5\4"+
		"\3\2\u009a\u00bf\3\2\2\2\u009b\u009c\5T+\2\u009c\u009d\7\31\2\2\u009d"+
		"\u009e\5\4\3\2\u009e\u00bf\3\2\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\5"+
		"\4\3\2\u00a1\u00bf\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\5\4\3\2\u00a4"+
		"\u00bf\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\5\4\3\2\u00a7\u00bf\3"+
		"\2\2\2\u00a8\u00a9\5Z.\2\u00a9\u00aa\5\4\3\2\u00aa\u00bf\3\2\2\2\u00ab"+
		"\u00ac\5\n\6\2\u00ac\u00ad\5\4\3\2\u00ad\u00bf\3\2\2\2\u00ae\u00af\5\f"+
		"\7\2\u00af\u00b0\5\4\3\2\u00b0\u00bf\3\2\2\2\u00b1\u00b2\5\16\b\2\u00b2"+
		"\u00b3\5\4\3\2\u00b3\u00bf\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\5"+
		"\4\3\2\u00b6\u00bf\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\5\4\3\2\u00b9"+
		"\u00bf\3\2\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\5\4\3\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bf\5\6\4\2\u00be\u0094\3\2\2\2\u00be\u0097\3\2\2\2\u00be"+
		"\u009b\3\2\2\2\u00be\u009f\3\2\2\2\u00be\u00a2\3\2\2\2\u00be\u00a5\3\2"+
		"\2\2\u00be\u00a8\3\2\2\2\u00be\u00ab\3\2\2\2\u00be\u00ae\3\2\2\2\u00be"+
		"\u00b1\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00ba\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\5\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\7\3"+
		"\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\t\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\u00c6"+
		"\7/\2\2\u00c6\u00c7\5X-\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\13\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\5X-\2\u00cd"+
		"\u00ce\7\60\2\2\u00ce\u00cf\7\31\2\2\u00cf\r\3\2\2\2\u00d0\u00d1\7>\2"+
		"\2\u00d1\u00d2\7/\2\2\u00d2\u00d3\5X-\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5"+
		"\7\31\2\2\u00d5\17\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7/\2\2\u00d8"+
		"\u00d9\5X-\2\u00d9\u00da\7\60\2\2\u00da\u00db\7\31\2\2\u00db\21\3\2\2"+
		"\2\u00dc\u00dd\7@\2\2\u00dd\u00df\7/\2\2\u00de\u00e0\5\\/\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\7\26\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6"+
		"\7\30\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2"+
		"\u00e7\u00e9\5X-\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00ec\5\26\f\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\7\31\2\2\u00ef\23"+
		"\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\5\36\20\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\u00f5\7-\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7."+
		"\2\2\u00f7\u013f\3\2\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\7\60\2\2\u00fb\u00fc\7-\2\2\u00fc\u00fd\5\4\3\2\u00fd\u00fe\7.\2\2\u00fe"+
		"\u013f\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7/\2\2\u0101\u0102\7\60"+
		"\2\2\u0102\u0103\7-\2\2\u0103\u013f\7.\2\2\u0104\u0105\7\'\2\2\u0105\u0106"+
		"\7-\2\2\u0106\u0107\5\4\3\2\u0107\u0108\7.\2\2\u0108\u0109\7(\2\2\u0109"+
		"\u010a\7/\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\60\2\2\u010c\u010d\7"+
		"\31\2\2\u010d\u013f\3\2\2\2\u010e\u010f\7\'\2\2\u010f\u0110\7-\2\2\u0110"+
		"\u0111\5\4\3\2\u0111\u0112\7.\2\2\u0112\u0113\7(\2\2\u0113\u0114\7/\2"+
		"\2\u0114\u0115\7\60\2\2\u0115\u0116\7\31\2\2\u0116\u013f\3\2\2\2\u0117"+
		"\u0118\7\'\2\2\u0118\u0119\7-\2\2\u0119\u011a\7.\2\2\u011a\u011b\7(\2"+
		"\2\u011b\u011c\7/\2\2\u011c\u011d\5\36\20\2\u011d\u011e\7\60\2\2\u011e"+
		"\u011f\7\31\2\2\u011f\u013f\3\2\2\2\u0120\u0121\7\'\2\2\u0121\u0122\7"+
		"-\2\2\u0122\u0123\7.\2\2\u0123\u0124\7(\2\2\u0124\u0125\7/\2\2\u0125\u0126"+
		"\7\60\2\2\u0126\u013f\7\31\2\2\u0127\u0128\7&\2\2\u0128\u0129\7/\2\2\u0129"+
		"\u012a\5V,\2\u012a\u012b\7\31\2\2\u012b\u012c\5\36\20\2\u012c\u012d\7"+
		"\31\2\2\u012d\u012e\5Z.\2\u012e\u012f\7\60\2\2\u012f\u0130\7-\2\2\u0130"+
		"\u0131\5\4\3\2\u0131\u0132\7.\2\2\u0132\u013f\3\2\2\2\u0133\u0134\7&\2"+
		"\2\u0134\u0135\7/\2\2\u0135\u0136\5V,\2\u0136\u0137\7\31\2\2\u0137\u0138"+
		"\5\36\20\2\u0138\u0139\7\31\2\2\u0139\u013a\5Z.\2\u013a\u013b\7\60\2\2"+
		"\u013b\u013c\7-\2\2\u013c\u013d\7.\2\2\u013d\u013f\3\2\2\2\u013e\u00f0"+
		"\3\2\2\2\u013e\u00f8\3\2\2\2\u013e\u00ff\3\2\2\2\u013e\u0104\3\2\2\2\u013e"+
		"\u010e\3\2\2\2\u013e\u0117\3\2\2\2\u013e\u0120\3\2\2\2\u013e\u0127\3\2"+
		"\2\2\u013e\u0133\3\2\2\2\u013f\25\3\2\2\2\u0140\u0141\5F$\2\u0141\u0142"+
		"\7/\2\2\u0142\u0143\5t;\2\u0143\u0144\7\60\2\2\u0144\u014a\3\2\2\2\u0145"+
		"\u0146\5F$\2\u0146\u0147\7/\2\2\u0147\u0148\7\60\2\2\u0148\u014a\3\2\2"+
		"\2\u0149\u0140\3\2\2\2\u0149\u0145\3\2\2\2\u014a\27\3\2\2\2\u014b\u014c"+
		"\7#\2\2\u014c\u014d\7/\2\2\u014d\u014e\5\36\20\2\u014e\u014f\7\60\2\2"+
		"\u014f\u0150\7-\2\2\u0150\u0151\5\4\3\2\u0151\u0152\7.\2\2\u0152\u015d"+
		"\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\7/\2\2\u0155\u0156\5\36\20\2\u0156"+
		"\u0157\7\60\2\2\u0157\u0158\7-\2\2\u0158\u0159\5\4\3\2\u0159\u015a\7."+
		"\2\2\u015a\u015b\5\32\16\2\u015b\u015d\3\2\2\2\u015c\u014b\3\2\2\2\u015c"+
		"\u0153\3\2\2\2\u015d\31\3\2\2\2\u015e\u015f\7$\2\2\u015f\u0160\7/\2\2"+
		"\u0160\u0161\5\36\20\2\u0161\u0162\7\60\2\2\u0162\u0163\7-\2\2\u0163\u0164"+
		"\5\4\3\2\u0164\u0165\7.\2\2\u0165\u0166\5\32\16\2\u0166\u0171\3\2\2\2"+
		"\u0167\u0168\7$\2\2\u0168\u0169\7/\2\2\u0169\u016a\5\36\20\2\u016a\u016b"+
		"\7\60\2\2\u016b\u016c\7-\2\2\u016c\u016d\5\4\3\2\u016d\u016e\7.\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u0171\5\34\17\2\u0170\u015e\3\2\2\2\u0170\u0167\3"+
		"\2\2\2\u0170\u016f\3\2\2\2\u0171\33\3\2\2\2\u0172\u0173\7%\2\2\u0173\u0174"+
		"\7-\2\2\u0174\u0175\5\4\3\2\u0175\u0176\7.\2\2\u0176\35\3\2\2\2\u0177"+
		"\u0178\b\20\1\2\u0178\u0179\5 \21\2\u0179\u0180\3\2\2\2\u017a\u017b\f"+
		"\4\2\2\u017b\u017c\5.\30\2\u017c\u017d\5 \21\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017a\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\37\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b\21\1\2\u0184\u0185"+
		"\5\"\22\2\u0185\u018c\3\2\2\2\u0186\u0187\f\4\2\2\u0187\u0188\5,\27\2"+
		"\u0188\u0189\5\"\22\2\u0189\u018b\3\2\2\2\u018a\u0186\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d!\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\b\22\1\2\u0190\u0191\5$\23\2\u0191\u0198\3"+
		"\2\2\2\u0192\u0193\f\4\2\2\u0193\u0194\5*\26\2\u0194\u0195\5$\23\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0192\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199#\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c"+
		"\b\23\1\2\u019c\u019d\5&\24\2\u019d\u01a4\3\2\2\2\u019e\u019f\f\4\2\2"+
		"\u019f\u01a0\5(\25\2\u01a0\u01a1\5&\24\2\u01a1\u01a3\3\2\2\2\u01a2\u019e"+
		"\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"%\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01b3\5\\/\2\u01a8\u01a9\5@!\2\u01a9"+
		"\u01aa\7/\2\2\u01aa\u01ab\5\36\20\2\u01ab\u01ac\7\60\2\2\u01ac\u01b3\3"+
		"\2\2\2\u01ad\u01ae\7/\2\2\u01ae\u01af\5\36\20\2\u01af\u01b0\7\60\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01b3\5X-\2\u01b2\u01a7\3\2\2\2\u01b2\u01a8\3\2\2"+
		"\2\u01b2\u01ad\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\'\3\2\2\2\u01b4\u01b9"+
		"\58\35\2\u01b5\u01b9\5:\36\2\u01b6\u01b9\5<\37\2\u01b7\u01b9\5> \2\u01b8"+
		"\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9)\3\2\2\2\u01ba\u01bd\5\64\33\2\u01bb\u01bd\5\66\34\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd+\3\2\2\2\u01be\u01bf\5\62\32"+
		"\2\u01bf-\3\2\2\2\u01c0\u01c1\5\60\31\2\u01c1/\3\2\2\2\u01c2\u01c3\79"+
		"\2\2\u01c3\61\3\2\2\2\u01c4\u01c5\78\2\2\u01c5\63\3\2\2\2\u01c6\u01c7"+
		"\7\66\2\2\u01c7\65\3\2\2\2\u01c8\u01c9\7\67\2\2\u01c9\67\3\2\2\2\u01ca"+
		"\u01cb\7+\2\2\u01cb9\3\2\2\2\u01cc\u01cd\7,\2\2\u01cd;\3\2\2\2\u01ce\u01cf"+
		"\7\65\2\2\u01cf=\3\2\2\2\u01d0\u01d1\7\64\2\2\u01d1?\3\2\2\2\u01d2\u01d3"+
		"\7\17\2\2\u01d3A\3\2\2\2\u01d4\u01d5\5v<\2\u01d5\u01d6\5F$\2\u01d6\u01d7"+
		"\7/\2\2\u01d7\u01d8\5H%\2\u01d8\u01d9\7\60\2\2\u01d9\u01da\7-\2\2\u01da"+
		"\u01dc\5\4\3\2\u01db\u01dd\5D#\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01df\7.\2\2\u01df\u0201\3\2\2\2\u01e0\u01e1"+
		"\5v<\2\u01e1\u01e2\5F$\2\u01e2\u01e3\7/\2\2\u01e3\u01e4\7\60\2\2\u01e4"+
		"\u01e5\7-\2\2\u01e5\u01e7\5\4\3\2\u01e6\u01e8\5D#\2\u01e7\u01e6\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7.\2\2\u01ea\u0201"+
		"\3\2\2\2\u01eb\u01ec\5v<\2\u01ec\u01ed\5F$\2\u01ed\u01ee\7/\2\2\u01ee"+
		"\u01ef\5H%\2\u01ef\u01f0\7\60\2\2\u01f0\u01f2\7-\2\2\u01f1\u01f3\5D#\2"+
		"\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\7.\2\2\u01f5\u0201\3\2\2\2\u01f6\u01f7\5v<\2\u01f7\u01f8\5F$\2\u01f8"+
		"\u01f9\7/\2\2\u01f9\u01fa\7\60\2\2\u01fa\u01fc\7-\2\2\u01fb\u01fd\5D#"+
		"\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff"+
		"\7.\2\2\u01ff\u0201\3\2\2\2\u0200\u01d4\3\2\2\2\u0200\u01e0\3\2\2\2\u0200"+
		"\u01eb\3\2\2\2\u0200\u01f6\3\2\2\2\u0201C\3\2\2\2\u0202\u0203\7*\2\2\u0203"+
		"\u0204\5\u0080A\2\u0204\u0205\7\31\2\2\u0205\u020f\3\2\2\2\u0206\u0207"+
		"\7*\2\2\u0207\u0208\5X-\2\u0208\u0209\7\31\2\2\u0209\u020f\3\2\2\2\u020a"+
		"\u020b\7*\2\2\u020b\u020c\5\\/\2\u020c\u020d\7\31\2\2\u020d\u020f\3\2"+
		"\2\2\u020e\u0202\3\2\2\2\u020e\u0206\3\2\2\2\u020e\u020a\3\2\2\2\u020f"+
		"E\3\2\2\2\u0210\u0211\7\25\2\2\u0211G\3\2\2\2\u0212\u0213\5v<\2\u0213"+
		"\u0214\7\24\2\2\u0214\u021b\3\2\2\2\u0215\u0216\5v<\2\u0216\u0217\7\24"+
		"\2\2\u0217\u0218\7\61\2\2\u0218\u0219\5H%\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0212\3\2\2\2\u021a\u0215\3\2\2\2\u021bI\3\2\2\2\u021c\u021d\7!\2\2\u021d"+
		"\u021e\5v<\2\u021e\u021f\5R*\2\u021f\u0220\7\31\2\2\u0220K\3\2\2\2\u0221"+
		"\u0222\5v<\2\u0222\u0223\5R*\2\u0223\u0224\7\31\2\2\u0224\u022a\3\2\2"+
		"\2\u0225\u0226\7\36\2\2\u0226\u0227\5N(\2\u0227\u0228\7\31\2\2\u0228\u022a"+
		"\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0225\3\2\2\2\u022aM\3\2\2\2\u022b"+
		"\u022e\5X-\2\u022c\u022e\5P)\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2"+
		"\u022eO\3\2\2\2\u022f\u0230\5X-\2\u0230\u0231\7\16\2\2\u0231\u0232\7\37"+
		"\2\2\u0232\u0238\3\2\2\2\u0233\u0234\5X-\2\u0234\u0235\7\16\2\2\u0235"+
		"\u0236\7 \2\2\u0236\u0238\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0233\3\2"+
		"\2\2\u0238Q\3\2\2\2\u0239\u023d\5X-\2\u023a\u023d\5V,\2\u023b\u023d\5"+
		"T+\2\u023c\u0239\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d"+
		"S\3\2\2\2\u023e\u023f\5X-\2\u023f\u0240\5j\66\2\u0240U\3\2\2\2\u0241\u0242"+
		"\5X-\2\u0242\u0243\7\16\2\2\u0243\u0244\5\\/\2\u0244W\3\2\2\2\u0245\u0246"+
		"\7\24\2\2\u0246Y\3\2\2\2\u0247\u0248\5X-\2\u0248\u0249\7\22\2\2\u0249"+
		"\u024a\7\31\2\2\u024a\u0250\3\2\2\2\u024b\u024c\5X-\2\u024c\u024d\7\23"+
		"\2\2\u024d\u024e\7\31\2\2\u024e\u0250\3\2\2\2\u024f\u0247\3\2\2\2\u024f"+
		"\u024b\3\2\2\2\u0250[\3\2\2\2\u0251\u0252\b/\1\2\u0252\u0253\5^\60\2\u0253"+
		"\u025a\3\2\2\2\u0254\u0255\f\4\2\2\u0255\u0256\5d\63\2\u0256\u0257\5^"+
		"\60\2\u0257\u0259\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b]\3\2\2\2\u025c\u025a\3\2\2\2"+
		"\u025d\u025e\b\60\1\2\u025e\u025f\5`\61\2\u025f\u0266\3\2\2\2\u0260\u0261"+
		"\f\4\2\2\u0261\u0262\5f\64\2\u0262\u0263\5`\61\2\u0263\u0265\3\2\2\2\u0264"+
		"\u0260\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267_\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\5h\65\2\u026a\u026b"+
		"\5b\62\2\u026b\u026e\3\2\2\2\u026c\u026e\5b\62\2\u026d\u0269\3\2\2\2\u026d"+
		"\u026c\3\2\2\2\u026ea\3\2\2\2\u026f\u0277\5\u0080A\2\u0270\u0277\5\26"+
		"\f\2\u0271\u0272\7/\2\2\u0272\u0273\5\\/\2\u0273\u0274\7\60\2\2\u0274"+
		"\u0277\3\2\2\2\u0275\u0277\5X-\2\u0276\u026f\3\2\2\2\u0276\u0270\3\2\2"+
		"\2\u0276\u0271\3\2\2\2\u0276\u0275\3\2\2\2\u0277c\3\2\2\2\u0278\u0279"+
		"\t\2\2\2\u0279e\3\2\2\2\u027a\u027b\t\3\2\2\u027bg\3\2\2\2\u027c\u027d"+
		"\t\4\2\2\u027di\3\2\2\2\u027e\u027f\5l\67\2\u027f\u0280\5r:\2\u0280\u0281"+
		"\5n8\2\u0281\u0293\3\2\2\2\u0282\u0283\5l\67\2\u0283\u0284\5r:\2\u0284"+
		"\u0285\5n8\2\u0285\u0286\5p9\2\u0286\u0288\7-\2\2\u0287\u0289\5t;\2\u0288"+
		"\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\7."+
		"\2\2\u028b\u0293\3\2\2\2\u028c\u028d\5l\67\2\u028d\u028e\5r:\2\u028e\u028f"+
		"\5n8\2\u028f\u0290\5p9\2\u0290\u0291\5b\62\2\u0291\u0293\3\2\2\2\u0292"+
		"\u027e\3\2\2\2\u0292\u0282\3\2\2\2\u0292\u028c\3\2\2\2\u0293k\3\2\2\2"+
		"\u0294\u0295\7+\2\2\u0295m\3\2\2\2\u0296\u0297\7,\2\2\u0297o\3\2\2\2\u0298"+
		"\u0299\7\16\2\2\u0299q\3\2\2\2\u029a\u029e\7\3\2\2\u029b\u029e\5X-\2\u029c"+
		"\u029e\5\\/\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2"+
		"\2\2\u029es\3\2\2\2\u029f\u02a8\5b\62\2\u02a0\u02a1\5b\62\2\u02a1\u02a3"+
		"\7\61\2\2\u02a2\u02a4\7\6\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5t;\2\u02a6\u02a8\3\2\2\2\u02a7\u029f"+
		"\3\2\2\2\u02a7\u02a0\3\2\2\2\u02a8u\3\2\2\2\u02a9\u02ae\5x=\2\u02aa\u02ae"+
		"\5z>\2\u02ab\u02ae\5|?\2\u02ac\u02ae\5~@\2\u02ad\u02a9\3\2\2\2\u02ad\u02aa"+
		"\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02aew\3\2\2\2\u02af"+
		"\u02b0\7\32\2\2\u02b0y\3\2\2\2\u02b1\u02b2\7\33\2\2\u02b2{\3\2\2\2\u02b3"+
		"\u02b4\7\34\2\2\u02b4}\3\2\2\2\u02b5\u02b6\7\35\2\2\u02b6\177\3\2\2\2"+
		"\u02b7\u02bc\5\u0082B\2\u02b8\u02bc\5\u0084C\2\u02b9\u02bc\5\u0086D\2"+
		"\u02ba\u02bc\5\u0088E\2\u02bb\u02b7\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc\u0081\3\2\2\2\u02bd\u02be\7\30"+
		"\2\2\u02be\u0083\3\2\2\2\u02bf\u02c0\7\26\2\2\u02c0\u0085\3\2\2\2\u02c1"+
		"\u02c2\7\3\2\2\u02c2\u0087\3\2\2\2\u02c3\u02c4\7\4\2\2\u02c4\u0089\3\2"+
		"\2\2+\u0092\u00be\u00df\u00e2\u00e5\u00e8\u00eb\u013e\u0149\u015c\u0170"+
		"\u0180\u018c\u0198\u01a4\u01b2\u01b8\u01bc\u01dc\u01e7\u01f2\u01fc\u0200"+
		"\u020e\u021a\u0229\u022d\u0237\u023c\u024f\u025a\u0266\u026d\u0276\u0288"+
		"\u0292\u029d\u02a3\u02a7\u02ad\u02bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
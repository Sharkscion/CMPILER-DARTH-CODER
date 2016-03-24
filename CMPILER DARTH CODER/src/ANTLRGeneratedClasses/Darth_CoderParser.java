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
		DO=37, WHILE=38, BREAK=39, RETURN=40, ARRAY_OPEN=41, ARRAY_CLOSE=42, OPEN_BRACES=43, 
		CLOSE_BRACES=44, OPEN_SQUARE_BRACKET=45, CLOSE_SQUARE_BRACKET=46, COMMA=47, 
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
		RULE_var = 48, RULE_array = 49, RULE_array_open = 50, RULE_array_close = 51, 
		RULE_equal = 52, RULE_index = 53, RULE_value = 54, RULE_data_type = 55, 
		RULE_galactic_credit = 56, RULE_imperial_credit = 57, RULE_unit = 58, 
		RULE_legion = 59, RULE_literal = 60, RULE_string_literal = 61, RULE_character_literal = 62, 
		RULE_int_literal = 63, RULE_float_literal = 64;
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
		"array", "array_open", "array_close", "equal", "index", "value", "data_type", 
		"galactic_credit", "imperial_credit", "unit", "legion", "literal", "string_literal", 
		"character_literal", "int_literal", "float_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", null, 
		null, "'='", "'!'", "'''", "'\"'", "'++'", "'--'", null, null, null, null, 
		null, "'.'", "'GalacticCredit'", "'ImperialCredit'", "'Unit'", "'Legion'", 
		"'Side'", "'LightSide'", "'DarkSide'", "'Declare'", "'Void'", "'ForceInstance'", 
		"'InstanceVariant'", "'NoVariant'", "'ForceCommand'", "'ForceOrder'", 
		"'ForceAnalyze'", "'Order_66'", "'Transmit'", null, null, "'{'", "'}'", 
		"'['", "']'", "','", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", 
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
		"ARRAY_CLOSE", "OPEN_BRACES", "CLOSE_BRACES", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"COMMA", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL_TO", "GREATER_THAN_EQUAL_TO", 
		"NOT_EQUAL", "EQUAL_EQUAL", "AND", "OR", "END_TRANSMISSION", "INITIATE", 
		"SCAN_INTEGER", "SCAN_FLOAT", "SCAN_CHAR", "SCAN_STRING", "PRINT"
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(138);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
			case IMPERIAL_CREDIT:
			case UNIT:
			case LEGION:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				func_dec();
				setState(131);
				start();
				}
				break;
			case INITIATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(INITIATE);
				setState(134);
				match(OPEN_BRACES);
				setState(135);
				code_block();
				setState(136);
				match(CLOSE_BRACES);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				var_dec();
				setState(141);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				reg_assignment();
				setState(144);
				match(TERMINAL);
				setState(145);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				array_assignment();
				setState(148);
				match(TERMINAL);
				setState(149);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				if_conditional();
				setState(152);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				iterative_con();
				setState(155);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				func_call();
				setState(158);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				incr();
				setState(161);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				scan_imperial_credit();
				setState(164);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				scan_galactic_credit();
				setState(167);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				scan_unit();
				setState(170);
				code_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				scan_legion();
				setState(173);
				code_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(175);
				print();
				setState(176);
				code_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(178);
				comment();
				setState(179);
				code_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
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
			setState(186);
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
			setState(188);
			match(SCAN_FLOAT);
			setState(189);
			match(OPEN_SQUARE_BRACKET);
			setState(190);
			var_iden();
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
			setState(194);
			match(SCAN_INTEGER);
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
			setState(200);
			match(SCAN_CHAR);
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
			setState(206);
			match(SCAN_STRING);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Darth_CoderParser.PRINT, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(Darth_CoderParser.CHARACTER_LITERAL, 0); }
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
			setState(212);
			match(PRINT);
			setState(213);
			match(OPEN_SQUARE_BRACKET);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(214);
				var_iden();
				}
				break;
			}
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(217);
				expr(0);
				}
				break;
			}
			setState(221);
			_la = _input.LA(1);
			if (_la==CHARACTER_LITERAL) {
				{
				setState(220);
				match(CHARACTER_LITERAL);
				}
			}

			setState(224);
			_la = _input.LA(1);
			if (_la==FUNC_IDEN) {
				{
				setState(223);
				func_call();
				}
			}

			setState(226);
			match(CLOSE_SQUARE_BRACKET);
			setState(227);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(WHILE);
				setState(230);
				match(OPEN_SQUARE_BRACKET);
				setState(231);
				condition(0);
				setState(232);
				match(CLOSE_SQUARE_BRACKET);
				setState(233);
				match(OPEN_BRACES);
				setState(234);
				code_block();
				setState(235);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(WHILE);
				setState(238);
				match(OPEN_SQUARE_BRACKET);
				setState(239);
				match(CLOSE_SQUARE_BRACKET);
				setState(240);
				match(OPEN_BRACES);
				setState(241);
				code_block();
				setState(242);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(WHILE);
				setState(245);
				match(OPEN_SQUARE_BRACKET);
				setState(246);
				match(CLOSE_SQUARE_BRACKET);
				setState(247);
				match(OPEN_BRACES);
				setState(248);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(DO);
				setState(250);
				match(OPEN_BRACES);
				setState(251);
				code_block();
				setState(252);
				match(CLOSE_BRACES);
				setState(253);
				match(WHILE);
				setState(254);
				match(OPEN_SQUARE_BRACKET);
				setState(255);
				condition(0);
				setState(256);
				match(CLOSE_SQUARE_BRACKET);
				setState(257);
				match(TERMINAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(DO);
				setState(260);
				match(OPEN_BRACES);
				setState(261);
				code_block();
				setState(262);
				match(CLOSE_BRACES);
				setState(263);
				match(WHILE);
				setState(264);
				match(OPEN_SQUARE_BRACKET);
				setState(265);
				match(CLOSE_SQUARE_BRACKET);
				setState(266);
				match(TERMINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				match(DO);
				setState(269);
				match(OPEN_BRACES);
				setState(270);
				match(CLOSE_BRACES);
				setState(271);
				match(WHILE);
				setState(272);
				match(OPEN_SQUARE_BRACKET);
				setState(273);
				condition(0);
				setState(274);
				match(CLOSE_SQUARE_BRACKET);
				setState(275);
				match(TERMINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				match(DO);
				setState(278);
				match(OPEN_BRACES);
				setState(279);
				match(CLOSE_BRACES);
				setState(280);
				match(WHILE);
				setState(281);
				match(OPEN_SQUARE_BRACKET);
				setState(282);
				match(CLOSE_SQUARE_BRACKET);
				setState(283);
				match(TERMINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				match(FOR);
				setState(285);
				match(OPEN_SQUARE_BRACKET);
				setState(286);
				reg_assignment();
				setState(287);
				match(TERMINAL);
				setState(288);
				condition(0);
				setState(289);
				match(TERMINAL);
				setState(290);
				incr();
				setState(291);
				match(CLOSE_SQUARE_BRACKET);
				setState(292);
				match(OPEN_BRACES);
				setState(293);
				code_block();
				setState(294);
				match(CLOSE_BRACES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				match(FOR);
				setState(297);
				match(OPEN_SQUARE_BRACKET);
				setState(298);
				reg_assignment();
				setState(299);
				match(TERMINAL);
				setState(300);
				condition(0);
				setState(301);
				match(TERMINAL);
				setState(302);
				incr();
				setState(303);
				match(CLOSE_SQUARE_BRACKET);
				setState(304);
				match(OPEN_BRACES);
				setState(305);
				match(CLOSE_BRACES);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				func_iden();
				setState(310);
				match(OPEN_SQUARE_BRACKET);
				setState(311);
				value();
				setState(312);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				func_iden();
				setState(315);
				match(OPEN_SQUARE_BRACKET);
				setState(316);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(IF);
				setState(321);
				match(OPEN_SQUARE_BRACKET);
				setState(322);
				condition(0);
				setState(323);
				match(CLOSE_SQUARE_BRACKET);
				setState(324);
				match(OPEN_BRACES);
				setState(325);
				code_block();
				setState(326);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(IF);
				setState(329);
				match(OPEN_SQUARE_BRACKET);
				setState(330);
				condition(0);
				setState(331);
				match(CLOSE_SQUARE_BRACKET);
				setState(332);
				match(OPEN_BRACES);
				setState(333);
				code_block();
				setState(334);
				match(CLOSE_BRACES);
				setState(335);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				match(OPEN_BRACES);
				setState(344);
				code_block();
				setState(345);
				match(CLOSE_BRACES);
				setState(346);
				elseIf_conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(OPEN_BRACES);
				setState(353);
				code_block();
				setState(354);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(359);
			match(ELSE);
			setState(360);
			match(OPEN_BRACES);
			setState(361);
			code_block();
			setState(362);
			match(CLOSE_BRACES);
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Darth_CoderParser.AND, 0); }
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public AndExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToCondition2Context extends ConditionContext {
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public ToCondition2Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToCondition2(this);
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
			_localctx = new ToCondition2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(365);
			condition2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(367);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(368);
					match(AND);
					setState(369);
					condition2(0);
					}
					} 
				}
				setState(374);
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

	public static class Condition2Context extends ParserRuleContext {
		public Condition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition2; }
	 
		public Condition2Context() { }
		public void copyFrom(Condition2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToCondition3Context extends Condition2Context {
		public Condition3Context condition3() {
			return getRuleContext(Condition3Context.class,0);
		}
		public ToCondition3Context(Condition2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToCondition3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends Condition2Context {
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public TerminalNode OR() { return getToken(Darth_CoderParser.OR, 0); }
		public Condition3Context condition3() {
			return getRuleContext(Condition3Context.class,0);
		}
		public OrExprContext(Condition2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitOrExpr(this);
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
			_localctx = new ToCondition3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(376);
			condition3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new Condition2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition2);
					setState(378);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(379);
					match(OR);
					setState(380);
					condition3(0);
					}
					} 
				}
				setState(385);
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

	public static class Condition3Context extends ParserRuleContext {
		public Condition3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition3; }
	 
		public Condition3Context() { }
		public void copyFrom(Condition3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExprContext extends Condition3Context {
		public Token op;
		public Condition3Context condition3() {
			return getRuleContext(Condition3Context.class,0);
		}
		public Condition4Context condition4() {
			return getRuleContext(Condition4Context.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(Darth_CoderParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(Darth_CoderParser.EQUAL_EQUAL, 0); }
		public EqualityExprContext(Condition3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToCondition4Context extends Condition3Context {
		public Condition4Context condition4() {
			return getRuleContext(Condition4Context.class,0);
		}
		public ToCondition4Context(Condition3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToCondition4(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToCondition4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(387);
			condition4(0);
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
					_localctx = new EqualityExprContext(new Condition3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition3);
					setState(389);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(390);
					((EqualityExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NOT_EQUAL || _la==EQUAL_EQUAL) ) {
						((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(391);
					condition4(0);
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

	public static class Condition4Context extends ParserRuleContext {
		public Condition4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition4; }
	 
		public Condition4Context() { }
		public void copyFrom(Condition4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToGenComparisonContext extends Condition4Context {
		public Gen_comparisonContext gen_comparison() {
			return getRuleContext(Gen_comparisonContext.class,0);
		}
		public ToGenComparisonContext(Condition4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToGenComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends Condition4Context {
		public Token op;
		public Condition4Context condition4() {
			return getRuleContext(Condition4Context.class,0);
		}
		public Gen_comparisonContext gen_comparison() {
			return getRuleContext(Gen_comparisonContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(Darth_CoderParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Darth_CoderParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO() { return getToken(Darth_CoderParser.GREATER_THAN_EQUAL_TO, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO() { return getToken(Darth_CoderParser.LESS_THAN_EQUAL_TO, 0); }
		public RelationalExprContext(Condition4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitRelationalExpr(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToGenComparisonContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(398);
			gen_comparison();
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExprContext(new Condition4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition4);
					setState(400);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(401);
					((RelationalExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_EQUAL_TO) | (1L << GREATER_THAN_EQUAL_TO))) != 0)) ) {
						((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(402);
					gen_comparison();
					}
					} 
				}
				setState(407);
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

	public static class Gen_comparisonContext extends ParserRuleContext {
		public Gen_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_comparison; }
	 
		public Gen_comparisonContext() { }
		public void copyFrom(Gen_comparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotBracketCondContext extends Gen_comparisonContext {
		public TerminalNode NOT() { return getToken(Darth_CoderParser.NOT, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public NotBracketCondContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitNotBracketCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExprContext extends Gen_comparisonContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ToExprContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketCondContext extends Gen_comparisonContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public BracketCondContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitBracketCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Gen_comparisonContext {
		public TerminalNode LIGHT_SIDE() { return getToken(Darth_CoderParser.LIGHT_SIDE, 0); }
		public TrueContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Gen_comparisonContext {
		public TerminalNode DARK_SIDE() { return getToken(Darth_CoderParser.DARK_SIDE, 0); }
		public FalseContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToVarIdenContext extends Gen_comparisonContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ToVarIdenContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToVarIden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_comparisonContext gen_comparison() throws RecognitionException {
		Gen_comparisonContext _localctx = new Gen_comparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_gen_comparison);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBracketCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(NOT);
				setState(410);
				match(OPEN_SQUARE_BRACKET);
				setState(411);
				condition(0);
				setState(412);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 3:
				_localctx = new BracketCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(OPEN_SQUARE_BRACKET);
				setState(415);
				condition(0);
				setState(416);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 4:
				_localctx = new ToVarIdenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				var_iden();
				}
				break;
			case 5:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(LIGHT_SIDE);
				}
				break;
			case 6:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
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
			setState(427);
			switch (_input.LA(1)) {
			case ARRAY_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				less_than();
				}
				break;
			case ARRAY_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				greater_than();
				}
				break;
			case GREATER_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				greater_than_or_equal_to();
				}
				break;
			case LESS_THAN_EQUAL_TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
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
			setState(431);
			switch (_input.LA(1)) {
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				not_equal();
				}
				break;
			case EQUAL_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
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
			setState(433);
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
			setState(435);
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
			setState(437);
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
			setState(439);
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
			setState(441);
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
			setState(443);
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
			setState(445);
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
			setState(447);
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
			setState(449);
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
			setState(451);
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
			setState(453);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				data_type();
				setState(456);
				func_iden();
				setState(457);
				match(OPEN_SQUARE_BRACKET);
				setState(458);
				parameter();
				setState(459);
				match(CLOSE_SQUARE_BRACKET);
				setState(460);
				match(OPEN_BRACES);
				setState(461);
				code_block();
				setState(463);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(462);
					return_statement();
					}
				}

				setState(465);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				data_type();
				setState(468);
				func_iden();
				setState(469);
				match(OPEN_SQUARE_BRACKET);
				setState(470);
				match(CLOSE_SQUARE_BRACKET);
				setState(471);
				match(OPEN_BRACES);
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
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				data_type();
				setState(479);
				func_iden();
				setState(480);
				match(OPEN_SQUARE_BRACKET);
				setState(481);
				parameter();
				setState(482);
				match(CLOSE_SQUARE_BRACKET);
				setState(483);
				match(OPEN_BRACES);
				setState(485);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(484);
					return_statement();
					}
				}

				setState(487);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				data_type();
				setState(490);
				func_iden();
				setState(491);
				match(OPEN_SQUARE_BRACKET);
				setState(492);
				match(CLOSE_SQUARE_BRACKET);
				setState(493);
				match(OPEN_BRACES);
				setState(495);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(494);
					return_statement();
					}
				}

				setState(497);
				match(CLOSE_BRACES);
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
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(RETURN);
				setState(502);
				literal();
				setState(503);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(RETURN);
				setState(506);
				var_iden();
				setState(507);
				match(TERMINAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(RETURN);
				setState(510);
				expr(0);
				setState(511);
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
			setState(515);
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
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				data_type();
				setState(518);
				match(VAR_IDEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				data_type();
				setState(521);
				match(VAR_IDEN);
				setState(522);
				match(COMMA);
				setState(523);
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
			setState(527);
			match(CONST_DEC);
			setState(528);
			data_type();
			setState(529);
			statement();
			setState(530);
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
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
	 
		public Var_decContext() { }
		public void copyFrom(Var_decContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDecFourTypesContext extends Var_decContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public VarDecFourTypesContext(Var_decContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarDecFourTypes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecBooleanContext extends Var_decContext {
		public TerminalNode SIDE() { return getToken(Darth_CoderParser.SIDE, 0); }
		public Boolean_statementContext boolean_statement() {
			return getRuleContext(Boolean_statementContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public VarDecBooleanContext(Var_decContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarDecBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecVarIdenFourTypesContext extends Var_decContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public VarDecVarIdenFourTypesContext(Var_decContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarDecVarIdenFourTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_var_dec);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new VarDecFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				data_type();
				setState(533);
				statement();
				setState(534);
				match(TERMINAL);
				}
				break;
			case 2:
				_localctx = new VarDecVarIdenFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				data_type();
				setState(537);
				var_iden();
				setState(538);
				match(TERMINAL);
				}
				break;
			case 3:
				_localctx = new VarDecBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(SIDE);
				setState(541);
				boolean_statement();
				setState(542);
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
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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
		public Boolean_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assignment; }
	 
		public Boolean_assignmentContext() { }
		public void copyFrom(Boolean_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarBooleanTrueContext extends Boolean_assignmentContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public TerminalNode LIGHT_SIDE() { return getToken(Darth_CoderParser.LIGHT_SIDE, 0); }
		public VarBooleanTrueContext(Boolean_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarBooleanTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBooleanFalseContext extends Boolean_assignmentContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public TerminalNode DARK_SIDE() { return getToken(Darth_CoderParser.DARK_SIDE, 0); }
		public VarBooleanFalseContext(Boolean_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarBooleanFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_assignmentContext boolean_assignment() throws RecognitionException {
		Boolean_assignmentContext _localctx = new Boolean_assignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolean_assignment);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new VarBooleanTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				var_iden();
				setState(551);
				match(EQUAL);
				setState(552);
				match(LIGHT_SIDE);
				}
				break;
			case 2:
				_localctx = new VarBooleanFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				var_iden();
				setState(555);
				match(EQUAL);
				setState(556);
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
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				reg_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
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
			setState(564);
			var_iden();
			setState(565);
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
			setState(567);
			var_iden();
			setState(568);
			match(EQUAL);
			setState(569);
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
			setState(571);
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
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				var_iden();
				setState(574);
				match(INCREMENT_OPERATOR);
				setState(575);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				var_iden();
				setState(578);
				match(DECREMENT_OPERATOR);
				setState(579);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(Darth_CoderParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Darth_CoderParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExpr2Context extends ExprContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ToExpr2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToExpr2(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToExpr2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(584);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(586);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(587);
					((AdditiveExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(588);
					expr2(0);
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExprContext extends Expr2Context {
		public Token op;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Gen_varContext gen_var() {
			return getRuleContext(Gen_varContext.class,0);
		}
		public TerminalNode MULT() { return getToken(Darth_CoderParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(Darth_CoderParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Darth_CoderParser.MOD, 0); }
		public MultiplicativeExprContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToGenVarContext extends Expr2Context {
		public Gen_varContext gen_var() {
			return getRuleContext(Gen_varContext.class,0);
		}
		public ToGenVarContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToGenVar(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToGenVarContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(595);
			gen_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(new Expr2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(597);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(598);
					((MultiplicativeExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(599);
					gen_var();
					}
					} 
				}
				setState(604);
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

	public static class Gen_varContext extends ParserRuleContext {
		public Gen_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_var; }
	 
		public Gen_varContext() { }
		public void copyFrom(Gen_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExprContext extends Gen_varContext {
		public Token op;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Darth_CoderParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(Darth_CoderParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Darth_CoderParser.MINUS, 0); }
		public UnaryExprContext(Gen_varContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToVarContext extends Gen_varContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ToVarContext(Gen_varContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_varContext gen_var() throws RecognitionException {
		Gen_varContext _localctx = new Gen_varContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_gen_var);
		int _la;
		try {
			setState(608);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(606);
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
				_localctx = new ToVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
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
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupExprContext extends VarContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Darth_CoderParser.OPEN_SQUARE_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Darth_CoderParser.CLOSE_SQUARE_BRACKET, 0); }
		public GroupExprContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitGroupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToFunc_callContext extends VarContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ToFunc_callContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToLiteralContext extends VarContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ToLiteralContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToVar_IdenContext extends VarContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public ToVar_IdenContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToVar_Iden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_var);
		try {
			setState(617);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				_localctx = new ToLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				literal();
				}
				break;
			case FUNC_IDEN:
				_localctx = new ToFunc_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				func_call();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(OPEN_SQUARE_BRACKET);
				setState(613);
				expr(0);
				setState(614);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case VAR_IDEN:
				_localctx = new ToVar_IdenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
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
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
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
		enterRule(_localctx, 98, RULE_array);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				array_open();
				setState(620);
				index();
				setState(621);
				array_close();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				array_open();
				setState(624);
				index();
				setState(625);
				array_close();
				setState(626);
				equal();
				setState(627);
				match(OPEN_BRACES);
				setState(629);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << VAR_IDEN) | (1L << FUNC_IDEN) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
					{
					setState(628);
					value();
					}
				}

				setState(631);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				array_open();
				setState(634);
				index();
				setState(635);
				array_close();
				setState(636);
				equal();
				setState(637);
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
		enterRule(_localctx, 100, RULE_array_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		enterRule(_localctx, 102, RULE_array_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
		enterRule(_localctx, 104, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		enterRule(_localctx, 106, RULE_index);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				var_iden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
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
		enterRule(_localctx, 108, RULE_value);
		int _la;
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new SingleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				var();
				}
				break;
			case 2:
				_localctx = new MoreLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				var();
				setState(654);
				match(COMMA);
				setState(656);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(655);
					match(WS);
					}
				}

				setState(658);
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
		enterRule(_localctx, 110, RULE_data_type);
		try {
			setState(666);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				galactic_credit();
				}
				break;
			case IMPERIAL_CREDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				imperial_credit();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				unit();
				}
				break;
			case LEGION:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
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
		enterRule(_localctx, 112, RULE_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		enterRule(_localctx, 114, RULE_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		enterRule(_localctx, 116, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		enterRule(_localctx, 118, RULE_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
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
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Character_literalContext character_literal() {
			return getRuleContext(Character_literalContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal);
		try {
			setState(680);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				string_literal();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				character_literal();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				int_literal();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
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
		enterRule(_localctx, 122, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		enterRule(_localctx, 124, RULE_character_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		enterRule(_localctx, 126, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 128, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u02b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u008d"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b9\n\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00da\n\n\3\n\5\n\u00dd\n\n\3\n\5\n"+
		"\u00e0\n\n\3\n\5\n\u00e3\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0136\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0141"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0154\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0168\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0175\n\20\f\20\16\20\u0178\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0180\n\21\f\21\16\21\u0183\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u018b\n\22\f\22\16\22\u018e\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0196\n\23\f\23\16\23\u0199\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u01a8\n\24\3\25\3\25\3\25\3\25\5\25\u01ae\n\25\3\26\3\26\5\26\u01b2"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u01d2\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01dd\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e8\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01f2\n\"\3\"\3\"\5\"\u01f6\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u0204\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0210\n%\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0223\n"+
		"\'\3(\3(\5(\u0227\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0231\n)\3*\3*\5*\u0235"+
		"\n*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0248\n.\3/"+
		"\3/\3/\3/\3/\3/\7/\u0250\n/\f/\16/\u0253\13/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u025b\n\60\f\60\16\60\u025e\13\60\3\61\3\61\3\61\5\61\u0263"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u026c\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0278\n\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0282\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\3\67\5\67\u028d\n\67\38\38\38\38\58\u0293\n8\38\38\58\u0297\n8\3"+
		"9\39\39\39\59\u029d\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u02ab\n"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3B\2\b\36 \"$\\^C\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\2\7\3\2\66\67\3\2\62\65\3\2\7\b\3\2\t\13\4\2\7\b\17\17\u02c1"+
		"\2\u008c\3\2\2\2\4\u00b8\3\2\2\2\6\u00ba\3\2\2\2\b\u00bc\3\2\2\2\n\u00be"+
		"\3\2\2\2\f\u00c4\3\2\2\2\16\u00ca\3\2\2\2\20\u00d0\3\2\2\2\22\u00d6\3"+
		"\2\2\2\24\u0135\3\2\2\2\26\u0140\3\2\2\2\30\u0153\3\2\2\2\32\u0167\3\2"+
		"\2\2\34\u0169\3\2\2\2\36\u016e\3\2\2\2 \u0179\3\2\2\2\"\u0184\3\2\2\2"+
		"$\u018f\3\2\2\2&\u01a7\3\2\2\2(\u01ad\3\2\2\2*\u01b1\3\2\2\2,\u01b3\3"+
		"\2\2\2.\u01b5\3\2\2\2\60\u01b7\3\2\2\2\62\u01b9\3\2\2\2\64\u01bb\3\2\2"+
		"\2\66\u01bd\3\2\2\28\u01bf\3\2\2\2:\u01c1\3\2\2\2<\u01c3\3\2\2\2>\u01c5"+
		"\3\2\2\2@\u01c7\3\2\2\2B\u01f5\3\2\2\2D\u0203\3\2\2\2F\u0205\3\2\2\2H"+
		"\u020f\3\2\2\2J\u0211\3\2\2\2L\u0222\3\2\2\2N\u0226\3\2\2\2P\u0230\3\2"+
		"\2\2R\u0234\3\2\2\2T\u0236\3\2\2\2V\u0239\3\2\2\2X\u023d\3\2\2\2Z\u0247"+
		"\3\2\2\2\\\u0249\3\2\2\2^\u0254\3\2\2\2`\u0262\3\2\2\2b\u026b\3\2\2\2"+
		"d\u0281\3\2\2\2f\u0283\3\2\2\2h\u0285\3\2\2\2j\u0287\3\2\2\2l\u028c\3"+
		"\2\2\2n\u0296\3\2\2\2p\u029c\3\2\2\2r\u029e\3\2\2\2t\u02a0\3\2\2\2v\u02a2"+
		"\3\2\2\2x\u02a4\3\2\2\2z\u02aa\3\2\2\2|\u02ac\3\2\2\2~\u02ae\3\2\2\2\u0080"+
		"\u02b0\3\2\2\2\u0082\u02b2\3\2\2\2\u0084\u0085\5B\"\2\u0085\u0086\5\2"+
		"\2\2\u0086\u008d\3\2\2\2\u0087\u0088\7;\2\2\u0088\u0089\7-\2\2\u0089\u008a"+
		"\5\4\3\2\u008a\u008b\7.\2\2\u008b\u008d\3\2\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u0087\3\2\2\2\u008d\3\3\2\2\2\u008e\u008f\5L\'\2\u008f\u0090\5\4\3\2"+
		"\u0090\u00b9\3\2\2\2\u0091\u0092\5V,\2\u0092\u0093\7\31\2\2\u0093\u0094"+
		"\5\4\3\2\u0094\u00b9\3\2\2\2\u0095\u0096\5T+\2\u0096\u0097\7\31\2\2\u0097"+
		"\u0098\5\4\3\2\u0098\u00b9\3\2\2\2\u0099\u009a\5\30\r\2\u009a\u009b\5"+
		"\4\3\2\u009b\u00b9\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\5\4\3\2\u009e"+
		"\u00b9\3\2\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\5\4\3\2\u00a1\u00b9\3"+
		"\2\2\2\u00a2\u00a3\5Z.\2\u00a3\u00a4\5\4\3\2\u00a4\u00b9\3\2\2\2\u00a5"+
		"\u00a6\5\n\6\2\u00a6\u00a7\5\4\3\2\u00a7\u00b9\3\2\2\2\u00a8\u00a9\5\f"+
		"\7\2\u00a9\u00aa\5\4\3\2\u00aa\u00b9\3\2\2\2\u00ab\u00ac\5\16\b\2\u00ac"+
		"\u00ad\5\4\3\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\5"+
		"\4\3\2\u00b0\u00b9\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\5\4\3\2\u00b3"+
		"\u00b9\3\2\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\5\4\3\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b9\5\6\4\2\u00b8\u008e\3\2\2\2\u00b8\u0091\3\2\2\2\u00b8"+
		"\u0095\3\2\2\2\u00b8\u0099\3\2\2\2\u00b8\u009c\3\2\2\2\u00b8\u009f\3\2"+
		"\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8"+
		"\u00ab\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\5\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\7\3"+
		"\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\t\3\2\2\2\u00be\u00bf\7=\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c1\5X-\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7\31\2\2\u00c3"+
		"\13\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7/\2\2\u00c6\u00c7\5X-\2\u00c7"+
		"\u00c8\7\60\2\2\u00c8\u00c9\7\31\2\2\u00c9\r\3\2\2\2\u00ca\u00cb\7>\2"+
		"\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\5X-\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf"+
		"\7\31\2\2\u00cf\17\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\7/\2\2\u00d2"+
		"\u00d3\5X-\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\31\2\2\u00d5\21\3\2\2"+
		"\2\u00d6\u00d7\7@\2\2\u00d7\u00d9\7/\2\2\u00d8\u00da\5X-\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5\\/\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7\26"+
		"\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00e3\5\26\f\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7\31\2\2\u00e6\23\3\2\2\2\u00e7"+
		"\u00e8\7(\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\60"+
		"\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7.\2\2\u00ee\u0136"+
		"\3\2\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"\u00f3\7-\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7.\2\2\u00f5\u0136\3\2\2"+
		"\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\7/\2\2\u00f8\u00f9\7\60\2\2\u00f9\u00fa"+
		"\7-\2\2\u00fa\u0136\7.\2\2\u00fb\u00fc\7\'\2\2\u00fc\u00fd\7-\2\2\u00fd"+
		"\u00fe\5\4\3\2\u00fe\u00ff\7.\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7/\2"+
		"\2\u0101\u0102\5\36\20\2\u0102\u0103\7\60\2\2\u0103\u0104\7\31\2\2\u0104"+
		"\u0136\3\2\2\2\u0105\u0106\7\'\2\2\u0106\u0107\7-\2\2\u0107\u0108\5\4"+
		"\3\2\u0108\u0109\7.\2\2\u0109\u010a\7(\2\2\u010a\u010b\7/\2\2\u010b\u010c"+
		"\7\60\2\2\u010c\u010d\7\31\2\2\u010d\u0136\3\2\2\2\u010e\u010f\7\'\2\2"+
		"\u010f\u0110\7-\2\2\u0110\u0111\7.\2\2\u0111\u0112\7(\2\2\u0112\u0113"+
		"\7/\2\2\u0113\u0114\5\36\20\2\u0114\u0115\7\60\2\2\u0115\u0116\7\31\2"+
		"\2\u0116\u0136\3\2\2\2\u0117\u0118\7\'\2\2\u0118\u0119\7-\2\2\u0119\u011a"+
		"\7.\2\2\u011a\u011b\7(\2\2\u011b\u011c\7/\2\2\u011c\u011d\7\60\2\2\u011d"+
		"\u0136\7\31\2\2\u011e\u011f\7&\2\2\u011f\u0120\7/\2\2\u0120\u0121\5V,"+
		"\2\u0121\u0122\7\31\2\2\u0122\u0123\5\36\20\2\u0123\u0124\7\31\2\2\u0124"+
		"\u0125\5Z.\2\u0125\u0126\7\60\2\2\u0126\u0127\7-\2\2\u0127\u0128\5\4\3"+
		"\2\u0128\u0129\7.\2\2\u0129\u0136\3\2\2\2\u012a\u012b\7&\2\2\u012b\u012c"+
		"\7/\2\2\u012c\u012d\5V,\2\u012d\u012e\7\31\2\2\u012e\u012f\5\36\20\2\u012f"+
		"\u0130\7\31\2\2\u0130\u0131\5Z.\2\u0131\u0132\7\60\2\2\u0132\u0133\7-"+
		"\2\2\u0133\u0134\7.\2\2\u0134\u0136\3\2\2\2\u0135\u00e7\3\2\2\2\u0135"+
		"\u00ef\3\2\2\2\u0135\u00f6\3\2\2\2\u0135\u00fb\3\2\2\2\u0135\u0105\3\2"+
		"\2\2\u0135\u010e\3\2\2\2\u0135\u0117\3\2\2\2\u0135\u011e\3\2\2\2\u0135"+
		"\u012a\3\2\2\2\u0136\25\3\2\2\2\u0137\u0138\5F$\2\u0138\u0139\7/\2\2\u0139"+
		"\u013a\5n8\2\u013a\u013b\7\60\2\2\u013b\u0141\3\2\2\2\u013c\u013d\5F$"+
		"\2\u013d\u013e\7/\2\2\u013e\u013f\7\60\2\2\u013f\u0141\3\2\2\2\u0140\u0137"+
		"\3\2\2\2\u0140\u013c\3\2\2\2\u0141\27\3\2\2\2\u0142\u0143\7#\2\2\u0143"+
		"\u0144\7/\2\2\u0144\u0145\5\36\20\2\u0145\u0146\7\60\2\2\u0146\u0147\7"+
		"-\2\2\u0147\u0148\5\4\3\2\u0148\u0149\7.\2\2\u0149\u0154\3\2\2\2\u014a"+
		"\u014b\7#\2\2\u014b\u014c\7/\2\2\u014c\u014d\5\36\20\2\u014d\u014e\7\60"+
		"\2\2\u014e\u014f\7-\2\2\u014f\u0150\5\4\3\2\u0150\u0151\7.\2\2\u0151\u0152"+
		"\5\32\16\2\u0152\u0154\3\2\2\2\u0153\u0142\3\2\2\2\u0153\u014a\3\2\2\2"+
		"\u0154\31\3\2\2\2\u0155\u0156\7$\2\2\u0156\u0157\7/\2\2\u0157\u0158\5"+
		"\36\20\2\u0158\u0159\7\60\2\2\u0159\u015a\7-\2\2\u015a\u015b\5\4\3\2\u015b"+
		"\u015c\7.\2\2\u015c\u015d\5\32\16\2\u015d\u0168\3\2\2\2\u015e\u015f\7"+
		"$\2\2\u015f\u0160\7/\2\2\u0160\u0161\5\36\20\2\u0161\u0162\7\60\2\2\u0162"+
		"\u0163\7-\2\2\u0163\u0164\5\4\3\2\u0164\u0165\7.\2\2\u0165\u0168\3\2\2"+
		"\2\u0166\u0168\5\34\17\2\u0167\u0155\3\2\2\2\u0167\u015e\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\33\3\2\2\2\u0169\u016a\7%\2\2\u016a\u016b\7-\2\2"+
		"\u016b\u016c\5\4\3\2\u016c\u016d\7.\2\2\u016d\35\3\2\2\2\u016e\u016f\b"+
		"\20\1\2\u016f\u0170\5 \21\2\u0170\u0176\3\2\2\2\u0171\u0172\f\4\2\2\u0172"+
		"\u0173\78\2\2\u0173\u0175\5 \21\2\u0174\u0171\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\37\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017a\b\21\1\2\u017a\u017b\5\"\22\2\u017b\u0181\3\2\2\2"+
		"\u017c\u017d\f\4\2\2\u017d\u017e\79\2\2\u017e\u0180\5\"\22\2\u017f\u017c"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"!\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\b\22\1\2\u0185\u0186\5$\23\2"+
		"\u0186\u018c\3\2\2\2\u0187\u0188\f\4\2\2\u0188\u0189\t\2\2\2\u0189\u018b"+
		"\5$\23\2\u018a\u0187\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d#\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\b\23\1\2"+
		"\u0190\u0191\5&\24\2\u0191\u0197\3\2\2\2\u0192\u0193\f\4\2\2\u0193\u0194"+
		"\t\3\2\2\u0194\u0196\5&\24\2\u0195\u0192\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198%\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u019a\u01a8\5\\/\2\u019b\u019c\7\17\2\2\u019c\u019d\7/\2\2\u019d\u019e"+
		"\5\36\20\2\u019e\u019f\7\60\2\2\u019f\u01a8\3\2\2\2\u01a0\u01a1\7/\2\2"+
		"\u01a1\u01a2\5\36\20\2\u01a2\u01a3\7\60\2\2\u01a3\u01a8\3\2\2\2\u01a4"+
		"\u01a8\5X-\2\u01a5\u01a8\7\37\2\2\u01a6\u01a8\7 \2\2\u01a7\u019a\3\2\2"+
		"\2\u01a7\u019b\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\'\3\2\2\2\u01a9\u01ae\58\35\2\u01aa"+
		"\u01ae\5:\36\2\u01ab\u01ae\5<\37\2\u01ac\u01ae\5> \2\u01ad\u01a9\3\2\2"+
		"\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae)"+
		"\3\2\2\2\u01af\u01b2\5\64\33\2\u01b0\u01b2\5\66\34\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b0\3\2\2\2\u01b2+\3\2\2\2\u01b3\u01b4\5\62\32\2\u01b4-\3\2"+
		"\2\2\u01b5\u01b6\5\60\31\2\u01b6/\3\2\2\2\u01b7\u01b8\79\2\2\u01b8\61"+
		"\3\2\2\2\u01b9\u01ba\78\2\2\u01ba\63\3\2\2\2\u01bb\u01bc\7\66\2\2\u01bc"+
		"\65\3\2\2\2\u01bd\u01be\7\67\2\2\u01be\67\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0"+
		"9\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2;\3\2\2\2\u01c3\u01c4\7\65\2\2\u01c4"+
		"=\3\2\2\2\u01c5\u01c6\7\64\2\2\u01c6?\3\2\2\2\u01c7\u01c8\7\17\2\2\u01c8"+
		"A\3\2\2\2\u01c9\u01ca\5p9\2\u01ca\u01cb\5F$\2\u01cb\u01cc\7/\2\2\u01cc"+
		"\u01cd\5H%\2\u01cd\u01ce\7\60\2\2\u01ce\u01cf\7-\2\2\u01cf\u01d1\5\4\3"+
		"\2\u01d0\u01d2\5D#\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d4\7.\2\2\u01d4\u01f6\3\2\2\2\u01d5\u01d6\5p9\2\u01d6"+
		"\u01d7\5F$\2\u01d7\u01d8\7/\2\2\u01d8\u01d9\7\60\2\2\u01d9\u01da\7-\2"+
		"\2\u01da\u01dc\5\4\3\2\u01db\u01dd\5D#\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7.\2\2\u01df\u01f6\3\2\2\2\u01e0"+
		"\u01e1\5p9\2\u01e1\u01e2\5F$\2\u01e2\u01e3\7/\2\2\u01e3\u01e4\5H%\2\u01e4"+
		"\u01e5\7\60\2\2\u01e5\u01e7\7-\2\2\u01e6\u01e8\5D#\2\u01e7\u01e6\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7.\2\2\u01ea\u01f6"+
		"\3\2\2\2\u01eb\u01ec\5p9\2\u01ec\u01ed\5F$\2\u01ed\u01ee\7/\2\2\u01ee"+
		"\u01ef\7\60\2\2\u01ef\u01f1\7-\2\2\u01f0\u01f2\5D#\2\u01f1\u01f0\3\2\2"+
		"\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7.\2\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01c9\3\2\2\2\u01f5\u01d5\3\2\2\2\u01f5\u01e0\3\2\2\2\u01f5"+
		"\u01eb\3\2\2\2\u01f6C\3\2\2\2\u01f7\u01f8\7*\2\2\u01f8\u01f9\5z>\2\u01f9"+
		"\u01fa\7\31\2\2\u01fa\u0204\3\2\2\2\u01fb\u01fc\7*\2\2\u01fc\u01fd\5X"+
		"-\2\u01fd\u01fe\7\31\2\2\u01fe\u0204\3\2\2\2\u01ff\u0200\7*\2\2\u0200"+
		"\u0201\5\\/\2\u0201\u0202\7\31\2\2\u0202\u0204\3\2\2\2\u0203\u01f7\3\2"+
		"\2\2\u0203\u01fb\3\2\2\2\u0203\u01ff\3\2\2\2\u0204E\3\2\2\2\u0205\u0206"+
		"\7\25\2\2\u0206G\3\2\2\2\u0207\u0208\5p9\2\u0208\u0209\7\24\2\2\u0209"+
		"\u0210\3\2\2\2\u020a\u020b\5p9\2\u020b\u020c\7\24\2\2\u020c\u020d\7\61"+
		"\2\2\u020d\u020e\5H%\2\u020e\u0210\3\2\2\2\u020f\u0207\3\2\2\2\u020f\u020a"+
		"\3\2\2\2\u0210I\3\2\2\2\u0211\u0212\7!\2\2\u0212\u0213\5p9\2\u0213\u0214"+
		"\5R*\2\u0214\u0215\7\31\2\2\u0215K\3\2\2\2\u0216\u0217\5p9\2\u0217\u0218"+
		"\5R*\2\u0218\u0219\7\31\2\2\u0219\u0223\3\2\2\2\u021a\u021b\5p9\2\u021b"+
		"\u021c\5X-\2\u021c\u021d\7\31\2\2\u021d\u0223\3\2\2\2\u021e\u021f\7\36"+
		"\2\2\u021f\u0220\5N(\2\u0220\u0221\7\31\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0216\3\2\2\2\u0222\u021a\3\2\2\2\u0222\u021e\3\2\2\2\u0223M\3\2\2\2"+
		"\u0224\u0227\5X-\2\u0225\u0227\5P)\2\u0226\u0224\3\2\2\2\u0226\u0225\3"+
		"\2\2\2\u0227O\3\2\2\2\u0228\u0229\5X-\2\u0229\u022a\7\16\2\2\u022a\u022b"+
		"\7\37\2\2\u022b\u0231\3\2\2\2\u022c\u022d\5X-\2\u022d\u022e\7\16\2\2\u022e"+
		"\u022f\7 \2\2\u022f\u0231\3\2\2\2\u0230\u0228\3\2\2\2\u0230\u022c\3\2"+
		"\2\2\u0231Q\3\2\2\2\u0232\u0235\5V,\2\u0233\u0235\5T+\2\u0234\u0232\3"+
		"\2\2\2\u0234\u0233\3\2\2\2\u0235S\3\2\2\2\u0236\u0237\5X-\2\u0237\u0238"+
		"\5d\63\2\u0238U\3\2\2\2\u0239\u023a\5X-\2\u023a\u023b\7\16\2\2\u023b\u023c"+
		"\5\\/\2\u023cW\3\2\2\2\u023d\u023e\7\24\2\2\u023eY\3\2\2\2\u023f\u0240"+
		"\5X-\2\u0240\u0241\7\22\2\2\u0241\u0242\7\31\2\2\u0242\u0248\3\2\2\2\u0243"+
		"\u0244\5X-\2\u0244\u0245\7\23\2\2\u0245\u0246\7\31\2\2\u0246\u0248\3\2"+
		"\2\2\u0247\u023f\3\2\2\2\u0247\u0243\3\2\2\2\u0248[\3\2\2\2\u0249\u024a"+
		"\b/\1\2\u024a\u024b\5^\60\2\u024b\u0251\3\2\2\2\u024c\u024d\f\4\2\2\u024d"+
		"\u024e\t\4\2\2\u024e\u0250\5^\60\2\u024f\u024c\3\2\2\2\u0250\u0253\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252]\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0255\b\60\1\2\u0255\u0256\5`\61\2\u0256\u025c\3\2\2\2"+
		"\u0257\u0258\f\4\2\2\u0258\u0259\t\5\2\2\u0259\u025b\5`\61\2\u025a\u0257"+
		"\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"_\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\t\6\2\2\u0260\u0263\5b\62\2"+
		"\u0261\u0263\5b\62\2\u0262\u025f\3\2\2\2\u0262\u0261\3\2\2\2\u0263a\3"+
		"\2\2\2\u0264\u026c\5z>\2\u0265\u026c\5\26\f\2\u0266\u0267\7/\2\2\u0267"+
		"\u0268\5\\/\2\u0268\u0269\7\60\2\2\u0269\u026c\3\2\2\2\u026a\u026c\5X"+
		"-\2\u026b\u0264\3\2\2\2\u026b\u0265\3\2\2\2\u026b\u0266\3\2\2\2\u026b"+
		"\u026a\3\2\2\2\u026cc\3\2\2\2\u026d\u026e\5f\64\2\u026e\u026f\5l\67\2"+
		"\u026f\u0270\5h\65\2\u0270\u0282\3\2\2\2\u0271\u0272\5f\64\2\u0272\u0273"+
		"\5l\67\2\u0273\u0274\5h\65\2\u0274\u0275\5j\66\2\u0275\u0277\7-\2\2\u0276"+
		"\u0278\5n8\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2"+
		"\2\u0279\u027a\7.\2\2\u027a\u0282\3\2\2\2\u027b\u027c\5f\64\2\u027c\u027d"+
		"\5l\67\2\u027d\u027e\5h\65\2\u027e\u027f\5j\66\2\u027f\u0280\5b\62\2\u0280"+
		"\u0282\3\2\2\2\u0281\u026d\3\2\2\2\u0281\u0271\3\2\2\2\u0281\u027b\3\2"+
		"\2\2\u0282e\3\2\2\2\u0283\u0284\7+\2\2\u0284g\3\2\2\2\u0285\u0286\7,\2"+
		"\2\u0286i\3\2\2\2\u0287\u0288\7\16\2\2\u0288k\3\2\2\2\u0289\u028d\7\3"+
		"\2\2\u028a\u028d\5X-\2\u028b\u028d\5\\/\2\u028c\u0289\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028b\3\2\2\2\u028dm\3\2\2\2\u028e\u0297\5b\62\2\u028f"+
		"\u0290\5b\62\2\u0290\u0292\7\61\2\2\u0291\u0293\7\6\2\2\u0292\u0291\3"+
		"\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\5n8\2\u0295"+
		"\u0297\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u028f\3\2\2\2\u0297o\3\2\2\2"+
		"\u0298\u029d\5r:\2\u0299\u029d\5t;\2\u029a\u029d\5v<\2\u029b\u029d\5x"+
		"=\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029dq\3\2\2\2\u029e\u029f\7\32\2\2\u029fs\3\2\2\2\u02a0"+
		"\u02a1\7\33\2\2\u02a1u\3\2\2\2\u02a2\u02a3\7\34\2\2\u02a3w\3\2\2\2\u02a4"+
		"\u02a5\7\35\2\2\u02a5y\3\2\2\2\u02a6\u02ab\5|?\2\u02a7\u02ab\5~@\2\u02a8"+
		"\u02ab\5\u0080A\2\u02a9\u02ab\5\u0082B\2\u02aa\u02a6\3\2\2\2\u02aa\u02a7"+
		"\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab{\3\2\2\2\u02ac"+
		"\u02ad\7\30\2\2\u02ad}\3\2\2\2\u02ae\u02af\7\26\2\2\u02af\177\3\2\2\2"+
		"\u02b0\u02b1\7\3\2\2\u02b1\u0081\3\2\2\2\u02b2\u02b3\7\4\2\2\u02b3\u0083"+
		"\3\2\2\2*\u008c\u00b8\u00d9\u00dc\u00df\u00e2\u0135\u0140\u0153\u0167"+
		"\u0176\u0181\u018c\u0197\u01a7\u01ad\u01b1\u01d1\u01dc\u01e7\u01f1\u01f5"+
		"\u0203\u020f\u0222\u0226\u0230\u0234\u0247\u0251\u025c\u0262\u026b\u0277"+
		"\u0281\u028c\u0292\u0296\u029c\u02aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
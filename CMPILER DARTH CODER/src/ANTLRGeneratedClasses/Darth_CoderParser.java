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
		RULE_gen_comparison = 18, RULE_func_dec = 19, RULE_return_statement = 20, 
		RULE_func_iden = 21, RULE_parameter = 22, RULE_constant_declaration = 23, 
		RULE_var_dec = 24, RULE_boolean_statement = 25, RULE_boolean_assignment = 26, 
		RULE_statement = 27, RULE_array_assignment = 28, RULE_reg_assignment = 29, 
		RULE_var_iden = 30, RULE_incr = 31, RULE_expr = 32, RULE_expr2 = 33, RULE_gen_var = 34, 
		RULE_var = 35, RULE_side = 36, RULE_array = 37, RULE_array_open = 38, 
		RULE_array_close = 39, RULE_equal = 40, RULE_index = 41, RULE_value = 42, 
		RULE_data_type = 43, RULE_galactic_credit = 44, RULE_imperial_credit = 45, 
		RULE_unit = 46, RULE_legion = 47, RULE_literal = 48, RULE_string_literal = 49, 
		RULE_character_literal = 50, RULE_int_literal = 51, RULE_float_literal = 52;
	public static final String[] ruleNames = {
		"start", "code_block", "epsilon", "comment", "scan_imperial_credit", "scan_galactic_credit", 
		"scan_unit", "scan_legion", "print", "iterative_con", "func_call", "if_conditional", 
		"elseIf_conditional", "else_conditional", "condition", "condition2", "condition3", 
		"condition4", "gen_comparison", "func_dec", "return_statement", "func_iden", 
		"parameter", "constant_declaration", "var_dec", "boolean_statement", "boolean_assignment", 
		"statement", "array_assignment", "reg_assignment", "var_iden", "incr", 
		"expr", "expr2", "gen_var", "var", "side", "array", "array_open", "array_close", 
		"equal", "index", "value", "data_type", "galactic_credit", "imperial_credit", 
		"unit", "legion", "literal", "string_literal", "character_literal", "int_literal", 
		"float_literal"
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
			setState(114);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
			case IMPERIAL_CREDIT:
			case UNIT:
			case LEGION:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				func_dec();
				setState(107);
				start();
				}
				break;
			case INITIATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(INITIATE);
				setState(110);
				match(OPEN_BRACES);
				setState(111);
				code_block();
				setState(112);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				var_dec();
				setState(117);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				reg_assignment();
				setState(120);
				match(TERMINAL);
				setState(121);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				array_assignment();
				setState(124);
				match(TERMINAL);
				setState(125);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				if_conditional();
				setState(128);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				iterative_con();
				setState(131);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				func_call();
				setState(134);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				incr();
				setState(137);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				scan_imperial_credit();
				setState(140);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				scan_galactic_credit();
				setState(143);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				scan_unit();
				setState(146);
				code_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				scan_legion();
				setState(149);
				code_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(151);
				print();
				setState(152);
				code_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(154);
				comment();
				setState(155);
				code_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
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
			setState(162);
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
			setState(164);
			match(SCAN_FLOAT);
			setState(165);
			match(OPEN_SQUARE_BRACKET);
			setState(166);
			var_iden();
			setState(167);
			match(CLOSE_SQUARE_BRACKET);
			setState(168);
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
			setState(170);
			match(SCAN_INTEGER);
			setState(171);
			match(OPEN_SQUARE_BRACKET);
			setState(172);
			var_iden();
			setState(173);
			match(CLOSE_SQUARE_BRACKET);
			setState(174);
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
			setState(176);
			match(SCAN_CHAR);
			setState(177);
			match(OPEN_SQUARE_BRACKET);
			setState(178);
			var_iden();
			setState(179);
			match(CLOSE_SQUARE_BRACKET);
			setState(180);
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
			setState(182);
			match(SCAN_STRING);
			setState(183);
			match(OPEN_SQUARE_BRACKET);
			setState(184);
			var_iden();
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
			setState(188);
			match(PRINT);
			setState(189);
			match(OPEN_SQUARE_BRACKET);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(190);
				var_iden();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(193);
				expr(0);
				}
				break;
			}
			setState(197);
			_la = _input.LA(1);
			if (_la==CHARACTER_LITERAL) {
				{
				setState(196);
				match(CHARACTER_LITERAL);
				}
			}

			setState(200);
			_la = _input.LA(1);
			if (_la==FUNC_IDEN) {
				{
				setState(199);
				func_call();
				}
			}

			setState(202);
			match(CLOSE_SQUARE_BRACKET);
			setState(203);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(WHILE);
				setState(206);
				match(OPEN_SQUARE_BRACKET);
				setState(207);
				condition(0);
				setState(208);
				match(CLOSE_SQUARE_BRACKET);
				setState(209);
				match(OPEN_BRACES);
				setState(210);
				code_block();
				setState(211);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(WHILE);
				setState(214);
				match(OPEN_SQUARE_BRACKET);
				setState(215);
				match(CLOSE_SQUARE_BRACKET);
				setState(216);
				match(OPEN_BRACES);
				setState(217);
				code_block();
				setState(218);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(WHILE);
				setState(221);
				match(OPEN_SQUARE_BRACKET);
				setState(222);
				match(CLOSE_SQUARE_BRACKET);
				setState(223);
				match(OPEN_BRACES);
				setState(224);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(DO);
				setState(226);
				match(OPEN_BRACES);
				setState(227);
				code_block();
				setState(228);
				match(CLOSE_BRACES);
				setState(229);
				match(WHILE);
				setState(230);
				match(OPEN_SQUARE_BRACKET);
				setState(231);
				condition(0);
				setState(232);
				match(CLOSE_SQUARE_BRACKET);
				setState(233);
				match(TERMINAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(DO);
				setState(236);
				match(OPEN_BRACES);
				setState(237);
				code_block();
				setState(238);
				match(CLOSE_BRACES);
				setState(239);
				match(WHILE);
				setState(240);
				match(OPEN_SQUARE_BRACKET);
				setState(241);
				match(CLOSE_SQUARE_BRACKET);
				setState(242);
				match(TERMINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(DO);
				setState(245);
				match(OPEN_BRACES);
				setState(246);
				match(CLOSE_BRACES);
				setState(247);
				match(WHILE);
				setState(248);
				match(OPEN_SQUARE_BRACKET);
				setState(249);
				condition(0);
				setState(250);
				match(CLOSE_SQUARE_BRACKET);
				setState(251);
				match(TERMINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(DO);
				setState(254);
				match(OPEN_BRACES);
				setState(255);
				match(CLOSE_BRACES);
				setState(256);
				match(WHILE);
				setState(257);
				match(OPEN_SQUARE_BRACKET);
				setState(258);
				match(CLOSE_SQUARE_BRACKET);
				setState(259);
				match(TERMINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				match(FOR);
				setState(261);
				match(OPEN_SQUARE_BRACKET);
				setState(262);
				reg_assignment();
				setState(263);
				match(TERMINAL);
				setState(264);
				condition(0);
				setState(265);
				match(TERMINAL);
				setState(266);
				incr();
				setState(267);
				match(CLOSE_SQUARE_BRACKET);
				setState(268);
				match(OPEN_BRACES);
				setState(269);
				code_block();
				setState(270);
				match(CLOSE_BRACES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				match(FOR);
				setState(273);
				match(OPEN_SQUARE_BRACKET);
				setState(274);
				reg_assignment();
				setState(275);
				match(TERMINAL);
				setState(276);
				condition(0);
				setState(277);
				match(TERMINAL);
				setState(278);
				incr();
				setState(279);
				match(CLOSE_SQUARE_BRACKET);
				setState(280);
				match(OPEN_BRACES);
				setState(281);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				func_iden();
				setState(286);
				match(OPEN_SQUARE_BRACKET);
				setState(287);
				value();
				setState(288);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				func_iden();
				setState(291);
				match(OPEN_SQUARE_BRACKET);
				setState(292);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(IF);
				setState(297);
				match(OPEN_SQUARE_BRACKET);
				setState(298);
				condition(0);
				setState(299);
				match(CLOSE_SQUARE_BRACKET);
				setState(300);
				match(OPEN_BRACES);
				setState(301);
				code_block();
				setState(302);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(IF);
				setState(305);
				match(OPEN_SQUARE_BRACKET);
				setState(306);
				condition(0);
				setState(307);
				match(CLOSE_SQUARE_BRACKET);
				setState(308);
				match(OPEN_BRACES);
				setState(309);
				code_block();
				setState(310);
				match(CLOSE_BRACES);
				setState(311);
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
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ELSE_IF);
				setState(316);
				match(OPEN_SQUARE_BRACKET);
				setState(317);
				condition(0);
				setState(318);
				match(CLOSE_SQUARE_BRACKET);
				setState(319);
				match(OPEN_BRACES);
				setState(320);
				code_block();
				setState(321);
				match(CLOSE_BRACES);
				setState(322);
				elseIf_conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(ELSE_IF);
				setState(325);
				match(OPEN_SQUARE_BRACKET);
				setState(326);
				condition(0);
				setState(327);
				match(CLOSE_SQUARE_BRACKET);
				setState(328);
				match(OPEN_BRACES);
				setState(329);
				code_block();
				setState(330);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
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
			setState(335);
			match(ELSE);
			setState(336);
			match(OPEN_BRACES);
			setState(337);
			code_block();
			setState(338);
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

			setState(341);
			condition2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
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
					setState(343);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(344);
					match(AND);
					setState(345);
					condition2(0);
					}
					} 
				}
				setState(350);
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

			setState(352);
			condition3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
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
					setState(354);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(355);
					match(OR);
					setState(356);
					condition3(0);
					}
					} 
				}
				setState(361);
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

			setState(363);
			condition4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
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
					setState(365);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(366);
					((EqualityExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NOT_EQUAL || _la==EQUAL_EQUAL) ) {
						((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(367);
					condition4(0);
					}
					} 
				}
				setState(372);
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

			setState(374);
			gen_comparison();
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
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
					setState(376);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(377);
					((RelationalExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_EQUAL_TO) | (1L << GREATER_THAN_EQUAL_TO))) != 0)) ) {
						((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(378);
					gen_comparison();
					}
					} 
				}
				setState(383);
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
	public static class ToSideValContext extends Gen_comparisonContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public ToSideValContext(Gen_comparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToSideVal(this);
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
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBracketCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(NOT);
				setState(386);
				match(OPEN_SQUARE_BRACKET);
				setState(387);
				condition(0);
				setState(388);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 3:
				_localctx = new BracketCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(OPEN_SQUARE_BRACKET);
				setState(391);
				condition(0);
				setState(392);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 4:
				_localctx = new ToVarIdenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				var_iden();
				}
				break;
			case 5:
				_localctx = new ToSideValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				side();
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
		enterRule(_localctx, 38, RULE_func_dec);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				data_type();
				setState(399);
				func_iden();
				setState(400);
				match(OPEN_SQUARE_BRACKET);
				setState(401);
				parameter();
				setState(402);
				match(CLOSE_SQUARE_BRACKET);
				setState(403);
				match(OPEN_BRACES);
				setState(404);
				code_block();
				setState(406);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(405);
					return_statement();
					}
				}

				setState(408);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				data_type();
				setState(411);
				func_iden();
				setState(412);
				match(OPEN_SQUARE_BRACKET);
				setState(413);
				match(CLOSE_SQUARE_BRACKET);
				setState(414);
				match(OPEN_BRACES);
				setState(415);
				code_block();
				setState(417);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(416);
					return_statement();
					}
				}

				setState(419);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				data_type();
				setState(422);
				func_iden();
				setState(423);
				match(OPEN_SQUARE_BRACKET);
				setState(424);
				parameter();
				setState(425);
				match(CLOSE_SQUARE_BRACKET);
				setState(426);
				match(OPEN_BRACES);
				setState(428);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(427);
					return_statement();
					}
				}

				setState(430);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				data_type();
				setState(433);
				func_iden();
				setState(434);
				match(OPEN_SQUARE_BRACKET);
				setState(435);
				match(CLOSE_SQUARE_BRACKET);
				setState(436);
				match(OPEN_BRACES);
				setState(438);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(437);
					return_statement();
					}
				}

				setState(440);
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
		enterRule(_localctx, 40, RULE_return_statement);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(RETURN);
				setState(445);
				literal();
				setState(446);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(RETURN);
				setState(449);
				var_iden();
				setState(450);
				match(TERMINAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(RETURN);
				setState(453);
				expr(0);
				setState(454);
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
		enterRule(_localctx, 42, RULE_func_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		enterRule(_localctx, 44, RULE_parameter);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				data_type();
				setState(461);
				match(VAR_IDEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				data_type();
				setState(464);
				match(VAR_IDEN);
				setState(465);
				match(COMMA);
				setState(466);
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
		enterRule(_localctx, 46, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(CONST_DEC);
			setState(471);
			data_type();
			setState(472);
			statement();
			setState(473);
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
		enterRule(_localctx, 48, RULE_var_dec);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new VarDecFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				data_type();
				setState(476);
				statement();
				setState(477);
				match(TERMINAL);
				}
				break;
			case 2:
				_localctx = new VarDecVarIdenFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				data_type();
				setState(480);
				var_iden();
				setState(481);
				match(TERMINAL);
				}
				break;
			case 3:
				_localctx = new VarDecBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(SIDE);
				setState(484);
				boolean_statement();
				setState(485);
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
		enterRule(_localctx, 50, RULE_boolean_statement);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
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
		enterRule(_localctx, 52, RULE_boolean_assignment);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				var_iden();
				setState(494);
				match(EQUAL);
				setState(495);
				match(LIGHT_SIDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				var_iden();
				setState(498);
				match(EQUAL);
				setState(499);
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
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				reg_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
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
		enterRule(_localctx, 56, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			var_iden();
			setState(508);
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
		enterRule(_localctx, 58, RULE_reg_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			var_iden();
			setState(511);
			match(EQUAL);
			setState(512);
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
		enterRule(_localctx, 60, RULE_var_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 62, RULE_incr);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				var_iden();
				setState(517);
				match(INCREMENT_OPERATOR);
				setState(518);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				var_iden();
				setState(521);
				match(DECREMENT_OPERATOR);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToExpr2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(527);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(529);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(530);
					((AdditiveExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(531);
					expr2(0);
					}
					} 
				}
				setState(536);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToGenVarContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(538);
			gen_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(new Expr2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(540);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(541);
					((MultiplicativeExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(542);
					gen_var();
					}
					} 
				}
				setState(547);
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
		enterRule(_localctx, 68, RULE_gen_var);
		int _la;
		try {
			setState(551);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(549);
				var();
				}
				break;
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case VAR_IDEN:
			case FUNC_IDEN:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LIGHT_SIDE:
			case DARK_SIDE:
			case OPEN_SQUARE_BRACKET:
				_localctx = new ToVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
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
	public static class ToSideContext extends VarContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public ToSideContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitToSide(this);
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
		enterRule(_localctx, 70, RULE_var);
		try {
			setState(561);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				_localctx = new ToLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				literal();
				}
				break;
			case FUNC_IDEN:
				_localctx = new ToFunc_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				func_call();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(OPEN_SQUARE_BRACKET);
				setState(556);
				expr(0);
				setState(557);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case LIGHT_SIDE:
			case DARK_SIDE:
				_localctx = new ToSideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				side();
				}
				break;
			case VAR_IDEN:
				_localctx = new ToVar_IdenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
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

	public static class SideContext extends ParserRuleContext {
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
	 
		public SideContext() { }
		public void copyFrom(SideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueContext extends SideContext {
		public TerminalNode LIGHT_SIDE() { return getToken(Darth_CoderParser.LIGHT_SIDE, 0); }
		public TrueContext(SideContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends SideContext {
		public TerminalNode DARK_SIDE() { return getToken(Darth_CoderParser.DARK_SIDE, 0); }
		public FalseContext(SideContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_side);
		try {
			setState(565);
			switch (_input.LA(1)) {
			case LIGHT_SIDE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(LIGHT_SIDE);
				}
				break;
			case DARK_SIDE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(DARK_SIDE);
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
		enterRule(_localctx, 74, RULE_array);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				array_open();
				setState(568);
				index();
				setState(569);
				array_close();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				array_open();
				setState(572);
				index();
				setState(573);
				array_close();
				setState(574);
				equal();
				setState(575);
				match(OPEN_BRACES);
				setState(577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << VAR_IDEN) | (1L << FUNC_IDEN) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << LIGHT_SIDE) | (1L << DARK_SIDE) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
					{
					setState(576);
					value();
					}
				}

				setState(579);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				array_open();
				setState(582);
				index();
				setState(583);
				array_close();
				setState(584);
				equal();
				setState(585);
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
		enterRule(_localctx, 76, RULE_array_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 78, RULE_array_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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
		enterRule(_localctx, 80, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		enterRule(_localctx, 82, RULE_index);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				var_iden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
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
		enterRule(_localctx, 84, RULE_value);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new SingleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				var();
				}
				break;
			case 2:
				_localctx = new MoreLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				var();
				setState(602);
				match(COMMA);
				setState(604);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(603);
					match(WS);
					}
				}

				setState(606);
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
		enterRule(_localctx, 86, RULE_data_type);
		try {
			setState(614);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				galactic_credit();
				}
				break;
			case IMPERIAL_CREDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				imperial_credit();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				unit();
				}
				break;
			case LEGION:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
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
		enterRule(_localctx, 88, RULE_galactic_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
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
		enterRule(_localctx, 90, RULE_imperial_credit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		enterRule(_localctx, 92, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		enterRule(_localctx, 94, RULE_legion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(628);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				string_literal();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				character_literal();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				int_literal();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
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
		enterRule(_localctx, 98, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		enterRule(_localctx, 100, RULE_character_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		enterRule(_localctx, 102, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		enterRule(_localctx, 104, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
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
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 33:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u0281\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2u\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a1\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\5\n\u00c2\n\n\3\n\5\n\u00c5\n\n\3\n\5\n\u00c8\n\n"+
		"\3\n\5\n\u00cb\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u011e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0129\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013c"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0150\n\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u015d\n\20\f\20\16\20\u0160\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0168\n\21\f\21\16\21\u016b\13\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0173\n\22\f\22\16\22\u0176\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u017e\n\23\f\23\16\23\u0181\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u018f\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0199\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a4\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u01af\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u01b9\n\25\3\25\3\25\5\25\u01bd\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01cb\n\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d7\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01ea\n\32\3\33\3\33\5\33\u01ee\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01f8\n\34\3\35\3\35\5\35\u01fc\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u020f\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u0217\n\"\f\"\16\"\u021a\13\"\3#\3#\3#\3#\3#\3#\7#\u0222"+
		"\n#\f#\16#\u0225\13#\3$\3$\3$\5$\u022a\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0234"+
		"\n%\3&\3&\5&\u0238\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0244"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u024e\n\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3+\5+\u0259\n+\3,\3,\3,\3,\5,\u025f\n,\3,\3,\5,\u0263\n,\3-\3-\3"+
		"-\3-\5-\u0269\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5"+
		"\62\u0277\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\2\b\36 \""+
		"$BD\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhj\2\7\3\2\66\67\3\2\62\65\3\2\7\b\3\2\t\13\4\2"+
		"\7\b\17\17\u0296\2t\3\2\2\2\4\u00a0\3\2\2\2\6\u00a2\3\2\2\2\b\u00a4\3"+
		"\2\2\2\n\u00a6\3\2\2\2\f\u00ac\3\2\2\2\16\u00b2\3\2\2\2\20\u00b8\3\2\2"+
		"\2\22\u00be\3\2\2\2\24\u011d\3\2\2\2\26\u0128\3\2\2\2\30\u013b\3\2\2\2"+
		"\32\u014f\3\2\2\2\34\u0151\3\2\2\2\36\u0156\3\2\2\2 \u0161\3\2\2\2\"\u016c"+
		"\3\2\2\2$\u0177\3\2\2\2&\u018e\3\2\2\2(\u01bc\3\2\2\2*\u01ca\3\2\2\2,"+
		"\u01cc\3\2\2\2.\u01d6\3\2\2\2\60\u01d8\3\2\2\2\62\u01e9\3\2\2\2\64\u01ed"+
		"\3\2\2\2\66\u01f7\3\2\2\28\u01fb\3\2\2\2:\u01fd\3\2\2\2<\u0200\3\2\2\2"+
		">\u0204\3\2\2\2@\u020e\3\2\2\2B\u0210\3\2\2\2D\u021b\3\2\2\2F\u0229\3"+
		"\2\2\2H\u0233\3\2\2\2J\u0237\3\2\2\2L\u024d\3\2\2\2N\u024f\3\2\2\2P\u0251"+
		"\3\2\2\2R\u0253\3\2\2\2T\u0258\3\2\2\2V\u0262\3\2\2\2X\u0268\3\2\2\2Z"+
		"\u026a\3\2\2\2\\\u026c\3\2\2\2^\u026e\3\2\2\2`\u0270\3\2\2\2b\u0276\3"+
		"\2\2\2d\u0278\3\2\2\2f\u027a\3\2\2\2h\u027c\3\2\2\2j\u027e\3\2\2\2lm\5"+
		"(\25\2mn\5\2\2\2nu\3\2\2\2op\7;\2\2pq\7-\2\2qr\5\4\3\2rs\7.\2\2su\3\2"+
		"\2\2tl\3\2\2\2to\3\2\2\2u\3\3\2\2\2vw\5\62\32\2wx\5\4\3\2x\u00a1\3\2\2"+
		"\2yz\5<\37\2z{\7\31\2\2{|\5\4\3\2|\u00a1\3\2\2\2}~\5:\36\2~\177\7\31\2"+
		"\2\177\u0080\5\4\3\2\u0080\u00a1\3\2\2\2\u0081\u0082\5\30\r\2\u0082\u0083"+
		"\5\4\3\2\u0083\u00a1\3\2\2\2\u0084\u0085\5\24\13\2\u0085\u0086\5\4\3\2"+
		"\u0086\u00a1\3\2\2\2\u0087\u0088\5\26\f\2\u0088\u0089\5\4\3\2\u0089\u00a1"+
		"\3\2\2\2\u008a\u008b\5@!\2\u008b\u008c\5\4\3\2\u008c\u00a1\3\2\2\2\u008d"+
		"\u008e\5\n\6\2\u008e\u008f\5\4\3\2\u008f\u00a1\3\2\2\2\u0090\u0091\5\f"+
		"\7\2\u0091\u0092\5\4\3\2\u0092\u00a1\3\2\2\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\5\4\3\2\u0095\u00a1\3\2\2\2\u0096\u0097\5\20\t\2\u0097\u0098\5"+
		"\4\3\2\u0098\u00a1\3\2\2\2\u0099\u009a\5\22\n\2\u009a\u009b\5\4\3\2\u009b"+
		"\u00a1\3\2\2\2\u009c\u009d\5\b\5\2\u009d\u009e\5\4\3\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u00a1\5\6\4\2\u00a0v\3\2\2\2\u00a0y\3\2\2\2\u00a0}\3\2\2\2"+
		"\u00a0\u0081\3\2\2\2\u00a0\u0084\3\2\2\2\u00a0\u0087\3\2\2\2\u00a0\u008a"+
		"\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0\u0090\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0"+
		"\u0096\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\5\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\7\3\2\2\2\u00a4\u00a5\7"+
		"\27\2\2\u00a5\t\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7\u00a8\7/\2\2\u00a8\u00a9"+
		"\5> \2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\7\31\2\2\u00ab\13\3\2\2\2\u00ac"+
		"\u00ad\7<\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5> \2\u00af\u00b0\7\60\2"+
		"\2\u00b0\u00b1\7\31\2\2\u00b1\r\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7/\2\2\u00b4\u00b5\5> \2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\7\31\2\2\u00b7"+
		"\17\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\5> \2\u00bb"+
		"\u00bc\7\60\2\2\u00bc\u00bd\7\31\2\2\u00bd\21\3\2\2\2\u00be\u00bf\7@\2"+
		"\2\u00bf\u00c1\7/\2\2\u00c0\u00c2\5> \2\u00c1\u00c0\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5B\"\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\7\26\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5\26\f\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\60"+
		"\2\2\u00cd\u00ce\7\31\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7-\2\2"+
		"\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7.\2\2\u00d6\u011e\3\2\2\2\u00d7\u00d8"+
		"\7(\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7-\2\2\u00db"+
		"\u00dc\5\4\3\2\u00dc\u00dd\7.\2\2\u00dd\u011e\3\2\2\2\u00de\u00df\7(\2"+
		"\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7\60\2\2\u00e1\u00e2\7-\2\2\u00e2\u011e"+
		"\7.\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\5\4\3\2\u00e6"+
		"\u00e7\7.\2\2\u00e7\u00e8\7(\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\5\36\20"+
		"\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7\31\2\2\u00ec\u011e\3\2\2\2\u00ed"+
		"\u00ee\7\'\2\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7.\2"+
		"\2\u00f1\u00f2\7(\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7\60\2\2\u00f4\u00f5"+
		"\7\31\2\2\u00f5\u011e\3\2\2\2\u00f6\u00f7\7\'\2\2\u00f7\u00f8\7-\2\2\u00f8"+
		"\u00f9\7.\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\5\36\20"+
		"\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7\31\2\2\u00fe\u011e\3\2\2\2\u00ff"+
		"\u0100\7\'\2\2\u0100\u0101\7-\2\2\u0101\u0102\7.\2\2\u0102\u0103\7(\2"+
		"\2\u0103\u0104\7/\2\2\u0104\u0105\7\60\2\2\u0105\u011e\7\31\2\2\u0106"+
		"\u0107\7&\2\2\u0107\u0108\7/\2\2\u0108\u0109\5<\37\2\u0109\u010a\7\31"+
		"\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\31\2\2\u010c\u010d\5@!\2\u010d"+
		"\u010e\7\60\2\2\u010e\u010f\7-\2\2\u010f\u0110\5\4\3\2\u0110\u0111\7."+
		"\2\2\u0111\u011e\3\2\2\2\u0112\u0113\7&\2\2\u0113\u0114\7/\2\2\u0114\u0115"+
		"\5<\37\2\u0115\u0116\7\31\2\2\u0116\u0117\5\36\20\2\u0117\u0118\7\31\2"+
		"\2\u0118\u0119\5@!\2\u0119\u011a\7\60\2\2\u011a\u011b\7-\2\2\u011b\u011c"+
		"\7.\2\2\u011c\u011e\3\2\2\2\u011d\u00cf\3\2\2\2\u011d\u00d7\3\2\2\2\u011d"+
		"\u00de\3\2\2\2\u011d\u00e3\3\2\2\2\u011d\u00ed\3\2\2\2\u011d\u00f6\3\2"+
		"\2\2\u011d\u00ff\3\2\2\2\u011d\u0106\3\2\2\2\u011d\u0112\3\2\2\2\u011e"+
		"\25\3\2\2\2\u011f\u0120\5,\27\2\u0120\u0121\7/\2\2\u0121\u0122\5V,\2\u0122"+
		"\u0123\7\60\2\2\u0123\u0129\3\2\2\2\u0124\u0125\5,\27\2\u0125\u0126\7"+
		"/\2\2\u0126\u0127\7\60\2\2\u0127\u0129\3\2\2\2\u0128\u011f\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0129\27\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7/\2\2"+
		"\u012c\u012d\5\36\20\2\u012d\u012e\7\60\2\2\u012e\u012f\7-\2\2\u012f\u0130"+
		"\5\4\3\2\u0130\u0131\7.\2\2\u0131\u013c\3\2\2\2\u0132\u0133\7#\2\2\u0133"+
		"\u0134\7/\2\2\u0134\u0135\5\36\20\2\u0135\u0136\7\60\2\2\u0136\u0137\7"+
		"-\2\2\u0137\u0138\5\4\3\2\u0138\u0139\7.\2\2\u0139\u013a\5\32\16\2\u013a"+
		"\u013c\3\2\2\2\u013b\u012a\3\2\2\2\u013b\u0132\3\2\2\2\u013c\31\3\2\2"+
		"\2\u013d\u013e\7$\2\2\u013e\u013f\7/\2\2\u013f\u0140\5\36\20\2\u0140\u0141"+
		"\7\60\2\2\u0141\u0142\7-\2\2\u0142\u0143\5\4\3\2\u0143\u0144\7.\2\2\u0144"+
		"\u0145\5\32\16\2\u0145\u0150\3\2\2\2\u0146\u0147\7$\2\2\u0147\u0148\7"+
		"/\2\2\u0148\u0149\5\36\20\2\u0149\u014a\7\60\2\2\u014a\u014b\7-\2\2\u014b"+
		"\u014c\5\4\3\2\u014c\u014d\7.\2\2\u014d\u0150\3\2\2\2\u014e\u0150\5\34"+
		"\17\2\u014f\u013d\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\33\3\2\2\2\u0151\u0152\7%\2\2\u0152\u0153\7-\2\2\u0153\u0154\5\4\3\2"+
		"\u0154\u0155\7.\2\2\u0155\35\3\2\2\2\u0156\u0157\b\20\1\2\u0157\u0158"+
		"\5 \21\2\u0158\u015e\3\2\2\2\u0159\u015a\f\4\2\2\u015a\u015b\78\2\2\u015b"+
		"\u015d\5 \21\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\37\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162"+
		"\b\21\1\2\u0162\u0163\5\"\22\2\u0163\u0169\3\2\2\2\u0164\u0165\f\4\2\2"+
		"\u0165\u0166\79\2\2\u0166\u0168\5\"\22\2\u0167\u0164\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a!\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\b\22\1\2\u016d\u016e\5$\23\2\u016e\u0174\3"+
		"\2\2\2\u016f\u0170\f\4\2\2\u0170\u0171\t\2\2\2\u0171\u0173\5$\23\2\u0172"+
		"\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175#\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b\23\1\2\u0178\u0179"+
		"\5&\24\2\u0179\u017f\3\2\2\2\u017a\u017b\f\4\2\2\u017b\u017c\t\3\2\2\u017c"+
		"\u017e\5&\24\2\u017d\u017a\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180%\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u018f"+
		"\5B\"\2\u0183\u0184\7\17\2\2\u0184\u0185\7/\2\2\u0185\u0186\5\36\20\2"+
		"\u0186\u0187\7\60\2\2\u0187\u018f\3\2\2\2\u0188\u0189\7/\2\2\u0189\u018a"+
		"\5\36\20\2\u018a\u018b\7\60\2\2\u018b\u018f\3\2\2\2\u018c\u018f\5> \2"+
		"\u018d\u018f\5J&\2\u018e\u0182\3\2\2\2\u018e\u0183\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\'\3\2\2\2\u0190"+
		"\u0191\5X-\2\u0191\u0192\5,\27\2\u0192\u0193\7/\2\2\u0193\u0194\5.\30"+
		"\2\u0194\u0195\7\60\2\2\u0195\u0196\7-\2\2\u0196\u0198\5\4\3\2\u0197\u0199"+
		"\5*\26\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\7.\2\2\u019b\u01bd\3\2\2\2\u019c\u019d\5X-\2\u019d\u019e\5,\27"+
		"\2\u019e\u019f\7/\2\2\u019f\u01a0\7\60\2\2\u01a0\u01a1\7-\2\2\u01a1\u01a3"+
		"\5\4\3\2\u01a2\u01a4\5*\26\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\7.\2\2\u01a6\u01bd\3\2\2\2\u01a7\u01a8\5X-"+
		"\2\u01a8\u01a9\5,\27\2\u01a9\u01aa\7/\2\2\u01aa\u01ab\5.\30\2\u01ab\u01ac"+
		"\7\60\2\2\u01ac\u01ae\7-\2\2\u01ad\u01af\5*\26\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7.\2\2\u01b1\u01bd\3\2"+
		"\2\2\u01b2\u01b3\5X-\2\u01b3\u01b4\5,\27\2\u01b4\u01b5\7/\2\2\u01b5\u01b6"+
		"\7\60\2\2\u01b6\u01b8\7-\2\2\u01b7\u01b9\5*\26\2\u01b8\u01b7\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\7.\2\2\u01bb\u01bd\3\2"+
		"\2\2\u01bc\u0190\3\2\2\2\u01bc\u019c\3\2\2\2\u01bc\u01a7\3\2\2\2\u01bc"+
		"\u01b2\3\2\2\2\u01bd)\3\2\2\2\u01be\u01bf\7*\2\2\u01bf\u01c0\5b\62\2\u01c0"+
		"\u01c1\7\31\2\2\u01c1\u01cb\3\2\2\2\u01c2\u01c3\7*\2\2\u01c3\u01c4\5>"+
		" \2\u01c4\u01c5\7\31\2\2\u01c5\u01cb\3\2\2\2\u01c6\u01c7\7*\2\2\u01c7"+
		"\u01c8\5B\"\2\u01c8\u01c9\7\31\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01be\3\2"+
		"\2\2\u01ca\u01c2\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb+\3\2\2\2\u01cc\u01cd"+
		"\7\25\2\2\u01cd-\3\2\2\2\u01ce\u01cf\5X-\2\u01cf\u01d0\7\24\2\2\u01d0"+
		"\u01d7\3\2\2\2\u01d1\u01d2\5X-\2\u01d2\u01d3\7\24\2\2\u01d3\u01d4\7\61"+
		"\2\2\u01d4\u01d5\5.\30\2\u01d5\u01d7\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6"+
		"\u01d1\3\2\2\2\u01d7/\3\2\2\2\u01d8\u01d9\7!\2\2\u01d9\u01da\5X-\2\u01da"+
		"\u01db\58\35\2\u01db\u01dc\7\31\2\2\u01dc\61\3\2\2\2\u01dd\u01de\5X-\2"+
		"\u01de\u01df\58\35\2\u01df\u01e0\7\31\2\2\u01e0\u01ea\3\2\2\2\u01e1\u01e2"+
		"\5X-\2\u01e2\u01e3\5> \2\u01e3\u01e4\7\31\2\2\u01e4\u01ea\3\2\2\2\u01e5"+
		"\u01e6\7\36\2\2\u01e6\u01e7\5\64\33\2\u01e7\u01e8\7\31\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01dd\3\2\2\2\u01e9\u01e1\3\2\2\2\u01e9\u01e5\3\2\2\2\u01ea"+
		"\63\3\2\2\2\u01eb\u01ee\5> \2\u01ec\u01ee\5\66\34\2\u01ed\u01eb\3\2\2"+
		"\2\u01ed\u01ec\3\2\2\2\u01ee\65\3\2\2\2\u01ef\u01f0\5> \2\u01f0\u01f1"+
		"\7\16\2\2\u01f1\u01f2\7\37\2\2\u01f2\u01f8\3\2\2\2\u01f3\u01f4\5> \2\u01f4"+
		"\u01f5\7\16\2\2\u01f5\u01f6\7 \2\2\u01f6\u01f8\3\2\2\2\u01f7\u01ef\3\2"+
		"\2\2\u01f7\u01f3\3\2\2\2\u01f8\67\3\2\2\2\u01f9\u01fc\5<\37\2\u01fa\u01fc"+
		"\5:\36\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc9\3\2\2\2\u01fd"+
		"\u01fe\5> \2\u01fe\u01ff\5L\'\2\u01ff;\3\2\2\2\u0200\u0201\5> \2\u0201"+
		"\u0202\7\16\2\2\u0202\u0203\5B\"\2\u0203=\3\2\2\2\u0204\u0205\7\24\2\2"+
		"\u0205?\3\2\2\2\u0206\u0207\5> \2\u0207\u0208\7\22\2\2\u0208\u0209\7\31"+
		"\2\2\u0209\u020f\3\2\2\2\u020a\u020b\5> \2\u020b\u020c\7\23\2\2\u020c"+
		"\u020d\7\31\2\2\u020d\u020f\3\2\2\2\u020e\u0206\3\2\2\2\u020e\u020a\3"+
		"\2\2\2\u020fA\3\2\2\2\u0210\u0211\b\"\1\2\u0211\u0212\5D#\2\u0212\u0218"+
		"\3\2\2\2\u0213\u0214\f\4\2\2\u0214\u0215\t\4\2\2\u0215\u0217\5D#\2\u0216"+
		"\u0213\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219C\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\b#\1\2\u021c\u021d"+
		"\5F$\2\u021d\u0223\3\2\2\2\u021e\u021f\f\4\2\2\u021f\u0220\t\5\2\2\u0220"+
		"\u0222\5F$\2\u0221\u021e\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224E\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227"+
		"\t\6\2\2\u0227\u022a\5H%\2\u0228\u022a\5H%\2\u0229\u0226\3\2\2\2\u0229"+
		"\u0228\3\2\2\2\u022aG\3\2\2\2\u022b\u0234\5b\62\2\u022c\u0234\5\26\f\2"+
		"\u022d\u022e\7/\2\2\u022e\u022f\5B\"\2\u022f\u0230\7\60\2\2\u0230\u0234"+
		"\3\2\2\2\u0231\u0234\5J&\2\u0232\u0234\5> \2\u0233\u022b\3\2\2\2\u0233"+
		"\u022c\3\2\2\2\u0233\u022d\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2"+
		"\2\2\u0234I\3\2\2\2\u0235\u0238\7\37\2\2\u0236\u0238\7 \2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0236\3\2\2\2\u0238K\3\2\2\2\u0239\u023a\5N(\2\u023a\u023b"+
		"\5T+\2\u023b\u023c\5P)\2\u023c\u024e\3\2\2\2\u023d\u023e\5N(\2\u023e\u023f"+
		"\5T+\2\u023f\u0240\5P)\2\u0240\u0241\5R*\2\u0241\u0243\7-\2\2\u0242\u0244"+
		"\5V,\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\7.\2\2\u0246\u024e\3\2\2\2\u0247\u0248\5N(\2\u0248\u0249\5T+\2"+
		"\u0249\u024a\5P)\2\u024a\u024b\5R*\2\u024b\u024c\5H%\2\u024c\u024e\3\2"+
		"\2\2\u024d\u0239\3\2\2\2\u024d\u023d\3\2\2\2\u024d\u0247\3\2\2\2\u024e"+
		"M\3\2\2\2\u024f\u0250\7+\2\2\u0250O\3\2\2\2\u0251\u0252\7,\2\2\u0252Q"+
		"\3\2\2\2\u0253\u0254\7\16\2\2\u0254S\3\2\2\2\u0255\u0259\7\3\2\2\u0256"+
		"\u0259\5> \2\u0257\u0259\5B\"\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2"+
		"\2\u0258\u0257\3\2\2\2\u0259U\3\2\2\2\u025a\u0263\5H%\2\u025b\u025c\5"+
		"H%\2\u025c\u025e\7\61\2\2\u025d\u025f\7\6\2\2\u025e\u025d\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5V,\2\u0261\u0263\3\2\2"+
		"\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0263W\3\2\2\2\u0264\u0269"+
		"\5Z.\2\u0265\u0269\5\\/\2\u0266\u0269\5^\60\2\u0267\u0269\5`\61\2\u0268"+
		"\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2"+
		"\2\2\u0269Y\3\2\2\2\u026a\u026b\7\32\2\2\u026b[\3\2\2\2\u026c\u026d\7"+
		"\33\2\2\u026d]\3\2\2\2\u026e\u026f\7\34\2\2\u026f_\3\2\2\2\u0270\u0271"+
		"\7\35\2\2\u0271a\3\2\2\2\u0272\u0277\5d\63\2\u0273\u0277\5f\64\2\u0274"+
		"\u0277\5h\65\2\u0275\u0277\5j\66\2\u0276\u0272\3\2\2\2\u0276\u0273\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277c\3\2\2\2\u0278\u0279"+
		"\7\30\2\2\u0279e\3\2\2\2\u027a\u027b\7\26\2\2\u027bg\3\2\2\2\u027c\u027d"+
		"\7\3\2\2\u027di\3\2\2\2\u027e\u027f\7\4\2\2\u027fk\3\2\2\2)t\u00a0\u00c1"+
		"\u00c4\u00c7\u00ca\u011d\u0128\u013b\u014f\u015e\u0169\u0174\u017f\u018e"+
		"\u0198\u01a3\u01ae\u01b8\u01bc\u01ca\u01d6\u01e9\u01ed\u01f7\u01fb\u020e"+
		"\u0218\u0223\u0229\u0233\u0237\u0243\u024d\u0258\u025e\u0262\u0268\u0276";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
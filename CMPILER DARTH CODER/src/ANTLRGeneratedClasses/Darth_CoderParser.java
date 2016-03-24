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
		MOD=9, EQUAL=10, NOT=11, SINGLE_QUOTE=12, DOUBLE_QUOTE=13, INCREMENT_OPERATOR=14, 
		DECREMENT_OPERATOR=15, VAR_IDEN=16, FUNC_IDEN=17, CHARACTER_LITERAL=18, 
		COMMENT_LINE=19, STRING_LITERAL=20, TERMINAL=21, GALACTIC_CREDIT=22, IMPERIAL_CREDIT=23, 
		UNIT=24, LEGION=25, SIDE=26, LIGHT_SIDE=27, DARK_SIDE=28, CONST_DEC=29, 
		VOID=30, IF=31, ELSE_IF=32, ELSE=33, FOR=34, DO=35, WHILE=36, BREAK=37, 
		RETURN=38, ARRAY_OPEN=39, ARRAY_CLOSE=40, OPEN_BRACES=41, CLOSE_BRACES=42, 
		OPEN_SQUARE_BRACKET=43, CLOSE_SQUARE_BRACKET=44, COMMA=45, LESS_THAN=46, 
		GREATER_THAN=47, LESS_THAN_EQUAL_TO=48, GREATER_THAN_EQUAL_TO=49, NOT_EQUAL=50, 
		EQUAL_EQUAL=51, AND=52, OR=53, END_TRANSMISSION=54, INITIATE=55, SCAN_INTEGER=56, 
		SCAN_FLOAT=57, SCAN_CHAR=58, SCAN_STRING=59, PRINT=60;
	public static final int
		RULE_start = 0, RULE_code_block = 1, RULE_epsilon = 2, RULE_comment = 3, 
		RULE_scan_imperial_credit = 4, RULE_scan_galactic_credit = 5, RULE_scan_unit = 6, 
		RULE_scan_legion = 7, RULE_print = 8, RULE_iterative_con = 9, RULE_func_call = 10, 
		RULE_if_conditional = 11, RULE_elseIf_conditional = 12, RULE_else_conditional = 13, 
		RULE_condition = 14, RULE_condition2 = 15, RULE_condition3 = 16, RULE_condition4 = 17, 
		RULE_gen_comparison = 18, RULE_func_dec = 19, RULE_return_statement = 20, 
		RULE_func_iden = 21, RULE_parameter = 22, RULE_constant_declaration = 23, 
		RULE_var_dec = 24, RULE_boolean_statement = 25, RULE_boolean_assignment = 26, 
		RULE_statement = 27, RULE_array_dec = 28, RULE_array_assignment = 29, 
		RULE_reg_assignment = 30, RULE_var_iden = 31, RULE_incr = 32, RULE_expr = 33, 
		RULE_expr2 = 34, RULE_gen_var = 35, RULE_var = 36, RULE_side = 37, RULE_array_open = 38, 
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
		"statement", "array_dec", "array_assignment", "reg_assignment", "var_iden", 
		"incr", "expr", "expr2", "gen_var", "var", "side", "array_open", "array_close", 
		"equal", "index", "value", "data_type", "galactic_credit", "imperial_credit", 
		"unit", "legion", "literal", "string_literal", "character_literal", "int_literal", 
		"float_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
		"'!'", "'''", "'\"'", "'++'", "'--'", null, null, null, null, null, "'.'", 
		"'GalacticCredit'", "'ImperialCredit'", "'Unit'", "'Legion'", "'Side'", 
		"'LightSide'", "'DarkSide'", "'Declare'", "'Void'", "'ForceInstance'", 
		"'InstanceVariant'", "'NoVariant'", "'ForceCommand'", "'ForceOrder'", 
		"'ForceAnalyze'", "'Order_66'", "'Transmit'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "','", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", 
		"'||'", "'End_Transmission'", "'Initiate'", "'EncodeGalacticCredit'", 
		"'EncodeImperialCredit'", "'EncodeUnit'", "'EncodeLegion'", "'Decode'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_LITERAL", "FLOAT_LITERAL", "NL", "WS", "PLUS", "MINUS", "MULT", 
		"DIV", "MOD", "EQUAL", "NOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "VAR_IDEN", "FUNC_IDEN", "CHARACTER_LITERAL", "COMMENT_LINE", 
		"STRING_LITERAL", "TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", "UNIT", 
		"LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", "IF", 
		"ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", 
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
		public Boolean_assignmentContext boolean_assignment() {
			return getRuleContext(Boolean_assignmentContext.class,0);
		}
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
			setState(162);
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
				boolean_assignment();
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
				array_assignment();
				setState(128);
				match(TERMINAL);
				setState(129);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				if_conditional();
				setState(132);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				iterative_con();
				setState(135);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				func_call();
				setState(138);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				incr();
				setState(141);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				scan_imperial_credit();
				setState(144);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				scan_galactic_credit();
				setState(147);
				code_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(149);
				scan_unit();
				setState(150);
				code_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(152);
				scan_legion();
				setState(153);
				code_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				print();
				setState(156);
				code_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(158);
				comment();
				setState(159);
				code_block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(161);
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
			setState(166);
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
			setState(168);
			match(SCAN_FLOAT);
			setState(169);
			match(OPEN_SQUARE_BRACKET);
			setState(170);
			var_iden();
			setState(171);
			match(CLOSE_SQUARE_BRACKET);
			setState(172);
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
			setState(174);
			match(SCAN_INTEGER);
			setState(175);
			match(OPEN_SQUARE_BRACKET);
			setState(176);
			var_iden();
			setState(177);
			match(CLOSE_SQUARE_BRACKET);
			setState(178);
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
			setState(180);
			match(SCAN_CHAR);
			setState(181);
			match(OPEN_SQUARE_BRACKET);
			setState(182);
			var_iden();
			setState(183);
			match(CLOSE_SQUARE_BRACKET);
			setState(184);
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
			setState(186);
			match(SCAN_STRING);
			setState(187);
			match(OPEN_SQUARE_BRACKET);
			setState(188);
			var_iden();
			setState(189);
			match(CLOSE_SQUARE_BRACKET);
			setState(190);
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
			setState(192);
			match(PRINT);
			setState(193);
			match(OPEN_SQUARE_BRACKET);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(194);
				var_iden();
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(197);
				expr(0);
				}
				break;
			}
			setState(201);
			_la = _input.LA(1);
			if (_la==CHARACTER_LITERAL) {
				{
				setState(200);
				match(CHARACTER_LITERAL);
				}
			}

			setState(204);
			_la = _input.LA(1);
			if (_la==FUNC_IDEN) {
				{
				setState(203);
				func_call();
				}
			}

			setState(206);
			match(CLOSE_SQUARE_BRACKET);
			setState(207);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(WHILE);
				setState(210);
				match(OPEN_SQUARE_BRACKET);
				setState(211);
				condition(0);
				setState(212);
				match(CLOSE_SQUARE_BRACKET);
				setState(213);
				match(OPEN_BRACES);
				setState(214);
				code_block();
				setState(215);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(WHILE);
				setState(218);
				match(OPEN_SQUARE_BRACKET);
				setState(219);
				match(CLOSE_SQUARE_BRACKET);
				setState(220);
				match(OPEN_BRACES);
				setState(221);
				code_block();
				setState(222);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(WHILE);
				setState(225);
				match(OPEN_SQUARE_BRACKET);
				setState(226);
				match(CLOSE_SQUARE_BRACKET);
				setState(227);
				match(OPEN_BRACES);
				setState(228);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(DO);
				setState(230);
				match(OPEN_BRACES);
				setState(231);
				code_block();
				setState(232);
				match(CLOSE_BRACES);
				setState(233);
				match(WHILE);
				setState(234);
				match(OPEN_SQUARE_BRACKET);
				setState(235);
				condition(0);
				setState(236);
				match(CLOSE_SQUARE_BRACKET);
				setState(237);
				match(TERMINAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(DO);
				setState(240);
				match(OPEN_BRACES);
				setState(241);
				code_block();
				setState(242);
				match(CLOSE_BRACES);
				setState(243);
				match(WHILE);
				setState(244);
				match(OPEN_SQUARE_BRACKET);
				setState(245);
				match(CLOSE_SQUARE_BRACKET);
				setState(246);
				match(TERMINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(DO);
				setState(249);
				match(OPEN_BRACES);
				setState(250);
				match(CLOSE_BRACES);
				setState(251);
				match(WHILE);
				setState(252);
				match(OPEN_SQUARE_BRACKET);
				setState(253);
				condition(0);
				setState(254);
				match(CLOSE_SQUARE_BRACKET);
				setState(255);
				match(TERMINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(DO);
				setState(258);
				match(OPEN_BRACES);
				setState(259);
				match(CLOSE_BRACES);
				setState(260);
				match(WHILE);
				setState(261);
				match(OPEN_SQUARE_BRACKET);
				setState(262);
				match(CLOSE_SQUARE_BRACKET);
				setState(263);
				match(TERMINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				match(FOR);
				setState(265);
				match(OPEN_SQUARE_BRACKET);
				setState(266);
				reg_assignment();
				setState(267);
				match(TERMINAL);
				setState(268);
				condition(0);
				setState(269);
				match(TERMINAL);
				setState(270);
				incr();
				setState(271);
				match(CLOSE_SQUARE_BRACKET);
				setState(272);
				match(OPEN_BRACES);
				setState(273);
				code_block();
				setState(274);
				match(CLOSE_BRACES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				match(FOR);
				setState(277);
				match(OPEN_SQUARE_BRACKET);
				setState(278);
				reg_assignment();
				setState(279);
				match(TERMINAL);
				setState(280);
				condition(0);
				setState(281);
				match(TERMINAL);
				setState(282);
				incr();
				setState(283);
				match(CLOSE_SQUARE_BRACKET);
				setState(284);
				match(OPEN_BRACES);
				setState(285);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				func_iden();
				setState(290);
				match(OPEN_SQUARE_BRACKET);
				setState(291);
				value();
				setState(292);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				func_iden();
				setState(295);
				match(OPEN_SQUARE_BRACKET);
				setState(296);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(IF);
				setState(301);
				match(OPEN_SQUARE_BRACKET);
				setState(302);
				condition(0);
				setState(303);
				match(CLOSE_SQUARE_BRACKET);
				setState(304);
				match(OPEN_BRACES);
				setState(305);
				code_block();
				setState(306);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(IF);
				setState(309);
				match(OPEN_SQUARE_BRACKET);
				setState(310);
				condition(0);
				setState(311);
				match(CLOSE_SQUARE_BRACKET);
				setState(312);
				match(OPEN_BRACES);
				setState(313);
				code_block();
				setState(314);
				match(CLOSE_BRACES);
				setState(315);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ELSE_IF);
				setState(320);
				match(OPEN_SQUARE_BRACKET);
				setState(321);
				condition(0);
				setState(322);
				match(CLOSE_SQUARE_BRACKET);
				setState(323);
				match(OPEN_BRACES);
				setState(324);
				code_block();
				setState(325);
				match(CLOSE_BRACES);
				setState(326);
				elseIf_conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(ELSE_IF);
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
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
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
			setState(339);
			match(ELSE);
			setState(340);
			match(OPEN_BRACES);
			setState(341);
			code_block();
			setState(342);
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

			setState(345);
			condition2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
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
					setState(347);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(348);
					match(AND);
					setState(349);
					condition2(0);
					}
					} 
				}
				setState(354);
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

			setState(356);
			condition3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
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
					setState(358);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(359);
					match(OR);
					setState(360);
					condition3(0);
					}
					} 
				}
				setState(365);
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

			setState(367);
			condition4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
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
					setState(369);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(370);
					((EqualityExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NOT_EQUAL || _la==EQUAL_EQUAL) ) {
						((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(371);
					condition4(0);
					}
					} 
				}
				setState(376);
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

			setState(378);
			gen_comparison();
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
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
					setState(380);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(381);
					((RelationalExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_EQUAL_TO) | (1L << GREATER_THAN_EQUAL_TO))) != 0)) ) {
						((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(382);
					gen_comparison();
					}
					} 
				}
				setState(387);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expr(0);
				}
				break;
			case 2:
				_localctx = new NotBracketCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(NOT);
				setState(390);
				match(OPEN_SQUARE_BRACKET);
				setState(391);
				condition(0);
				setState(392);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 3:
				_localctx = new BracketCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(OPEN_SQUARE_BRACKET);
				setState(395);
				condition(0);
				setState(396);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 4:
				_localctx = new ToVarIdenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				var_iden();
				}
				break;
			case 5:
				_localctx = new ToSideValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				data_type();
				setState(403);
				func_iden();
				setState(404);
				match(OPEN_SQUARE_BRACKET);
				setState(405);
				parameter();
				setState(406);
				match(CLOSE_SQUARE_BRACKET);
				setState(407);
				match(OPEN_BRACES);
				setState(408);
				code_block();
				setState(410);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(409);
					return_statement();
					}
				}

				setState(412);
				match(CLOSE_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				data_type();
				setState(415);
				func_iden();
				setState(416);
				match(OPEN_SQUARE_BRACKET);
				setState(417);
				match(CLOSE_SQUARE_BRACKET);
				setState(418);
				match(OPEN_BRACES);
				setState(419);
				code_block();
				setState(421);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(420);
					return_statement();
					}
				}

				setState(423);
				match(CLOSE_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				data_type();
				setState(426);
				func_iden();
				setState(427);
				match(OPEN_SQUARE_BRACKET);
				setState(428);
				parameter();
				setState(429);
				match(CLOSE_SQUARE_BRACKET);
				setState(430);
				match(OPEN_BRACES);
				setState(432);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(431);
					return_statement();
					}
				}

				setState(434);
				match(CLOSE_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				data_type();
				setState(437);
				func_iden();
				setState(438);
				match(OPEN_SQUARE_BRACKET);
				setState(439);
				match(CLOSE_SQUARE_BRACKET);
				setState(440);
				match(OPEN_BRACES);
				setState(442);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(441);
					return_statement();
					}
				}

				setState(444);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(RETURN);
				setState(449);
				literal();
				setState(450);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(RETURN);
				setState(453);
				var_iden();
				setState(454);
				match(TERMINAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(RETURN);
				setState(457);
				expr(0);
				setState(458);
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
			setState(462);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				data_type();
				setState(465);
				match(VAR_IDEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				data_type();
				setState(468);
				match(VAR_IDEN);
				setState(469);
				match(COMMA);
				setState(470);
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
			setState(474);
			match(CONST_DEC);
			setState(475);
			data_type();
			setState(476);
			statement();
			setState(477);
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
		public Reg_assignmentContext reg_assignment() {
			return getRuleContext(Reg_assignmentContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public VarDecFourTypesContext(Var_decContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitVarDecFourTypes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDecContext extends Var_decContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Array_decContext array_dec() {
			return getRuleContext(Array_decContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(Darth_CoderParser.TERMINAL, 0); }
		public ArrayDecContext(Var_decContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArrayDec(this);
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new VarDecFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				data_type();
				setState(480);
				reg_assignment();
				setState(481);
				match(TERMINAL);
				}
				break;
			case 2:
				_localctx = new ArrayDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				data_type();
				setState(484);
				array_dec();
				setState(485);
				match(TERMINAL);
				}
				break;
			case 3:
				_localctx = new VarDecVarIdenFourTypesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				data_type();
				setState(488);
				var_iden();
				setState(489);
				match(TERMINAL);
				}
				break;
			case 4:
				_localctx = new VarDecBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(SIDE);
				setState(492);
				boolean_statement();
				setState(493);
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
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				var_iden();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				var_iden();
				setState(502);
				match(EQUAL);
				setState(503);
				match(LIGHT_SIDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				var_iden();
				setState(506);
				match(EQUAL);
				setState(507);
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
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				reg_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
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

	public static class Array_decContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode ARRAY_OPEN() { return getToken(Darth_CoderParser.ARRAY_OPEN, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode ARRAY_CLOSE() { return getToken(Darth_CoderParser.ARRAY_CLOSE, 0); }
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public TerminalNode OPEN_BRACES() { return getToken(Darth_CoderParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(Darth_CoderParser.CLOSE_BRACES, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Array_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Darth_CoderVisitor ) return ((Darth_CoderVisitor<? extends T>)visitor).visitArray_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_decContext array_dec() throws RecognitionException {
		Array_decContext _localctx = new Array_decContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_dec);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				var_iden();
				setState(516);
				match(ARRAY_OPEN);
				setState(517);
				index();
				setState(518);
				match(ARRAY_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				var_iden();
				setState(521);
				match(ARRAY_OPEN);
				setState(522);
				match(ARRAY_CLOSE);
				setState(523);
				match(EQUAL);
				setState(524);
				match(OPEN_BRACES);
				setState(526);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << VAR_IDEN) | (1L << FUNC_IDEN) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_SQUARE_BRACKET))) != 0)) {
					{
					setState(525);
					value();
					}
				}

				setState(528);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Var_idenContext var_iden() {
			return getRuleContext(Var_idenContext.class,0);
		}
		public TerminalNode ARRAY_OPEN() { return getToken(Darth_CoderParser.ARRAY_OPEN, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode ARRAY_CLOSE() { return getToken(Darth_CoderParser.ARRAY_CLOSE, 0); }
		public TerminalNode EQUAL() { return getToken(Darth_CoderParser.EQUAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 58, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			var_iden();
			setState(533);
			match(ARRAY_OPEN);
			setState(534);
			index();
			setState(535);
			match(ARRAY_CLOSE);
			setState(536);
			match(EQUAL);
			setState(537);
			var();
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
		enterRule(_localctx, 60, RULE_reg_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			var_iden();
			setState(540);
			match(EQUAL);
			setState(541);
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
		enterRule(_localctx, 62, RULE_var_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 64, RULE_incr);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				var_iden();
				setState(546);
				match(INCREMENT_OPERATOR);
				setState(547);
				match(TERMINAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				var_iden();
				setState(550);
				match(DECREMENT_OPERATOR);
				setState(551);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToExpr2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(556);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(563);
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
					setState(558);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(559);
					((AdditiveExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(560);
					expr2(0);
					}
					} 
				}
				setState(565);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToGenVarContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(567);
			gen_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(574);
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
					setState(569);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(570);
					((MultiplicativeExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(571);
					gen_var();
					}
					} 
				}
				setState(576);
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
		enterRule(_localctx, 70, RULE_gen_var);
		int _la;
		try {
			setState(580);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(578);
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
				setState(579);
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
		enterRule(_localctx, 72, RULE_var);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				_localctx = new ToLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				literal();
				}
				break;
			case FUNC_IDEN:
				_localctx = new ToFunc_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				func_call();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(OPEN_SQUARE_BRACKET);
				setState(585);
				expr(0);
				setState(586);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case VAR_IDEN:
				_localctx = new ToVar_IdenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
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
		enterRule(_localctx, 74, RULE_side);
		try {
			setState(593);
			switch (_input.LA(1)) {
			case LIGHT_SIDE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(LIGHT_SIDE);
				}
				break;
			case DARK_SIDE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
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
			setState(595);
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
			setState(597);
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
			setState(599);
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
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				var_iden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new SingleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				var();
				}
				break;
			case 2:
				_localctx = new MoreLiteralsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				var();
				setState(608);
				match(COMMA);
				setState(610);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(609);
					match(WS);
					}
				}

				setState(612);
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
			setState(620);
			switch (_input.LA(1)) {
			case GALACTIC_CREDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				galactic_credit();
				}
				break;
			case IMPERIAL_CREDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				imperial_credit();
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				unit();
				}
				break;
			case LEGION:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
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
			setState(622);
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
			setState(624);
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
			setState(626);
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
			setState(628);
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
			setState(634);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				string_literal();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				character_literal();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				int_literal();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
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
			setState(636);
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
			setState(638);
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
			setState(640);
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
			setState(642);
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
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 34:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0287\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2u\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a5\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00c6\n\n\3\n\5\n\u00c9\n\n\3"+
		"\n\5\n\u00cc\n\n\3\n\5\n\u00cf\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0122\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u012d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0140\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0154\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0161\n\20\f\20\16"+
		"\20\u0164\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u016c\n\21\f\21\16"+
		"\21\u016f\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0177\n\22\f\22\16"+
		"\22\u017a\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0182\n\23\f\23\16"+
		"\23\u0185\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0193\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u019d"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a8\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b3\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01bd\n\25\3\25\3\25\5\25\u01c1\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01cf"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01db\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f2\n\32\3\33\3\33\5\33\u01f6"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0200\n\34\3\35\3\35"+
		"\5\35\u0204\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0211\n\36\3\36\3\36\5\36\u0215\n\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u022c\n"+
		"\"\3#\3#\3#\3#\3#\3#\7#\u0234\n#\f#\16#\u0237\13#\3$\3$\3$\3$\3$\3$\7"+
		"$\u023f\n$\f$\16$\u0242\13$\3%\3%\3%\5%\u0247\n%\3&\3&\3&\3&\3&\3&\3&"+
		"\5&\u0250\n&\3\'\3\'\5\'\u0254\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\5+\u025f"+
		"\n+\3,\3,\3,\3,\5,\u0265\n,\3,\3,\5,\u0269\n,\3-\3-\3-\3-\5-\u026f\n-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u027d\n\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\2\b\36 \"$DF\67\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhj\2\7\3\2\64\65\3\2\60\63\3\2\7\b\3\2\t\13\4\2\7\b\r\r\u029c\2t"+
		"\3\2\2\2\4\u00a4\3\2\2\2\6\u00a6\3\2\2\2\b\u00a8\3\2\2\2\n\u00aa\3\2\2"+
		"\2\f\u00b0\3\2\2\2\16\u00b6\3\2\2\2\20\u00bc\3\2\2\2\22\u00c2\3\2\2\2"+
		"\24\u0121\3\2\2\2\26\u012c\3\2\2\2\30\u013f\3\2\2\2\32\u0153\3\2\2\2\34"+
		"\u0155\3\2\2\2\36\u015a\3\2\2\2 \u0165\3\2\2\2\"\u0170\3\2\2\2$\u017b"+
		"\3\2\2\2&\u0192\3\2\2\2(\u01c0\3\2\2\2*\u01ce\3\2\2\2,\u01d0\3\2\2\2."+
		"\u01da\3\2\2\2\60\u01dc\3\2\2\2\62\u01f1\3\2\2\2\64\u01f5\3\2\2\2\66\u01ff"+
		"\3\2\2\28\u0203\3\2\2\2:\u0214\3\2\2\2<\u0216\3\2\2\2>\u021d\3\2\2\2@"+
		"\u0221\3\2\2\2B\u022b\3\2\2\2D\u022d\3\2\2\2F\u0238\3\2\2\2H\u0246\3\2"+
		"\2\2J\u024f\3\2\2\2L\u0253\3\2\2\2N\u0255\3\2\2\2P\u0257\3\2\2\2R\u0259"+
		"\3\2\2\2T\u025e\3\2\2\2V\u0268\3\2\2\2X\u026e\3\2\2\2Z\u0270\3\2\2\2\\"+
		"\u0272\3\2\2\2^\u0274\3\2\2\2`\u0276\3\2\2\2b\u027c\3\2\2\2d\u027e\3\2"+
		"\2\2f\u0280\3\2\2\2h\u0282\3\2\2\2j\u0284\3\2\2\2lm\5(\25\2mn\5\2\2\2"+
		"nu\3\2\2\2op\79\2\2pq\7+\2\2qr\5\4\3\2rs\7,\2\2su\3\2\2\2tl\3\2\2\2to"+
		"\3\2\2\2u\3\3\2\2\2vw\5\62\32\2wx\5\4\3\2x\u00a5\3\2\2\2yz\5> \2z{\7\27"+
		"\2\2{|\5\4\3\2|\u00a5\3\2\2\2}~\5\66\34\2~\177\7\27\2\2\177\u0080\5\4"+
		"\3\2\u0080\u00a5\3\2\2\2\u0081\u0082\5<\37\2\u0082\u0083\7\27\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u00a5\3\2\2\2\u0085\u0086\5\30\r\2\u0086\u0087\5"+
		"\4\3\2\u0087\u00a5\3\2\2\2\u0088\u0089\5\24\13\2\u0089\u008a\5\4\3\2\u008a"+
		"\u00a5\3\2\2\2\u008b\u008c\5\26\f\2\u008c\u008d\5\4\3\2\u008d\u00a5\3"+
		"\2\2\2\u008e\u008f\5B\"\2\u008f\u0090\5\4\3\2\u0090\u00a5\3\2\2\2\u0091"+
		"\u0092\5\n\6\2\u0092\u0093\5\4\3\2\u0093\u00a5\3\2\2\2\u0094\u0095\5\f"+
		"\7\2\u0095\u0096\5\4\3\2\u0096\u00a5\3\2\2\2\u0097\u0098\5\16\b\2\u0098"+
		"\u0099\5\4\3\2\u0099\u00a5\3\2\2\2\u009a\u009b\5\20\t\2\u009b\u009c\5"+
		"\4\3\2\u009c\u00a5\3\2\2\2\u009d\u009e\5\22\n\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a5\3\2\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\5\4\3\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a5\5\6\4\2\u00a4v\3\2\2\2\u00a4y\3\2\2\2\u00a4}\3\2\2\2"+
		"\u00a4\u0081\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u008b"+
		"\3\2\2\2\u00a4\u008e\3\2\2\2\u00a4\u0091\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4"+
		"\u0097\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a0\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\7\3"+
		"\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\t\3\2\2\2\u00aa\u00ab\7;\2\2\u00ab\u00ac"+
		"\7-\2\2\u00ac\u00ad\5@!\2\u00ad\u00ae\7.\2\2\u00ae\u00af\7\27\2\2\u00af"+
		"\13\3\2\2\2\u00b0\u00b1\7:\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\5@!\2\u00b3"+
		"\u00b4\7.\2\2\u00b4\u00b5\7\27\2\2\u00b5\r\3\2\2\2\u00b6\u00b7\7<\2\2"+
		"\u00b7\u00b8\7-\2\2\u00b8\u00b9\5@!\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\7"+
		"\27\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7=\2\2\u00bd\u00be\7-\2\2\u00be\u00bf"+
		"\5@!\2\u00bf\u00c0\7.\2\2\u00c0\u00c1\7\27\2\2\u00c1\21\3\2\2\2\u00c2"+
		"\u00c3\7>\2\2\u00c3\u00c5\7-\2\2\u00c4\u00c6\5@!\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5D#\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\7\24\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf"+
		"\5\26\f\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d1\7.\2\2\u00d1\u00d2\7\27\2\2\u00d2\23\3\2\2\2\u00d3\u00d4"+
		"\7&\2\2\u00d4\u00d5\7-\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7.\2\2\u00d7"+
		"\u00d8\7+\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7,\2\2\u00da\u0122\3\2\2"+
		"\2\u00db\u00dc\7&\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de\7.\2\2\u00de\u00df"+
		"\7+\2\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7,\2\2\u00e1\u0122\3\2\2\2\u00e2"+
		"\u00e3\7&\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7.\2\2\u00e5\u00e6\7+\2\2"+
		"\u00e6\u0122\7,\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\7+\2\2\u00e9\u00ea"+
		"\5\4\3\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7&\2\2\u00ec\u00ed\7-\2\2\u00ed"+
		"\u00ee\5\36\20\2\u00ee\u00ef\7.\2\2\u00ef\u00f0\7\27\2\2\u00f0\u0122\3"+
		"\2\2\2\u00f1\u00f2\7%\2\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\5\4\3\2\u00f4"+
		"\u00f5\7,\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7-\2\2\u00f7\u00f8\7.\2\2"+
		"\u00f8\u00f9\7\27\2\2\u00f9\u0122\3\2\2\2\u00fa\u00fb\7%\2\2\u00fb\u00fc"+
		"\7+\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7&\2\2\u00fe\u00ff\7-\2\2\u00ff"+
		"\u0100\5\36\20\2\u0100\u0101\7.\2\2\u0101\u0102\7\27\2\2\u0102\u0122\3"+
		"\2\2\2\u0103\u0104\7%\2\2\u0104\u0105\7+\2\2\u0105\u0106\7,\2\2\u0106"+
		"\u0107\7&\2\2\u0107\u0108\7-\2\2\u0108\u0109\7.\2\2\u0109\u0122\7\27\2"+
		"\2\u010a\u010b\7$\2\2\u010b\u010c\7-\2\2\u010c\u010d\5> \2\u010d\u010e"+
		"\7\27\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7\27\2\2\u0110\u0111\5B\""+
		"\2\u0111\u0112\7.\2\2\u0112\u0113\7+\2\2\u0113\u0114\5\4\3\2\u0114\u0115"+
		"\7,\2\2\u0115\u0122\3\2\2\2\u0116\u0117\7$\2\2\u0117\u0118\7-\2\2\u0118"+
		"\u0119\5> \2\u0119\u011a\7\27\2\2\u011a\u011b\5\36\20\2\u011b\u011c\7"+
		"\27\2\2\u011c\u011d\5B\"\2\u011d\u011e\7.\2\2\u011e\u011f\7+\2\2\u011f"+
		"\u0120\7,\2\2\u0120\u0122\3\2\2\2\u0121\u00d3\3\2\2\2\u0121\u00db\3\2"+
		"\2\2\u0121\u00e2\3\2\2\2\u0121\u00e7\3\2\2\2\u0121\u00f1\3\2\2\2\u0121"+
		"\u00fa\3\2\2\2\u0121\u0103\3\2\2\2\u0121\u010a\3\2\2\2\u0121\u0116\3\2"+
		"\2\2\u0122\25\3\2\2\2\u0123\u0124\5,\27\2\u0124\u0125\7-\2\2\u0125\u0126"+
		"\5V,\2\u0126\u0127\7.\2\2\u0127\u012d\3\2\2\2\u0128\u0129\5,\27\2\u0129"+
		"\u012a\7-\2\2\u012a\u012b\7.\2\2\u012b\u012d\3\2\2\2\u012c\u0123\3\2\2"+
		"\2\u012c\u0128\3\2\2\2\u012d\27\3\2\2\2\u012e\u012f\7!\2\2\u012f\u0130"+
		"\7-\2\2\u0130\u0131\5\36\20\2\u0131\u0132\7.\2\2\u0132\u0133\7+\2\2\u0133"+
		"\u0134\5\4\3\2\u0134\u0135\7,\2\2\u0135\u0140\3\2\2\2\u0136\u0137\7!\2"+
		"\2\u0137\u0138\7-\2\2\u0138\u0139\5\36\20\2\u0139\u013a\7.\2\2\u013a\u013b"+
		"\7+\2\2\u013b\u013c\5\4\3\2\u013c\u013d\7,\2\2\u013d\u013e\5\32\16\2\u013e"+
		"\u0140\3\2\2\2\u013f\u012e\3\2\2\2\u013f\u0136\3\2\2\2\u0140\31\3\2\2"+
		"\2\u0141\u0142\7\"\2\2\u0142\u0143\7-\2\2\u0143\u0144\5\36\20\2\u0144"+
		"\u0145\7.\2\2\u0145\u0146\7+\2\2\u0146\u0147\5\4\3\2\u0147\u0148\7,\2"+
		"\2\u0148\u0149\5\32\16\2\u0149\u0154\3\2\2\2\u014a\u014b\7\"\2\2\u014b"+
		"\u014c\7-\2\2\u014c\u014d\5\36\20\2\u014d\u014e\7.\2\2\u014e\u014f\7+"+
		"\2\2\u014f\u0150\5\4\3\2\u0150\u0151\7,\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0154\5\34\17\2\u0153\u0141\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u0152\3"+
		"\2\2\2\u0154\33\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157\7+\2\2\u0157\u0158"+
		"\5\4\3\2\u0158\u0159\7,\2\2\u0159\35\3\2\2\2\u015a\u015b\b\20\1\2\u015b"+
		"\u015c\5 \21\2\u015c\u0162\3\2\2\2\u015d\u015e\f\4\2\2\u015e\u015f\7\66"+
		"\2\2\u015f\u0161\5 \21\2\u0160\u015d\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\37\3\2\2\2\u0164\u0162\3\2\2"+
		"\2\u0165\u0166\b\21\1\2\u0166\u0167\5\"\22\2\u0167\u016d\3\2\2\2\u0168"+
		"\u0169\f\4\2\2\u0169\u016a\7\67\2\2\u016a\u016c\5\"\22\2\u016b\u0168\3"+
		"\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"!\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\b\22\1\2\u0171\u0172\5$\23\2"+
		"\u0172\u0178\3\2\2\2\u0173\u0174\f\4\2\2\u0174\u0175\t\2\2\2\u0175\u0177"+
		"\5$\23\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179#\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\b\23\1\2"+
		"\u017c\u017d\5&\24\2\u017d\u0183\3\2\2\2\u017e\u017f\f\4\2\2\u017f\u0180"+
		"\t\3\2\2\u0180\u0182\5&\24\2\u0181\u017e\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184%\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0193\5D#\2\u0187\u0188\7\r\2\2\u0188\u0189\7-\2\2\u0189\u018a"+
		"\5\36\20\2\u018a\u018b\7.\2\2\u018b\u0193\3\2\2\2\u018c\u018d\7-\2\2\u018d"+
		"\u018e\5\36\20\2\u018e\u018f\7.\2\2\u018f\u0193\3\2\2\2\u0190\u0193\5"+
		"@!\2\u0191\u0193\5L\'\2\u0192\u0186\3\2\2\2\u0192\u0187\3\2\2\2\u0192"+
		"\u018c\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\'\3\2\2\2"+
		"\u0194\u0195\5X-\2\u0195\u0196\5,\27\2\u0196\u0197\7-\2\2\u0197\u0198"+
		"\5.\30\2\u0198\u0199\7.\2\2\u0199\u019a\7+\2\2\u019a\u019c\5\4\3\2\u019b"+
		"\u019d\5*\26\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\7,\2\2\u019f\u01c1\3\2\2\2\u01a0\u01a1\5X-\2\u01a1\u01a2"+
		"\5,\27\2\u01a2\u01a3\7-\2\2\u01a3\u01a4\7.\2\2\u01a4\u01a5\7+\2\2\u01a5"+
		"\u01a7\5\4\3\2\u01a6\u01a8\5*\26\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7,\2\2\u01aa\u01c1\3\2\2\2\u01ab"+
		"\u01ac\5X-\2\u01ac\u01ad\5,\27\2\u01ad\u01ae\7-\2\2\u01ae\u01af\5.\30"+
		"\2\u01af\u01b0\7.\2\2\u01b0\u01b2\7+\2\2\u01b1\u01b3\5*\26\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5"+
		"\u01c1\3\2\2\2\u01b6\u01b7\5X-\2\u01b7\u01b8\5,\27\2\u01b8\u01b9\7-\2"+
		"\2\u01b9\u01ba\7.\2\2\u01ba\u01bc\7+\2\2\u01bb\u01bd\5*\26\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7,\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u0194\3\2\2\2\u01c0\u01a0\3\2\2\2\u01c0\u01ab\3\2"+
		"\2\2\u01c0\u01b6\3\2\2\2\u01c1)\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c4"+
		"\5b\62\2\u01c4\u01c5\7\27\2\2\u01c5\u01cf\3\2\2\2\u01c6\u01c7\7(\2\2\u01c7"+
		"\u01c8\5@!\2\u01c8\u01c9\7\27\2\2\u01c9\u01cf\3\2\2\2\u01ca\u01cb\7(\2"+
		"\2\u01cb\u01cc\5D#\2\u01cc\u01cd\7\27\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c2"+
		"\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf+\3\2\2\2\u01d0"+
		"\u01d1\7\23\2\2\u01d1-\3\2\2\2\u01d2\u01d3\5X-\2\u01d3\u01d4\7\22\2\2"+
		"\u01d4\u01db\3\2\2\2\u01d5\u01d6\5X-\2\u01d6\u01d7\7\22\2\2\u01d7\u01d8"+
		"\7/\2\2\u01d8\u01d9\5.\30\2\u01d9\u01db\3\2\2\2\u01da\u01d2\3\2\2\2\u01da"+
		"\u01d5\3\2\2\2\u01db/\3\2\2\2\u01dc\u01dd\7\37\2\2\u01dd\u01de\5X-\2\u01de"+
		"\u01df\58\35\2\u01df\u01e0\7\27\2\2\u01e0\61\3\2\2\2\u01e1\u01e2\5X-\2"+
		"\u01e2\u01e3\5> \2\u01e3\u01e4\7\27\2\2\u01e4\u01f2\3\2\2\2\u01e5\u01e6"+
		"\5X-\2\u01e6\u01e7\5:\36\2\u01e7\u01e8\7\27\2\2\u01e8\u01f2\3\2\2\2\u01e9"+
		"\u01ea\5X-\2\u01ea\u01eb\5@!\2\u01eb\u01ec\7\27\2\2\u01ec\u01f2\3\2\2"+
		"\2\u01ed\u01ee\7\34\2\2\u01ee\u01ef\5\64\33\2\u01ef\u01f0\7\27\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01e1\3\2\2\2\u01f1\u01e5\3\2\2\2\u01f1\u01e9\3\2"+
		"\2\2\u01f1\u01ed\3\2\2\2\u01f2\63\3\2\2\2\u01f3\u01f6\5@!\2\u01f4\u01f6"+
		"\5\66\34\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\65\3\2\2\2\u01f7"+
		"\u01f8\5@!\2\u01f8\u01f9\7\f\2\2\u01f9\u01fa\7\35\2\2\u01fa\u0200\3\2"+
		"\2\2\u01fb\u01fc\5@!\2\u01fc\u01fd\7\f\2\2\u01fd\u01fe\7\36\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200\67\3\2\2"+
		"\2\u0201\u0204\5> \2\u0202\u0204\5<\37\2\u0203\u0201\3\2\2\2\u0203\u0202"+
		"\3\2\2\2\u02049\3\2\2\2\u0205\u0206\5@!\2\u0206\u0207\7)\2\2\u0207\u0208"+
		"\5T+\2\u0208\u0209\7*\2\2\u0209\u0215\3\2\2\2\u020a\u020b\5@!\2\u020b"+
		"\u020c\7)\2\2\u020c\u020d\7*\2\2\u020d\u020e\7\f\2\2\u020e\u0210\7+\2"+
		"\2\u020f\u0211\5V,\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\7,\2\2\u0213\u0215\3\2\2\2\u0214\u0205\3\2\2\2\u0214"+
		"\u020a\3\2\2\2\u0215;\3\2\2\2\u0216\u0217\5@!\2\u0217\u0218\7)\2\2\u0218"+
		"\u0219\5T+\2\u0219\u021a\7*\2\2\u021a\u021b\7\f\2\2\u021b\u021c\5J&\2"+
		"\u021c=\3\2\2\2\u021d\u021e\5@!\2\u021e\u021f\7\f\2\2\u021f\u0220\5D#"+
		"\2\u0220?\3\2\2\2\u0221\u0222\7\22\2\2\u0222A\3\2\2\2\u0223\u0224\5@!"+
		"\2\u0224\u0225\7\20\2\2\u0225\u0226\7\27\2\2\u0226\u022c\3\2\2\2\u0227"+
		"\u0228\5@!\2\u0228\u0229\7\21\2\2\u0229\u022a\7\27\2\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0223\3\2\2\2\u022b\u0227\3\2\2\2\u022cC\3\2\2\2\u022d\u022e"+
		"\b#\1\2\u022e\u022f\5F$\2\u022f\u0235\3\2\2\2\u0230\u0231\f\4\2\2\u0231"+
		"\u0232\t\4\2\2\u0232\u0234\5F$\2\u0233\u0230\3\2\2\2\u0234\u0237\3\2\2"+
		"\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236E\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0238\u0239\b$\1\2\u0239\u023a\5H%\2\u023a\u0240\3\2\2\2\u023b"+
		"\u023c\f\4\2\2\u023c\u023d\t\5\2\2\u023d\u023f\5H%\2\u023e\u023b\3\2\2"+
		"\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241G"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\t\6\2\2\u0244\u0247\5J&\2\u0245"+
		"\u0247\5J&\2\u0246\u0243\3\2\2\2\u0246\u0245\3\2\2\2\u0247I\3\2\2\2\u0248"+
		"\u0250\5b\62\2\u0249\u0250\5\26\f\2\u024a\u024b\7-\2\2\u024b\u024c\5D"+
		"#\2\u024c\u024d\7.\2\2\u024d\u0250\3\2\2\2\u024e\u0250\5@!\2\u024f\u0248"+
		"\3\2\2\2\u024f\u0249\3\2\2\2\u024f\u024a\3\2\2\2\u024f\u024e\3\2\2\2\u0250"+
		"K\3\2\2\2\u0251\u0254\7\35\2\2\u0252\u0254\7\36\2\2\u0253\u0251\3\2\2"+
		"\2\u0253\u0252\3\2\2\2\u0254M\3\2\2\2\u0255\u0256\7)\2\2\u0256O\3\2\2"+
		"\2\u0257\u0258\7*\2\2\u0258Q\3\2\2\2\u0259\u025a\7\f\2\2\u025aS\3\2\2"+
		"\2\u025b\u025f\7\3\2\2\u025c\u025f\5@!\2\u025d\u025f\5D#\2\u025e\u025b"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025fU\3\2\2\2\u0260"+
		"\u0269\5J&\2\u0261\u0262\5J&\2\u0262\u0264\7/\2\2\u0263\u0265\7\6\2\2"+
		"\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267"+
		"\5V,\2\u0267\u0269\3\2\2\2\u0268\u0260\3\2\2\2\u0268\u0261\3\2\2\2\u0269"+
		"W\3\2\2\2\u026a\u026f\5Z.\2\u026b\u026f\5\\/\2\u026c\u026f\5^\60\2\u026d"+
		"\u026f\5`\61\2\u026e\u026a\3\2\2\2\u026e\u026b\3\2\2\2\u026e\u026c\3\2"+
		"\2\2\u026e\u026d\3\2\2\2\u026fY\3\2\2\2\u0270\u0271\7\30\2\2\u0271[\3"+
		"\2\2\2\u0272\u0273\7\31\2\2\u0273]\3\2\2\2\u0274\u0275\7\32\2\2\u0275"+
		"_\3\2\2\2\u0276\u0277\7\33\2\2\u0277a\3\2\2\2\u0278\u027d\5d\63\2\u0279"+
		"\u027d\5f\64\2\u027a\u027d\5h\65\2\u027b\u027d\5j\66\2\u027c\u0278\3\2"+
		"\2\2\u027c\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027d"+
		"c\3\2\2\2\u027e\u027f\7\26\2\2\u027fe\3\2\2\2\u0280\u0281\7\24\2\2\u0281"+
		"g\3\2\2\2\u0282\u0283\7\3\2\2\u0283i\3\2\2\2\u0284\u0285\7\4\2\2\u0285"+
		"k\3\2\2\2)t\u00a4\u00c5\u00c8\u00cb\u00ce\u0121\u012c\u013f\u0153\u0162"+
		"\u016d\u0178\u0183\u0192\u019c\u01a7\u01b2\u01bc\u01c0\u01ce\u01da\u01f1"+
		"\u01f5\u01ff\u0203\u0210\u0214\u022b\u0235\u0240\u0246\u024f\u0253\u025e"+
		"\u0264\u0268\u026e\u027c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
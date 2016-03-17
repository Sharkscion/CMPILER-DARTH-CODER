// Generated from Calculator.g4 by ANTLR 4.5.2

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
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, MOD=9, LPAR=10, 
		RPAR=11, EQUAL=12;
	public static final int
		RULE_start = 0, RULE_plusOrMinus = 1, RULE_multOrDiv = 2, RULE_unarySign = 3, 
		RULE_atom = 4;
	public static final String[] ruleNames = {
		"start", "plusOrMinus", "multOrDiv", "unarySign", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
		"LPAR", "RPAR", "EQUAL"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculateContext extends StartContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode NL() { return getToken(CalculatorParser.NL, 0); }
		public CalculateContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new CalculateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			plusOrMinus(0);
			setState(12);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(11);
				match(NL);
				}
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

	public static class PlusOrMinusContext extends ParserRuleContext {
		public PlusOrMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOrMinus; }
	 
		public PlusOrMinusContext() { }
		public void copyFrom(PlusOrMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMultOrDivContext extends PlusOrMinusContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public ToMultOrDivContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterToMultOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitToMultOrDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends PlusOrMinusContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public PlusContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends PlusOrMinusContext {
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public MinusContext(PlusOrMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOrMinusContext plusOrMinus() throws RecognitionException {
		return plusOrMinus(0);
	}

	private PlusOrMinusContext plusOrMinus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusOrMinusContext _localctx = new PlusOrMinusContext(_ctx, _parentState);
		PlusOrMinusContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_plusOrMinus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(15);
			multOrDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(17);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(18);
						match(PLUS);
						setState(19);
						multOrDiv(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusOrMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusOrMinus);
						setState(20);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(21);
						match(MINUS);
						setState(22);
						multOrDiv(0);
						}
						break;
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MultOrDivContext extends ParserRuleContext {
		public MultOrDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOrDiv; }
	 
		public MultOrDivContext() { }
		public void copyFrom(MultOrDivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public UnarySignContext unarySign() {
			return getRuleContext(UnarySignContext.class,0);
		}
		public MultiplicationContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToUnaryMinusContext extends MultOrDivContext {
		public UnarySignContext unarySign() {
			return getRuleContext(UnarySignContext.class,0);
		}
		public ToUnaryMinusContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterToUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitToUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode MOD() { return getToken(CalculatorParser.MOD, 0); }
		public UnarySignContext unarySign() {
			return getRuleContext(UnarySignContext.class,0);
		}
		public ModuloContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MultOrDivContext {
		public MultOrDivContext multOrDiv() {
			return getRuleContext(MultOrDivContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public UnarySignContext unarySign() {
			return getRuleContext(UnarySignContext.class,0);
		}
		public DivisionContext(MultOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivContext multOrDiv() throws RecognitionException {
		return multOrDiv(0);
	}

	private MultOrDivContext multOrDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultOrDivContext _localctx = new MultOrDivContext(_ctx, _parentState);
		MultOrDivContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_multOrDiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnaryMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(29);
			unarySign();
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(31);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(32);
						match(MULT);
						setState(33);
						unarySign();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(34);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(35);
						match(DIV);
						setState(36);
						unarySign();
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new MultOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multOrDiv);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						match(MOD);
						setState(39);
						unarySign();
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class UnarySignContext extends ParserRuleContext {
		public UnarySignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarySign; }
	 
		public UnarySignContext() { }
		public void copyFrom(UnarySignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangeMinusSignContext extends UnarySignContext {
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ChangeMinusSignContext(UnarySignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterChangeMinusSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitChangeMinusSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitChangeMinusSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangePlusSignContext extends UnarySignContext {
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ChangePlusSignContext(UnarySignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterChangePlusSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitChangePlusSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitChangePlusSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnarySignContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnarySignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarySignContext unarySign() throws RecognitionException {
		UnarySignContext _localctx = new UnarySignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unarySign);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new ChangeMinusSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(MINUS);
				setState(46);
				atom();
				}
				break;
			case PLUS:
				_localctx = new ChangePlusSignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(PLUS);
				setState(48);
				atom();
				}
				break;
			case INT:
			case LPAR:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracesContext extends AtomContext {
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(INT);
				}
				break;
			case LPAR:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(LPAR);
				setState(54);
				plusOrMinus(0);
				setState(55);
				match(RPAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return plusOrMinus_sempred((PlusOrMinusContext)_localctx, predIndex);
		case 2:
			return multOrDiv_sempred((MultOrDivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean plusOrMinus_sempred(PlusOrMinusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multOrDiv_sempred(MultOrDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\6\2\4\4\6\7\2\4\6\b\n\2\2A\2\f\3\2"+
		"\2\2\4\20\3\2\2\2\6\36\3\2\2\2\b\64\3\2\2\2\n;\3\2\2\2\f\16\5\4\3\2\r"+
		"\17\7\5\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\21\b\3\1\2\21\22"+
		"\5\6\4\2\22\33\3\2\2\2\23\24\f\5\2\2\24\25\7\7\2\2\25\32\5\6\4\2\26\27"+
		"\f\4\2\2\27\30\7\b\2\2\30\32\5\6\4\2\31\23\3\2\2\2\31\26\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\33\3\2\2\2\36\37"+
		"\b\4\1\2\37 \5\b\5\2 ,\3\2\2\2!\"\f\6\2\2\"#\7\t\2\2#+\5\b\5\2$%\f\5\2"+
		"\2%&\7\n\2\2&+\5\b\5\2\'(\f\4\2\2()\7\13\2\2)+\5\b\5\2*!\3\2\2\2*$\3\2"+
		"\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60"+
		"\7\b\2\2\60\65\5\n\6\2\61\62\7\7\2\2\62\65\5\n\6\2\63\65\5\n\6\2\64/\3"+
		"\2\2\2\64\61\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66<\7\3\2\2\678\7\f\2"+
		"\289\5\4\3\29:\7\r\2\2:<\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2<\13\3\2\2\2\t"+
		"\16\31\33*,\64;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
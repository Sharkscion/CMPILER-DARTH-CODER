// Generated from Calculator.g4 by ANTLR 4.4

	package ANTLRGeneratedClasses;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, MOD=9, LPAR=10, 
		RPAR=11, EQUAL=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LPAR", 
		"RPAR", "EQUAL"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16D\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\3\6\3\"\n\3\r\3\16\3"+
		"#\3\3\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\2\2"+
		"\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\3\2"+
		"\62;\5\2\13\13\17\17\"\"G\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2\2\5!\3\2\2\2\7+\3\2\2"+
		"\2\t.\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3"+
		"\2\2\2\25>\3\2\2\2\27@\3\2\2\2\31B\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\4\3\2\2\2 \"\t\2\2\2! \3"+
		"\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%\'\7\60\2\2&(\t\2\2\2"+
		"\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\6\3\2\2\2+,\7\f\2\2,\b\3\2"+
		"\2\2-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\b\5\2\2\63\n\3\2\2\2\64\65\7-\2\2\65\f\3\2\2\2\66\67\7/\2"+
		"\2\67\16\3\2\2\289\7,\2\29\20\3\2\2\2:;\7\61\2\2;\22\3\2\2\2<=\7\'\2\2"+
		"=\24\3\2\2\2>?\7*\2\2?\26\3\2\2\2@A\7+\2\2A\30\3\2\2\2BC\7?\2\2C\32\3"+
		"\2\2\2\7\2\36#)\60\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
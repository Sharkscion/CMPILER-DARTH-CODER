// Generated from Darth_Coder.g4 by ANTLR 4.5.2

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
public class Darth_CoderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, MOD=9, LPAR=10, 
		RPAR=11, EQUAL=12, VAR_IDEN=13, FUNC_IDEN=14, UNIT_LIT=15, LEGION_LIT=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LPAR", 
		"RPAR", "EQUAL", "VAR_IDEN", "FUNC_IDEN", "UNIT_LIT", "LEGION_LIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'='", null, null, "'.|\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
		"LPAR", "RPAR", "EQUAL", "VAR_IDEN", "FUNC_IDEN", "UNIT_LIT", "LEGION_LIT"
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


	public Darth_CoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Darth_Coder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2%\n"+
		"\2\r\2\16\2&\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\6\3\60\n\3\r\3\16\3\61\3\4"+
		"\3\4\3\5\6\5\67\n\5\r\5\16\58\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\6\16O\n\16\r\16\16\16P\3"+
		"\17\3\17\6\17U\n\17\r\17\16\17V\3\20\3\20\3\20\3\20\3\21\6\21^\n\21\r"+
		"\21\16\21_\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\6\3\2\62;\5\2\13\13\17\17\"\"\6\2\62;C\\"+
		"aac|\4\2\f\f\60\60g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\3$\3\2\2\2\5)\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\13<\3\2"+
		"\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3"+
		"\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35R\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#%\t\2"+
		"\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\4\3\2\2\2(*\t\2\2\2)("+
		"\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\60\2\2.\60\t\2\2"+
		"\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\6\3\2\2\2\63\64"+
		"\7\f\2\2\64\b\3\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29:\3\2\2\2:;\b\5\2\2;\n\3\2\2\2<=\7-\2\2=\f\3\2\2\2>?\7"+
		"/\2\2?\16\3\2\2\2@A\7,\2\2A\20\3\2\2\2BC\7\61\2\2C\22\3\2\2\2DE\7\'\2"+
		"\2E\24\3\2\2\2FG\7*\2\2G\26\3\2\2\2HI\7+\2\2I\30\3\2\2\2JK\7?\2\2K\32"+
		"\3\2\2\2LN\7a\2\2MO\t\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\34"+
		"\3\2\2\2RT\7%\2\2SU\t\4\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\36"+
		"\3\2\2\2XY\7\60\2\2YZ\7~\2\2Z[\7\f\2\2[ \3\2\2\2\\^\t\5\2\2]\\\3\2\2\2"+
		"^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\"\3\2\2\2\n\2&+\618PV_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
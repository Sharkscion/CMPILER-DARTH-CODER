// Generated from Calculator.g4 by ANTLR 4.5.2
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, NL=3, WS=4, PLUS=5, MINUS=6, MULT=7, DIV=8, LPAR=9, RPAR=10, 
		EQUAL=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "LPAR", "RPAR", 
		"EQUAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DOUBLE", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", "LPAR", 
		"RPAR", "EQUAL"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\4\3\4\3\5\6\5-\n\5\r\5\16\5.\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\3\2\62;\5\2\13\13\17\17\"\""+
		"C\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3\32\3\2\2\2\5\37\3\2\2\2\7)\3\2\2\2\t,\3\2\2\2\13\62\3\2\2\2\r\64\3"+
		"\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25<\3\2\2\2\27>\3\2\2\2\31"+
		"\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\4\3\2\2\2\36 \t\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"#\3\2\2\2#%\7\60\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3"+
		"\2\2\2(\6\3\2\2\2)*\7\f\2\2*\b\3\2\2\2+-\t\3\2\2,+\3\2\2\2-.\3\2\2\2."+
		",\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\b\5\2\2\61\n\3\2\2\2\62\63\7-\2"+
		"\2\63\f\3\2\2\2\64\65\7/\2\2\65\16\3\2\2\2\66\67\7,\2\2\67\20\3\2\2\2"+
		"89\7\61\2\29\22\3\2\2\2:;\7*\2\2;\24\3\2\2\2<=\7+\2\2=\26\3\2\2\2>?\7"+
		"?\2\2?\30\3\2\2\2\7\2\34!\'.\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
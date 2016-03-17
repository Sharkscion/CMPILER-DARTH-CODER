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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_LITERAL", "FLOAT_LITERAL", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "LPAR", "RPAR", "EQUAL", "NOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
		"INCREMENT_OPERATOR", "DECREMENT_OPERATOR", "VAR_IDEN", "FUNC_IDEN", "CHARACTER_LITERAL", 
		"SINGLE_CHARACTER", "STRING_LITERAL", "STRING_CHARACTERS", "STRING_CHARACTER", 
		"TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", "UNIT", "LEGION", "SIDE", 
		"LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", "IF", "ELSE_IF", "ELSE", 
		"FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", "ARRAY_CLOSE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"COMMA", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL_TO", "GREATER_THAN_EQUAL_TO", 
		"NOT_EQUAL", "EQUAL_EQUAL", "AND", "OR", "END_TRANSMISSION", "INITIATE", 
		"SCAN_INTEGER", "SCAN_FLOAT", "SCAN_CHAR", "SCAN_STRING", "PRINT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u020e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\6\2\u0085\n\2\r\2\16\2\u0086\3\3\6\3\u008a"+
		"\n\3\r\3\16\3\u008b\3\3\3\3\6\3\u0090\n\3\r\3\16\3\u0091\3\4\3\4\3\5\6"+
		"\5\u0097\n\5\r\5\16\5\u0098\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00bb\n\23\r\23\16\23\u00bc\3\24"+
		"\3\24\6\24\u00c1\n\24\r\24\16\24\u00c2\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\5\27\u00cd\n\27\3\27\3\27\3\30\6\30\u00d2\n\30\r\30\16\30\u00d3"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\2\2B\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\2-\27/\2\61\2\63\30\65\31\67\329\33;\34=\35?\36"+
		"A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67"+
		"s8u9w:y;{<}=\177>\u0081?\3\2\7\3\2\62;\5\2\13\13\17\17\"\"\6\2\62;C\\"+
		"aac|\4\2))^^\4\2$$^^\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0084\3\2\2\2\5\u0089\3\2\2"+
		"\2\7\u0093\3\2\2\2\t\u0096\3\2\2\2\13\u009c\3\2\2\2\r\u009e\3\2\2\2\17"+
		"\u00a0\3\2\2\2\21\u00a2\3\2\2\2\23\u00a4\3\2\2\2\25\u00a6\3\2\2\2\27\u00a8"+
		"\3\2\2\2\31\u00aa\3\2\2\2\33\u00ac\3\2\2\2\35\u00ae\3\2\2\2\37\u00b0\3"+
		"\2\2\2!\u00b2\3\2\2\2#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00be\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00d1\3\2\2\2\61\u00d5\3\2\2\2"+
		"\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00e8\3\2\2\29\u00f7\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0108\3\2\2\2A\u0112\3\2\2\2C\u011b\3\2\2\2E"+
		"\u0123\3\2\2\2G\u0128\3\2\2\2I\u0136\3\2\2\2K\u0146\3\2\2\2M\u0150\3\2"+
		"\2\2O\u015d\3\2\2\2Q\u0168\3\2\2\2S\u0175\3\2\2\2U\u017e\3\2\2\2W\u0187"+
		"\3\2\2\2Y\u0189\3\2\2\2[\u018b\3\2\2\2]\u018d\3\2\2\2_\u018f\3\2\2\2a"+
		"\u0191\3\2\2\2c\u0193\3\2\2\2e\u0195\3\2\2\2g\u0197\3\2\2\2i\u0199\3\2"+
		"\2\2k\u019c\3\2\2\2m\u019f\3\2\2\2o\u01a2\3\2\2\2q\u01a5\3\2\2\2s\u01a8"+
		"\3\2\2\2u\u01ab\3\2\2\2w\u01bc\3\2\2\2y\u01c5\3\2\2\2{\u01da\3\2\2\2}"+
		"\u01ef\3\2\2\2\177\u01fa\3\2\2\2\u0081\u0207\3\2\2\2\u0083\u0085\t\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\4\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\7\60\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\6\3\2\2\2"+
		"\u0093\u0094\7\f\2\2\u0094\b\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b\5\2\2\u009b\n\3\2\2\2\u009c\u009d\7-\2\2"+
		"\u009d\f\3\2\2\2\u009e\u009f\7/\2\2\u009f\16\3\2\2\2\u00a0\u00a1\7,\2"+
		"\2\u00a1\20\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\22\3\2\2\2\u00a4\u00a5"+
		"\7\'\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7\26\3\2\2\2\u00a8\u00a9"+
		"\7+\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\32\3\2\2\2\u00ac\u00ad"+
		"\7#\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7)\2\2\u00af\36\3\2\2\2\u00b0\u00b1"+
		"\7$\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\7-\2\2\u00b4\"\3"+
		"\2\2\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\7/\2\2\u00b7$\3\2\2\2\u00b8\u00ba"+
		"\7a\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd&\3\2\2\2\u00be\u00c0\7%\2\2\u00bf"+
		"\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7)\2\2\u00c5\u00c6"+
		"\5+\26\2\u00c6\u00c7\7)\2\2\u00c7*\3\2\2\2\u00c8\u00c9\n\5\2\2\u00c9,"+
		"\3\2\2\2\u00ca\u00cc\7$\2\2\u00cb\u00cd\5/\30\2\u00cc\u00cb\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf.\3\2\2\2\u00d0"+
		"\u00d2\5\61\31\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\n\6\2\2\u00d6"+
		"\62\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7I\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7e\2\2"+
		"\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7E\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7f\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7v\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7K\2\2\u00e9"+
		"\u00ea\7o\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2"+
		"\u00ed\u00ee\7k\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1"+
		"\7E\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7v\2\2\u00f68\3\2\2\2\u00f7\u00f8\7W\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7v\2\2\u00fb:\3\2\2\2\u00fc"+
		"\u00fd\7N\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102<\3\2\2\2\u0103\u0104\7U\2"+
		"\2\u0104\u0105\7k\2\2\u0105\u0106\7f\2\2\u0106\u0107\7g\2\2\u0107>\3\2"+
		"\2\2\u0108\u0109\7N\2\2\u0109\u010a\7k\2\2\u010a\u010b\7i\2\2\u010b\u010c"+
		"\7j\2\2\u010c\u010d\7v\2\2\u010d\u010e\7U\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7f\2\2\u0110\u0111\7g\2\2\u0111@\3\2\2\2\u0112\u0113\7F\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7m\2\2\u0116\u0117\7U\2\2"+
		"\u0117\u0118\7k\2\2\u0118\u0119\7f\2\2\u0119\u011a\7g\2\2\u011aB\3\2\2"+
		"\2\u011b\u011c\7F\2\2\u011c\u011d\7g\2\2\u011d\u011e\7e\2\2\u011e\u011f"+
		"\7n\2\2\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2\u0121\u0122\7g\2\2\u0122"+
		"D\3\2\2\2\u0123\u0124\7X\2\2\u0124\u0125\7q\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7f\2\2\u0127F\3\2\2\2\u0128\u0129\7H\2\2\u0129\u012a\7q\2\2\u012a"+
		"\u012b\7t\2\2\u012b\u012c\7e\2\2\u012c\u012d\7g\2\2\u012d\u012e\7K\2\2"+
		"\u012e\u012f\7p\2\2\u012f\u0130\7u\2\2\u0130\u0131\7v\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7p\2\2\u0133\u0134\7e\2\2\u0134\u0135\7g\2\2\u0135"+
		"H\3\2\2\2\u0136\u0137\7K\2\2\u0137\u0138\7p\2\2\u0138\u0139\7u\2\2\u0139"+
		"\u013a\7v\2\2\u013a\u013b\7c\2\2\u013b\u013c\7p\2\2\u013c\u013d\7e\2\2"+
		"\u013d\u013e\7g\2\2\u013e\u013f\7X\2\2\u013f\u0140\7c\2\2\u0140\u0141"+
		"\7t\2\2\u0141\u0142\7k\2\2\u0142\u0143\7c\2\2\u0143\u0144\7p\2\2\u0144"+
		"\u0145\7v\2\2\u0145J\3\2\2\2\u0146\u0147\7P\2\2\u0147\u0148\7q\2\2\u0148"+
		"\u0149\7X\2\2\u0149\u014a\7c\2\2\u014a\u014b\7t\2\2\u014b\u014c\7k\2\2"+
		"\u014c\u014d\7c\2\2\u014d\u014e\7p\2\2\u014e\u014f\7v\2\2\u014fL\3\2\2"+
		"\2\u0150\u0151\7H\2\2\u0151\u0152\7q\2\2\u0152\u0153\7t\2\2\u0153\u0154"+
		"\7e\2\2\u0154\u0155\7g\2\2\u0155\u0156\7E\2\2\u0156\u0157\7q\2\2\u0157"+
		"\u0158\7o\2\2\u0158\u0159\7o\2\2\u0159\u015a\7c\2\2\u015a\u015b\7p\2\2"+
		"\u015b\u015c\7f\2\2\u015cN\3\2\2\2\u015d\u015e\7H\2\2\u015e\u015f\7q\2"+
		"\2\u015f\u0160\7t\2\2\u0160\u0161\7e\2\2\u0161\u0162\7g\2\2\u0162\u0163"+
		"\7Q\2\2\u0163\u0164\7t\2\2\u0164\u0165\7f\2\2\u0165\u0166\7g\2\2\u0166"+
		"\u0167\7t\2\2\u0167P\3\2\2\2\u0168\u0169\7H\2\2\u0169\u016a\7q\2\2\u016a"+
		"\u016b\7t\2\2\u016b\u016c\7e\2\2\u016c\u016d\7g\2\2\u016d\u016e\7C\2\2"+
		"\u016e\u016f\7p\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2\u0171\u0172"+
		"\7{\2\2\u0172\u0173\7|\2\2\u0173\u0174\7g\2\2\u0174R\3\2\2\2\u0175\u0176"+
		"\7Q\2\2\u0176\u0177\7t\2\2\u0177\u0178\7f\2\2\u0178\u0179\7g\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u017b\7a\2\2\u017b\u017c\78\2\2\u017c\u017d\78\2\2"+
		"\u017dT\3\2\2\2\u017e\u017f\7V\2\2\u017f\u0180\7t\2\2\u0180\u0181\7c\2"+
		"\2\u0181\u0182\7p\2\2\u0182\u0183\7u\2\2\u0183\u0184\7o\2\2\u0184\u0185"+
		"\7k\2\2\u0185\u0186\7v\2\2\u0186V\3\2\2\2\u0187\u0188\7>\2\2\u0188X\3"+
		"\2\2\2\u0189\u018a\7@\2\2\u018aZ\3\2\2\2\u018b\u018c\7}\2\2\u018c\\\3"+
		"\2\2\2\u018d\u018e\7\177\2\2\u018e^\3\2\2\2\u018f\u0190\7]\2\2\u0190`"+
		"\3\2\2\2\u0191\u0192\7_\2\2\u0192b\3\2\2\2\u0193\u0194\7.\2\2\u0194d\3"+
		"\2\2\2\u0195\u0196\7>\2\2\u0196f\3\2\2\2\u0197\u0198\7@\2\2\u0198h\3\2"+
		"\2\2\u0199\u019a\7>\2\2\u019a\u019b\7?\2\2\u019bj\3\2\2\2\u019c\u019d"+
		"\7@\2\2\u019d\u019e\7?\2\2\u019el\3\2\2\2\u019f\u01a0\7#\2\2\u01a0\u01a1"+
		"\7?\2\2\u01a1n\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3\u01a4\7?\2\2\u01a4p\3"+
		"\2\2\2\u01a5\u01a6\7(\2\2\u01a6\u01a7\7(\2\2\u01a7r\3\2\2\2\u01a8\u01a9"+
		"\7~\2\2\u01a9\u01aa\7~\2\2\u01aat\3\2\2\2\u01ab\u01ac\7G\2\2\u01ac\u01ad"+
		"\7p\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af\7a\2\2\u01af\u01b0\7V\2\2\u01b0"+
		"\u01b1\7t\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7u\2\2"+
		"\u01b4\u01b5\7o\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8"+
		"\7u\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7p\2\2\u01bb"+
		"v\3\2\2\2\u01bc\u01bd\7K\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7k\2\2\u01bf"+
		"\u01c0\7v\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7v\2\2"+
		"\u01c3\u01c4\7g\2\2\u01c4x\3\2\2\2\u01c5\u01c6\7G\2\2\u01c6\u01c7\7p\2"+
		"\2\u01c7\u01c8\7e\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7f\2\2\u01ca\u01cb"+
		"\7g\2\2\u01cb\u01cc\7I\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7n\2\2\u01ce"+
		"\u01cf\7c\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7k\2\2"+
		"\u01d2\u01d3\7e\2\2\u01d3\u01d4\7E\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6"+
		"\7g\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9\7v\2\2\u01d9"+
		"z\3\2\2\2\u01da\u01db\7G\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7e\2\2\u01dd"+
		"\u01de\7q\2\2\u01de\u01df\7f\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7K\2\2"+
		"\u01e1\u01e2\7o\2\2\u01e2\u01e3\7r\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5"+
		"\7t\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7n\2\2\u01e8"+
		"\u01e9\7E\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7f\2\2"+
		"\u01ec\u01ed\7k\2\2\u01ed\u01ee\7v\2\2\u01ee|\3\2\2\2\u01ef\u01f0\7G\2"+
		"\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7e\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4"+
		"\7f\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7W\2\2\u01f6\u01f7\7p\2\2\u01f7"+
		"\u01f8\7k\2\2\u01f8\u01f9\7v\2\2\u01f9~\3\2\2\2\u01fa\u01fb\7G\2\2\u01fb"+
		"\u01fc\7p\2\2\u01fc\u01fd\7e\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7f\2\2"+
		"\u01ff\u0200\7g\2\2\u0200\u0201\7N\2\2\u0201\u0202\7g\2\2\u0202\u0203"+
		"\7i\2\2\u0203\u0204\7k\2\2\u0204\u0205\7q\2\2\u0205\u0206\7p\2\2\u0206"+
		"\u0080\3\2\2\2\u0207\u0208\7F\2\2\u0208\u0209\7g\2\2\u0209\u020a\7e\2"+
		"\2\u020a\u020b\7q\2\2\u020b\u020c\7f\2\2\u020c\u020d\7g\2\2\u020d\u0082"+
		"\3\2\2\2\13\2\u0086\u008b\u0091\u0098\u00bc\u00c2\u00cc\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
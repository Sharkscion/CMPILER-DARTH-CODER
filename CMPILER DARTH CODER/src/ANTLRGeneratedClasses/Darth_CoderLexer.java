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
		CHARACTER_LITERAL=20, COMMENT_LINE=21, STRING_LITERAL=22, TERMINAL=23, 
		GALACTIC_CREDIT=24, IMPERIAL_CREDIT=25, UNIT=26, LEGION=27, SIDE=28, LIGHT_SIDE=29, 
		DARK_SIDE=30, CONST_DEC=31, VOID=32, IF=33, ELSE_IF=34, ELSE=35, FOR=36, 
		DO=37, WHILE=38, BREAK=39, RETURN=40, ARRAY_OPEN=41, ARRAY_CLOSE=42, OPEN_BRACKET=43, 
		CLOSE_BRACKET=44, OPEN_SQUARE_BRACKET=45, CLOSE_SQUARE_BRACKET=46, COMMA=47, 
		LESS_THAN=48, GREATER_THAN=49, LESS_THAN_EQUAL_TO=50, GREATER_THAN_EQUAL_TO=51, 
		NOT_EQUAL=52, EQUAL_EQUAL=53, AND=54, OR=55, END_TRANSMISSION=56, INITIATE=57, 
		SCAN_INTEGER=58, SCAN_FLOAT=59, SCAN_CHAR=60, SCAN_STRING=61, PRINT=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_LITERAL", "FLOAT_LITERAL", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "LPAR", "RPAR", "EQUAL", "NOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
		"INCREMENT_OPERATOR", "DECREMENT_OPERATOR", "VAR_IDEN", "FUNC_IDEN", "CHARACTER_LITERAL", 
		"COMMENT_LINE", "SINGLE_CHARACTER", "STRING_LITERAL", "STRING_CHARACTERS", 
		"STRING_CHARACTER", "TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", 
		"UNIT", "LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", 
		"IF", "ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", 
		"ARRAY_CLOSE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", 
		"CLOSE_SQUARE_BRACKET", "COMMA", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL_TO", 
		"GREATER_THAN_EQUAL_TO", "NOT_EQUAL", "EQUAL_EQUAL", "AND", "OR", "END_TRANSMISSION", 
		"INITIATE", "SCAN_INTEGER", "SCAN_FLOAT", "SCAN_CHAR", "SCAN_STRING", 
		"PRINT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u0216\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\6\2\u0087\n\2\r\2\16\2\u0088\3\3\6"+
		"\3\u008c\n\3\r\3\16\3\u008d\3\3\3\3\6\3\u0092\n\3\r\3\16\3\u0093\3\4\3"+
		"\4\3\5\6\5\u0099\n\5\r\5\16\5\u009a\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00bd\n\23\r\23\16\23\u00be"+
		"\3\24\3\24\6\24\u00c3\n\24\r\24\16\24\u00c4\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\5\26\u00cd\n\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u00d5\n\30\3\30"+
		"\3\30\3\31\6\31\u00da\n\31\r\31\16\31\u00db\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3B\3B\3B\3B\3B\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\2\63"+
		"\2\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c"+
		"\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\3\2\7\3"+
		"\2\62;\5\2\13\f\17\17\"\"\6\2\62;C\\aac|\4\2))^^\4\2$$^^\u021b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\3\u0086\3\2\2\2\5\u008b\3\2\2\2\7\u0095\3\2\2\2\t"+
		"\u0098\3\2\2\2\13\u009e\3\2\2\2\r\u00a0\3\2\2\2\17\u00a2\3\2\2\2\21\u00a4"+
		"\3\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3"+
		"\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2"+
		"\2#\u00b7\3\2\2\2%\u00ba\3\2\2\2\'\u00c0\3\2\2\2)\u00c6\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61\u00d9\3\2\2\2\63\u00dd\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00f0\3\2\2\2;\u00ff\3\2\2\2=\u0104"+
		"\3\2\2\2?\u010b\3\2\2\2A\u0110\3\2\2\2C\u011a\3\2\2\2E\u0123\3\2\2\2G"+
		"\u012b\3\2\2\2I\u0130\3\2\2\2K\u013e\3\2\2\2M\u014e\3\2\2\2O\u0158\3\2"+
		"\2\2Q\u0165\3\2\2\2S\u0170\3\2\2\2U\u017d\3\2\2\2W\u0186\3\2\2\2Y\u018f"+
		"\3\2\2\2[\u0191\3\2\2\2]\u0193\3\2\2\2_\u0195\3\2\2\2a\u0197\3\2\2\2c"+
		"\u0199\3\2\2\2e\u019b\3\2\2\2g\u019d\3\2\2\2i\u019f\3\2\2\2k\u01a1\3\2"+
		"\2\2m\u01a4\3\2\2\2o\u01a7\3\2\2\2q\u01aa\3\2\2\2s\u01ad\3\2\2\2u\u01b0"+
		"\3\2\2\2w\u01b3\3\2\2\2y\u01c4\3\2\2\2{\u01cd\3\2\2\2}\u01e2\3\2\2\2\177"+
		"\u01f7\3\2\2\2\u0081\u0202\3\2\2\2\u0083\u020f\3\2\2\2\u0085\u0087\t\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\4\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\t\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\6\3"+
		"\2\2\2\u0095\u0096\7\f\2\2\u0096\b\3\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\b\5\2\2\u009d\n\3\2\2\2\u009e\u009f\7-\2\2"+
		"\u009f\f\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1\16\3\2\2\2\u00a2\u00a3\7,\2"+
		"\2\u00a3\20\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\22\3\2\2\2\u00a6\u00a7"+
		"\7\'\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\26\3\2\2\2\u00aa\u00ab"+
		"\7+\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\32\3\2\2\2\u00ae\u00af"+
		"\7#\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7)\2\2\u00b1\36\3\2\2\2\u00b2\u00b3"+
		"\7$\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b6\7-\2\2\u00b6\"\3"+
		"\2\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7/\2\2\u00b9$\3\2\2\2\u00ba\u00bc"+
		"\7a\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf&\3\2\2\2\u00c0\u00c2\7%\2\2\u00c1"+
		"\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7)\2\2\u00c7\u00c8"+
		"\5-\27\2\u00c8\u00c9\7)\2\2\u00c9*\3\2\2\2\u00ca\u00cc\7,\2\2\u00cb\u00cd"+
		"\5\61\31\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cf\7,\2\2\u00cf,\3\2\2\2\u00d0\u00d1\n\5\2\2\u00d1.\3\2\2\2"+
		"\u00d2\u00d4\7$\2\2\u00d3\u00d5\5\61\31\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7\60\3\2\2\2\u00d8"+
		"\u00da\5\63\32\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\62\3\2\2\2\u00dd\u00de\n\6\2\2\u00de"+
		"\64\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7I\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7e\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea"+
		"\7E\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7f\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7v\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7K\2\2\u00f1"+
		"\u00f2\7o\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7t\2\2"+
		"\u00f5\u00f6\7k\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7E\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7f\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7v\2\2\u00fe:\3\2\2\2\u00ff\u0100\7W\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7k\2\2\u0102\u0103\7v\2\2\u0103<\3\2\2\2\u0104"+
		"\u0105\7N\2\2\u0105\u0106\7g\2\2\u0106\u0107\7i\2\2\u0107\u0108\7k\2\2"+
		"\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a>\3\2\2\2\u010b\u010c\7U\2"+
		"\2\u010c\u010d\7k\2\2\u010d\u010e\7f\2\2\u010e\u010f\7g\2\2\u010f@\3\2"+
		"\2\2\u0110\u0111\7N\2\2\u0111\u0112\7k\2\2\u0112\u0113\7i\2\2\u0113\u0114"+
		"\7j\2\2\u0114\u0115\7v\2\2\u0115\u0116\7U\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7f\2\2\u0118\u0119\7g\2\2\u0119B\3\2\2\2\u011a\u011b\7F\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d\u011e\7m\2\2\u011e\u011f\7U\2\2"+
		"\u011f\u0120\7k\2\2\u0120\u0121\7f\2\2\u0121\u0122\7g\2\2\u0122D\3\2\2"+
		"\2\u0123\u0124\7F\2\2\u0124\u0125\7g\2\2\u0125\u0126\7e\2\2\u0126\u0127"+
		"\7n\2\2\u0127\u0128\7c\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a"+
		"F\3\2\2\2\u012b\u012c\7X\2\2\u012c\u012d\7q\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u012f\7f\2\2\u012fH\3\2\2\2\u0130\u0131\7H\2\2\u0131\u0132\7q\2\2\u0132"+
		"\u0133\7t\2\2\u0133\u0134\7e\2\2\u0134\u0135\7g\2\2\u0135\u0136\7K\2\2"+
		"\u0136\u0137\7p\2\2\u0137\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139\u013a"+
		"\7c\2\2\u013a\u013b\7p\2\2\u013b\u013c\7e\2\2\u013c\u013d\7g\2\2\u013d"+
		"J\3\2\2\2\u013e\u013f\7K\2\2\u013f\u0140\7p\2\2\u0140\u0141\7u\2\2\u0141"+
		"\u0142\7v\2\2\u0142\u0143\7c\2\2\u0143\u0144\7p\2\2\u0144\u0145\7e\2\2"+
		"\u0145\u0146\7g\2\2\u0146\u0147\7X\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7t\2\2\u0149\u014a\7k\2\2\u014a\u014b\7c\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7v\2\2\u014dL\3\2\2\2\u014e\u014f\7P\2\2\u014f\u0150\7q\2\2\u0150"+
		"\u0151\7X\2\2\u0151\u0152\7c\2\2\u0152\u0153\7t\2\2\u0153\u0154\7k\2\2"+
		"\u0154\u0155\7c\2\2\u0155\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157N\3\2\2"+
		"\2\u0158\u0159\7H\2\2\u0159\u015a\7q\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7e\2\2\u015c\u015d\7g\2\2\u015d\u015e\7E\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0160\7o\2\2\u0160\u0161\7o\2\2\u0161\u0162\7c\2\2\u0162\u0163\7p\2\2"+
		"\u0163\u0164\7f\2\2\u0164P\3\2\2\2\u0165\u0166\7H\2\2\u0166\u0167\7q\2"+
		"\2\u0167\u0168\7t\2\2\u0168\u0169\7e\2\2\u0169\u016a\7g\2\2\u016a\u016b"+
		"\7Q\2\2\u016b\u016c\7t\2\2\u016c\u016d\7f\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u016f\7t\2\2\u016fR\3\2\2\2\u0170\u0171\7H\2\2\u0171\u0172\7q\2\2\u0172"+
		"\u0173\7t\2\2\u0173\u0174\7e\2\2\u0174\u0175\7g\2\2\u0175\u0176\7C\2\2"+
		"\u0176\u0177\7p\2\2\u0177\u0178\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a"+
		"\7{\2\2\u017a\u017b\7|\2\2\u017b\u017c\7g\2\2\u017cT\3\2\2\2\u017d\u017e"+
		"\7Q\2\2\u017e\u017f\7t\2\2\u017f\u0180\7f\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7a\2\2\u0183\u0184\78\2\2\u0184\u0185\78\2\2"+
		"\u0185V\3\2\2\2\u0186\u0187\7V\2\2\u0187\u0188\7t\2\2\u0188\u0189\7c\2"+
		"\2\u0189\u018a\7p\2\2\u018a\u018b\7u\2\2\u018b\u018c\7o\2\2\u018c\u018d"+
		"\7k\2\2\u018d\u018e\7v\2\2\u018eX\3\2\2\2\u018f\u0190\7>\2\2\u0190Z\3"+
		"\2\2\2\u0191\u0192\7@\2\2\u0192\\\3\2\2\2\u0193\u0194\7}\2\2\u0194^\3"+
		"\2\2\2\u0195\u0196\7\177\2\2\u0196`\3\2\2\2\u0197\u0198\7]\2\2\u0198b"+
		"\3\2\2\2\u0199\u019a\7_\2\2\u019ad\3\2\2\2\u019b\u019c\7.\2\2\u019cf\3"+
		"\2\2\2\u019d\u019e\7>\2\2\u019eh\3\2\2\2\u019f\u01a0\7@\2\2\u01a0j\3\2"+
		"\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7?\2\2\u01a3l\3\2\2\2\u01a4\u01a5"+
		"\7@\2\2\u01a5\u01a6\7?\2\2\u01a6n\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9p\3\2\2\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\7?\2\2\u01acr\3"+
		"\2\2\2\u01ad\u01ae\7(\2\2\u01ae\u01af\7(\2\2\u01aft\3\2\2\2\u01b0\u01b1"+
		"\7~\2\2\u01b1\u01b2\7~\2\2\u01b2v\3\2\2\2\u01b3\u01b4\7G\2\2\u01b4\u01b5"+
		"\7p\2\2\u01b5\u01b6\7f\2\2\u01b6\u01b7\7a\2\2\u01b7\u01b8\7V\2\2\u01b8"+
		"\u01b9\7t\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7u\2\2"+
		"\u01bc\u01bd\7o\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0"+
		"\7u\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7p\2\2\u01c3"+
		"x\3\2\2\2\u01c4\u01c5\7K\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7k\2\2\u01c7"+
		"\u01c8\7v\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7v\2\2"+
		"\u01cb\u01cc\7g\2\2\u01ccz\3\2\2\2\u01cd\u01ce\7G\2\2\u01ce\u01cf\7p\2"+
		"\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7f\2\2\u01d2\u01d3"+
		"\7g\2\2\u01d3\u01d4\7I\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7n\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7e\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7k\2\2"+
		"\u01da\u01db\7e\2\2\u01db\u01dc\7E\2\2\u01dc\u01dd\7t\2\2\u01dd\u01de"+
		"\7g\2\2\u01de\u01df\7f\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7v\2\2\u01e1"+
		"|\3\2\2\2\u01e2\u01e3\7G\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e5\7e\2\2\u01e5"+
		"\u01e6\7q\2\2\u01e6\u01e7\7f\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7K\2\2"+
		"\u01e9\u01ea\7o\2\2\u01ea\u01eb\7r\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed"+
		"\7t\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7c\2\2\u01ef\u01f0\7n\2\2\u01f0"+
		"\u01f1\7E\2\2\u01f1\u01f2\7t\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4\7f\2\2"+
		"\u01f4\u01f5\7k\2\2\u01f5\u01f6\7v\2\2\u01f6~\3\2\2\2\u01f7\u01f8\7G\2"+
		"\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc"+
		"\7f\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe\7W\2\2\u01fe\u01ff\7p\2\2\u01ff"+
		"\u0200\7k\2\2\u0200\u0201\7v\2\2\u0201\u0080\3\2\2\2\u0202\u0203\7G\2"+
		"\2\u0203\u0204\7p\2\2\u0204\u0205\7e\2\2\u0205\u0206\7q\2\2\u0206\u0207"+
		"\7f\2\2\u0207\u0208\7g\2\2\u0208\u0209\7N\2\2\u0209\u020a\7g\2\2\u020a"+
		"\u020b\7i\2\2\u020b\u020c\7k\2\2\u020c\u020d\7q\2\2\u020d\u020e\7p\2\2"+
		"\u020e\u0082\3\2\2\2\u020f\u0210\7F\2\2\u0210\u0211\7g\2\2\u0211\u0212"+
		"\7e\2\2\u0212\u0213\7q\2\2\u0213\u0214\7f\2\2\u0214\u0215\7g\2\2\u0215"+
		"\u0084\3\2\2\2\f\2\u0088\u008d\u0093\u009a\u00be\u00c4\u00cc\u00d4\u00db"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		"COMMENT_LINE", "SINGLE_CHARACTER", "STRING_LITERAL", "TERMINAL", "GALACTIC_CREDIT", 
		"IMPERIAL_CREDIT", "UNIT", "LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", 
		"CONST_DEC", "VOID", "IF", "ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", 
		"RETURN", "ARRAY_OPEN", "ARRAY_CLOSE", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "COMMA", "LESS_THAN", "GREATER_THAN", 
		"LESS_THAN_EQUAL_TO", "GREATER_THAN_EQUAL_TO", "NOT_EQUAL", "EQUAL_EQUAL", 
		"AND", "OR", "END_TRANSMISSION", "INITIATE", "SCAN_INTEGER", "SCAN_FLOAT", 
		"SCAN_CHAR", "SCAN_STRING", "PRINT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\6\2\u0083\n\2\r\2\16\2\u0084\3\3\6\3\u0088\n\3"+
		"\r\3\16\3\u0089\3\3\3\3\6\3\u008e\n\3\r\3\16\3\u008f\3\4\3\4\3\5\6\5\u0095"+
		"\n\5\r\5\16\5\u0096\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\6\23\u00b9\n\23\r\23\16\23\u00ba\3\24\3\24\6"+
		"\24\u00bf\n\24\r\24\16\24\u00c0\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00c9"+
		"\n\26\f\26\16\26\u00cc\13\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7"+
		"\30\u00d6\n\30\f\30\16\30\u00d9\13\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3\u00ca\2A\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\2/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?"+
		"\177@\3\2\b\3\2\62;\5\2\13\f\17\17\"\"\6\2\62;C\\aac|\4\2\f\f\17\17\4"+
		"\2))^^\5\2\f\f\17\17$$\u021a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0082\3\2\2\2\5"+
		"\u0087\3\2\2\2\7\u0091\3\2\2\2\t\u0094\3\2\2\2\13\u009a\3\2\2\2\r\u009c"+
		"\3\2\2\2\17\u009e\3\2\2\2\21\u00a0\3\2\2\2\23\u00a2\3\2\2\2\25\u00a4\3"+
		"\2\2\2\27\u00a6\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ac\3\2"+
		"\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00bc"+
		"\3\2\2\2)\u00c2\3\2\2\2+\u00c6\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61"+
		"\u00dc\3\2\2\2\63\u00de\3\2\2\2\65\u00ed\3\2\2\2\67\u00fc\3\2\2\29\u0101"+
		"\3\2\2\2;\u0108\3\2\2\2=\u010d\3\2\2\2?\u0117\3\2\2\2A\u0120\3\2\2\2C"+
		"\u0128\3\2\2\2E\u012d\3\2\2\2G\u013b\3\2\2\2I\u014b\3\2\2\2K\u0155\3\2"+
		"\2\2M\u0162\3\2\2\2O\u016d\3\2\2\2Q\u017a\3\2\2\2S\u0183\3\2\2\2U\u018c"+
		"\3\2\2\2W\u018e\3\2\2\2Y\u0190\3\2\2\2[\u0192\3\2\2\2]\u0194\3\2\2\2_"+
		"\u0196\3\2\2\2a\u0198\3\2\2\2c\u019a\3\2\2\2e\u019c\3\2\2\2g\u019e\3\2"+
		"\2\2i\u01a1\3\2\2\2k\u01a4\3\2\2\2m\u01a7\3\2\2\2o\u01aa\3\2\2\2q\u01ad"+
		"\3\2\2\2s\u01b0\3\2\2\2u\u01c1\3\2\2\2w\u01ca\3\2\2\2y\u01df\3\2\2\2{"+
		"\u01f4\3\2\2\2}\u01ff\3\2\2\2\177\u020c\3\2\2\2\u0081\u0083\t\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\4\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\7\60\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\6\3\2\2\2\u0091\u0092"+
		"\7\f\2\2\u0092\b\3\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\5\2\2\u0099\n\3\2\2\2\u009a\u009b\7-\2\2\u009b\f\3"+
		"\2\2\2\u009c\u009d\7/\2\2\u009d\16\3\2\2\2\u009e\u009f\7,\2\2\u009f\20"+
		"\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3"+
		"\24\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7+\2\2\u00a7"+
		"\30\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab"+
		"\34\3\2\2\2\u00ac\u00ad\7)\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7$\2\2\u00af"+
		" \3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\7-\2\2\u00b2\"\3\2\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b5\7/\2\2\u00b5$\3\2\2\2\u00b6\u00b8\7a\2\2\u00b7"+
		"\u00b9\t\4\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb&\3\2\2\2\u00bc\u00be\7%\2\2\u00bd\u00bf"+
		"\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7)\2\2\u00c3\u00c4\5-\27\2\u00c4"+
		"\u00c5\7)\2\2\u00c5*\3\2\2\2\u00c6\u00ca\7,\2\2\u00c7\u00c9\n\5\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce"+
		",\3\2\2\2\u00cf\u00d0\n\6\2\2\u00d0.\3\2\2\2\u00d1\u00d7\7$\2\2\u00d2"+
		"\u00d6\n\7\2\2\u00d3\u00d4\7$\2\2\u00d4\u00d6\7$\2\2\u00d5\u00d2\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db"+
		"\60\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd\62\3\2\2\2\u00de\u00df\7I\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7e\2\2"+
		"\u00e3\u00e4\7v\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7"+
		"\7E\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7f\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7v\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7K\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2"+
		"\u00f2\u00f3\7k\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6"+
		"\7E\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7f\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7v\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\7W\2\2\u00fd"+
		"\u00fe\7p\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7v\2\2\u01008\3\2\2\2\u0101"+
		"\u0102\7N\2\2\u0102\u0103\7g\2\2\u0103\u0104\7i\2\2\u0104\u0105\7k\2\2"+
		"\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107:\3\2\2\2\u0108\u0109\7U\2"+
		"\2\u0109\u010a\7k\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2\2\u010c<\3\2"+
		"\2\2\u010d\u010e\7N\2\2\u010e\u010f\7k\2\2\u010f\u0110\7i\2\2\u0110\u0111"+
		"\7j\2\2\u0111\u0112\7v\2\2\u0112\u0113\7U\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7f\2\2\u0115\u0116\7g\2\2\u0116>\3\2\2\2\u0117\u0118\7F\2\2\u0118"+
		"\u0119\7c\2\2\u0119\u011a\7t\2\2\u011a\u011b\7m\2\2\u011b\u011c\7U\2\2"+
		"\u011c\u011d\7k\2\2\u011d\u011e\7f\2\2\u011e\u011f\7g\2\2\u011f@\3\2\2"+
		"\2\u0120\u0121\7F\2\2\u0121\u0122\7g\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7n\2\2\u0124\u0125\7c\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127"+
		"B\3\2\2\2\u0128\u0129\7X\2\2\u0129\u012a\7q\2\2\u012a\u012b\7k\2\2\u012b"+
		"\u012c\7f\2\2\u012cD\3\2\2\2\u012d\u012e\7H\2\2\u012e\u012f\7q\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7e\2\2\u0131\u0132\7g\2\2\u0132\u0133\7K\2\2"+
		"\u0133\u0134\7p\2\2\u0134\u0135\7u\2\2\u0135\u0136\7v\2\2\u0136\u0137"+
		"\7c\2\2\u0137\u0138\7p\2\2\u0138\u0139\7e\2\2\u0139\u013a\7g\2\2\u013a"+
		"F\3\2\2\2\u013b\u013c\7K\2\2\u013c\u013d\7p\2\2\u013d\u013e\7u\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7c\2\2\u0140\u0141\7p\2\2\u0141\u0142\7e\2\2"+
		"\u0142\u0143\7g\2\2\u0143\u0144\7X\2\2\u0144\u0145\7c\2\2\u0145\u0146"+
		"\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7c\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7v\2\2\u014aH\3\2\2\2\u014b\u014c\7P\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7X\2\2\u014e\u014f\7c\2\2\u014f\u0150\7t\2\2\u0150\u0151\7k\2\2"+
		"\u0151\u0152\7c\2\2\u0152\u0153\7p\2\2\u0153\u0154\7v\2\2\u0154J\3\2\2"+
		"\2\u0155\u0156\7H\2\2\u0156\u0157\7q\2\2\u0157\u0158\7t\2\2\u0158\u0159"+
		"\7e\2\2\u0159\u015a\7g\2\2\u015a\u015b\7E\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7o\2\2\u015d\u015e\7o\2\2\u015e\u015f\7c\2\2\u015f\u0160\7p\2\2"+
		"\u0160\u0161\7f\2\2\u0161L\3\2\2\2\u0162\u0163\7H\2\2\u0163\u0164\7q\2"+
		"\2\u0164\u0165\7t\2\2\u0165\u0166\7e\2\2\u0166\u0167\7g\2\2\u0167\u0168"+
		"\7Q\2\2\u0168\u0169\7t\2\2\u0169\u016a\7f\2\2\u016a\u016b\7g\2\2\u016b"+
		"\u016c\7t\2\2\u016cN\3\2\2\2\u016d\u016e\7H\2\2\u016e\u016f\7q\2\2\u016f"+
		"\u0170\7t\2\2\u0170\u0171\7e\2\2\u0171\u0172\7g\2\2\u0172\u0173\7C\2\2"+
		"\u0173\u0174\7p\2\2\u0174\u0175\7c\2\2\u0175\u0176\7n\2\2\u0176\u0177"+
		"\7{\2\2\u0177\u0178\7|\2\2\u0178\u0179\7g\2\2\u0179P\3\2\2\2\u017a\u017b"+
		"\7Q\2\2\u017b\u017c\7t\2\2\u017c\u017d\7f\2\2\u017d\u017e\7g\2\2\u017e"+
		"\u017f\7t\2\2\u017f\u0180\7a\2\2\u0180\u0181\78\2\2\u0181\u0182\78\2\2"+
		"\u0182R\3\2\2\2\u0183\u0184\7V\2\2\u0184\u0185\7t\2\2\u0185\u0186\7c\2"+
		"\2\u0186\u0187\7p\2\2\u0187\u0188\7u\2\2\u0188\u0189\7o\2\2\u0189\u018a"+
		"\7k\2\2\u018a\u018b\7v\2\2\u018bT\3\2\2\2\u018c\u018d\7>\2\2\u018dV\3"+
		"\2\2\2\u018e\u018f\7@\2\2\u018fX\3\2\2\2\u0190\u0191\7}\2\2\u0191Z\3\2"+
		"\2\2\u0192\u0193\7\177\2\2\u0193\\\3\2\2\2\u0194\u0195\7]\2\2\u0195^\3"+
		"\2\2\2\u0196\u0197\7_\2\2\u0197`\3\2\2\2\u0198\u0199\7.\2\2\u0199b\3\2"+
		"\2\2\u019a\u019b\7>\2\2\u019bd\3\2\2\2\u019c\u019d\7@\2\2\u019df\3\2\2"+
		"\2\u019e\u019f\7>\2\2\u019f\u01a0\7?\2\2\u01a0h\3\2\2\2\u01a1\u01a2\7"+
		"@\2\2\u01a2\u01a3\7?\2\2\u01a3j\3\2\2\2\u01a4\u01a5\7#\2\2\u01a5\u01a6"+
		"\7?\2\2\u01a6l\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7?\2\2\u01a9n\3"+
		"\2\2\2\u01aa\u01ab\7(\2\2\u01ab\u01ac\7(\2\2\u01acp\3\2\2\2\u01ad\u01ae"+
		"\7~\2\2\u01ae\u01af\7~\2\2\u01afr\3\2\2\2\u01b0\u01b1\7G\2\2\u01b1\u01b2"+
		"\7p\2\2\u01b2\u01b3\7f\2\2\u01b3\u01b4\7a\2\2\u01b4\u01b5\7V\2\2\u01b5"+
		"\u01b6\7t\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7u\2\2"+
		"\u01b9\u01ba\7o\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd"+
		"\7u\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7p\2\2\u01c0"+
		"t\3\2\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7k\2\2\u01c4"+
		"\u01c5\7v\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8\7v\2\2"+
		"\u01c8\u01c9\7g\2\2\u01c9v\3\2\2\2\u01ca\u01cb\7G\2\2\u01cb\u01cc\7p\2"+
		"\2\u01cc\u01cd\7e\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7f\2\2\u01cf\u01d0"+
		"\7g\2\2\u01d0\u01d1\7I\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7n\2\2\u01d3"+
		"\u01d4\7c\2\2\u01d4\u01d5\7e\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7k\2\2"+
		"\u01d7\u01d8\7e\2\2\u01d8\u01d9\7E\2\2\u01d9\u01da\7t\2\2\u01da\u01db"+
		"\7g\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7v\2\2\u01de"+
		"x\3\2\2\2\u01df\u01e0\7G\2\2\u01e0\u01e1\7p\2\2\u01e1\u01e2\7e\2\2\u01e2"+
		"\u01e3\7q\2\2\u01e3\u01e4\7f\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7K\2\2"+
		"\u01e6\u01e7\7o\2\2\u01e7\u01e8\7r\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea"+
		"\7t\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7n\2\2\u01ed"+
		"\u01ee\7E\2\2\u01ee\u01ef\7t\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7f\2\2"+
		"\u01f1\u01f2\7k\2\2\u01f2\u01f3\7v\2\2\u01f3z\3\2\2\2\u01f4\u01f5\7G\2"+
		"\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7e\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9"+
		"\7f\2\2\u01f9\u01fa\7g\2\2\u01fa\u01fb\7W\2\2\u01fb\u01fc\7p\2\2\u01fc"+
		"\u01fd\7k\2\2\u01fd\u01fe\7v\2\2\u01fe|\3\2\2\2\u01ff\u0200\7G\2\2\u0200"+
		"\u0201\7p\2\2\u0201\u0202\7e\2\2\u0202\u0203\7q\2\2\u0203\u0204\7f\2\2"+
		"\u0204\u0205\7g\2\2\u0205\u0206\7N\2\2\u0206\u0207\7g\2\2\u0207\u0208"+
		"\7i\2\2\u0208\u0209\7k\2\2\u0209\u020a\7q\2\2\u020a\u020b\7p\2\2\u020b"+
		"~\3\2\2\2\u020c\u020d\7F\2\2\u020d\u020e\7g\2\2\u020e\u020f\7e\2\2\u020f"+
		"\u0210\7q\2\2\u0210\u0211\7f\2\2\u0211\u0212\7g\2\2\u0212\u0080\3\2\2"+
		"\2\f\2\u0084\u0089\u008f\u0096\u00ba\u00c0\u00ca\u00d5\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
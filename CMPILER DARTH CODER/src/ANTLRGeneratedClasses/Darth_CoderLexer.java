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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_LITERAL", "FLOAT_LITERAL", "NL", "WS", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "EQUAL", "NOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "VAR_IDEN", "FUNC_IDEN", "CHARACTER_LITERAL", "COMMENT_LINE", 
		"SINGLE_CHARACTER", "STRING_LITERAL", "TERMINAL", "GALACTIC_CREDIT", "IMPERIAL_CREDIT", 
		"UNIT", "LEGION", "SIDE", "LIGHT_SIDE", "DARK_SIDE", "CONST_DEC", "VOID", 
		"IF", "ELSE_IF", "ELSE", "FOR", "DO", "WHILE", "BREAK", "RETURN", "ARRAY_OPEN", 
		"ARRAY_CLOSE", "OPEN_BRACES", "CLOSE_BRACES", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"COMMA", "LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL_TO", "GREATER_THAN_EQUAL_TO", 
		"NOT_EQUAL", "EQUAL_EQUAL", "AND", "OR", "END_TRANSMISSION", "INITIATE", 
		"SCAN_INTEGER", "SCAN_FLOAT", "SCAN_CHAR", "SCAN_STRING", "PRINT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u020b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2\177\n\2\r\2\16\2\u0080\3\3\6\3\u0084\n\3\r\3\16\3\u0085"+
		"\3\3\3\3\6\3\u008a\n\3\r\3\16\3\u008b\3\4\3\4\3\5\6\5\u0091\n\5\r\5\16"+
		"\5\u0092\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\6\21\u00b1"+
		"\n\21\r\21\16\21\u00b2\3\22\3\22\6\22\u00b7\n\22\r\22\16\22\u00b8\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00ce\n\26\f\26\16\26\u00d1\13"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3\u00c2\2?\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\2+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37?"+
		" A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9"+
		"s:u;w<y={>\3\2\b\3\2\62;\5\2\13\f\17\17\"\"\6\2\62;C\\aac|\4\2\f\f\17"+
		"\17\4\2))^^\5\2\f\f\17\17$$\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3~\3\2\2\2\5\u0083\3\2\2\2\7\u008d\3\2"+
		"\2\2\t\u0090\3\2\2\2\13\u0096\3\2\2\2\r\u0098\3\2\2\2\17\u009a\3\2\2\2"+
		"\21\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31"+
		"\u00a4\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2\2\2!\u00ae"+
		"\3\2\2\2#\u00b4\3\2\2\2%\u00ba\3\2\2\2\'\u00be\3\2\2\2)\u00c7\3\2\2\2"+
		"+\u00c9\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00e5\3\2\2\2\63\u00f4"+
		"\3\2\2\2\65\u00f9\3\2\2\2\67\u0100\3\2\2\29\u0105\3\2\2\2;\u010f\3\2\2"+
		"\2=\u0118\3\2\2\2?\u0120\3\2\2\2A\u0125\3\2\2\2C\u0133\3\2\2\2E\u0143"+
		"\3\2\2\2G\u014d\3\2\2\2I\u015a\3\2\2\2K\u0165\3\2\2\2M\u0172\3\2\2\2O"+
		"\u017b\3\2\2\2Q\u0184\3\2\2\2S\u0186\3\2\2\2U\u0188\3\2\2\2W\u018a\3\2"+
		"\2\2Y\u018c\3\2\2\2[\u018e\3\2\2\2]\u0190\3\2\2\2_\u0192\3\2\2\2a\u0194"+
		"\3\2\2\2c\u0196\3\2\2\2e\u0199\3\2\2\2g\u019c\3\2\2\2i\u019f\3\2\2\2k"+
		"\u01a2\3\2\2\2m\u01a5\3\2\2\2o\u01a8\3\2\2\2q\u01b9\3\2\2\2s\u01c2\3\2"+
		"\2\2u\u01d7\3\2\2\2w\u01ec\3\2\2\2y\u01f7\3\2\2\2{\u0204\3\2\2\2}\177"+
		"\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\4\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\7\60\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\6\3\2\2\2\u008d\u008e"+
		"\7\f\2\2\u008e\b\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\b\5\2\2\u0095\n\3\2\2\2\u0096\u0097\7-\2\2\u0097\f\3"+
		"\2\2\2\u0098\u0099\7/\2\2\u0099\16\3\2\2\2\u009a\u009b\7,\2\2\u009b\20"+
		"\3\2\2\2\u009c\u009d\7\61\2\2\u009d\22\3\2\2\2\u009e\u009f\7\'\2\2\u009f"+
		"\24\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3"+
		"\30\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7"+
		"\34\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7-\2\2\u00aa\36\3\2\2\2\u00ab"+
		"\u00ac\7/\2\2\u00ac\u00ad\7/\2\2\u00ad \3\2\2\2\u00ae\u00b0\7a\2\2\u00af"+
		"\u00b1\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\"\3\2\2\2\u00b4\u00b6\7%\2\2\u00b5\u00b7"+
		"\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\u00bc\5)\25\2\u00bc"+
		"\u00bd\7)\2\2\u00bd&\3\2\2\2\u00be\u00c2\7,\2\2\u00bf\u00c1\n\5\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		"(\3\2\2\2\u00c7\u00c8\n\6\2\2\u00c8*\3\2\2\2\u00c9\u00cf\7$\2\2\u00ca"+
		"\u00ce\n\7\2\2\u00cb\u00cc\7$\2\2\u00cc\u00ce\7$\2\2\u00cd\u00ca\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3"+
		",\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7I\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2"+
		"\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7e\2\2\u00de\u00df"+
		"\7E\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7f\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7v\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7K\2\2\u00e6"+
		"\u00e7\7o\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2"+
		"\u00ea\u00eb\7k\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7E\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7f\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7v\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7W\2\2\u00f5"+
		"\u00f6\7p\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7v\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\7N\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7k\2\2"+
		"\u00fd\u00fe\7q\2\2\u00fe\u00ff\7p\2\2\u00ff\66\3\2\2\2\u0100\u0101\7"+
		"U\2\2\u0101\u0102\7k\2\2\u0102\u0103\7f\2\2\u0103\u0104\7g\2\2\u01048"+
		"\3\2\2\2\u0105\u0106\7N\2\2\u0106\u0107\7k\2\2\u0107\u0108\7i\2\2\u0108"+
		"\u0109\7j\2\2\u0109\u010a\7v\2\2\u010a\u010b\7U\2\2\u010b\u010c\7k\2\2"+
		"\u010c\u010d\7f\2\2\u010d\u010e\7g\2\2\u010e:\3\2\2\2\u010f\u0110\7F\2"+
		"\2\u0110\u0111\7c\2\2\u0111\u0112\7t\2\2\u0112\u0113\7m\2\2\u0113\u0114"+
		"\7U\2\2\u0114\u0115\7k\2\2\u0115\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117"+
		"<\3\2\2\2\u0118\u0119\7F\2\2\u0119\u011a\7g\2\2\u011a\u011b\7e\2\2\u011b"+
		"\u011c\7n\2\2\u011c\u011d\7c\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2"+
		"\u011f>\3\2\2\2\u0120\u0121\7X\2\2\u0121\u0122\7q\2\2\u0122\u0123\7k\2"+
		"\2\u0123\u0124\7f\2\2\u0124@\3\2\2\2\u0125\u0126\7H\2\2\u0126\u0127\7"+
		"q\2\2\u0127\u0128\7t\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7K\2\2\u012b\u012c\7p\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u012f\7c\2\2\u012f\u0130\7p\2\2\u0130\u0131\7e\2\2\u0131\u0132\7g\2\2"+
		"\u0132B\3\2\2\2\u0133\u0134\7K\2\2\u0134\u0135\7p\2\2\u0135\u0136\7u\2"+
		"\2\u0136\u0137\7v\2\2\u0137\u0138\7c\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7e\2\2\u013a\u013b\7g\2\2\u013b\u013c\7X\2\2\u013c\u013d\7c\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u013f\7k\2\2\u013f\u0140\7c\2\2\u0140\u0141\7p\2\2"+
		"\u0141\u0142\7v\2\2\u0142D\3\2\2\2\u0143\u0144\7P\2\2\u0144\u0145\7q\2"+
		"\2\u0145\u0146\7X\2\2\u0146\u0147\7c\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7k\2\2\u0149\u014a\7c\2\2\u014a\u014b\7p\2\2\u014b\u014c\7v\2\2\u014c"+
		"F\3\2\2\2\u014d\u014e\7H\2\2\u014e\u014f\7q\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7e\2\2\u0151\u0152\7g\2\2\u0152\u0153\7E\2\2\u0153\u0154\7q\2\2"+
		"\u0154\u0155\7o\2\2\u0155\u0156\7o\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7p\2\2\u0158\u0159\7f\2\2\u0159H\3\2\2\2\u015a\u015b\7H\2\2\u015b\u015c"+
		"\7q\2\2\u015c\u015d\7t\2\2\u015d\u015e\7e\2\2\u015e\u015f\7g\2\2\u015f"+
		"\u0160\7Q\2\2\u0160\u0161\7t\2\2\u0161\u0162\7f\2\2\u0162\u0163\7g\2\2"+
		"\u0163\u0164\7t\2\2\u0164J\3\2\2\2\u0165\u0166\7H\2\2\u0166\u0167\7q\2"+
		"\2\u0167\u0168\7t\2\2\u0168\u0169\7e\2\2\u0169\u016a\7g\2\2\u016a\u016b"+
		"\7C\2\2\u016b\u016c\7p\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e"+
		"\u016f\7{\2\2\u016f\u0170\7|\2\2\u0170\u0171\7g\2\2\u0171L\3\2\2\2\u0172"+
		"\u0173\7Q\2\2\u0173\u0174\7t\2\2\u0174\u0175\7f\2\2\u0175\u0176\7g\2\2"+
		"\u0176\u0177\7t\2\2\u0177\u0178\7a\2\2\u0178\u0179\78\2\2\u0179\u017a"+
		"\78\2\2\u017aN\3\2\2\2\u017b\u017c\7V\2\2\u017c\u017d\7t\2\2\u017d\u017e"+
		"\7c\2\2\u017e\u017f\7p\2\2\u017f\u0180\7u\2\2\u0180\u0181\7o\2\2\u0181"+
		"\u0182\7k\2\2\u0182\u0183\7v\2\2\u0183P\3\2\2\2\u0184\u0185\7*\2\2\u0185"+
		"R\3\2\2\2\u0186\u0187\7+\2\2\u0187T\3\2\2\2\u0188\u0189\7}\2\2\u0189V"+
		"\3\2\2\2\u018a\u018b\7\177\2\2\u018bX\3\2\2\2\u018c\u018d\7]\2\2\u018d"+
		"Z\3\2\2\2\u018e\u018f\7_\2\2\u018f\\\3\2\2\2\u0190\u0191\7.\2\2\u0191"+
		"^\3\2\2\2\u0192\u0193\7>\2\2\u0193`\3\2\2\2\u0194\u0195\7@\2\2\u0195b"+
		"\3\2\2\2\u0196\u0197\7>\2\2\u0197\u0198\7?\2\2\u0198d\3\2\2\2\u0199\u019a"+
		"\7@\2\2\u019a\u019b\7?\2\2\u019bf\3\2\2\2\u019c\u019d\7#\2\2\u019d\u019e"+
		"\7?\2\2\u019eh\3\2\2\2\u019f\u01a0\7?\2\2\u01a0\u01a1\7?\2\2\u01a1j\3"+
		"\2\2\2\u01a2\u01a3\7(\2\2\u01a3\u01a4\7(\2\2\u01a4l\3\2\2\2\u01a5\u01a6"+
		"\7~\2\2\u01a6\u01a7\7~\2\2\u01a7n\3\2\2\2\u01a8\u01a9\7G\2\2\u01a9\u01aa"+
		"\7p\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac\7a\2\2\u01ac\u01ad\7V\2\2\u01ad"+
		"\u01ae\7t\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7u\2\2"+
		"\u01b1\u01b2\7o\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5"+
		"\7u\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7p\2\2\u01b8"+
		"p\3\2\2\2\u01b9\u01ba\7K\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7k\2\2\u01bc"+
		"\u01bd\7v\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7v\2\2"+
		"\u01c0\u01c1\7g\2\2\u01c1r\3\2\2\2\u01c2\u01c3\7G\2\2\u01c3\u01c4\7p\2"+
		"\2\u01c4\u01c5\7e\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7f\2\2\u01c7\u01c8"+
		"\7g\2\2\u01c8\u01c9\7I\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7n\2\2\u01cb"+
		"\u01cc\7c\2\2\u01cc\u01cd\7e\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7k\2\2"+
		"\u01cf\u01d0\7e\2\2\u01d0\u01d1\7E\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3"+
		"\7g\2\2\u01d3\u01d4\7f\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7v\2\2\u01d6"+
		"t\3\2\2\2\u01d7\u01d8\7G\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7e\2\2\u01da"+
		"\u01db\7q\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7K\2\2"+
		"\u01de\u01df\7o\2\2\u01df\u01e0\7r\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2"+
		"\7t\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5\7n\2\2\u01e5"+
		"\u01e6\7E\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7f\2\2"+
		"\u01e9\u01ea\7k\2\2\u01ea\u01eb\7v\2\2\u01ebv\3\2\2\2\u01ec\u01ed\7G\2"+
		"\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7e\2\2\u01ef\u01f0\7q\2\2\u01f0\u01f1"+
		"\7f\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7W\2\2\u01f3\u01f4\7p\2\2\u01f4"+
		"\u01f5\7k\2\2\u01f5\u01f6\7v\2\2\u01f6x\3\2\2\2\u01f7\u01f8\7G\2\2\u01f8"+
		"\u01f9\7p\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7f\2\2"+
		"\u01fc\u01fd\7g\2\2\u01fd\u01fe\7N\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200"+
		"\7i\2\2\u0200\u0201\7k\2\2\u0201\u0202\7q\2\2\u0202\u0203\7p\2\2\u0203"+
		"z\3\2\2\2\u0204\u0205\7F\2\2\u0205\u0206\7g\2\2\u0206\u0207\7e\2\2\u0207"+
		"\u0208\7q\2\2\u0208\u0209\7f\2\2\u0209\u020a\7g\2\2\u020a|\3\2\2\2\f\2"+
		"\u0080\u0085\u008b\u0092\u00b2\u00b8\u00c2\u00cd\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
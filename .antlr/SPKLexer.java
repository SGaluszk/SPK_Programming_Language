// Generated from c:\Users\ikswo\OneDrive\STUDIA\sem6\SPK\SPK_Programming_Language\SPK.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPKLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TYPE_NAME=2, BOOL_=3, FUN_=4, INT=5, LIST=6, FLOATING=7, STRING_=8, 
		IF_=9, THEN_=10, ELSE=11, WHILE=12, FOR=13, IN=14, PRINT_=15, VARIABLE_NAME=16, 
		INTEGER_NUMBER=17, FLOAT_NUMBER=18, STRING=19, NON_ZERO_DIGIT=20, DIGIT=21, 
		OR=22, AND=23, EQ=24, NEQ=25, GT=26, LT=27, GTEQ=28, LTEQ=29, PLUS=30, 
		MINUS=31, MULT=32, DIV=33, MOD=34, POW=35, NOT=36, ASSIGN=37, OPAR=38, 
		CPAR=39, OBRACE=40, CBRACE=41, OSQBRACE=42, CSQBRACE=43, COMMENT=44, SEP=45, 
		WS=46, OTHER=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TYPE_NAME", "BOOL_", "FUN_", "INT", "LIST", "FLOATING", "STRING_", 
			"IF_", "THEN_", "ELSE", "WHILE", "FOR", "IN", "PRINT_", "VARIABLE_NAME", 
			"INTEGER_NUMBER", "FLOAT_NUMBER", "STRING", "NON_ZERO_DIGIT", "DIGIT", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "OSQBRACE", "CSQBRACE", "COMMENT", "SEP", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'LOGICZNA'", "'FUNKCJA'", "'CA\u0141KOWITA'", "'LISTA'", 
			"'U\u0141AMKOWA'", "'NAPIS'", "'JE\u017BELI'", "'TO'", "'INACZEJ'", "'DOP\u00D3KI'", 
			"'DLA'", "'W'", "'WYPISZ'", null, null, null, null, null, null, "'||'", 
			"'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'!'", "'='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TYPE_NAME", "BOOL_", "FUN_", "INT", "LIST", "FLOATING", 
			"STRING_", "IF_", "THEN_", "ELSE", "WHILE", "FOR", "IN", "PRINT_", "VARIABLE_NAME", 
			"INTEGER_NUMBER", "FLOAT_NUMBER", "STRING", "NON_ZERO_DIGIT", "DIGIT", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "OSQBRACE", "CSQBRACE", "COMMENT", "SEP", "WS", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SPKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SPK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3i\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13\21\3\22\5"+
		"\22\u00c9\n\22\3\22\3\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\22\5"+
		"\22\u00d3\n\22\3\23\5\23\u00d6\n\23\3\23\3\23\7\23\u00da\n\23\f\23\16"+
		"\23\u00dd\13\23\3\23\3\23\6\23\u00e1\n\23\r\23\16\23\u00e2\3\23\3\23\3"+
		"\23\3\23\6\23\u00e9\n\23\r\23\16\23\u00ea\5\23\u00ed\n\23\3\24\3\24\3"+
		"\24\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6\13\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3-\7-\u0134\n-\f-\16-\u0137\13-\3-\3-\3.\3.\3/\3/\3/\3/\3\60"+
		"\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\ts\3\2\2\2\13{\3\2"+
		"\2\2\r\u0085\3\2\2\2\17\u008b\3\2\2\2\21\u0094\3\2\2\2\23\u009a\3\2\2"+
		"\2\25\u00a1\3\2\2\2\27\u00a4\3\2\2\2\31\u00ac\3\2\2\2\33\u00b3\3\2\2\2"+
		"\35\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00c0\3\2\2\2#\u00d2\3\2\2\2%\u00ec"+
		"\3\2\2\2\'\u00ee\3\2\2\2)\u00f9\3\2\2\2+\u00fb\3\2\2\2-\u00fd\3\2\2\2"+
		"/\u0100\3\2\2\2\61\u0103\3\2\2\2\63\u0106\3\2\2\2\65\u0109\3\2\2\2\67"+
		"\u010b\3\2\2\29\u010d\3\2\2\2;\u0110\3\2\2\2=\u0113\3\2\2\2?\u0115\3\2"+
		"\2\2A\u0117\3\2\2\2C\u0119\3\2\2\2E\u011b\3\2\2\2G\u011d\3\2\2\2I\u011f"+
		"\3\2\2\2K\u0121\3\2\2\2M\u0123\3\2\2\2O\u0125\3\2\2\2Q\u0127\3\2\2\2S"+
		"\u0129\3\2\2\2U\u012b\3\2\2\2W\u012d\3\2\2\2Y\u012f\3\2\2\2[\u013a\3\2"+
		"\2\2]\u013c\3\2\2\2_\u0140\3\2\2\2ab\7.\2\2b\4\3\2\2\2ci\5\13\6\2di\5"+
		"\r\7\2ei\5\17\b\2fi\5\21\t\2gi\5\7\4\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2h"+
		"f\3\2\2\2hg\3\2\2\2i\6\3\2\2\2jk\7N\2\2kl\7Q\2\2lm\7I\2\2mn\7K\2\2no\7"+
		"E\2\2op\7\\\2\2pq\7P\2\2qr\7C\2\2r\b\3\2\2\2st\7H\2\2tu\7W\2\2uv\7P\2"+
		"\2vw\7M\2\2wx\7E\2\2xy\7L\2\2yz\7C\2\2z\n\3\2\2\2{|\7E\2\2|}\7C\2\2}~"+
		"\7\u0143\2\2~\177\7M\2\2\177\u0080\7Q\2\2\u0080\u0081\7Y\2\2\u0081\u0082"+
		"\7K\2\2\u0082\u0083\7V\2\2\u0083\u0084\7C\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7N\2\2\u0086\u0087\7K\2\2\u0087\u0088\7U\2\2\u0088\u0089\7V\2\2\u0089"+
		"\u008a\7C\2\2\u008a\16\3\2\2\2\u008b\u008c\7W\2\2\u008c\u008d\7\u0143"+
		"\2\2\u008d\u008e\7C\2\2\u008e\u008f\7O\2\2\u008f\u0090\7M\2\2\u0090\u0091"+
		"\7Q\2\2\u0091\u0092\7Y\2\2\u0092\u0093\7C\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7P\2\2\u0095\u0096\7C\2\2\u0096\u0097\7R\2\2\u0097\u0098\7K\2\2\u0098"+
		"\u0099\7U\2\2\u0099\22\3\2\2\2\u009a\u009b\7L\2\2\u009b\u009c\7G\2\2\u009c"+
		"\u009d\7\u017d\2\2\u009d\u009e\7G\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7"+
		"K\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3\7Q\2\2\u00a3\26"+
		"\3\2\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7C\2\2\u00a7"+
		"\u00a8\7E\2\2\u00a8\u00a9\7\\\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7L\2"+
		"\2\u00ab\30\3\2\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00af"+
		"\7R\2\2\u00af\u00b0\7\u00d5\2\2\u00b0\u00b1\7M\2\2\u00b1\u00b2\7K\2\2"+
		"\u00b2\32\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7N\2\2\u00b5\u00b6\7"+
		"C\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7Y\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7Y\2\2\u00ba\u00bb\7[\2\2\u00bb\u00bc\7R\2\2\u00bc\u00bd\7K\2\2\u00bd"+
		"\u00be\7U\2\2\u00be\u00bf\7\\\2\2\u00bf \3\2\2\2\u00c0\u00c4\t\2\2\2\u00c1"+
		"\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9"+
		"\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00ce\5)\25\2\u00cb\u00cd\5+\26\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d3\7\62\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3$\3\2\2\2\u00d4\u00d6\7/\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00db\5)\25\2\u00d8\u00da\5+\26\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\7\60\2\2\u00df"+
		"\u00e1\5+\26\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ed\3\2\2\2\u00e4\u00e5\7\62\2\2\u00e5"+
		"\u00e6\7\60\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5+\26\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00d5\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ed&\3\2\2\2"+
		"\u00ee\u00f4\7$\2\2\u00ef\u00f3\n\4\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f3"+
		"\7$\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7$\2\2\u00f8(\3\2\2\2\u00f9\u00fa\t\5\2\2\u00fa*\3\2"+
		"\2\2\u00fb\u00fc\t\6\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe\u00ff"+
		"\7~\2\2\u00ff.\3\2\2\2\u0100\u0101\7(\2\2\u0101\u0102\7(\2\2\u0102\60"+
		"\3\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\7?\2\2\u0105\62\3\2\2\2\u0106"+
		"\u0107\7#\2\2\u0107\u0108\7?\2\2\u0108\64\3\2\2\2\u0109\u010a\7@\2\2\u010a"+
		"\66\3\2\2\2\u010b\u010c\7>\2\2\u010c8\3\2\2\2\u010d\u010e\7@\2\2\u010e"+
		"\u010f\7?\2\2\u010f:\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7?\2\2\u0112"+
		"<\3\2\2\2\u0113\u0114\7-\2\2\u0114>\3\2\2\2\u0115\u0116\7/\2\2\u0116@"+
		"\3\2\2\2\u0117\u0118\7,\2\2\u0118B\3\2\2\2\u0119\u011a\7\61\2\2\u011a"+
		"D\3\2\2\2\u011b\u011c\7\'\2\2\u011cF\3\2\2\2\u011d\u011e\7`\2\2\u011e"+
		"H\3\2\2\2\u011f\u0120\7#\2\2\u0120J\3\2\2\2\u0121\u0122\7?\2\2\u0122L"+
		"\3\2\2\2\u0123\u0124\7*\2\2\u0124N\3\2\2\2\u0125\u0126\7+\2\2\u0126P\3"+
		"\2\2\2\u0127\u0128\7}\2\2\u0128R\3\2\2\2\u0129\u012a\7\177\2\2\u012aT"+
		"\3\2\2\2\u012b\u012c\7]\2\2\u012cV\3\2\2\2\u012d\u012e\7_\2\2\u012eX\3"+
		"\2\2\2\u012f\u0130\7A\2\2\u0130\u0131\7A\2\2\u0131\u0135\3\2\2\2\u0132"+
		"\u0134\n\7\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\b-\2\2\u0139Z\3\2\2\2\u013a\u013b\7=\2\2\u013b\\\3\2\2\2\u013c"+
		"\u013d\t\b\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b/\2\2\u013f^\3\2\2\2\u0140"+
		"\u0141\13\2\2\2\u0141`\3\2\2\2\20\2h\u00c4\u00c8\u00ce\u00d2\u00d5\u00db"+
		"\u00e2\u00ea\u00ec\u00f2\u00f4\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
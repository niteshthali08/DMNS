// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SYMBOLS=18, NUMBER=19, ID=20, BOOLEXPR=21, RELOPERATORS=22, ARITHOPERATOR=23, 
		WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"SYMBOLS", "NUMBER", "ID", "BOOLEXPR", "RELOPERATORS", "ARITHOPERATOR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'if'", "'else'", "'while'", "'('", "')'", "'{'", "'}'", 
		"'func'", "'return'", "','", "'stack'", "'push('", "'pop()'", "'isEmpty()'", 
		"'print'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SYMBOLS", "NUMBER", "ID", "BOOLEXPR", 
		"RELOPERATORS", "ARITHOPERATOR", "WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\6\24\u0081\n\24\r\24\16\24\u0082\3\25\6\25\u0086\n\25\r\25\16\25"+
		"\u0087\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0093\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u009e\n\27\3\30\3\30"+
		"\3\31\6\31\u00a3\n\31\r\31\16\31\u00a4\3\31\3\31\2\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\7\2##&(<=AB`a\3\2\62;\4\2C\\c|\4"+
		"\2>>@@\5\2,-//\61\61\5\2\13\f\17\17\"\"\u00af\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2"+
		"\2\2\5\65\3\2\2\2\78\3\2\2\2\t=\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2"+
		"\2\2\21I\3\2\2\2\23K\3\2\2\2\25P\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33_\3"+
		"\2\2\2\35e\3\2\2\2\37k\3\2\2\2!u\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\u0080\3"+
		"\2\2\2)\u0085\3\2\2\2+\u0092\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61"+
		"\u00a2\3\2\2\2\63\64\7?\2\2\64\4\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67"+
		"\6\3\2\2\289\7g\2\29:\7n\2\2:;\7u\2\2;<\7g\2\2<\b\3\2\2\2=>\7y\2\2>?\7"+
		"j\2\2?@\7k\2\2@A\7n\2\2AB\7g\2\2B\n\3\2\2\2CD\7*\2\2D\f\3\2\2\2EF\7+\2"+
		"\2F\16\3\2\2\2GH\7}\2\2H\20\3\2\2\2IJ\7\177\2\2J\22\3\2\2\2KL\7h\2\2L"+
		"M\7w\2\2MN\7p\2\2NO\7e\2\2O\24\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7v\2\2ST\7"+
		"w\2\2TU\7t\2\2UV\7p\2\2V\26\3\2\2\2WX\7.\2\2X\30\3\2\2\2YZ\7u\2\2Z[\7"+
		"v\2\2[\\\7c\2\2\\]\7e\2\2]^\7m\2\2^\32\3\2\2\2_`\7r\2\2`a\7w\2\2ab\7u"+
		"\2\2bc\7j\2\2cd\7*\2\2d\34\3\2\2\2ef\7r\2\2fg\7q\2\2gh\7r\2\2hi\7*\2\2"+
		"ij\7+\2\2j\36\3\2\2\2kl\7k\2\2lm\7u\2\2mn\7G\2\2no\7o\2\2op\7r\2\2pq\7"+
		"v\2\2qr\7{\2\2rs\7*\2\2st\7+\2\2t \3\2\2\2uv\7r\2\2vw\7t\2\2wx\7k\2\2"+
		"xy\7p\2\2yz\7v\2\2z\"\3\2\2\2{|\7$\2\2|$\3\2\2\2}~\t\2\2\2~&\3\2\2\2\177"+
		"\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083(\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"*\3\2\2\2\u0089\u008a\7V\2\2\u008a\u008b\7T\2\2\u008b\u008c\7W\2\2\u008c"+
		"\u0093\7G\2\2\u008d\u008e\7H\2\2\u008e\u008f\7C\2\2\u008f\u0090\7N\2\2"+
		"\u0090\u0091\7U\2\2\u0091\u0093\7G\2\2\u0092\u0089\3\2\2\2\u0092\u008d"+
		"\3\2\2\2\u0093,\3\2\2\2\u0094\u009e\t\5\2\2\u0095\u0096\7?\2\2\u0096\u009e"+
		"\7?\2\2\u0097\u0098\7>\2\2\u0098\u009e\7?\2\2\u0099\u009a\7@\2\2\u009a"+
		"\u009e\7?\2\2\u009b\u009c\7#\2\2\u009c\u009e\7?\2\2\u009d\u0094\3\2\2"+
		"\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e.\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\60\3\2\2\2\u00a1\u00a3"+
		"\t\7\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\31\2\2\u00a7\62\3\2\2"+
		"\2\b\2\u0082\u0087\u0092\u009d\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
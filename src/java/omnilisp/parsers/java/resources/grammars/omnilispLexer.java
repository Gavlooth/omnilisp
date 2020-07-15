// Generated from resources/grammars/omnilisp.g4 by ANTLR 4.8
package omnilisp.parsers.java;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class omnilispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, FLOAT=5, STRING=6, SYMBOL=7, TRASH=8, 
		HEX=9, BIN=10, LONG=11, BIGN=12, DEFINE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "BOOLEAN", "FLOAT", "STRING", "SYMBOL", "TRASH", 
			"WS", "NAME", "SYMBOL_HEAD", "SYMBOL_REST", "COMMENT", "FLOAT_TAIL", 
			"FLOAT_DECIMAL", "FLOAT_EXP", "HEXD", "HEX", "BIN", "LONG", "BIGN", "MATCH", 
			"DEFINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'nil'", null, null, null, null, null, null, null, 
			null, null, "'define'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BOOLEAN", "FLOAT", "STRING", "SYMBOL", "TRASH", 
			"HEX", "BIN", "LONG", "BIGN", "DEFINE"
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


	public omnilispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "omnilisp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C"+
		"\n\5\3\6\5\6F\n\6\3\6\6\6I\n\6\r\6\16\6J\3\6\3\6\5\6O\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7"+
		"\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\5\bn\n\b\3\t\3\t\5\tr\n\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\13\3\13\6\13\u0081"+
		"\n\13\r\13\16\13\u0082\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f"+
		"\3\r\3\r\5\r\u008e\n\r\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\20\3\20\6\20\u00a0\n\20\r"+
		"\20\16\20\u00a1\3\21\3\21\5\21\u00a6\n\21\3\21\6\21\u00a9\n\21\r\21\16"+
		"\21\u00aa\3\22\3\22\3\23\3\23\3\23\6\23\u00b2\n\23\r\23\16\23\u00b3\3"+
		"\24\3\24\3\24\6\24\u00b9\n\24\r\24\16\24\u00ba\3\25\5\25\u00be\n\25\3"+
		"\25\6\25\u00c1\n\25\r\25\16\25\u00c2\3\25\5\25\u00c6\n\25\3\26\5\26\u00c9"+
		"\n\26\3\26\6\26\u00cc\n\26\r\26\16\26\u00cd\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f"+
		")\r+\16-\2/\17\3\2\17\3\2\62;\3\2$$\6\2\13\f\17\17\"\"..\20\2\13\f\17"+
		"\17\"\"$%\'\')+..\61<BB]]_`bb}}\177\u0080\4\2\60\60\62;\4\2\f\f\17\17"+
		"\4\2GGgg\5\2\62;CHch\4\2ZZzz\4\2DDdd\3\2\62\63\4\2NNnn\4\2PPpp\2\u00ef"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\tB\3\2\2\2\13"+
		"^\3\2\2\2\r`\3\2\2\2\17m\3\2\2\2\21q\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27"+
		"\u0089\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u009b\3\2\2\2\37\u009d"+
		"\3\2\2\2!\u00a3\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b5\3\2\2\2"+
		")\u00bd\3\2\2\2+\u00c8\3\2\2\2-\u00d1\3\2\2\2/\u00d7\3\2\2\2\61\62\7*"+
		"\2\2\62\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7p\2\2\66\67\7k\2\2"+
		"\678\7n\2\28\b\3\2\2\29:\7v\2\2:;\7t\2\2;<\7w\2\2<C\7g\2\2=>\7h\2\2>?"+
		"\7c\2\2?@\7n\2\2@A\7u\2\2AC\7g\2\2B9\3\2\2\2B=\3\2\2\2C\n\3\2\2\2DF\7"+
		"/\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2KL\3\2\2\2L_\5\35\17\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2OP"+
		"\3\2\2\2PQ\7K\2\2QR\7p\2\2RS\7h\2\2ST\7k\2\2TU\7p\2\2UV\7k\2\2VW\7v\2"+
		"\2W_\7{\2\2XZ\7/\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7P\2\2\\]\7c\2\2"+
		"]_\7P\2\2^E\3\2\2\2^N\3\2\2\2^Y\3\2\2\2_\f\3\2\2\2`f\7$\2\2ae\n\3\2\2"+
		"bc\7^\2\2ce\7$\2\2da\3\2\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"i\3\2\2\2hf\3\2\2\2ij\7$\2\2j\16\3\2\2\2kn\4\60\61\2ln\5\25\13\2mk\3\2"+
		"\2\2ml\3\2\2\2n\20\3\2\2\2or\5\23\n\2pr\5\33\16\2qo\3\2\2\2qp\3\2\2\2"+
		"rs\3\2\2\2st\b\t\2\2t\22\3\2\2\2uv\t\4\2\2v\24\3\2\2\2w{\5\27\f\2xz\5"+
		"\31\r\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0086\3\2\2\2}{\3\2\2"+
		"\2~\u0080\7<\2\2\177\u0081\5\31\r\2\u0080\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"~\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\26\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\n\5\2\2\u008a\30\3\2"+
		"\2\2\u008b\u008e\5\27\f\2\u008c\u008e\t\6\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\32\3\2\2\2\u008f\u0093\7=\2\2\u0090\u0092\n\7\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\34\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\37\20\2\u0097"+
		"\u0098\5!\21\2\u0098\u009c\3\2\2\2\u0099\u009c\5\37\20\2\u009a\u009c\5"+
		"!\21\2\u009b\u0096\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009f\7\60\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2 "+
		"\3\2\2\2\u00a3\u00a5\t\b\2\2\u00a4\u00a6\7/\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\t\t\2\2\u00ad$\3\2\2\2\u00ae\u00af\7\62\2\2\u00af"+
		"\u00b1\t\n\2\2\u00b0\u00b2\5#\22\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4&\3\2\2\2\u00b5\u00b6"+
		"\7\62\2\2\u00b6\u00b8\t\13\2\2\u00b7\u00b9\t\f\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00be\7/\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c6\t\r\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6*\3\2\2\2"+
		"\u00c7\u00c9\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\t\16"+
		"\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7j\2\2\u00d6.\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7g\2\2\u00dd\60\3\2\2\2\35\2BEJNY^dfmq{\u0082"+
		"\u0086\u008d\u0093\u009b\u00a1\u00a5\u00aa\u00b3\u00ba\u00bd\u00c2\u00c5"+
		"\u00c8\u00cd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
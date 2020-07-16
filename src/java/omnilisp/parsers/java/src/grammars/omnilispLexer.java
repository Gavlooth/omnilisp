// Generated from src/grammars/omnilisp.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, NIL=3, BOOLEAN=4, FLOAT=5, STRING=6, SYMBOL=7, TRASH=8, 
		HEX=9, BIN=10, LONG=11, BIGN=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NIL", "BOOLEAN", "FLOAT", "STRING", "SYMBOL", "TRASH", 
			"WS", "NAME", "SYMBOL_HEAD", "SYMBOL_REST", "COMMENT", "FLOAT_TAIL", 
			"FLOAT_DECIMAL", "FLOAT_EXP", "HEXD", "HEX", "BIN", "LONG", "BIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NIL", "BOOLEAN", "FLOAT", "STRING", "SYMBOL", "TRASH", 
			"HEX", "BIN", "LONG", "BIGN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\5\6B\n\6\3\6"+
		"\6\6E\n\6\r\6\16\6F\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6V\n\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\7\7a\n\7\f\7\16\7d\13"+
		"\7\3\7\3\7\3\b\3\b\5\bj\n\b\3\t\3\t\5\tn\n\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\7\13v\n\13\f\13\16\13y\13\13\3\13\3\13\6\13}\n\13\r\13\16\13~\7\13\u0081"+
		"\n\13\f\13\16\13\u0084\13\13\3\f\3\f\3\r\3\r\5\r\u008a\n\r\3\16\3\16\7"+
		"\16\u008e\n\16\f\16\16\16\u0091\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u0098"+
		"\n\17\3\20\3\20\6\20\u009c\n\20\r\20\16\20\u009d\3\21\3\21\5\21\u00a2"+
		"\n\21\3\21\6\21\u00a5\n\21\r\21\16\21\u00a6\3\22\3\22\3\23\3\23\3\23\6"+
		"\23\u00ae\n\23\r\23\16\23\u00af\3\24\3\24\3\24\6\24\u00b5\n\24\r\24\16"+
		"\24\u00b6\3\25\5\25\u00ba\n\25\3\25\6\25\u00bd\n\25\r\25\16\25\u00be\3"+
		"\25\5\25\u00c2\n\25\3\26\5\26\u00c5\n\26\3\26\6\26\u00c8\n\26\r\26\16"+
		"\26\u00c9\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+\16\3\2\17\3\2\62;\3\2$$"+
		"\6\2\13\f\17\17\"\"..\20\2\13\f\17\17\"\"$%\'\')+..\61<BB]]_`bb}}\177"+
		"\u0080\4\2\60\60\62;\4\2\f\f\17\17\4\2GGgg\5\2\62;CHch\4\2ZZzz\4\2DDd"+
		"d\3\2\62\63\4\2NNnn\4\2PPpp\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3"+
		"\2\2\2\t>\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17i\3\2\2\2\21m\3\2\2\2\23q"+
		"\3\2\2\2\25s\3\2\2\2\27\u0085\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2"+
		"\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2!\u009f\3\2\2\2#\u00a8\3\2\2\2%\u00aa"+
		"\3\2\2\2\'\u00b1\3\2\2\2)\u00b9\3\2\2\2+\u00c4\3\2\2\2-.\7*\2\2.\4\3\2"+
		"\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7p\2\2\62\63\7k\2\2\63\64\7n\2\2\64"+
		"\b\3\2\2\2\65\66\7v\2\2\66\67\7t\2\2\678\7w\2\28?\7g\2\29:\7h\2\2:;\7"+
		"c\2\2;<\7n\2\2<=\7u\2\2=?\7g\2\2>\65\3\2\2\2>9\3\2\2\2?\n\3\2\2\2@B\7"+
		"/\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GH\3\2\2\2H[\5\35\17\2IK\7/\2\2JI\3\2\2\2JK\3\2\2\2KL"+
		"\3\2\2\2LM\7K\2\2MN\7p\2\2NO\7h\2\2OP\7k\2\2PQ\7p\2\2QR\7k\2\2RS\7v\2"+
		"\2S[\7{\2\2TV\7/\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7P\2\2XY\7c\2\2Y"+
		"[\7P\2\2ZA\3\2\2\2ZJ\3\2\2\2ZU\3\2\2\2[\f\3\2\2\2\\b\7$\2\2]a\n\3\2\2"+
		"^_\7^\2\2_a\7$\2\2`]\3\2\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"e\3\2\2\2db\3\2\2\2ef\7$\2\2f\16\3\2\2\2gj\4\60\61\2hj\5\25\13\2ig\3\2"+
		"\2\2ih\3\2\2\2j\20\3\2\2\2kn\5\23\n\2ln\5\33\16\2mk\3\2\2\2ml\3\2\2\2"+
		"no\3\2\2\2op\b\t\2\2p\22\3\2\2\2qr\t\4\2\2r\24\3\2\2\2sw\5\27\f\2tv\5"+
		"\31\r\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0082\3\2\2\2yw\3\2\2"+
		"\2z|\7<\2\2{}\5\31\r\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080z\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\26\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\n\5\2\2\u0086\30\3\2\2\2\u0087\u008a\5\27\f\2\u0088\u008a\t\6\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\32\3\2\2\2\u008b\u008f\7=\2\2"+
		"\u008c\u008e\n\7\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\5\37\20\2\u0093\u0094\5!\21\2\u0094\u0098\3\2\2\2\u0095\u0098\5"+
		"\37\20\2\u0096\u0098\5!\21\2\u0097\u0092\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\36\3\2\2\2\u0099\u009b\7\60\2\2\u009a\u009c\t\2\2"+
		"\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e \3\2\2\2\u009f\u00a1\t\b\2\2\u00a0\u00a2\7/\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\t\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\t\t\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7"+
		"\62\2\2\u00ab\u00ad\t\n\2\2\u00ac\u00ae\5#\22\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0&\3\2\2\2"+
		"\u00b1\u00b2\7\62\2\2\u00b2\u00b4\t\13\2\2\u00b3\u00b5\t\f\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"(\3\2\2\2\u00b8\u00ba\7/\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00c2\t\r\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2*\3\2\2\2"+
		"\u00c3\u00c5\7/\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\t\16"+
		"\2\2\u00cc,\3\2\2\2\35\2>AFJUZ`bimw~\u0082\u0089\u008f\u0097\u009d\u00a1"+
		"\u00a6\u00af\u00b6\u00b9\u00be\u00c1\u00c4\u00c9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package omnilisp.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OmnilispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, BOOLEAN=5, STRING=6, SYMBOL=7, COMMENT=8,
		WS=9, FLOAT=10, HEX=11, BIN=12, LONG=13, BIGN=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "INT", "BOOLEAN", "STRING", "SYMBOL", "COMMENT",
			"WS", "FLOAT", "FLOAT_TAIL", "FLOAT_DECIMAL", "FLOAT_EXP", "HEXD", "HEX",
			"BIN", "LONG", "BIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "BOOLEAN", "STRING", "SYMBOL", "COMMENT",
			"WS", "FLOAT", "HEX", "BIN", "LONG", "BIGN"
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


	public OmnilispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Omnilisp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\6\3"+
		"\6\3\6\3\6\5\6\67\n\6\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3\7"+
		"\3\b\3\b\7\bF\n\b\f\b\16\bI\13\b\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\5\13[\n\13\3\13\6\13^\n\13\r\13\16\13"+
		"_\3\13\3\13\5\13d\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13o\n\13\3\13\3\13\3\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\r\3"+
		"\r\6\r\177\n\r\r\r\16\r\u0080\3\16\3\16\5\16\u0085\n\16\3\16\6\16\u0088"+
		"\n\16\r\16\16\16\u0089\3\17\3\17\3\20\3\20\3\20\6\20\u0091\n\20\r\20\16"+
		"\20\u0092\3\21\3\21\3\21\6\21\u0098\n\21\r\21\16\21\u0099\3\22\5\22\u009d"+
		"\n\22\3\22\6\22\u00a0\n\22\r\22\16\22\u00a1\3\22\5\22\u00a5\n\22\3\23"+
		"\5\23\u00a8\n\23\3\23\6\23\u00ab\n\23\r\23\16\23\u00ac\3\23\3\23\3N\2"+
		"\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2"+
		"\37\r!\16#\17%\20\3\2\16\3\2\62;\3\2$$\7\2\13\f\17\17\"\"$%)+\7\2\13\f"+
		"\17\17\"\"$$)+\5\2\13\f\17\17\"\"\4\2GGgg\5\2\62;CHch\4\2ZZzz\4\2DDdd"+
		"\3\2\62\63\4\2NNnn\4\2PPpp\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'"+
		"\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17"+
		"C\3\2\2\2\21J\3\2\2\2\23U\3\2\2\2\25s\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2"+
		"\33\u0082\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u0094\3\2\2\2#\u009c"+
		"\3\2\2\2%\u00a7\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7)"+
		"\2\2,\b\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\n\3\2\2\2\62\63\7%\2\2\63\67\7h\2\2\64\65\7%\2\2\65\67\7v\2\2"+
		"\66\62\3\2\2\2\66\64\3\2\2\2\67\f\3\2\2\28>\7$\2\29=\n\3\2\2:;\7^\2\2"+
		";=\7$\2\2<9\3\2\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@>\3\2\2\2AB\7$\2\2B\16\3\2\2\2CG\n\4\2\2DF\n\5\2\2ED\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2H\20\3\2\2\2IG\3\2\2\2JN\7=\2\2KM\13\2\2\2LK\3\2"+
		"\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\f\2\2RS\3\2"+
		"\2\2ST\b\t\2\2T\22\3\2\2\2UV\t\6\2\2VW\3\2\2\2WX\b\n\2\2X\24\3\2\2\2Y"+
		"[\7/\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2at\5\27\f\2bd\7/\2\2cb\3\2\2\2cd\3\2\2\2"+
		"de\3\2\2\2ef\7K\2\2fg\7P\2\2gh\7H\2\2hi\7K\2\2ij\7P\2\2jk\7K\2\2kl\7V"+
		"\2\2lt\7[\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7P\2\2qr\7C\2\2"+
		"rt\7P\2\2sZ\3\2\2\2sc\3\2\2\2sn\3\2\2\2t\26\3\2\2\2uv\5\31\r\2vw\5\33"+
		"\16\2w{\3\2\2\2x{\5\31\r\2y{\5\33\16\2zu\3\2\2\2zx\3\2\2\2zy\3\2\2\2{"+
		"\30\3\2\2\2|~\7\60\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\32\3\2\2\2\u0082\u0084\t\7\2\2\u0083"+
		"\u0085\7/\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\34\3\2\2\2\u008b\u008c\t\b\2"+
		"\2\u008c\36\3\2\2\2\u008d\u008e\7\62\2\2\u008e\u0090\t\t\2\2\u008f\u0091"+
		"\5\35\17\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093 \3\2\2\2\u0094\u0095\7\62\2\2\u0095\u0097\t"+
		"\n\2\2\u0096\u0098\t\13\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\"\3\2\2\2\u009b\u009d\7/\2\2"+
		"\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0"+
		"\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\t\f\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5$\3\2\2\2\u00a6\u00a8\7/\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\t\r\2\2\u00af&\3\2\2\2\31\2\60\66"+
		"<>GNZ_cnsz\u0080\u0084\u0089\u0092\u0099\u009c\u00a1\u00a4\u00a7\u00ac"+
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

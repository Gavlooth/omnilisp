// Generated from resources/grammars/Omnilisp.g4 by ANTLR 4.8
package Omnilisp.parsers;
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
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, FLOAT=5, STRING=6, SYMBOL=7, TRASH=8, 
		HEX=9, BIN=10, LONG=11, BIGN=12, DEFINE=13, SPECIAL_FORM=14;
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
			"DEFINE", "SPECIAL_FORM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'NIL'", null, null, null, null, null, null, null, 
			null, null, "'define'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BOOLEAN", "FLOAT", "STRING", "SYMBOL", "TRASH", 
			"HEX", "BIN", "LONG", "BIGN", "DEFINE", "SPECIAL_FORM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5E\n\5\3\6\5\6H\n\6\3\6\6\6K\n\6\r\6\16\6L\3\6\3\6\5\6Q\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\5\6a\n\6\3\7\3"+
		"\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\5\bp\n\b\3\t\3\t\5"+
		"\tt\n\t\3\t\3\t\3\n\3\n\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\13"+
		"\3\13\6\13\u0083\n\13\r\13\16\13\u0084\7\13\u0087\n\13\f\13\16\13\u008a"+
		"\13\13\3\f\3\f\3\r\3\r\5\r\u0090\n\r\3\16\3\16\7\16\u0094\n\16\f\16\16"+
		"\16\u0097\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u009e\n\17\3\20\3\20\6\20"+
		"\u00a2\n\20\r\20\16\20\u00a3\3\21\3\21\5\21\u00a8\n\21\3\21\6\21\u00ab"+
		"\n\21\r\21\16\21\u00ac\3\22\3\22\3\23\3\23\3\23\6\23\u00b4\n\23\r\23\16"+
		"\23\u00b5\3\24\3\24\3\24\6\24\u00bb\n\24\r\24\16\24\u00bc\3\25\5\25\u00c0"+
		"\n\25\3\25\6\25\u00c3\n\25\r\25\16\25\u00c4\3\25\5\25\u00c8\n\25\3\26"+
		"\5\26\u00cb\n\26\3\26\6\26\u00ce\n\26\r\26\16\26\u00cf\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u00e3\n\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+\16-\2/\17\61\20\3\2\17\3\2\62"+
		";\3\2$$\6\2\13\f\17\17\"\"..\20\2\13\f\17\17\"\"$%\'\')+..\61<BB]]_`b"+
		"b}}\177\u0080\4\2\60\60\62;\4\2\f\f\17\17\4\2GGgg\5\2\62;CHch\4\2ZZzz"+
		"\4\2DDdd\3\2\62\63\4\2NNnn\4\2PPpp\2\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\tD\3\2\2\2\13`\3\2\2\2\rb\3"+
		"\2\2\2\17o\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27\u008b\3\2\2"+
		"\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u009d\3\2\2\2\37\u009f\3\2\2\2"+
		"!\u00a5\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b7\3\2\2\2)\u00bf\3"+
		"\2\2\2+\u00ca\3\2\2\2-\u00d3\3\2\2\2/\u00d9\3\2\2\2\61\u00e2\3\2\2\2\63"+
		"\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2\2\66\6\3\2\2\2\678\7P\2\289\7K\2\2"+
		"9:\7N\2\2:\b\3\2\2\2;<\7V\2\2<=\7T\2\2=>\7W\2\2>E\7G\2\2?@\7H\2\2@A\7"+
		"C\2\2AB\7N\2\2BC\7U\2\2CE\7G\2\2D;\3\2\2\2D?\3\2\2\2E\n\3\2\2\2FH\7/\2"+
		"\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MN\3\2\2\2Na\5\35\17\2OQ\7/\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2"+
		"\2\2RS\7K\2\2ST\7P\2\2TU\7H\2\2UV\7K\2\2VW\7P\2\2WX\7K\2\2XY\7V\2\2Ya"+
		"\7[\2\2Z\\\7/\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7P\2\2^_\7C\2\2_a"+
		"\7P\2\2`G\3\2\2\2`P\3\2\2\2`[\3\2\2\2a\f\3\2\2\2bh\7$\2\2cg\n\3\2\2de"+
		"\7^\2\2eg\7$\2\2fc\3\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3"+
		"\2\2\2jh\3\2\2\2kl\7$\2\2l\16\3\2\2\2mp\4\60\61\2np\5\25\13\2om\3\2\2"+
		"\2on\3\2\2\2p\20\3\2\2\2qt\5\23\n\2rt\5\33\16\2sq\3\2\2\2sr\3\2\2\2tu"+
		"\3\2\2\2uv\b\t\2\2v\22\3\2\2\2wx\t\4\2\2x\24\3\2\2\2y}\5\27\f\2z|\5\31"+
		"\r\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0088\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0082\7<\2\2\u0081\u0083\5\31\r\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0080\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\26\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\n\5\2"+
		"\2\u008c\30\3\2\2\2\u008d\u0090\5\27\f\2\u008e\u0090\t\6\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\32\3\2\2\2\u0091\u0095\7=\2\2\u0092"+
		"\u0094\n\7\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\34\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\5\37\20\2\u0099\u009a\5!\21\2\u009a\u009e\3\2\2\2\u009b\u009e\5\37\20"+
		"\2\u009c\u009e\5!\21\2\u009d\u0098\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\36\3\2\2\2\u009f\u00a1\7\60\2\2\u00a0\u00a2\t\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4 \3\2\2\2\u00a5\u00a7\t\b\2\2\u00a6\u00a8\7/\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\"\3\2\2\2\u00ae\u00af\t\t\2\2\u00af$\3\2\2\2\u00b0\u00b1\7"+
		"\62\2\2\u00b1\u00b3\t\n\2\2\u00b2\u00b4\5#\22\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6&\3\2\2\2"+
		"\u00b7\u00b8\7\62\2\2\u00b8\u00ba\t\13\2\2\u00b9\u00bb\t\f\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00c0\7/\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c8\t\r\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8*\3\2\2\2"+
		"\u00c9\u00cb\7/\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\t\16"+
		"\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7j\2\2\u00d8.\3\2\2\2\u00d9\u00da"+
		"\7f\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7g\2\2\u00df\60\3\2\2\2\u00e0\u00e3\5-\27\2"+
		"\u00e1\u00e3\5/\30\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\62"+
		"\3\2\2\2\36\2DGLP[`fhos}\u0084\u0088\u008f\u0095\u009d\u00a3\u00a7\u00ac"+
		"\u00b5\u00bc\u00bf\u00c4\u00c7\u00ca\u00cf\u00e2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Decaf.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, CLASS=6, PROGRAM=7, BRACKET_OPEN=8, 
		BRACKET_CLOSE=9, TYPE=10, VOID=11, SQUARE_BRACKET_OPEN=12, SQUARE_BRACKET_CLOSE=13, 
		COMMA=14, PARENTHESIS_OPEN=15, PARENTHESIS_CLOSE=16, ASSIGN_OP=17, IF=18, 
		ELSE=19, FOR=20, RETURN=21, BREAK=22, CONTINUE=23, CALLOUT=24, ARITH_OP=25, 
		RELOP=26, EQ_OP=27, COND_OP=28, ALPHA=29, DIGIT=30, BOOL_LITERAL=31, CHAR=32, 
		WHITESPACE=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "CLASS", "PROGRAM", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "TYPE", "VOID", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", 
		"COMMA", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "ASSIGN_OP", "IF", "ELSE", 
		"FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "ARITH_OP", "RELOP", 
		"EQ_OP", "COND_OP", "ALPHA", "DIGIT", "BOOL_LITERAL", "CHAR", "WHITESPACE"
	};


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0082\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00b5\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u00bb\n\34\3\35\3\35\3\35\3\35\5\35\u00c1\n\35\3"+
		"\36\5\36\u00c4\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d1\n \3"+
		"!\5!\u00d4\n!\3\"\6\"\u00d7\n\"\r\"\16\"\u00d8\3\"\3\"\2\2#\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#\3\2\7\6\2\'\',-//\61\61\4\2>>@@\5\2C\\aac|\4\2\13\f\"\u0080\5\2\13\f"+
		"\16\17\"\"\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E"+
		"\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17U\3"+
		"\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31r\3\2\2\2\33"+
		"t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2"+
		"\2\2\'\u0086\3\2\2\2)\u008b\3\2\2\2+\u008f\3\2\2\2-\u0096\3\2\2\2/\u009c"+
		"\3\2\2\2\61\u00a5\3\2\2\2\63\u00ad\3\2\2\2\65\u00b4\3\2\2\2\67\u00ba\3"+
		"\2\2\29\u00c0\3\2\2\2;\u00c3\3\2\2\2=\u00c5\3\2\2\2?\u00d0\3\2\2\2A\u00d3"+
		"\3\2\2\2C\u00d6\3\2\2\2EF\7c\2\2F\4\3\2\2\2GH\7/\2\2H\6\3\2\2\2IJ\7?\2"+
		"\2J\b\3\2\2\2KL\7h\2\2L\n\3\2\2\2MN\7#\2\2N\f\3\2\2\2OP\7e\2\2PQ\7n\2"+
		"\2QR\7c\2\2RS\7u\2\2ST\7u\2\2T\16\3\2\2\2UV\7R\2\2VW\7t\2\2WX\7q\2\2X"+
		"Y\7i\2\2YZ\7t\2\2Z[\7c\2\2[\\\7o\2\2\\\20\3\2\2\2]^\7}\2\2^\22\3\2\2\2"+
		"_`\7\177\2\2`\24\3\2\2\2ab\7k\2\2bc\7p\2\2cl\7v\2\2de\7d\2\2ef\7q\2\2"+
		"fg\7q\2\2gh\7n\2\2hi\7g\2\2ij\7c\2\2jl\7p\2\2ka\3\2\2\2kd\3\2\2\2l\26"+
		"\3\2\2\2mn\7x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2q\30\3\2\2\2rs\7]\2\2s\32"+
		"\3\2\2\2tu\7_\2\2u\34\3\2\2\2vw\7.\2\2w\36\3\2\2\2xy\7*\2\2y \3\2\2\2"+
		"z{\7+\2\2{\"\3\2\2\2|\u0082\7?\2\2}~\7-\2\2~\u0082\7?\2\2\177\u0080\7"+
		"/\2\2\u0080\u0082\7?\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082$\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085&\3\2\2\2"+
		"\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
		"\7g\2\2\u008a(\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7t\2\2\u008e*\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095\7p\2\2\u0095"+
		",\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7m\2\2\u009b.\3\2\2\2\u009c\u009d\7e\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7k\2\2"+
		"\u00a1\u00a2\7p\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7g\2\2\u00a4\60\3\2"+
		"\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\62\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\64\3\2\2\2\u00af\u00b5\t\3\2\2\u00b0"+
		"\u00b1\7>\2\2\u00b1\u00b5\7?\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b5\7?\2\2"+
		"\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\66"+
		"\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\u00bb\7?\2\2\u00b8\u00b9\7#\2\2\u00b9"+
		"\u00bb\7?\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb8\3\2\2\2\u00bc"+
		"\u00bd\7(\2\2\u00bd\u00c1\7(\2\2\u00be\u00bf\7~\2\2\u00bf\u00c1\7~\2\2"+
		"\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1:\3\2\2\2\u00c2\u00c4\t"+
		"\4\2\2\u00c3\u00c2\3\2\2\2\u00c4<\3\2\2\2\u00c5\u00c6\4\62;\2\u00c6>\3"+
		"\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00d1\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7u\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cb"+
		"\3\2\2\2\u00d1@\3\2\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"B\3\2\2\2\u00d5\u00d7\t\6\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\b\"\2\2\u00dbD\3\2\2\2\f\2k\u0081\u00b4\u00ba\u00c0\u00c3\u00d0\u00d3"+
		"\u00d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
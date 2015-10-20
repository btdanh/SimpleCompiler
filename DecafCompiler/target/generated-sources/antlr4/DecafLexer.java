// Generated from DecafLexer.g4 by ANTLR 4.4

	import java.util.Map;
	import java.util.HashMap;

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
		CLASS=1, PROGRAM=2, IF=3, ELSE=4, FOR=5, RETURN=6, BREAK=7, CONTINUE=8, 
		CALLOUT=9, BOOLEAN=10, TRUE=11, FALSE=12, INT=13, VOID=14, HEX_PRFEFIX=15, 
		INT_LITERAL=16, BOOL_LITERAL=17, IDENTIIER=18, ASSIGN_OP=19, ARITH_OP=20, 
		RELOP=21, EQ_OP=22, COND_OP=23, NEGATIVE=24, ASSIGNMENT=25, MINUS=26, 
		BRACKET_OPEN=27, BRACKET_CLOSE=28, SQUARE_BRACKET_OPEN=29, SQUARE_BRACKET_CLOSE=30, 
		COMMA=31, SEMICOLON=32, PARENTHESIS_OPEN=33, PARENTHESIS_CLOSE=34, WHITESPACE=35, 
		BLOCK_COMMENT=36, EOL_COMMENT=37, CHAR_LITERAL=38, STRING_LITERAL=39, 
		LSINGLE_QUOTE=40, LDOUBLE_QUOTE=41;
	public static final int CHAR_MODE = 1;
	public static final int CHAR_RETURN_MODE = 2;
	public static final int STRING_MODE = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CHAR_MODE", "CHAR_RETURN_MODE", "STRING_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"DECIMAL_LITERAL", "HEX_LITERAL", "HEX_PRFEFIX", "INT_LITERAL", "BOOL_LITERAL", 
		"ALPHA", "DIGIT", "ALPHA_NUM", "HEX_DIGIT", "ID", "IDENTIIER", "ASSIGN_OP", 
		"ARITH_OP", "RELOP", "EQ_OP", "COND_OP", "NEGATIVE", "ASSIGNMENT", "MINUS", 
		"BRACKET_OPEN", "BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", 
		"COMMA", "SEMICOLON", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "WHITESPACE", 
		"BLOCK_COMMENT", "EOL_COMMENT", "CHAR", "SPECIAL_CHAR", "LSINGLE_QUOTE", 
		"LDOUBLE_QUOTE", "CHAR_TEXT", "CHAR_LITERAL", "STRING_LITERAL", "STRING_TEXT"
	};


		
		
		Map<String, Integer> keywords = new HashMap<String, Integer>(){{
			put("class", DecafParser.CLASS);
			put("Program", DecafParser.PROGRAM);
			put("if", DecafParser.IF);
			put("else", DecafParser.ELSE);
			put("for", DecafParser.FOR);
			put("return", DecafParser.RETURN);
			put("break", DecafParser.BREAK);
			put("continue", DecafParser.CONTINUE);
			put("callout", DecafParser.CALLOUT);
			put("boolean", DecafParser.BOOLEAN);
			put("true", DecafParser.TRUE);
			put("false", DecafParser.FALSE);
			put("int", DecafParser.INT);
			put("void", DecafParser.VOID);		
		}};


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10: IDENTIIER_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void IDENTIIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 	
			if(keywords.containsKey(getText())){
				setType(keywords.get(getText()));
			}	
		 break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0107\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2T\n\2"+
		"\r\2\16\2U\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\4\3\4\3\4\3\5\3\5\5\5c\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t"+
		"v\n\t\3\n\3\n\5\nz\n\n\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0094\n\17\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\6\35\u00b9\n\35\r\35\16\35\u00ba\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00c3"+
		"\n\36\f\36\16\36\u00c6\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\7\37\u00d1\n\37\f\37\16\37\u00d4\13\37\3\37\3\37\3\37\3\37\3 \5 \u00db"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e7\n!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\5$\u00f5\n$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'"+
		"\5\'\u0104\n\'\3\'\3\'\4\u00c4\u00d2\2(\6\2\b\2\n\21\f\22\16\23\20\2\22"+
		"\2\24\2\26\2\30\2\32\24\34\25\36\26 \27\"\30$\31&\32(\33*\34,\35.\36\60"+
		"\37\62 \64!\66\"8#:$<%>&@\'B\2D\2F*H+J\2L(N)P\2\6\2\3\4\5\t\5\2C\\aac"+
		"|\3\2\62;\4\2CHch\6\2\'\',-//\61\61\4\2>>@@\5\2\13\f\16\17\"\"\6\2\"#"+
		"%(*]_\u0080\u0110\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\32\3\2\2\2\2"+
		"\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2"+
		"\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2"+
		"\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2"+
		"\2@\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\3J\3\2\2\2\4L\3\2\2\2\5N\3\2\2\2\5P"+
		"\3\2\2\2\6S\3\2\2\2\bW\3\2\2\2\n]\3\2\2\2\fb\3\2\2\2\16m\3\2\2\2\20o\3"+
		"\2\2\2\22q\3\2\2\2\24u\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32\u0082\3\2\2"+
		"\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u0093\3\2\2\2\"\u0099\3\2\2\2$\u009f"+
		"\3\2\2\2&\u00a1\3\2\2\2(\u00a3\3\2\2\2*\u00a5\3\2\2\2,\u00a7\3\2\2\2."+
		"\u00a9\3\2\2\2\60\u00ab\3\2\2\2\62\u00ad\3\2\2\2\64\u00af\3\2\2\2\66\u00b1"+
		"\3\2\2\28\u00b3\3\2\2\2:\u00b5\3\2\2\2<\u00b8\3\2\2\2>\u00be\3\2\2\2@"+
		"\u00cc\3\2\2\2B\u00da\3\2\2\2D\u00e6\3\2\2\2F\u00e8\3\2\2\2H\u00ed\3\2"+
		"\2\2J\u00f4\3\2\2\2L\u00f9\3\2\2\2N\u00fd\3\2\2\2P\u0103\3\2\2\2RT\5\22"+
		"\b\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WY\5\n\4\2XZ\5"+
		"\26\n\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]^\7\62\2"+
		"\2^_\7z\2\2_\13\3\2\2\2`c\5\6\2\2ac\5\b\3\2b`\3\2\2\2ba\3\2\2\2c\r\3\2"+
		"\2\2de\7v\2\2ef\7t\2\2fg\7w\2\2gn\7g\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl"+
		"\7u\2\2ln\7g\2\2md\3\2\2\2mh\3\2\2\2n\17\3\2\2\2op\t\2\2\2p\21\3\2\2\2"+
		"qr\t\3\2\2r\23\3\2\2\2sv\5\20\7\2tv\5\22\b\2us\3\2\2\2ut\3\2\2\2v\25\3"+
		"\2\2\2wz\5\22\b\2xz\t\4\2\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{\177\5\20"+
		"\7\2|~\5\24\t\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\31\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\30\13\2\u0083\u0084"+
		"\b\f\2\2\u0084\33\3\2\2\2\u0085\u008b\7?\2\2\u0086\u0087\7-\2\2\u0087"+
		"\u008b\7?\2\2\u0088\u0089\7/\2\2\u0089\u008b\7?\2\2\u008a\u0085\3\2\2"+
		"\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d"+
		"\t\5\2\2\u008d\37\3\2\2\2\u008e\u0094\t\6\2\2\u008f\u0090\7>\2\2\u0090"+
		"\u0094\7?\2\2\u0091\u0092\7@\2\2\u0092\u0094\7?\2\2\u0093\u008e\3\2\2"+
		"\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094!\3\2\2\2\u0095\u0096"+
		"\7?\2\2\u0096\u009a\7?\2\2\u0097\u0098\7#\2\2\u0098\u009a\7?\2\2\u0099"+
		"\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a#\3\2\2\2\u009b\u009c\7(\2\2\u009c"+
		"\u00a0\7(\2\2\u009d\u009e\7~\2\2\u009e\u00a0\7~\2\2\u009f\u009b\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\'\3\2\2"+
		"\2\u00a3\u00a4\7?\2\2\u00a4)\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6+\3\2\2\2"+
		"\u00a7\u00a8\7}\2\2\u00a8-\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa/\3\2\2"+
		"\2\u00ab\u00ac\7]\2\2\u00ac\61\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae\63\3\2"+
		"\2\2\u00af\u00b0\7.\2\2\u00b0\65\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\67\3"+
		"\2\2\2\u00b3\u00b4\7*\2\2\u00b49\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6;\3\2"+
		"\2\2\u00b7\u00b9\t\7\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\35"+
		"\3\2\u00bd=\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c4"+
		"\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\b\36\3\2\u00cb?\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7\61\2"+
		"\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\b\37\3\2\u00d8A\3\2\2\2\u00d9\u00db\t\b\2\2\u00da\u00d9\3\2\2\2"+
		"\u00dbC\3\2\2\2\u00dc\u00dd\7^\2\2\u00dd\u00e7\7$\2\2\u00de\u00df\7^\2"+
		"\2\u00df\u00e7\7^\2\2\u00e0\u00e1\7^\2\2\u00e1\u00e7\7)\2\2\u00e2\u00e3"+
		"\7^\2\2\u00e3\u00e7\7p\2\2\u00e4\u00e5\7^\2\2\u00e5\u00e7\7v\2\2\u00e6"+
		"\u00dc\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7E\3\2\2\2\u00e8\u00e9\7)\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\b\"\4\2\u00eb\u00ec\b\"\5\2\u00ecG\3\2\2\2\u00ed"+
		"\u00ee\7$\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b#\4\2\u00f0\u00f1\b#\6"+
		"\2\u00f1I\3\2\2\2\u00f2\u00f5\5B \2\u00f3\u00f5\5D!\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b$\4\2\u00f7"+
		"\u00f8\b$\7\2\u00f8K\3\2\2\2\u00f9\u00fa\7)\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b%\b\2\u00fcM\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b&\b\2\u0100O\3\2\2\2\u0101\u0104\5B \2\u0102\u0104\5D!\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\'"+
		"\4\2\u0106Q\3\2\2\2\30\2\3\4\5U[bmuy\177\u008a\u0093\u0099\u009f\u00ba"+
		"\u00c4\u00d2\u00da\u00e6\u00f4\u0103\t\3\f\2\b\2\2\5\2\2\4\3\2\4\5\2\4"+
		"\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
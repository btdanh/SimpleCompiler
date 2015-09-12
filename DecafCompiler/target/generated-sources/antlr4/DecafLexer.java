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


		
		public static final int SHOULD_SHOW = 100;
		
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
		case 3: INT_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		case 4: BOOL_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		case 10: IDENTIIER_action((RuleContext)_localctx, actionIndex); break;
		case 35: CHAR_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		case 36: STRING_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void INT_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = SHOULD_SHOW; break;
		}
	}
	private void STRING_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: _channel = SHOULD_SHOW; break;
		}
	}
	private void BOOL_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = SHOULD_SHOW; break;
		}
	}
	private void CHAR_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: _channel = SHOULD_SHOW; break;
		}
	}
	private void IDENTIIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  
			if(keywords.containsKey(getText())){
				setType(keywords.get(getText()));
			}
			else{
				_channel = SHOULD_SHOW;
			}
		 break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u010e\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2T\n\2"+
		"\r\2\16\2U\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\4\3\4\3\4\3\5\3\5\5\5c\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\7\5\7u\n\7"+
		"\3\b\3\b\3\t\3\t\5\t{\n\t\3\n\3\n\5\n\177\n\n\3\13\3\13\7\13\u0083\n\13"+
		"\f\13\16\13\u0086\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0099\n\17\3\20\3\20\3\20\3\20"+
		"\5\20\u009f\n\20\3\21\3\21\3\21\3\21\5\21\u00a5\n\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\6\35\u00be\n\35\r\35\16\35\u00bf\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\7\36\u00c8\n\36\f\36\16\36\u00cb\13\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00d6\n\37\f\37\16\37\u00d9\13"+
		"\37\3\37\3\37\3\37\3\37\3 \5 \u00e0\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u00ec\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\5$\u00fa\n$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u010b\n\'\3\'\3\'\4\u00c9"+
		"\u00d7\2(\6\2\b\2\n\21\f\22\16\23\20\2\22\2\24\2\26\2\30\2\32\24\34\25"+
		"\36\26 \27\"\30$\31&\32(\33*\34,\35.\36\60\37\62 \64!\66\"8#:$<%>&@\'"+
		"B\2D\2F*H+J\2L(N)P\2\6\2\3\4\5\b\5\2C\\aac|\4\2CHch\6\2\'\',-//\61\61"+
		"\4\2>>@@\5\2\13\f\16\17\"\"\6\2\"#%(*]_\u0080\u0117\2\n\3\2\2\2\2\f\3"+
		"\2\2\2\2\16\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2"+
		"\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2"+
		".\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2"+
		"\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\3"+
		"J\3\2\2\2\4L\3\2\2\2\5N\3\2\2\2\5P\3\2\2\2\6S\3\2\2\2\bW\3\2\2\2\n]\3"+
		"\2\2\2\fb\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24z\3\2\2\2\26~"+
		"\3\2\2\2\30\u0080\3\2\2\2\32\u0087\3\2\2\2\34\u008f\3\2\2\2\36\u0091\3"+
		"\2\2\2 \u0098\3\2\2\2\"\u009e\3\2\2\2$\u00a4\3\2\2\2&\u00a6\3\2\2\2(\u00a8"+
		"\3\2\2\2*\u00aa\3\2\2\2,\u00ac\3\2\2\2.\u00ae\3\2\2\2\60\u00b0\3\2\2\2"+
		"\62\u00b2\3\2\2\2\64\u00b4\3\2\2\2\66\u00b6\3\2\2\28\u00b8\3\2\2\2:\u00ba"+
		"\3\2\2\2<\u00bd\3\2\2\2>\u00c3\3\2\2\2@\u00d1\3\2\2\2B\u00df\3\2\2\2D"+
		"\u00eb\3\2\2\2F\u00ed\3\2\2\2H\u00f2\3\2\2\2J\u00f9\3\2\2\2L\u00fe\3\2"+
		"\2\2N\u0103\3\2\2\2P\u010a\3\2\2\2RT\5\22\b\2SR\3\2\2\2TU\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\7\3\2\2\2WY\5\n\4\2XZ\5\26\n\2YX\3\2\2\2Z[\3\2\2\2["+
		"Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]^\7\62\2\2^_\7z\2\2_\13\3\2\2\2`c\5\6"+
		"\2\2ac\5\b\3\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2de\b\5\2\2e\r\3\2\2\2fg\7"+
		"v\2\2gh\7t\2\2hi\7w\2\2ip\7g\2\2jk\7h\2\2kl\7c\2\2lm\7n\2\2mn\7u\2\2n"+
		"p\7g\2\2of\3\2\2\2oj\3\2\2\2pq\3\2\2\2qr\b\6\3\2r\17\3\2\2\2su\t\2\2\2"+
		"ts\3\2\2\2u\21\3\2\2\2vw\4\62;\2w\23\3\2\2\2x{\5\20\7\2y{\5\22\b\2zx\3"+
		"\2\2\2zy\3\2\2\2{\25\3\2\2\2|\177\5\22\b\2}\177\t\3\2\2~|\3\2\2\2~}\3"+
		"\2\2\2\177\27\3\2\2\2\u0080\u0084\5\20\7\2\u0081\u0083\5\24\t\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\31\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\30\13\2\u0088"+
		"\u0089\b\f\4\2\u0089\33\3\2\2\2\u008a\u0090\7?\2\2\u008b\u008c\7-\2\2"+
		"\u008c\u0090\7?\2\2\u008d\u008e\7/\2\2\u008e\u0090\7?\2\2\u008f\u008a"+
		"\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\35\3\2\2\2\u0091"+
		"\u0092\t\4\2\2\u0092\37\3\2\2\2\u0093\u0099\t\5\2\2\u0094\u0095\7>\2\2"+
		"\u0095\u0099\7?\2\2\u0096\u0097\7@\2\2\u0097\u0099\7?\2\2\u0098\u0093"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099!\3\2\2\2\u009a"+
		"\u009b\7?\2\2\u009b\u009f\7?\2\2\u009c\u009d\7#\2\2\u009d\u009f\7?\2\2"+
		"\u009e\u009a\3\2\2\2\u009e\u009c\3\2\2\2\u009f#\3\2\2\2\u00a0\u00a1\7"+
		"(\2\2\u00a1\u00a5\7(\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a5\7~\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5%\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\'"+
		"\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9)\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab+\3"+
		"\2\2\2\u00ac\u00ad\7}\2\2\u00ad-\3\2\2\2\u00ae\u00af\7\177\2\2\u00af/"+
		"\3\2\2\2\u00b0\u00b1\7]\2\2\u00b1\61\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3"+
		"\63\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5\65\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7"+
		"\67\3\2\2\2\u00b8\u00b9\7*\2\2\u00b99\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb"+
		";\3\2\2\2\u00bc\u00be\t\6\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\b\35\5\2\u00c2=\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7,\2\2\u00c5"+
		"\u00c9\3\2\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\b\36\5\2\u00d0?\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3"+
		"\7\61\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\b\37\5\2\u00ddA\3\2\2\2\u00de\u00e0\t\7\2\2\u00df\u00de\3\2\2\2"+
		"\u00e0C\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2\u00ec\7$\2\2\u00e3\u00e4\7^\2"+
		"\2\u00e4\u00ec\7^\2\2\u00e5\u00e6\7^\2\2\u00e6\u00ec\7)\2\2\u00e7\u00e8"+
		"\7^\2\2\u00e8\u00ec\7p\2\2\u00e9\u00ea\7^\2\2\u00ea\u00ec\7v\2\2\u00eb"+
		"\u00e1\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ecE\3\2\2\2\u00ed\u00ee\7)\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\b\"\6\2\u00f0\u00f1\b\"\7\2\u00f1G\3\2\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b#\6\2\u00f5\u00f6\b#\b"+
		"\2\u00f6I\3\2\2\2\u00f7\u00fa\5B \2\u00f8\u00fa\5D!\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b$\6\2\u00fc"+
		"\u00fd\b$\t\2\u00fdK\3\2\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b%\n\2\u0101\u0102\b%\13\2\u0102M\3\2\2\2\u0103\u0104\7$\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\b&\n\2\u0106\u0107\b&\f\2\u0107O\3\2\2\2\u0108"+
		"\u010b\5B \2\u0109\u010b\5D!\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010d\b\'\6\2\u010dQ\3\2\2\2\31\2\3\4\5U[b"+
		"otz~\u0084\u008f\u0098\u009e\u00a4\u00bf\u00c9\u00d7\u00df\u00eb\u00f9"+
		"\u010a\r\3\5\3\3\6\4\3\f\2\b\2\2\5\2\2\4\3\2\4\5\2\4\4\2\4\2\2\3%\5\3"+
		"&\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
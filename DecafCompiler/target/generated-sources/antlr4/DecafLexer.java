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
	public static final int STRING_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CHAR_MODE", "STRING_MODE"
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
		"BLOCK_COMMENT", "EOL_COMMENT", "CHAR", "LSINGLE_QUOTE", "LDOUBLE_QUOTE", 
		"CHAR_LITERAL", "CHAR_TEXT", "STRING_LITERAL", "STRING_TEXT"
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
		case 33: CHAR_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		case 35: STRING_LITERAL_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u00fa\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2Q\n\2\r\2\16\2R\3"+
		"\3\3\3\6\3W\n\3\r\3\16\3X\3\4\3\4\3\4\3\5\3\5\5\5`\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\7\5\7r\n\7\3\b\3\b\3\t"+
		"\3\t\5\tx\n\t\3\n\3\n\5\n|\n\n\3\13\3\13\7\13\u0080\n\13\f\13\16\13\u0083"+
		"\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20\3\20\5\20\u009c\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00a2\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\6\35\u00bb\n\35\r\35\16\35\u00bc\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\7\36\u00c5\n\36\f\36\16\36\u00c8\13\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\7\37\u00d3\n\37\f\37\16\37\u00d6\13\37\3\37\3\37\3"+
		"\37\3\37\3 \5 \u00dd\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\4\u00c6\u00d4\2\'\5\2\7\2"+
		"\t\21\13\22\r\23\17\2\21\2\23\2\25\2\27\2\31\24\33\25\35\26\37\27!\30"+
		"#\31%\32\'\33)\34+\35-\36/\37\61 \63!\65\"\67#9$;%=&?\'A\2C*E+G(I\2K)"+
		"M\2\5\2\3\4\b\5\2C\\aac|\4\2CHch\6\2\'\',-//\61\61\4\2>>@@\5\2\13\f\16"+
		"\17\"\"\4\2\13\f\"\u0080\u00ff\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2"+
		"\4K\3\2\2\2\4M\3\2\2\2\5P\3\2\2\2\7T\3\2\2\2\tZ\3\2\2\2\13_\3\2\2\2\r"+
		"l\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2"+
		"\31\u0084\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0095\3\2\2\2!"+
		"\u009b\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63"+
		"\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b7\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00c0\3\2\2\2?\u00ce\3\2\2\2A\u00dc\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00e3\3\2\2\2G\u00e8\3\2\2\2I\u00ed\3\2\2\2K\u00f1\3\2\2\2M\u00f6\3\2"+
		"\2\2OQ\5\21\b\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\6\3\2\2\2TV\5"+
		"\t\4\2UW\5\25\n\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\b\3\2\2\2Z"+
		"[\7\62\2\2[\\\7z\2\2\\\n\3\2\2\2]`\5\5\2\2^`\5\7\3\2_]\3\2\2\2_^\3\2\2"+
		"\2`a\3\2\2\2ab\b\5\2\2b\f\3\2\2\2cd\7v\2\2de\7t\2\2ef\7w\2\2fm\7g\2\2"+
		"gh\7h\2\2hi\7c\2\2ij\7n\2\2jk\7u\2\2km\7g\2\2lc\3\2\2\2lg\3\2\2\2mn\3"+
		"\2\2\2no\b\6\3\2o\16\3\2\2\2pr\t\2\2\2qp\3\2\2\2r\20\3\2\2\2st\4\62;\2"+
		"t\22\3\2\2\2ux\5\17\7\2vx\5\21\b\2wu\3\2\2\2wv\3\2\2\2x\24\3\2\2\2y|\5"+
		"\21\b\2z|\t\3\2\2{y\3\2\2\2{z\3\2\2\2|\26\3\2\2\2}\u0081\5\17\7\2~\u0080"+
		"\5\23\t\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\30\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\27\13\2\u0085"+
		"\u0086\b\f\4\2\u0086\32\3\2\2\2\u0087\u008d\7?\2\2\u0088\u0089\7-\2\2"+
		"\u0089\u008d\7?\2\2\u008a\u008b\7/\2\2\u008b\u008d\7?\2\2\u008c\u0087"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\t\4\2\2\u008f\36\3\2\2\2\u0090\u0096\t\5\2\2\u0091\u0092\7>\2\2"+
		"\u0092\u0096\7?\2\2\u0093\u0094\7@\2\2\u0094\u0096\7?\2\2\u0095\u0090"+
		"\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096 \3\2\2\2\u0097"+
		"\u0098\7?\2\2\u0098\u009c\7?\2\2\u0099\u009a\7#\2\2\u009a\u009c\7?\2\2"+
		"\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\"\3\2\2\2\u009d\u009e\7"+
		"(\2\2\u009e\u00a2\7(\2\2\u009f\u00a0\7~\2\2\u00a0\u00a2\7~\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4&"+
		"\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8*\3"+
		"\2\2\2\u00a9\u00aa\7}\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7\177\2\2\u00ac."+
		"\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7_\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7=\2\2\u00b4"+
		"\66\3\2\2\2\u00b5\u00b6\7*\2\2\u00b68\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8"+
		":\3\2\2\2\u00b9\u00bb\t\6\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\b\35\5\2\u00bf<\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2\7,\2\2\u00c2"+
		"\u00c6\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\b\36\5\2\u00cd>\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d0"+
		"\7\61\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b\37\5\2\u00da@\3\2\2\2\u00db\u00dd\t\7\2\2\u00dc\u00db\3\2\2\2"+
		"\u00ddB\3\2\2\2\u00de\u00df\7)\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b!"+
		"\6\2\u00e1\u00e2\b!\7\2\u00e2D\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\b\"\6\2\u00e6\u00e7\b\"\b\2\u00e7F\3\2\2\2\u00e8"+
		"\u00e9\7)\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b#\t\2\u00eb\u00ec\b#\n"+
		"\2\u00ecH\3\2\2\2\u00ed\u00ee\5A \2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b"+
		"$\6\2\u00f0J\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\b%\t\2\u00f4\u00f5\b%\13\2\u00f5L\3\2\2\2\u00f6\u00f7\5A \2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\b&\6\2\u00f9N\3\2\2\2\25\2\3\4RX_lqw{\u0081\u008c"+
		"\u0095\u009b\u00a1\u00bc\u00c6\u00d4\u00dc\f\3\5\3\3\6\4\3\f\2\b\2\2\5"+
		"\2\2\4\3\2\4\4\2\4\2\2\3#\5\3%\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
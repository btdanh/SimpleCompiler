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
		CALLOUT=9, BOOLEAN=10, TRUE=11, FALSE=12, INT=13, VOID=14, HEX_LITERAL=15, 
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
		"DECIMAL_LITERAL", "HEX_LITERAL", "INT_LITERAL", "BOOL_LITERAL", "ALPHA", 
		"DIGIT", "ALPHA_NUM", "HEX_DIGIT", "ID", "IDENTIIER", "ASSIGN_OP", "ARITH_OP", 
		"RELOP", "EQ_OP", "COND_OP", "NEGATIVE", "ASSIGNMENT", "MINUS", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "COMMA", 
		"SEMICOLON", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "WHITESPACE", "BLOCK_COMMENT", 
		"EOL_COMMENT", "CHAR", "SPECIAL_CHAR", "LSINGLE_QUOTE", "LDOUBLE_QUOTE", 
		"CHAR_TEXT", "CHAR_LITERAL", "STRING_LITERAL", "STRING_TEXT"
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
		case 9: IDENTIIER_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0104\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\3\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\7\3\7\3\b\3\b\5\bs\n\b\3\t\3"+
		"\t\5\tw\n\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0091\n\16"+
		"\3\17\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3\20\3\20\3\20\5\20\u009d\n"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00b6\n\34\r\34"+
		"\16\34\u00b7\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00c0\n\35\f\35\16\35"+
		"\u00c3\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00ce\n"+
		"\36\f\36\16\36\u00d1\13\36\3\36\3\36\3\36\3\36\3\37\5\37\u00d8\n\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00e4\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\5#\u00f2\n#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\5&\u0101"+
		"\n&\3&\3&\4\u00c1\u00cf\2\'\6\2\b\21\n\22\f\23\16\2\20\2\22\2\24\2\26"+
		"\2\30\24\32\25\34\26\36\27 \30\"\31$\32&\33(\34*\35,\36.\37\60 \62!\64"+
		"\"\66#8$:%<&>\'@\2B\2D*F+H\2J(L)N\2\6\2\3\4\5\t\5\2C\\aac|\3\2\62;\4\2"+
		"CHch\6\2\'\',-//\61\61\4\2>>@@\5\2\13\f\16\17\"\"\6\2\"#%(*]_\u0080\u010e"+
		"\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3"+
		"\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3"+
		"\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64"+
		"\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2D\3"+
		"\2\2\2\2F\3\2\2\2\3H\3\2\2\2\4J\3\2\2\2\5L\3\2\2\2\5N\3\2\2\2\6Q\3\2\2"+
		"\2\bU\3\2\2\2\n_\3\2\2\2\fj\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22r\3\2\2"+
		"\2\24v\3\2\2\2\26x\3\2\2\2\30\177\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3"+
		"\2\2\2\36\u0090\3\2\2\2 \u0096\3\2\2\2\"\u009c\3\2\2\2$\u009e\3\2\2\2"+
		"&\u00a0\3\2\2\2(\u00a2\3\2\2\2*\u00a4\3\2\2\2,\u00a6\3\2\2\2.\u00a8\3"+
		"\2\2\2\60\u00aa\3\2\2\2\62\u00ac\3\2\2\2\64\u00ae\3\2\2\2\66\u00b0\3\2"+
		"\2\28\u00b2\3\2\2\2:\u00b5\3\2\2\2<\u00bb\3\2\2\2>\u00c9\3\2\2\2@\u00d7"+
		"\3\2\2\2B\u00e3\3\2\2\2D\u00e5\3\2\2\2F\u00ea\3\2\2\2H\u00f1\3\2\2\2J"+
		"\u00f6\3\2\2\2L\u00fa\3\2\2\2N\u0100\3\2\2\2PR\5\20\7\2QP\3\2\2\2RS\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UV\7\62\2\2VW\7z\2\2WY\3\2\2\2XZ"+
		"\5\24\t\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]`\5\6\2"+
		"\2^`\5\b\3\2_]\3\2\2\2_^\3\2\2\2`\13\3\2\2\2ab\7v\2\2bc\7t\2\2cd\7w\2"+
		"\2dk\7g\2\2ef\7h\2\2fg\7c\2\2gh\7n\2\2hi\7u\2\2ik\7g\2\2ja\3\2\2\2je\3"+
		"\2\2\2k\r\3\2\2\2lm\t\2\2\2m\17\3\2\2\2no\t\3\2\2o\21\3\2\2\2ps\5\16\6"+
		"\2qs\5\20\7\2rp\3\2\2\2rq\3\2\2\2s\23\3\2\2\2tw\5\20\7\2uw\t\4\2\2vt\3"+
		"\2\2\2vu\3\2\2\2w\25\3\2\2\2x|\5\16\6\2y{\5\22\b\2zy\3\2\2\2{~\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|\3\2\2\2\177\u0080\5\26\n\2\u0080\u0081"+
		"\b\13\2\2\u0081\31\3\2\2\2\u0082\u0088\7?\2\2\u0083\u0084\7-\2\2\u0084"+
		"\u0088\7?\2\2\u0085\u0086\7/\2\2\u0086\u0088\7?\2\2\u0087\u0082\3\2\2"+
		"\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a"+
		"\t\5\2\2\u008a\35\3\2\2\2\u008b\u0091\t\6\2\2\u008c\u008d\7>\2\2\u008d"+
		"\u0091\7?\2\2\u008e\u008f\7@\2\2\u008f\u0091\7?\2\2\u0090\u008b\3\2\2"+
		"\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093"+
		"\7?\2\2\u0093\u0097\7?\2\2\u0094\u0095\7#\2\2\u0095\u0097\7?\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097!\3\2\2\2\u0098\u0099\7(\2\2\u0099"+
		"\u009d\7(\2\2\u009a\u009b\7~\2\2\u009b\u009d\7~\2\2\u009c\u0098\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009d#\3\2\2\2\u009e\u009f\7#\2\2\u009f%\3\2\2"+
		"\2\u00a0\u00a1\7?\2\2\u00a1\'\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3)\3\2\2"+
		"\2\u00a4\u00a5\7}\2\2\u00a5+\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7-\3\2"+
		"\2\2\u00a8\u00a9\7]\2\2\u00a9/\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab\61\3\2"+
		"\2\2\u00ac\u00ad\7.\2\2\u00ad\63\3\2\2\2\u00ae\u00af\7=\2\2\u00af\65\3"+
		"\2\2\2\u00b0\u00b1\7*\2\2\u00b1\67\3\2\2\2\u00b2\u00b3\7+\2\2\u00b39\3"+
		"\2\2\2\u00b4\u00b6\t\7\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\34"+
		"\3\2\u00ba;\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c1"+
		"\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b\35\3\2\u00c8=\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2"+
		"\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b\36\3\2\u00d5?\3\2\2\2\u00d6\u00d8\t\b\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8A\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00e4\7$\2\2\u00db\u00dc\7^\2"+
		"\2\u00dc\u00e4\7^\2\2\u00dd\u00de\7^\2\2\u00de\u00e4\7)\2\2\u00df\u00e0"+
		"\7^\2\2\u00e0\u00e4\7p\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e4\7v\2\2\u00e3"+
		"\u00d9\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00df\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4C\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\b!\4\2\u00e8\u00e9\b!\5\2\u00e9E\3\2\2\2\u00ea\u00eb"+
		"\7$\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\"\4\2\u00ed\u00ee\b\"\6\2\u00ee"+
		"G\3\2\2\2\u00ef\u00f2\5@\37\2\u00f0\u00f2\5B \2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b#\4\2\u00f4\u00f5\b#\7"+
		"\2\u00f5I\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b"+
		"$\b\2\u00f9K\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\b%\b\2\u00fdM\3\2\2\2\u00fe\u0101\5@\37\2\u00ff\u0101\5B \2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b&\4\2\u0103"+
		"O\3\2\2\2\30\2\3\4\5S[_jrv|\u0087\u0090\u0096\u009c\u00b7\u00c1\u00cf"+
		"\u00d7\u00e3\u00f1\u0100\t\3\13\2\b\2\2\5\2\2\4\3\2\4\5\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
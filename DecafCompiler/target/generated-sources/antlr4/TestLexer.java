// Generated from TestLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, HELLO=2, CHAR_LITERAL=3, STRING_LITERAL=4, LSINGLE_QUOTE=5, LDOUBLE_QUOTE=6;
	public static final int CHAR_MODE = 1;
	public static final int STRING_MODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CHAR_MODE", "STRING_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'"
	};
	public static final String[] ruleNames = {
		"ID", "HELLO", "CHAR", "LSINGLE_QUOTE", "LDOUBLE_QUOTE", "CHAR_LITERAL", 
		"CHAR_TEXT", "STRING_LITERAL", "STRING_TEXT"
	};


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bD\b\1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5"+
		"\4\'\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\5\3\7\4\t\2"+
		"\13\7\r\b\17\5\21\2\23\6\25\2\5\2\3\4\3\4\2\13\f\"\u0080A\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\4\23\3"+
		"\2\2\2\4\25\3\2\2\2\5\27\3\2\2\2\7\37\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\r"+
		"-\3\2\2\2\17\62\3\2\2\2\21\67\3\2\2\2\23;\3\2\2\2\25@\3\2\2\2\27\31\7"+
		"$\2\2\30\32\13\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\35\3\2\2\2\35\36\7$\2\2\36\6\3\2\2\2\37 \7j\2\2 !\7g\2\2!\""+
		"\7n\2\2\"#\7n\2\2#$\7q\2\2$\b\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'\n\3\2\2\2"+
		"()\7)\2\2)*\3\2\2\2*+\b\5\2\2+,\b\5\3\2,\f\3\2\2\2-.\7$\2\2./\3\2\2\2"+
		"/\60\b\6\2\2\60\61\b\6\4\2\61\16\3\2\2\2\62\63\7)\2\2\63\64\3\2\2\2\64"+
		"\65\b\7\5\2\65\66\b\7\6\2\66\20\3\2\2\2\678\5\t\4\289\3\2\2\29:\b\b\2"+
		"\2:\22\3\2\2\2;<\7$\2\2<=\3\2\2\2=>\b\t\5\2>?\b\t\6\2?\24\3\2\2\2@A\5"+
		"\t\4\2AB\3\2\2\2BC\b\n\2\2C\26\3\2\2\2\7\2\3\4\33&\7\5\2\2\4\3\2\4\4\2"+
		"\4\2\2\2f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
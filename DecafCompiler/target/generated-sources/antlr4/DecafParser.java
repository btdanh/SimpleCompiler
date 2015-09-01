// Generated from Decaf.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PROGRAM=2, BRACKET_OPEN=3, BRACKET_CLOSE=4, TYPE=5, VOID=6, SQUARE_BRACKET_OPEN=7, 
		SQUARE_BRACKET_CLOSE=8, COMMA=9, PARENTHESIS_OPEN=10, PARENTHESIS_CLOSE=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'class'", "'Program'", "'{'", "'}'", "TYPE", "'void'", "'['", 
		"']'", "','", "'('", "')'"
	};
	public static final int
		RULE_program = 0, RULE_field_decl_s = 1, RULE_field_decl = 2, RULE_field_decl_name = 3, 
		RULE_method_decl_s = 4, RULE_method_decl = 5, RULE_param_decl_s = 6, RULE_param_decl = 7, 
		RULE_block = 8, RULE_var_decl_s = 9, RULE_statement_s = 10, RULE_id = 11, 
		RULE_int_literal = 12;
	public static final String[] ruleNames = {
		"program", "field_decl_s", "field_decl", "field_decl_name", "method_decl_s", 
		"method_decl", "param_decl_s", "param_decl", "block", "var_decl_s", "statement_s", 
		"id", "int_literal"
	};

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Method_decl_sContext method_decl_s() {
			return getRuleContext(Method_decl_sContext.class,0);
		}
		public Field_decl_sContext field_decl_s() {
			return getRuleContext(Field_decl_sContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(DecafParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(DecafParser.BRACKET_OPEN, 0); }
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(CLASS);
			setState(27); match(PROGRAM);
			setState(28); match(BRACKET_OPEN);
			setState(29); field_decl_s();
			setState(30); method_decl_s();
			setState(31); match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_decl_sContext extends ParserRuleContext {
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_decl_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl_s(this);
		}
	}

	public final Field_decl_sContext field_decl_s() throws RecognitionException {
		Field_decl_sContext _localctx = new Field_decl_sContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl_s);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33); field_decl();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public Field_decl_nameContext field_decl_name(int i) {
			return getRuleContext(Field_decl_nameContext.class,i);
		}
		public List<Field_decl_nameContext> field_decl_name() {
			return getRuleContexts(Field_decl_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode TYPE() { return getToken(DecafParser.TYPE, 0); }
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(TYPE);
			setState(40); field_decl_name();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(41); match(COMMA);
				setState(42); field_decl_name();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_decl_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_CLOSE() { return getToken(DecafParser.SQUARE_BRACKET_CLOSE, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_OPEN() { return getToken(DecafParser.SQUARE_BRACKET_OPEN, 0); }
		public Field_decl_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl_name(this);
		}
	}

	public final Field_decl_nameContext field_decl_name() throws RecognitionException {
		Field_decl_nameContext _localctx = new Field_decl_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_decl_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			switch (_input.LA(1)) {
			case BRACKET_CLOSE:
			case TYPE:
			case VOID:
			case COMMA:
				{
				setState(48); id();
				}
				break;
			case SQUARE_BRACKET_OPEN:
				{
				setState(49); id();
				setState(50); match(SQUARE_BRACKET_OPEN);
				setState(51); int_literal();
				setState(52); match(SQUARE_BRACKET_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_decl_sContext extends ParserRuleContext {
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public Method_decl_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl_s(this);
		}
	}

	public final Method_decl_sContext method_decl_s() throws RecognitionException {
		Method_decl_sContext _localctx = new Method_decl_sContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==VOID) {
				{
				{
				setState(56); method_decl();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_sContext param_decl_s() {
			return getRuleContext(Param_decl_sContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(DecafParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(DecafParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(DecafParser.TYPE, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(63); id();
			setState(64); match(PARENTHESIS_OPEN);
			setState(65); param_decl_s();
			setState(66); match(PARENTHESIS_CLOSE);
			setState(67); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_sContext extends ParserRuleContext {
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_decl_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterParam_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitParam_decl_s(this);
		}
	}

	public final Param_decl_sContext param_decl_s() throws RecognitionException {
		Param_decl_sContext _localctx = new Param_decl_sContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(69); param_decl();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode TYPE(int i) {
			return getToken(DecafParser.TYPE, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(DecafParser.TYPE); }
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75); match(TYPE);
			setState(76); id();
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78); match(COMMA);
				setState(79); match(TYPE);
				setState(80); id();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Statement_sContext statement_s() {
			return getRuleContext(Statement_sContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(DecafParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(DecafParser.BRACKET_OPEN, 0); }
		public Var_decl_sContext var_decl_s() {
			return getRuleContext(Var_decl_sContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(BRACKET_OPEN);
			setState(87); var_decl_s();
			setState(88); statement_s();
			setState(89); match(BRACKET_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_sContext extends ParserRuleContext {
		public Var_decl_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_decl_s(this);
		}
	}

	public final Var_decl_sContext var_decl_s() throws RecognitionException {
		Var_decl_sContext _localctx = new Var_decl_sContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_sContext extends ParserRuleContext {
		public Statement_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement_s(this);
		}
	}

	public final Statement_sContext statement_s() throws RecognitionException {
		Statement_sContext _localctx = new Statement_sContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rf\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3%\n\3\f\3"+
		"\16\3(\13\3\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\59\n\5\3\6\7\6<\n\6\f\6\16\6?\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\7\bI\n\b\f\b\16\bL\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tT\n\t\f\t"+
		"\16\tW\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\7\b^\2\34\3\2\2\2"+
		"\4&\3\2\2\2\6)\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\f@\3\2\2\2\16J\3\2\2\2\20"+
		"M\3\2\2\2\22X\3\2\2\2\24]\3\2\2\2\26_\3\2\2\2\30a\3\2\2\2\32c\3\2\2\2"+
		"\34\35\7\3\2\2\35\36\7\4\2\2\36\37\7\5\2\2\37 \5\4\3\2 !\5\n\6\2!\"\7"+
		"\6\2\2\"\3\3\2\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\'\5\3\2\2\2(&\3\2\2\2)*\7\7\2\2*/\5\b\5\2+,\7\13\2\2,.\5\b\5\2-+\3\2"+
		"\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2\629\5"+
		"\30\r\2\63\64\5\30\r\2\64\65\7\t\2\2\65\66\5\32\16\2\66\67\7\n\2\2\67"+
		"9\3\2\2\28\62\3\2\2\28\63\3\2\2\29\t\3\2\2\2:<\5\f\7\2;:\3\2\2\2<?\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?=\3\2\2\2@A\t\2\2\2AB\5\30\r\2BC"+
		"\7\f\2\2CD\5\16\b\2DE\7\r\2\2EF\5\22\n\2F\r\3\2\2\2GI\5\20\t\2HG\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LJ\3\2\2\2MN\7\7\2\2NO\5\30"+
		"\r\2OU\3\2\2\2PQ\7\13\2\2QR\7\7\2\2RT\5\30\r\2SP\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2XY\7\5\2\2YZ\5\24\13\2Z[\5\26\f"+
		"\2[\\\7\6\2\2\\\23\3\2\2\2]^\3\2\2\2^\25\3\2\2\2_`\3\2\2\2`\27\3\2\2\2"+
		"ab\3\2\2\2b\31\3\2\2\2cd\3\2\2\2d\33\3\2\2\2\b&/8=JU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
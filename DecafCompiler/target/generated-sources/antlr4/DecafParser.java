// Generated from DecafParser.g4 by ANTLR 4.4
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
		EOL_COMMENT=37, HEX_PRFEFIX=15, CLASS=1, INT_LITERAL=16, EQ_OP=22, ARITH_OP=20, 
		NEGATIVE=24, LDOUBLE_QUOTE=41, ELSE=4, WHITESPACE=35, FOR=5, SEMICOLON=32, 
		INT=13, SQUARE_BRACKET_CLOSE=30, BOOL_LITERAL=17, COND_OP=23, MINUS=26, 
		PARENTHESIS_OPEN=33, TRUE=11, BREAK=7, SQUARE_BRACKET_OPEN=29, IF=3, ASSIGN_OP=19, 
		STRING_LITERAL=39, BOOLEAN=10, CHAR_LITERAL=38, CONTINUE=8, COMMA=31, 
		RETURN=6, BLOCK_COMMENT=36, PROGRAM=2, LSINGLE_QUOTE=40, ASSIGNMENT=25, 
		VOID=14, PARENTHESIS_CLOSE=34, FALSE=12, IDENTIIER=18, BRACKET_CLOSE=28, 
		RELOP=21, BRACKET_OPEN=27, CALLOUT=9;
	public static final String[] tokenNames = {
		"<INVALID>", "CLASS", "PROGRAM", "IF", "ELSE", "FOR", "RETURN", "BREAK", 
		"CONTINUE", "CALLOUT", "BOOLEAN", "TRUE", "FALSE", "INT", "VOID", "'0x'", 
		"INT_LITERAL", "BOOL_LITERAL", "IDENTIIER", "ASSIGN_OP", "ARITH_OP", "RELOP", 
		"EQ_OP", "COND_OP", "'!'", "'='", "'-'", "'{'", "'}'", "'['", "']'", "','", 
		"';'", "'('", "')'", "WHITESPACE", "BLOCK_COMMENT", "EOL_COMMENT", "CHAR_LITERAL", 
		"STRING_LITERAL", "'''", "'\"'"
	};
	public static final int
		RULE_program = 0, RULE_field_decl_s = 1, RULE_field_decl = 2, RULE_field_decl_name = 3, 
		RULE_method_decl_s = 4, RULE_method_decl = 5, RULE_param_decl_s = 6, RULE_param_decl = 7, 
		RULE_block = 8, RULE_var_decl_s = 9, RULE_var_decl = 10, RULE_statement_s = 11, 
		RULE_statement = 12, RULE_method_call = 13, RULE_method_name = 14, RULE_location = 15, 
		RULE_expr = 16, RULE_callout_arg = 17, RULE_bin_op = 18, RULE_literal = 19, 
		RULE_type = 20;
	public static final String[] ruleNames = {
		"program", "field_decl_s", "field_decl", "field_decl_name", "method_decl_s", 
		"method_decl", "param_decl_s", "param_decl", "block", "var_decl_s", "var_decl", 
		"statement_s", "statement", "method_call", "method_name", "location", 
		"expr", "callout_arg", "bin_op", "literal", "type"
	};

	@Override
	public String getGrammarFileName() { return "DecafParser.g4"; }

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
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(CLASS);
			setState(43); match(PROGRAM);
			setState(44); match(BRACKET_OPEN);
			setState(45); field_decl_s();
			setState(46); method_decl_s();
			setState(47); match(BRACKET_CLOSE);
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
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
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
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl_s(this);
		}
	}

	public final Field_decl_sContext field_decl_s() throws RecognitionException {
		Field_decl_sContext _localctx = new Field_decl_sContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(49); field_decl();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(SEMICOLON);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_decl_nameContext field_decl_name(int i) {
			return getRuleContext(Field_decl_nameContext.class,i);
		}
		public List<Field_decl_nameContext> field_decl_name() {
			return getRuleContexts(Field_decl_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); type();
			setState(58); field_decl_name();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59); match(COMMA);
				setState(60); field_decl_name();
				}
				}
				setState(65);
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
		public TerminalNode SQUARE_BRACKET_CLOSE() { return getToken(DecafParser.SQUARE_BRACKET_CLOSE, 0); }
		public TerminalNode IDENTIIER() { return getToken(DecafParser.IDENTIIER, 0); }
		public TerminalNode SQUARE_BRACKET_OPEN() { return getToken(DecafParser.SQUARE_BRACKET_OPEN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public Field_decl_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl_name(this);
		}
	}

	public final Field_decl_nameContext field_decl_name() throws RecognitionException {
		Field_decl_nameContext _localctx = new Field_decl_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_decl_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(66); match(IDENTIIER);
				}
				break;
			case 2:
				{
				setState(67); match(IDENTIIER);
				setState(68); match(SQUARE_BRACKET_OPEN);
				setState(69); match(INT_LITERAL);
				setState(70); match(SQUARE_BRACKET_CLOSE);
				}
				break;
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
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl_s(this);
		}
	}

	public final Method_decl_sContext method_decl_s() throws RecognitionException {
		Method_decl_sContext _localctx = new Method_decl_sContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(73); method_decl();
				}
				}
				setState(78);
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
		public Param_decl_sContext param_decl_s() {
			return getRuleContext(Param_decl_sContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(DecafParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode IDENTIIER() { return getToken(DecafParser.IDENTIIER, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(DecafParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(79); type();
				}
				break;
			case VOID:
				{
				setState(80); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83); match(IDENTIIER);
			setState(84); match(PARENTHESIS_OPEN);
			setState(85); param_decl_s();
			setState(86); match(PARENTHESIS_CLOSE);
			setState(87); block();
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
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParam_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParam_decl_s(this);
		}
	}

	public final Param_decl_sContext param_decl_s() throws RecognitionException {
		Param_decl_sContext _localctx = new Param_decl_sContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(89); param_decl();
				}
				}
				setState(94);
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
		public List<TerminalNode> IDENTIIER() { return getTokens(DecafParser.IDENTIIER); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode IDENTIIER(int i) {
			return getToken(DecafParser.IDENTIIER, i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParam_decl(this);
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
			setState(95); type();
			setState(96); match(IDENTIIER);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98); match(COMMA);
				setState(99); type();
				setState(100); match(IDENTIIER);
				}
				}
				setState(106);
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
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(BRACKET_OPEN);
			setState(108); var_decl_s();
			setState(109); statement_s();
			setState(110); match(BRACKET_CLOSE);
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
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_decl_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl_s(this);
		}
	}

	public final Var_decl_sContext var_decl_s() throws RecognitionException {
		Var_decl_sContext _localctx = new Var_decl_sContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(112); var_decl();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(SEMICOLON);
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIIER() { return getTokens(DecafParser.IDENTIIER); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode IDENTIIER(int i) {
			return getToken(DecafParser.IDENTIIER, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); type();
			setState(121); match(IDENTIIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122); match(COMMA);
				setState(123); match(IDENTIIER);
				}
				}
				setState(128);
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

	public static class Statement_sContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement_s(this);
		}
	}

	public final Statement_sContext statement_s() throws RecognitionException {
		Statement_sContext _localctx = new Statement_sContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << IDENTIIER) | (1L << BRACKET_OPEN))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ELSE(int i) {
			return getToken(DecafParser.ELSE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(DecafParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(DecafParser.PARENTHESIS_OPEN, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DecafParser.ASSIGNMENT, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> ELSE() { return getTokens(DecafParser.ELSE); }
		public TerminalNode IDENTIIER() { return getToken(DecafParser.IDENTIIER, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode ASSIGN_OP() { return getToken(DecafParser.ASSIGN_OP, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); location();
				setState(136); match(ASSIGN_OP);
				setState(137); expr(0);
				setState(138); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); method_call();
				setState(141); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(IF);
				setState(144); match(PARENTHESIS_OPEN);
				setState(145); expr(0);
				setState(146); match(PARENTHESIS_CLOSE);
				setState(147); block();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(148); match(ELSE);
					setState(149); block();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155); match(FOR);
				setState(156); match(IDENTIIER);
				setState(157); match(ASSIGNMENT);
				setState(158); expr(0);
				setState(159); match(COMMA);
				setState(160); expr(0);
				setState(161); block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163); match(RETURN);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << INT_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIIER) | (1L << NEGATIVE) | (1L << MINUS) | (1L << PARENTHESIS_OPEN) | (1L << CHAR_LITERAL))) != 0)) {
					{
					{
					setState(164); expr(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170); match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171); match(BREAK);
				setState(172); match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173); match(CONTINUE);
				setState(174); match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175); block();
				}
				break;
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

	public static class Method_callContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(DecafParser.PARENTHESIS_CLOSE, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(DecafParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(213);
			switch (_input.LA(1)) {
			case IDENTIIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); method_name();
				setState(179); match(PARENTHESIS_OPEN);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << INT_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIIER) | (1L << NEGATIVE) | (1L << MINUS) | (1L << PARENTHESIS_OPEN) | (1L << CHAR_LITERAL))) != 0)) {
					{
					{
					setState(180); expr(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(181); match(COMMA);
						setState(182); expr(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193); match(PARENTHESIS_CLOSE);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(CALLOUT);
				setState(196); match(PARENTHESIS_OPEN);
				setState(197); match(STRING_LITERAL);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198); match(COMMA);
					setState(199); callout_arg();
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(200); match(COMMA);
							setState(201); callout_arg();
							}
							} 
						}
						setState(206);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212); match(PARENTHESIS_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIIER() { return getToken(DecafParser.IDENTIIER, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(IDENTIIER);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode SQUARE_BRACKET_CLOSE() { return getToken(DecafParser.SQUARE_BRACKET_CLOSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIIER() { return getToken(DecafParser.IDENTIIER, 0); }
		public TerminalNode SQUARE_BRACKET_OPEN() { return getToken(DecafParser.SQUARE_BRACKET_OPEN, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_location);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(IDENTIIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(IDENTIIER);
				setState(219); match(SQUARE_BRACKET_OPEN);
				setState(220); expr(0);
				setState(221); match(SQUARE_BRACKET_CLOSE);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(DecafParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(DecafParser.PARENTHESIS_OPEN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEGATIVE() { return getToken(DecafParser.NEGATIVE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(226); match(MINUS);
				setState(227); expr(3);
				}
				break;
			case 2:
				{
				setState(228); match(NEGATIVE);
				setState(229); expr(2);
				}
				break;
			case 3:
				{
				setState(230); location();
				}
				break;
			case 4:
				{
				setState(231); method_call();
				}
				break;
			case 5:
				{
				setState(232); literal();
				}
				break;
			case 6:
				{
				setState(233); match(PARENTHESIS_OPEN);
				setState(234); expr(0);
				setState(235); match(PARENTHESIS_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(239);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(240); bin_op();
					setState(241); expr(5);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callout_arg);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case CALLOUT:
			case INT_LITERAL:
			case BOOL_LITERAL:
			case IDENTIIER:
			case NEGATIVE:
			case MINUS:
			case PARENTHESIS_OPEN:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode COND_OP() { return getToken(DecafParser.COND_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(DecafParser.EQ_OP, 0); }
		public TerminalNode ARITH_OP() { return getToken(DecafParser.ARITH_OP, 0); }
		public TerminalNode RELOP() { return getToken(DecafParser.RELOP, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARITH_OP) | (1L << RELOP) | (1L << EQ_OP) | (1L << COND_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(DecafParser.CHAR_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(DecafParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4"+
		"C\13\4\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3"+
		"\7\5\7T\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b]\n\b\f\b\16\b`\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\7\13t\n\13\f\13\16\13w\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\177\n\f\f"+
		"\f\16\f\u0082\13\f\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099"+
		"\n\16\f\16\16\16\u009c\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ba\n\17\f\17"+
		"\16\17\u00bd\13\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0\13"+
		"\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\3\17\5\17\u00d8\n\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00f6\n\22\f\22\16\22\u00f9\13\22\3\23\3\23\5\23\u00fd\n\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\3\"\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\5\3\2\26\31\4\2\22\23((\4\2\f\f\17\17\u010f\2,\3"+
		"\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\bI\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16^\3"+
		"\2\2\2\20a\3\2\2\2\22m\3\2\2\2\24u\3\2\2\2\26z\3\2\2\2\30\u0086\3\2\2"+
		"\2\32\u00b2\3\2\2\2\34\u00d7\3\2\2\2\36\u00d9\3\2\2\2 \u00e1\3\2\2\2\""+
		"\u00ef\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0100\3\2\2\2*\u0102\3\2"+
		"\2\2,-\7\3\2\2-.\7\4\2\2./\7\35\2\2/\60\5\4\3\2\60\61\5\n\6\2\61\62\7"+
		"\36\2\2\62\3\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\"\2\2:\5\3\2\2\2;<\5*\26"+
		"\2<A\5\b\5\2=>\7!\2\2>@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2B\7\3\2\2\2CA\3\2\2\2DJ\7\24\2\2EF\7\24\2\2FG\7\37\2\2GH\7\22\2\2HJ"+
		"\7 \2\2ID\3\2\2\2IE\3\2\2\2J\t\3\2\2\2KM\5\f\7\2LK\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QT\5*\26\2RT\7\20\2\2SQ\3\2\2"+
		"\2SR\3\2\2\2TU\3\2\2\2UV\7\24\2\2VW\7#\2\2WX\5\16\b\2XY\7$\2\2YZ\5\22"+
		"\n\2Z\r\3\2\2\2[]\5\20\t\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_"+
		"\17\3\2\2\2`^\3\2\2\2ab\5*\26\2bc\7\24\2\2cj\3\2\2\2de\7!\2\2ef\5*\26"+
		"\2fg\7\24\2\2gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21\3"+
		"\2\2\2lj\3\2\2\2mn\7\35\2\2no\5\24\13\2op\5\30\r\2pq\7\36\2\2q\23\3\2"+
		"\2\2rt\5\26\f\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3"+
		"\2\2\2xy\7\"\2\2y\25\3\2\2\2z{\5*\26\2{\u0080\7\24\2\2|}\7!\2\2}\177\7"+
		"\24\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\27\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\32\16\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\31\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\25\2"+
		"\2\u008b\u008c\5\"\22\2\u008c\u008d\7\"\2\2\u008d\u00b3\3\2\2\2\u008e"+
		"\u008f\5\34\17\2\u008f\u0090\7\"\2\2\u0090\u00b3\3\2\2\2\u0091\u0092\7"+
		"\5\2\2\u0092\u0093\7#\2\2\u0093\u0094\5\"\22\2\u0094\u0095\7$\2\2\u0095"+
		"\u009a\5\22\n\2\u0096\u0097\7\6\2\2\u0097\u0099\5\22\n\2\u0098\u0096\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00b3\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7\24"+
		"\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\7!\2\2\u00a2"+
		"\u00a3\5\"\22\2\u00a3\u00a4\5\22\n\2\u00a4\u00b3\3\2\2\2\u00a5\u00a9\7"+
		"\b\2\2\u00a6\u00a8\5\"\22\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00b3\7\"\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00b3\7\"\2\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\u00b3\7\"\2\2\u00b1\u00b3\5\22\n\2\u00b2\u0089\3"+
		"\2\2\2\u00b2\u008e\3\2\2\2\u00b2\u0091\3\2\2\2\u00b2\u009d\3\2\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00c0\7#\2\2\u00b6\u00bb"+
		"\5\"\22\2\u00b7\u00b8\7!\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c4\7$\2\2\u00c4\u00d8\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c7\7#\2\2\u00c7\u00d3\7)\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ce\5$\23"+
		"\2\u00ca\u00cb\7!\2\2\u00cb\u00cd\5$\23\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\7$\2\2\u00d7\u00b4\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d8\35\3\2\2\2"+
		"\u00d9\u00da\7\24\2\2\u00da\37\3\2\2\2\u00db\u00e2\7\24\2\2\u00dc\u00dd"+
		"\7\24\2\2\u00dd\u00de\7\37\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7 \2\2"+
		"\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2!\3"+
		"\2\2\2\u00e3\u00e4\b\22\1\2\u00e4\u00e5\7\34\2\2\u00e5\u00f0\5\"\22\5"+
		"\u00e6\u00e7\7\32\2\2\u00e7\u00f0\5\"\22\4\u00e8\u00f0\5 \21\2\u00e9\u00f0"+
		"\5\34\17\2\u00ea\u00f0\5(\25\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5\"\22\2"+
		"\u00ed\u00ee\7$\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e6"+
		"\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2\f\6\2\2\u00f2\u00f3\5&"+
		"\24\2\u00f3\u00f4\5\"\22\7\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8#\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00fa\u00fd\5\"\22\2\u00fb\u00fd\7)\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd%\3\2\2\2\u00fe\u00ff\t\2\2\2\u00ff"+
		"\'\3\2\2\2\u0100\u0101\t\3\2\2\u0101)\3\2\2\2\u0102\u0103\t\4\2\2\u0103"+
		"+\3\2\2\2\30\66AINS^ju\u0080\u0086\u009a\u00a9\u00b2\u00bb\u00c0\u00ce"+
		"\u00d3\u00d7\u00e1\u00ef\u00f7\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
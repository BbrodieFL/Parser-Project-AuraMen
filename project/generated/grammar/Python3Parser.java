// Generated from grammar/Python3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Python3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, Comparison_operators=26, VARNAME=27, INT=28, FLOAT=29, STRING=30, 
		BOOLEAN=31, NEWLINE=32, INDENT=33, WS=34, SINGLE_LINE_COMMENT=35, MULTI_LINE_COMMENT=36;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_statement = 2, RULE_if_statement = 3, 
		RULE_elif_statement = 4, RULE_else_statement = 5, RULE_for_statement = 6, 
		RULE_while_statement = 7, RULE_blockStatement = 8, RULE_block = 9, RULE_assignment = 10, 
		RULE_assignment_operator = 11, RULE_expression = 12, RULE_paramExpr = 13, 
		RULE_list = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "statement", "if_statement", "elif_statement", "else_statement", 
			"for_statement", "while_statement", "blockStatement", "block", "assignment", 
			"assignment_operator", "expression", "paramExpr", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "':'", "'elif'", "'else'", "'for'", "'in'", "'while'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'not'", "'and'", "'or'", "'('", "')'", "','", "'['", "']'", null, null, 
			null, null, null, null, null, "'\\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Comparison_operators", "VARNAME", "INT", "FLOAT", "STRING", 
			"BOOLEAN", "NEWLINE", "INDENT", "WS", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Python3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			program();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(33); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(32);
							statement();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(35); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(37);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8474919074L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(Python3Parser.EOF, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				expression(0);
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			expression(0);
			setState(56);
			match(T__1);
			setState(57);
			match(NEWLINE);
			setState(58);
			block();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					elif_statement();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(65);
				else_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(Python3Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(Python3Parser.INDENT, i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitElif_statement(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elif_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(68);
				match(INDENT);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__2);
			setState(75);
			expression(0);
			setState(76);
			match(T__1);
			setState(77);
			match(NEWLINE);
			setState(78);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(Python3Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(Python3Parser.INDENT, i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(80);
				match(INDENT);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__3);
			setState(87);
			match(T__1);
			setState(88);
			match(NEWLINE);
			setState(89);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__4);
			setState(92);
			expression(0);
			setState(93);
			match(T__5);
			setState(94);
			expression(0);
			setState(95);
			match(T__1);
			setState(96);
			match(NEWLINE);
			setState(97);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__6);
			setState(100);
			expression(0);
			setState(101);
			match(T__1);
			setState(102);
			match(NEWLINE);
			setState(103);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(Python3Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(Python3Parser.INDENT, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				match(INDENT);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDENT );
			setState(110);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(Python3Parser.VARNAME, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VARNAME);
			setState(118);
			assignment_operator();
			setState(119);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitMulExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitAndExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitStringExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(Python3Parser.BOOLEAN, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitBoolExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public FloatExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitFloatExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitSubExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(Python3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public NegExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNegExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitAddExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitOrExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitDivExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Comparison_operators() { return getToken(Python3Parser.Comparison_operators, 0); }
		public CompareExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitCompareExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExpressionContext {
		public TerminalNode VARNAME() { return getToken(Python3Parser.VARNAME, 0); }
		public VarExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitVarExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNotExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(Python3Parser.INT, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitIntExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitListExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitModExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitParenExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExpressionContext {
		public TerminalNode VARNAME() { return getToken(Python3Parser.VARNAME, 0); }
		public ParamExprContext paramExpr() {
			return getRuleContext(ParamExprContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitFuncCallExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				match(T__17);
				setState(125);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__15);
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(VARNAME);
				setState(129);
				match(T__20);
				setState(130);
				paramExpr();
				setState(131);
				match(T__21);
				}
				break;
			case 4:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				list();
				}
				break;
			case 9:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(VARNAME);
				}
				break;
			case 10:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__20);
				setState(140);
				expression(0);
				setState(141);
				match(T__21);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(146);
						match(T__12);
						setState(147);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(149);
						match(T__13);
						setState(150);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(152);
						match(T__14);
						setState(153);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new SubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(155);
						match(T__15);
						setState(156);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(158);
						match(T__16);
						setState(159);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new CompareExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(161);
						match(Comparison_operators);
						setState(162);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(164);
						match(T__18);
						setState(165);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(167);
						match(T__19);
						setState(168);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterParamExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitParamExpr(this);
		}
	}

	public final ParamExprContext paramExpr() throws RecognitionException {
		ParamExprContext _localctx = new ParamExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(175);
				match(T__22);
				setState(176);
				expression(0);
				}
				}
				setState(181);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__23);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4179951616L) != 0)) {
				{
				setState(183);
				expression(0);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(184);
					match(T__22);
					setState(185);
					expression(0);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(T__24);
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
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001#\u0001\u0001\u0004"+
		"\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00025\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003=\b\u0003\n\u0003\f\u0003"+
		"@\t\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004\u0005\u0004F\b"+
		"\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005R\b\u0005\n\u0005"+
		"\f\u0005U\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bk\b\b\u000b\b\f\bl\u0001"+
		"\b\u0001\b\u0001\t\u0004\tr\b\t\u000b\t\f\ts\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00b2\b\r\n\r\f\r\u00b5\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00bb\b\u000e\n\u000e"+
		"\f\u000e\u00be\t\u000e\u0003\u000e\u00c0\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0001\u0018\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0001  \u0001"+
		"\u0000\b\f\u0001\u0000\u001c\u001d\u00d6\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002&\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010"+
		"j\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014u\u0001"+
		"\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000"+
		"\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f\u0001\u0001\u0000"+
		"\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\'\u0001\u0000\u0000\u0000%\'\u0005 \u0000\u0000&!\u0001\u0000\u0000"+
		"\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000"+
		"*+\u0003\u0018\f\u0000+,\u0007\u0000\u0000\u0000,5\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0014\n\u0000./\u0007\u0000\u0000\u0000/5\u0001\u0000\u0000\u0000"+
		"05\u0003\u0006\u0003\u000015\u0003\f\u0006\u000025\u0003\u000e\u0007\u0000"+
		"35\u0005 \u0000\u00004*\u0001\u0000\u0000\u00004-\u0001\u0000\u0000\u0000"+
		"40\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0005"+
		"\u0001\u0000\u000078\u0003\u0018\f\u000089\u0005\u0002\u0000\u00009:\u0005"+
		" \u0000\u0000:>\u0003\u0012\t\u0000;=\u0003\b\u0004\u0000<;\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AC\u0003\n\u0005\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000DF\u0005!\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0003\u0018\f\u0000LM\u0005\u0002\u0000\u0000MN\u0005"+
		" \u0000\u0000NO\u0003\u0012\t\u0000O\t\u0001\u0000\u0000\u0000PR\u0005"+
		"!\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0005\u0002\u0000"+
		"\u0000XY\u0005 \u0000\u0000YZ\u0003\u0012\t\u0000Z\u000b\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0005\u0000\u0000\\]\u0003\u0018\f\u0000]^\u0005\u0006"+
		"\u0000\u0000^_\u0003\u0018\f\u0000_`\u0005\u0002\u0000\u0000`a\u0005 "+
		"\u0000\u0000ab\u0003\u0012\t\u0000b\r\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0007\u0000\u0000de\u0003\u0018\f\u0000ef\u0005\u0002\u0000\u0000fg\u0005"+
		" \u0000\u0000gh\u0003\u0012\t\u0000h\u000f\u0001\u0000\u0000\u0000ik\u0005"+
		"!\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0003\u0004\u0002\u0000o\u0011\u0001\u0000\u0000\u0000pr\u0003\u0010"+
		"\b\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000"+
		"uv\u0005\u001b\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0003\u0018\f\u0000"+
		"x\u0015\u0001\u0000\u0000\u0000yz\u0007\u0001\u0000\u0000z\u0017\u0001"+
		"\u0000\u0000\u0000{|\u0006\f\uffff\uffff\u0000|}\u0005\u0012\u0000\u0000"+
		"}\u0090\u0003\u0018\f\f~\u007f\u0005\u0010\u0000\u0000\u007f\u0090\u0007"+
		"\u0002\u0000\u0000\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u0082\u0005"+
		"\u0015\u0000\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0005\u0016"+
		"\u0000\u0000\u0084\u0090\u0001\u0000\u0000\u0000\u0085\u0090\u0005\u001c"+
		"\u0000\u0000\u0086\u0090\u0005\u001d\u0000\u0000\u0087\u0090\u0005\u001e"+
		"\u0000\u0000\u0088\u0090\u0005\u001f\u0000\u0000\u0089\u0090\u0003\u001c"+
		"\u000e\u0000\u008a\u0090\u0005\u001b\u0000\u0000\u008b\u008c\u0005\u0015"+
		"\u0000\u0000\u008c\u008d\u0003\u0018\f\u0000\u008d\u008e\u0005\u0016\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f{\u0001\u0000\u0000\u0000"+
		"\u008f~\u0001\u0000\u0000\u0000\u008f\u0080\u0001\u0000\u0000\u0000\u008f"+
		"\u0085\u0001\u0000\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u008f"+
		"\u0087\u0001\u0000\u0000\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f"+
		"\u0089\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f"+
		"\u008b\u0001\u0000\u0000\u0000\u0090\u00ab\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\n\u0012\u0000\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u00aa"+
		"\u0003\u0018\f\u0013\u0094\u0095\n\u0011\u0000\u0000\u0095\u0096\u0005"+
		"\u000e\u0000\u0000\u0096\u00aa\u0003\u0018\f\u0012\u0097\u0098\n\u0010"+
		"\u0000\u0000\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u00aa\u0003\u0018"+
		"\f\u0011\u009a\u009b\n\u000f\u0000\u0000\u009b\u009c\u0005\u0010\u0000"+
		"\u0000\u009c\u00aa\u0003\u0018\f\u0010\u009d\u009e\n\u000e\u0000\u0000"+
		"\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u00aa\u0003\u0018\f\u000f\u00a0"+
		"\u00a1\n\r\u0000\u0000\u00a1\u00a2\u0005\u001a\u0000\u0000\u00a2\u00aa"+
		"\u0003\u0018\f\u000e\u00a3\u00a4\n\u000b\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0013\u0000\u0000\u00a5\u00aa\u0003\u0018\f\f\u00a6\u00a7\n\n\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8\u00aa\u0003\u0018\f\u000b\u00a9"+
		"\u0091\u0001\u0000\u0000\u0000\u00a9\u0094\u0001\u0000\u0000\u0000\u00a9"+
		"\u0097\u0001\u0000\u0000\u0000\u00a9\u009a\u0001\u0000\u0000\u0000\u00a9"+
		"\u009d\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003\u0018\f\u0000\u00af\u00b0"+
		"\u0005\u0017\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001b\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00bf\u0005"+
		"\u0018\u0000\u0000\u00b7\u00bc\u0003\u0018\f\u0000\u00b8\u00b9\u0005\u0017"+
		"\u0000\u0000\u00b9\u00bb\u0003\u0018\f\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0019\u0000\u0000\u00c2\u001d\u0001\u0000\u0000"+
		"\u0000\u0010#&(4>BGSls\u008f\u00a9\u00ab\u00b3\u00bc\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
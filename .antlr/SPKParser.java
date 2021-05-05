// Generated from c:\Users\ikswo\OneDrive\STUDIA\sem6\SPK\SPK_Programming_Language\SPK.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPKParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TYPE_NAME=2, BOOL_=3, FUN_=4, INT=5, LIST=6, FLOATING=7, STRING_=8, 
		IF_=9, THEN_=10, ELSE=11, WHILE=12, FOR=13, IN=14, PRINT_=15, VARIABLE_NAME=16, 
		INTEGER_NUMBER=17, FLOAT_NUMBER=18, STRING=19, NON_ZERO_DIGIT=20, DIGIT=21, 
		OR=22, AND=23, EQ=24, NEQ=25, GT=26, LT=27, GTEQ=28, LTEQ=29, PLUS=30, 
		MINUS=31, MULT=32, DIV=33, MOD=34, POW=35, NOT=36, ASSIGN=37, OPAR=38, 
		CPAR=39, OBRACE=40, CBRACE=41, OSQBRACE=42, CSQBRACE=43, COMMENT=44, SEP=45, 
		WS=46, OTHER=47;
	public static final int
		RULE_program = 0, RULE_bigStmt = 1, RULE_if_stat = 2, RULE_while_stat = 3, 
		RULE_for_loop = 4, RULE_print_ = 5, RULE_printable = 6, RULE_condition_block = 7, 
		RULE_block = 8, RULE_function_ = 9, RULE_function_exec = 10, RULE_arguments = 11, 
		RULE_arguments_exec = 12, RULE_declaration = 13, RULE_assignment = 14, 
		RULE_expr = 15, RULE_atom = 16, RULE_iterable = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "bigStmt", "if_stat", "while_stat", "for_loop", "print_", 
			"printable", "condition_block", "block", "function_", "function_exec", 
			"arguments", "arguments_exec", "declaration", "assignment", "expr", "atom", 
			"iterable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'LOGICZNA'", "'FUNKCJA'", "'CA\u0141KOWITA'", "'LISTA'", 
			"'U\u0141AMKOWA'", "'NAPIS'", "'JE\u017BELI'", "'TO'", "'INACZEJ'", "'DOP\u00D3KI'", 
			"'DLA'", "'W'", "'WYPISZ'", null, null, null, null, null, null, "'||'", 
			"'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'!'", "'='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TYPE_NAME", "BOOL_", "FUN_", "INT", "LIST", "FLOATING", 
			"STRING_", "IF_", "THEN_", "ELSE", "WHILE", "FOR", "IN", "PRINT_", "VARIABLE_NAME", 
			"INTEGER_NUMBER", "FLOAT_NUMBER", "STRING", "NON_ZERO_DIGIT", "DIGIT", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "OSQBRACE", "CSQBRACE", "COMMENT", "SEP", "WS", "OTHER"
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
	public String getGrammarFileName() { return "SPK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SPKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SPKParser.EOF, 0); }
		public List<Function_Context> function_() {
			return getRuleContexts(Function_Context.class);
		}
		public Function_Context function_(int i) {
			return getRuleContext(Function_Context.class,i);
		}
		public List<BigStmtContext> bigStmt() {
			return getRuleContexts(BigStmtContext.class);
		}
		public BigStmtContext bigStmt(int i) {
			return getRuleContext(BigStmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN_) {
				{
				{
				setState(36);
				function_();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_NAME) | (1L << IF_) | (1L << WHILE) | (1L << FOR) | (1L << PRINT_) | (1L << VARIABLE_NAME))) != 0)) {
				{
				{
				setState(42);
				bigStmt();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
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

	public static class BigStmtContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public Function_execContext function_exec() {
			return getRuleContext(Function_execContext.class,0);
		}
		public BigStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigStmt; }
	}

	public final BigStmtContext bigStmt() throws RecognitionException {
		BigStmtContext _localctx = new BigStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bigStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(50);
				if_stat();
				}
				break;
			case 2:
				{
				setState(51);
				while_stat();
				}
				break;
			case 3:
				{
				setState(52);
				for_loop();
				}
				break;
			case 4:
				{
				setState(53);
				declaration();
				}
				break;
			case 5:
				{
				setState(54);
				assignment();
				}
				break;
			case 6:
				{
				setState(55);
				print_();
				}
				break;
			case 7:
				{
				setState(56);
				function_exec();
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF_() { return getTokens(SPKParser.IF_); }
		public TerminalNode IF_(int i) {
			return getToken(SPKParser.IF_, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(SPKParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SPKParser.ELSE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IF_);
			setState(60);
			condition_block();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(ELSE);
					setState(62);
					match(IF_);
					setState(63);
					condition_block();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				match(ELSE);
				setState(70);
				block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SPKParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN_() { return getToken(SPKParser.THEN_, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WHILE);
			setState(74);
			expr(0);
			setState(75);
			match(THEN_);
			setState(76);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SPKParser.FOR, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode IN() { return getToken(SPKParser.IN, 0); }
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FOR);
			setState(79);
			match(VARIABLE_NAME);
			setState(80);
			match(IN);
			setState(81);
			iterable();
			setState(82);
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

	public static class Print_Context extends ParserRuleContext {
		public TerminalNode PRINT_() { return getToken(SPKParser.PRINT_, 0); }
		public PrintableContext printable() {
			return getRuleContext(PrintableContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SPKParser.SEP, 0); }
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PRINT_);
			setState(85);
			printable();
			setState(86);
			match(SEP);
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

	public static class PrintableContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SPKParser.STRING, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(SPKParser.INTEGER_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(SPKParser.FLOAT_NUMBER, 0); }
		public TerminalNode BOOL_() { return getToken(SPKParser.BOOL_, 0); }
		public PrintableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable; }
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_) | (1L << VARIABLE_NAME) | (1L << INTEGER_NUMBER) | (1L << FLOAT_NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN_() { return getToken(SPKParser.THEN_, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			expr(0);
			setState(91);
			match(THEN_);
			setState(92);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(SPKParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(SPKParser.CBRACE, 0); }
		public List<BigStmtContext> bigStmt() {
			return getRuleContexts(BigStmtContext.class);
		}
		public BigStmtContext bigStmt(int i) {
			return getRuleContext(BigStmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(OBRACE);
				setState(95);
				block();
				setState(96);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(OBRACE);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					bigStmt();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_NAME) | (1L << IF_) | (1L << WHILE) | (1L << FOR) | (1L << PRINT_) | (1L << VARIABLE_NAME))) != 0) );
				setState(104);
				match(CBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				bigStmt();
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

	public static class Function_Context extends ParserRuleContext {
		public TerminalNode FUN_() { return getToken(SPKParser.FUN_, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode OPAR() { return getToken(SPKParser.OPAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(SPKParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(SPKParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(SPKParser.CBRACE, 0); }
		public TerminalNode SEP() { return getToken(SPKParser.SEP, 0); }
		public List<BigStmtContext> bigStmt() {
			return getRuleContexts(BigStmtContext.class);
		}
		public BigStmtContext bigStmt(int i) {
			return getRuleContext(BigStmtContext.class,i);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FUN_);
			setState(110);
			match(VARIABLE_NAME);
			setState(111);
			match(OPAR);
			setState(112);
			arguments();
			setState(113);
			match(CPAR);
			setState(114);
			match(OBRACE);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				bigStmt();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_NAME) | (1L << IF_) | (1L << WHILE) | (1L << FOR) | (1L << PRINT_) | (1L << VARIABLE_NAME))) != 0) );
			setState(120);
			match(CBRACE);
			setState(121);
			match(SEP);
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

	public static class Function_execContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode OPAR() { return getToken(SPKParser.OPAR, 0); }
		public Arguments_execContext arguments_exec() {
			return getRuleContext(Arguments_execContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(SPKParser.CPAR, 0); }
		public TerminalNode SEP() { return getToken(SPKParser.SEP, 0); }
		public Function_execContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_exec; }
	}

	public final Function_execContext function_exec() throws RecognitionException {
		Function_execContext _localctx = new Function_execContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_exec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VARIABLE_NAME);
			setState(124);
			match(OPAR);
			setState(125);
			arguments_exec();
			setState(126);
			match(CPAR);
			setState(127);
			match(SEP);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_NAME() { return getTokens(SPKParser.TYPE_NAME); }
		public TerminalNode TYPE_NAME(int i) {
			return getToken(SPKParser.TYPE_NAME, i);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(SPKParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(SPKParser.VARIABLE_NAME, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(TYPE_NAME);
					setState(130);
					match(VARIABLE_NAME);
					setState(131);
					match(T__0);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(137);
			match(TYPE_NAME);
			setState(138);
			match(VARIABLE_NAME);
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

	public static class Arguments_execContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Arguments_execContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_exec; }
	}

	public final Arguments_execContext arguments_exec() throws RecognitionException {
		Arguments_execContext _localctx = new Arguments_execContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments_exec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					expr(0);
					setState(141);
					match(T__0);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(148);
			expr(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE_NAME() { return getToken(SPKParser.TYPE_NAME, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SPKParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SPKParser.SEP, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(TYPE_NAME);
			setState(151);
			match(VARIABLE_NAME);
			setState(152);
			match(ASSIGN);
			setState(153);
			expr(0);
			setState(154);
			match(SEP);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SPKParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(SPKParser.SEP, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(VARIABLE_NAME);
			setState(157);
			match(ASSIGN);
			setState(158);
			expr(0);
			setState(159);
			match(SEP);
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
		public Token op;
		public TerminalNode MINUS() { return getToken(SPKParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SPKParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(SPKParser.POW, 0); }
		public TerminalNode MULT() { return getToken(SPKParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SPKParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SPKParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SPKParser.PLUS, 0); }
		public TerminalNode LTEQ() { return getToken(SPKParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(SPKParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(SPKParser.LT, 0); }
		public TerminalNode GT() { return getToken(SPKParser.GT, 0); }
		public TerminalNode EQ() { return getToken(SPKParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SPKParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(SPKParser.AND, 0); }
		public TerminalNode OR() { return getToken(SPKParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(162);
				match(MINUS);
				setState(163);
				expr(9);
				}
				break;
			case NOT:
				{
				setState(164);
				match(NOT);
				setState(165);
				expr(8);
				}
				break;
			case BOOL_:
			case VARIABLE_NAME:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case STRING:
			case OPAR:
			case OSQBRACE:
				{
				setState(166);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(POW);
						setState(171);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(173);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(176);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(AND);
						setState(186);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(OR);
						setState(189);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(194);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(SPKParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(SPKParser.CPAR, 0); }
		public List<TerminalNode> INTEGER_NUMBER() { return getTokens(SPKParser.INTEGER_NUMBER); }
		public TerminalNode INTEGER_NUMBER(int i) {
			return getToken(SPKParser.INTEGER_NUMBER, i);
		}
		public List<TerminalNode> FLOAT_NUMBER() { return getTokens(SPKParser.FLOAT_NUMBER); }
		public TerminalNode FLOAT_NUMBER(int i) {
			return getToken(SPKParser.FLOAT_NUMBER, i);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public TerminalNode STRING() { return getToken(SPKParser.STRING, 0); }
		public TerminalNode BOOL_() { return getToken(SPKParser.BOOL_, 0); }
		public TerminalNode OSQBRACE() { return getToken(SPKParser.OSQBRACE, 0); }
		public TerminalNode CSQBRACE() { return getToken(SPKParser.CSQBRACE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(OPAR);
				setState(196);
				expr(0);
				setState(197);
				match(CPAR);
				}
				break;
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(INTEGER_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(FLOAT_NUMBER);
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(VARIABLE_NAME);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(STRING);
				}
				break;
			case BOOL_:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(BOOL_);
				}
				break;
			case OSQBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(OSQBRACE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTEGER_NUMBER || _la==FLOAT_NUMBER) {
					{
					{
					setState(205);
					_la = _input.LA(1);
					if ( !(_la==INTEGER_NUMBER || _la==FLOAT_NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(CSQBRACE);
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

	public static class IterableContext extends ParserRuleContext {
		public TerminalNode OSQBRACE() { return getToken(SPKParser.OSQBRACE, 0); }
		public TerminalNode CSQBRACE() { return getToken(SPKParser.CSQBRACE, 0); }
		public List<TerminalNode> INTEGER_NUMBER() { return getTokens(SPKParser.INTEGER_NUMBER); }
		public TerminalNode INTEGER_NUMBER(int i) {
			return getToken(SPKParser.INTEGER_NUMBER, i);
		}
		public List<TerminalNode> FLOAT_NUMBER() { return getTokens(SPKParser.FLOAT_NUMBER); }
		public TerminalNode FLOAT_NUMBER(int i) {
			return getToken(SPKParser.FLOAT_NUMBER, i);
		}
		public TerminalNode STRING() { return getToken(SPKParser.STRING, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(SPKParser.VARIABLE_NAME, 0); }
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterable);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OSQBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(OSQBRACE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTEGER_NUMBER || _la==FLOAT_NUMBER) {
					{
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==INTEGER_NUMBER || _la==FLOAT_NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(CSQBRACE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(STRING);
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(VARIABLE_NAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00e5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\7\4C\n"+
		"\4\f\4\16\4F\13\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\6\ng\n\n\r\n\16\nh\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\6\13w\n\13\r\13\16\13x\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00aa\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c1\n\21\f\21"+
		"\16\21\u00c4\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00d1\n\22\f\22\16\22\u00d4\13\22\3\22\5\22\u00d7\n\22\3\23\3"+
		"\23\7\23\u00db\n\23\f\23\16\23\u00de\13\23\3\23\3\23\3\23\5\23\u00e3\n"+
		"\23\3\23\2\3 \24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\4\2\5"+
		"\5\22\25\3\2\"$\3\2 !\3\2\34\37\3\2\32\33\3\2\23\24\2\u00f5\2)\3\2\2\2"+
		"\4;\3\2\2\2\6=\3\2\2\2\bK\3\2\2\2\nP\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20"+
		"\\\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26}\3\2\2\2\30\u0088\3\2\2\2\32\u0093"+
		"\3\2\2\2\34\u0098\3\2\2\2\36\u009e\3\2\2\2 \u00a9\3\2\2\2\"\u00d6\3\2"+
		"\2\2$\u00e2\3\2\2\2&(\5\24\13\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*/\3\2\2\2+)\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60"+
		"\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64<\5\6"+
		"\4\2\65<\5\b\5\2\66<\5\n\6\2\67<\5\34\17\28<\5\36\20\29<\5\f\7\2:<\5\26"+
		"\f\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2"+
		"\2;:\3\2\2\2<\5\3\2\2\2=>\7\13\2\2>D\5\20\t\2?@\7\r\2\2@A\7\13\2\2AC\5"+
		"\20\t\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EI\3\2\2\2FD\3\2\2\2GH"+
		"\7\r\2\2HJ\5\22\n\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KL\7\16\2\2LM\5 \21"+
		"\2MN\7\f\2\2NO\5\22\n\2O\t\3\2\2\2PQ\7\17\2\2QR\7\22\2\2RS\7\20\2\2ST"+
		"\5$\23\2TU\5\22\n\2U\13\3\2\2\2VW\7\21\2\2WX\5\16\b\2XY\7/\2\2Y\r\3\2"+
		"\2\2Z[\t\2\2\2[\17\3\2\2\2\\]\5 \21\2]^\7\f\2\2^_\5\22\n\2_\21\3\2\2\2"+
		"`a\7*\2\2ab\5\22\n\2bc\7+\2\2cn\3\2\2\2df\7*\2\2eg\5\4\3\2fe\3\2\2\2g"+
		"h\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7+\2\2kn\3\2\2\2ln\5\4\3\2m"+
		"`\3\2\2\2md\3\2\2\2ml\3\2\2\2n\23\3\2\2\2op\7\6\2\2pq\7\22\2\2qr\7(\2"+
		"\2rs\5\30\r\2st\7)\2\2tv\7*\2\2uw\5\4\3\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2yz\3\2\2\2z{\7+\2\2{|\7/\2\2|\25\3\2\2\2}~\7\22\2\2~\177\7"+
		"(\2\2\177\u0080\5\32\16\2\u0080\u0081\7)\2\2\u0081\u0082\7/\2\2\u0082"+
		"\27\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0085\7\22\2\2\u0085\u0087\7\3\2"+
		"\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\4\2\2\u008c"+
		"\u008d\7\22\2\2\u008d\31\3\2\2\2\u008e\u008f\5 \21\2\u008f\u0090\7\3\2"+
		"\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\5 \21\2\u0097\33\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a\7\22\2"+
		"\2\u009a\u009b\7\'\2\2\u009b\u009c\5 \21\2\u009c\u009d\7/\2\2\u009d\35"+
		"\3\2\2\2\u009e\u009f\7\22\2\2\u009f\u00a0\7\'\2\2\u00a0\u00a1\5 \21\2"+
		"\u00a1\u00a2\7/\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\b\21\1\2\u00a4\u00a5"+
		"\7!\2\2\u00a5\u00aa\5 \21\13\u00a6\u00a7\7&\2\2\u00a7\u00aa\5 \21\n\u00a8"+
		"\u00aa\5\"\22\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00c2\3\2\2\2\u00ab\u00ac\f\f\2\2\u00ac\u00ad\7%\2\2\u00ad"+
		"\u00c1\5 \21\r\u00ae\u00af\f\t\2\2\u00af\u00b0\t\3\2\2\u00b0\u00c1\5 "+
		"\21\n\u00b1\u00b2\f\b\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00c1\5 \21\t\u00b4"+
		"\u00b5\f\7\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00c1\5 \21\b\u00b7\u00b8\f\6"+
		"\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00c1\5 \21\7\u00ba\u00bb\f\5\2\2\u00bb"+
		"\u00bc\7\31\2\2\u00bc\u00c1\5 \21\6\u00bd\u00be\f\4\2\2\u00be\u00bf\7"+
		"\30\2\2\u00bf\u00c1\5 \21\5\u00c0\u00ab\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0"+
		"\u00b1\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6"+
		"\u00c7\5 \21\2\u00c7\u00c8\7)\2\2\u00c8\u00d7\3\2\2\2\u00c9\u00d7\7\23"+
		"\2\2\u00ca\u00d7\7\24\2\2\u00cb\u00d7\7\22\2\2\u00cc\u00d7\7\25\2\2\u00cd"+
		"\u00d7\7\5\2\2\u00ce\u00d2\7,\2\2\u00cf\u00d1\t\7\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7-\2\2\u00d6\u00c5\3\2"+
		"\2\2\u00d6\u00c9\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cb\3\2\2\2\u00d6"+
		"\u00cc\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7#\3\2\2\2"+
		"\u00d8\u00dc\7,\2\2\u00d9\u00db\t\7\2\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e3\7-\2\2\u00e0\u00e3\7\25\2\2\u00e1\u00e3\7\22"+
		"\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"%\3\2\2\2\23)/;DIhmx\u0088\u0093\u00a9\u00c0\u00c2\u00d2\u00d6\u00dc\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
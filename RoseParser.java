// Generated from Rose.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, DECLARE=2, ELSE=3, END=4, EXIT=5, FOR=6, IF=7, IN=8, INTEGER=9, 
		IS=10, LOOP=11, PROCEDURE=12, READ=13, THEN=14, WRITE=15, ID=16, CONST=17, 
		COLON=18, OP1=19, SEMICOLON=20, ADD=21, SUB=22, MUL=23, DIV=24, PERCENT=25, 
		EQUAL=26, OP2=27, GREATER=28, GREEQU=29, LESS=30, LESEQU=31, AND=32, OR=33, 
		EXCLAMATION=34, OP3=35, LP=36, RP=37, WHITESPACE=38, COMMENT=39;
	public static final int
		RULE_program = 0, RULE_variables = 1, RULE_variable = 2, RULE_statements = 3, 
		RULE_statements_ = 4, RULE_statement = 5, RULE_assignment_statement = 6, 
		RULE_if_statement = 7, RULE_if_statement_ = 8, RULE_for_statement = 9, 
		RULE_exit_statement = 10, RULE_read_statement = 11, RULE_write_statement = 12, 
		RULE_bool_expression = 13, RULE_bool_expression_ = 14, RULE_bool_term = 15, 
		RULE_bool_term_ = 16, RULE_bool_factor = 17, RULE_bool_primary = 18, RULE_relation_op = 19, 
		RULE_arith_expression = 20, RULE_arith_expression_ = 21, RULE_arith_term = 22, 
		RULE_arith_term_ = 23, RULE_arith_factor = 24, RULE_arith_primary = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variables", "variable", "statements", "statements_", "statement", 
			"assignment_statement", "if_statement", "if_statement_", "for_statement", 
			"exit_statement", "read_statement", "write_statement", "bool_expression", 
			"bool_expression_", "bool_term", "bool_term_", "bool_factor", "bool_primary", 
			"relation_op", "arith_expression", "arith_expression_", "arith_term", 
			"arith_term_", "arith_factor", "arith_primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", "'for'", "'if'", 
			"'in'", "'integer'", "'is'", "'loop'", "'procedure'", "'read'", "'then'", 
			"'write'", null, null, "':'", "'..'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", 
			"':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", "IF", "IN", "INTEGER", 
			"IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", "ID", "CONST", "COLON", 
			"OP1", "SEMICOLON", "ADD", "SUB", "MUL", "DIV", "PERCENT", "EQUAL", "OP2", 
			"GREATER", "GREEQU", "LESS", "LESEQU", "AND", "OR", "EXCLAMATION", "OP3", 
			"LP", "RP", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(RoseParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IS() { return getToken(RoseParser.IS, 0); }
		public TerminalNode DECLARE() { return getToken(RoseParser.DECLARE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(RoseParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PROCEDURE);
			setState(53);
			match(ID);
			setState(54);
			match(IS);
			setState(55);
			match(DECLARE);
			 System.out.println("\t" + ".data"); 
			setState(57);
			variables();
			setState(58);
			match(BEGIN);
			 System.out.println("\t" + ".text"); System.out.println("main:"); 
			setState(60);
			statements(0,1);
			setState(61);
			match(END);
			setState(62);
			match(SEMICOLON);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				variable();
				setState(65);
				variables();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VariableContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COLON() { return getToken(RoseParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((VariableContext)_localctx).ID = match(ID);
			setState(71);
			match(COLON);
			setState(72);
			match(INTEGER);
			setState(73);
			match(SEMICOLON);
			System.out.println((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null) +":\t.word\t 0");
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Statements_Context statements_;
		public Statements_Context statements_() {
			return getRuleContext(Statements_Context.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((StatementsContext)_localctx).statements_ = statements_(_localctx.reg,_localctx.label);

					((StatementsContext)_localctx).nreg = ((StatementsContext)_localctx).statements_.nreg;
					((StatementsContext)_localctx).nlabel = ((StatementsContext)_localctx).statements_.nlabel;
				
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

	public static class Statements_Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public Statements_Context statements_;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements_Context statements_() {
			return getRuleContext(Statements_Context.class,0);
		}
		public Statements_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements_Context(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements_(this);
		}
	}

	public final Statements_Context statements_(int reg,int label) throws RecognitionException {
		Statements_Context _localctx = new Statements_Context(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statements_);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Statements_Context)_localctx).statement = statement(_localctx.reg,_localctx.label);

						((Statements_Context)_localctx).reg = ((Statements_Context)_localctx).statement.nreg;
						((Statements_Context)_localctx).label = ((Statements_Context)_localctx).statement.nlabel;
					
				setState(81);
				((Statements_Context)_localctx).statements_ = statements_(_localctx.reg,_localctx.label);

						((Statements_Context)_localctx).nreg = ((Statements_Context)_localctx).statements_.nreg;
						((Statements_Context)_localctx).nlabel = ((Statements_Context)_localctx).statements_.nlabel;
					
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{

						((Statements_Context)_localctx).nreg = _localctx.reg;
						((Statements_Context)_localctx).nlabel = _localctx.label;
					
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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Assignment_statementContext assignment_statement;
		public If_statementContext if_statement;
		public For_statementContext for_statement;
		public Read_statementContext read_statement;
		public Write_statementContext write_statement;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((StatementContext)_localctx).assignment_statement = assignment_statement(_localctx.reg);

						((StatementContext)_localctx).nreg = ((StatementContext)_localctx).assignment_statement.nreg;
						((StatementContext)_localctx).nlabel = _localctx.label;
					
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((StatementContext)_localctx).if_statement = if_statement(_localctx.reg,_localctx.label);

						((StatementContext)_localctx).nreg = ((StatementContext)_localctx).if_statement.nreg;
						((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).if_statement.nlabel;
					
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				((StatementContext)_localctx).for_statement = for_statement(_localctx.reg,_localctx.label);

						((StatementContext)_localctx).nreg = ((StatementContext)_localctx).for_statement.nreg;
						((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).for_statement.nlabel;
					
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				exit_statement();

						((StatementContext)_localctx).nreg = _localctx.reg;
						((StatementContext)_localctx).nlabel = _localctx.label;
					
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				((StatementContext)_localctx).read_statement = read_statement(_localctx.reg);

						((StatementContext)_localctx).nreg = ((StatementContext)_localctx).read_statement.nreg;
						((StatementContext)_localctx).nlabel = _localctx.label;
					
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				((StatementContext)_localctx).write_statement = write_statement(_localctx.reg);

						((StatementContext)_localctx).nreg = ((StatementContext)_localctx).write_statement.nreg;
						((StatementContext)_localctx).nlabel = _localctx.label;
					
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode OP3() { return getToken(RoseParser.OP3, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement(int reg) throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 12, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(108);
			match(OP3);
			setState(109);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(110);
			match(SEMICOLON);

					((Assignment_statementContext)_localctx).reg =  ((Assignment_statementContext)_localctx).arith_expression.nreg;
					System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((Assignment_statementContext)_localctx).ID!=null?((Assignment_statementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$t" + (_localctx.reg - 1) + ",\t0($t" + (_localctx.reg) + ")");
					((Assignment_statementContext)_localctx).nreg = ((Assignment_statementContext)_localctx).arith_expression.nreg-1;
				
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

	public static class If_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public If_statement_Context if_statement_;
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_Context if_statement_() {
			return getRuleContext(If_statement_Context.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement(int reg,int label) throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IF);

					int t=_localctx.label++;
					int f=_localctx.label++;
					int end=_localctx.label++;
				
			setState(115);
			((If_statementContext)_localctx).bool_expression = bool_expression(_localctx.reg, _localctx.label, t, f);
			setState(116);
			match(THEN);

					System.out.println("L" + t + ":");
					((If_statementContext)_localctx).label = ((If_statementContext)_localctx).bool_expression.nlabel;
				
			setState(118);
			((If_statementContext)_localctx).statements = statements(_localctx.reg,_localctx.label);

					((If_statementContext)_localctx).reg = ((If_statementContext)_localctx).statements.nreg;
					((If_statementContext)_localctx).label = ((If_statementContext)_localctx).statements.nlabel;
				
			setState(120);
			((If_statementContext)_localctx).if_statement_ = if_statement_(_localctx.reg,_localctx.label,f,end);

					((If_statementContext)_localctx).nreg = ((If_statementContext)_localctx).if_statement_.nreg;
					((If_statementContext)_localctx).nlabel = ((If_statementContext)_localctx).if_statement_.nlabel;
				
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

	public static class If_statement_Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int f;
		public int end;
		public int nreg;
		public int nlabel;
		public StatementsContext statements;
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statement_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statement_Context(ParserRuleContext parent, int invokingState, int reg, int label, int f, int end) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.f = f;
			this.end = end;
		}
		@Override public int getRuleIndex() { return RULE_if_statement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement_(this);
		}
	}

	public final If_statement_Context if_statement_(int reg,int label,int f,int end) throws RecognitionException {
		If_statement_Context _localctx = new If_statement_Context(_ctx, getState(), reg, label, f, end);
		enterRule(_localctx, 16, RULE_if_statement_);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{

						System.out.println("L" + f + ":");
						((If_statement_Context)_localctx).nlabel = _localctx.label;
						((If_statement_Context)_localctx).nreg = _localctx.reg;
					
				setState(124);
				match(END);
				setState(125);
				match(IF);
				setState(126);
				match(SEMICOLON);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ELSE);

						System.out.println("\tb\tL" + end);
						System.out.println("L" + f + ":");
					
				setState(129);
				((If_statement_Context)_localctx).statements = statements(_localctx.reg,_localctx.label);

						System.out.println("L" + end + ":");
						((If_statement_Context)_localctx).nlabel =  ((If_statement_Context)_localctx).statements.nlabel;
						((If_statement_Context)_localctx).nreg =  ((If_statement_Context)_localctx).statements.nreg;
					
				setState(131);
				match(END);
				setState(132);
				match(IF);
				setState(133);
				match(SEMICOLON);
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

	public static class For_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode OP1() { return getToken(RoseParser.OP1, 0); }
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement(int reg,int label) throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 18, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{

					int cmp=_localctx.label++;
					int t=_localctx.label++;
					int f=_localctx.label++;
				
			setState(138);
			match(FOR);
			setState(139);
			((For_statementContext)_localctx).ID = match(ID);
			setState(140);
			match(IN);
			setState(141);
			((For_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);

					((For_statementContext)_localctx).reg = ((For_statementContext)_localctx).arith_expression.nreg;
					System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$t" + (_localctx.reg - 1) + ",\t0($t" + (_localctx.reg) + ")");
					System.out.println("L" + cmp + ":");
					System.out.println("\tla\t$t" + (_localctx.reg-1) + ",\t" + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\tlw\t$t" + (_localctx.reg-1) + ",\t0($t" + (_localctx.reg-1) + ")");
				
			setState(143);
			match(OP1);
			setState(144);
			((For_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);

					System.out.println("\tble\t$t0,\t$t1,\tL" + t);
					System.out.println("\tb\tL" + f);
					System.out.println("L" + t +":");
					((For_statementContext)_localctx).reg = _localctx.reg-1;
				
			setState(146);
			match(LOOP);
			setState(147);
			statements(_localctx.reg,_localctx.label);

					System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\tlw\t$t" + (_localctx.reg) + ",\t0($t" + (_localctx.reg) + ")");
					System.out.println("\tli\t$t" +(_localctx.reg+1)+ "\t1");
					System.out.println("\tadd\t$t" + (_localctx.reg) + ",\t$t" + (_localctx.reg) + ",\t$t" + (_localctx.reg+1));
					System.out.println("\tla\t$t" + (_localctx.reg+1) + ",\t" + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$t" + (_localctx.reg) + ",\t0($t" + (_localctx.reg+1) + ")");
					System.out.println("\tb\tL" + cmp);
					System.out.println("L" + f +":");
				
			setState(149);
			match(END);
			setState(150);
			match(LOOP);
			setState(151);
			match(SEMICOLON);
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(RoseParser.EXIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(EXIT);
			setState(154);
			match(SEMICOLON);

				System.out.println("\tli\t$v0,\t10");
				System.out.println("\tsyscall");
				
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

	public static class Read_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Token ID;
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement(int reg) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 22, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(READ);
			setState(158);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(159);
			match(SEMICOLON);

					System.out.println("\tli\t$v0,\t5");
					System.out.println("\tsyscall");
					System.out.println("\tla\t$t" + _localctx.reg + ",\t" + (((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null));
					System.out.println("\tsw\t$v0,\t0($t" + _localctx.reg + ")");
					((Read_statementContext)_localctx).nreg =  _localctx.reg;
				
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

	public static class Write_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Arith_expressionContext arith_expression;
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RoseParser.SEMICOLON, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement(int reg) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 24, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WRITE);
			setState(163);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(164);
			match(SEMICOLON);

					System.out.println("\tmove\t$a0,\t$t" + ((Write_statementContext)_localctx).arith_expression.place);
					System.out.println("\tli\t$v0,\t1");
					System.out.println("\tsyscall");
					((Write_statementContext)_localctx).nreg = ((Write_statementContext)_localctx).arith_expression.nreg-1; 
				
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expression_Context bool_expression_;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression(int reg,int label,int t,int f) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 26, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((Bool_expressionContext)_localctx).reg = ((Bool_expressionContext)_localctx).bool_term.nreg;
					((Bool_expressionContext)_localctx).label = ((Bool_expressionContext)_localctx).bool_term.nlabel;
					((Bool_expressionContext)_localctx).t = ((Bool_expressionContext)_localctx).bool_term.nt;
					((Bool_expressionContext)_localctx).f = ((Bool_expressionContext)_localctx).bool_term.nf;
					System.out.println("\t$t" + (_localctx.reg - 2) + ",\t$t" + (_localctx.reg-1) + ",\tL" + _localctx.t);
					((Bool_expressionContext)_localctx).reg =  _localctx.reg - 2;
				
			setState(169);
			((Bool_expressionContext)_localctx).bool_expression_ = bool_expression_(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((Bool_expressionContext)_localctx).t = ((Bool_expressionContext)_localctx).bool_expression_.nt;
					((Bool_expressionContext)_localctx).f = ((Bool_expressionContext)_localctx).bool_expression_.nf;
					System.out.println("\tb\tL" + _localctx.f);
					((Bool_expressionContext)_localctx).nreg = ((Bool_expressionContext)_localctx).bool_expression_.nreg;
					((Bool_expressionContext)_localctx).nlabel = ((Bool_expressionContext)_localctx).bool_expression_.nlabel;
				
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

	public static class Bool_expression_Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public Bool_termContext bool_term;
		public Bool_expression_Context bool_expression_;
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression_Context bool_expression_() {
			return getRuleContext(Bool_expression_Context.class,0);
		}
		public Bool_expression_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression_Context(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression_(this);
		}
	}

	public final Bool_expression_Context bool_expression_(int reg,int label,int t,int f) throws RecognitionException {
		Bool_expression_Context _localctx = new Bool_expression_Context(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 28, RULE_bool_expression_);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{

						System.out.println("\tb\tL" + _localctx.label);
						System.out.println("L" + _localctx.label + ":");
						((Bool_expression_Context)_localctx).label =  _localctx.label + 1;
					
				setState(173);
				match(OR);
				setState(174);
				((Bool_expression_Context)_localctx).bool_term = bool_term(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((Bool_expression_Context)_localctx).reg = ((Bool_expression_Context)_localctx).bool_term.nreg;
						((Bool_expression_Context)_localctx).label = ((Bool_expression_Context)_localctx).bool_term.nlabel;
						((Bool_expression_Context)_localctx).t = ((Bool_expression_Context)_localctx).bool_term.nt;
						((Bool_expression_Context)_localctx).f = ((Bool_expression_Context)_localctx).bool_term.nf;
					
				setState(176);
				((Bool_expression_Context)_localctx).bool_expression_ = bool_expression_(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((Bool_expression_Context)_localctx).t = ((Bool_expression_Context)_localctx).bool_expression_.nt;
						((Bool_expression_Context)_localctx).f = ((Bool_expression_Context)_localctx).bool_expression_.nf;
						System.out.println("\t$t" + (_localctx.reg - 2) + ",\t$t" + (_localctx.reg-1) + ",\tL" + _localctx.t);	
						((Bool_expression_Context)_localctx).nreg = ((Bool_expression_Context)_localctx).bool_expression_.nreg;
						((Bool_expression_Context)_localctx).nlabel = ((Bool_expression_Context)_localctx).bool_expression_.nlabel;
						((Bool_expression_Context)_localctx).nt =  _localctx.t;
						((Bool_expression_Context)_localctx).nf =  _localctx.f;
					
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{

						((Bool_expression_Context)_localctx).nreg =  _localctx.reg;
						((Bool_expression_Context)_localctx).nlabel =  _localctx.label;
						((Bool_expression_Context)_localctx).nt =  _localctx.t;
						((Bool_expression_Context)_localctx).nf =  _localctx.f;
					
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

	public static class Bool_termContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public Bool_factorContext bool_factor;
		public Bool_term_Context bool_term_;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term(int reg,int label,int t,int f) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 30, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((Bool_termContext)_localctx).reg = ((Bool_termContext)_localctx).bool_factor.nreg;
					((Bool_termContext)_localctx).t = ((Bool_termContext)_localctx).bool_factor.nt;
					((Bool_termContext)_localctx).f = ((Bool_termContext)_localctx).bool_factor.nf;
				
			setState(184);
			((Bool_termContext)_localctx).bool_term_ = bool_term_(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((Bool_termContext)_localctx).nreg = ((Bool_termContext)_localctx).bool_term_.nreg;
					((Bool_termContext)_localctx).nlabel = ((Bool_termContext)_localctx).bool_term_.nlabel;
					((Bool_termContext)_localctx).nt = ((Bool_termContext)_localctx).bool_term_.nt;
					((Bool_termContext)_localctx).nf = ((Bool_termContext)_localctx).bool_term_.nf;
				
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

	public static class Bool_term_Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public Bool_factorContext bool_factor;
		public Bool_term_Context bool_term_;
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term_Context bool_term_() {
			return getRuleContext(Bool_term_Context.class,0);
		}
		public Bool_term_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term_Context(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_term_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term_(this);
		}
	}

	public final Bool_term_Context bool_term_(int reg,int label,int t,int f) throws RecognitionException {
		Bool_term_Context _localctx = new Bool_term_Context(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 32, RULE_bool_term_);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{

						System.out.println("\t$t" + (_localctx.reg - 2) + ",\t$t" + (_localctx.reg-1) + ",\tL" + _localctx.label);
						System.out.println("\tb\tL" + _localctx.f);
						System.out.println("L" + _localctx.label + ":");
						((Bool_term_Context)_localctx).label =  _localctx.label + 1;
						((Bool_term_Context)_localctx).reg =  _localctx.reg - 2;
					
				setState(188);
				match(AND);
				setState(189);
				((Bool_term_Context)_localctx).bool_factor = bool_factor(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((Bool_term_Context)_localctx).reg = ((Bool_term_Context)_localctx).bool_factor.nreg;
						((Bool_term_Context)_localctx).t = ((Bool_term_Context)_localctx).bool_factor.nt;
						((Bool_term_Context)_localctx).f = ((Bool_term_Context)_localctx).bool_factor.nf;
					
				setState(191);
				((Bool_term_Context)_localctx).bool_term_ = bool_term_(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((Bool_term_Context)_localctx).nreg = ((Bool_term_Context)_localctx).bool_term_.nreg;
						((Bool_term_Context)_localctx).nlabel = ((Bool_term_Context)_localctx).bool_term_.nlabel;
						((Bool_term_Context)_localctx).nt = ((Bool_term_Context)_localctx).bool_term_.nt;
						((Bool_term_Context)_localctx).nf = ((Bool_term_Context)_localctx).bool_term_.nf;
					
				}
				break;
			case THEN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{

						((Bool_term_Context)_localctx).nreg =  _localctx.reg;
						((Bool_term_Context)_localctx).nlabel =  _localctx.label;
						((Bool_term_Context)_localctx).nt =  _localctx.t;
						((Bool_term_Context)_localctx).nf =  _localctx.f;
					
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

	public static class Bool_factorContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nt;
		public int nf;
		public Bool_primaryContext bool_primary;
		public TerminalNode EXCLAMATION() { return getToken(RoseParser.EXCLAMATION, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor(int reg,int label,int t,int f) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 34, RULE_bool_factor);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(EXCLAMATION);
				setState(198);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg, _localctx.label, _localctx.t, _localctx.f);

						((Bool_factorContext)_localctx).nt = ((Bool_factorContext)_localctx).bool_primary.nf;
						((Bool_factorContext)_localctx).nf = ((Bool_factorContext)_localctx).bool_primary.nt;
						((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg;
					
				}
				break;
			case ID:
			case CONST:
			case SUB:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg, _localctx.label, _localctx.t, _localctx.f);

						((Bool_factorContext)_localctx).nt =  _localctx.t;
						((Bool_factorContext)_localctx).nf =  _localctx.f;
						((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg;
					
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

	public static class Bool_primaryContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nt;
		public int nf;
		public Arith_expressionContext arith_expression;
		public Relation_opContext relation_op;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary(int reg,int label,int t,int f) throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 36, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(207);
			((Bool_primaryContext)_localctx).relation_op = relation_op();

					((Bool_primaryContext)_localctx).reg = ((Bool_primaryContext)_localctx).arith_expression.nreg;
				
			setState(209);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);

					((Bool_primaryContext)_localctx).nreg = ((Bool_primaryContext)_localctx).arith_expression.nreg;
					((Bool_primaryContext)_localctx).nt = _localctx.t;
					((Bool_primaryContext)_localctx).nf = _localctx.f;
					System.out.print("\t"+((Bool_primaryContext)_localctx).relation_op.opcode);
				
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

	public static class Relation_opContext extends ParserRuleContext {
		public String opcode;
		public TerminalNode EQUAL() { return getToken(RoseParser.EQUAL, 0); }
		public TerminalNode OP2() { return getToken(RoseParser.OP2, 0); }
		public TerminalNode GREATER() { return getToken(RoseParser.GREATER, 0); }
		public TerminalNode GREEQU() { return getToken(RoseParser.GREEQU, 0); }
		public TerminalNode LESS() { return getToken(RoseParser.LESS, 0); }
		public TerminalNode LESEQU() { return getToken(RoseParser.LESEQU, 0); }
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relation_op);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(EQUAL);
				((Relation_opContext)_localctx).opcode = "beq";
				}
				break;
			case OP2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(OP2);
				((Relation_opContext)_localctx).opcode = "bne";
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(GREATER);
				((Relation_opContext)_localctx).opcode = "bgt";
				}
				break;
			case GREEQU:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(GREEQU);
				((Relation_opContext)_localctx).opcode = "bge";
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(LESS);
				((Relation_opContext)_localctx).opcode = "blt";
				}
				break;
			case LESEQU:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(LESEQU);
				((Relation_opContext)_localctx).opcode = "ble";
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression_Context arith_expression_;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 40, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);

					((Arith_expressionContext)_localctx).reg = ((Arith_expressionContext)_localctx).arith_term.nreg;
					((Arith_expressionContext)_localctx).place = ((Arith_expressionContext)_localctx).arith_term.place;
				
			setState(228);
			((Arith_expressionContext)_localctx).arith_expression_ = arith_expression_(_localctx.reg,_localctx.place);

					((Arith_expressionContext)_localctx).nreg = ((Arith_expressionContext)_localctx).arith_expression_.nreg;
					((Arith_expressionContext)_localctx).place = ((Arith_expressionContext)_localctx).arith_expression_.place;
				
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

	public static class Arith_expression_Context extends ParserRuleContext {
		public int reg;
		public int lplace;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression_Context arith_expression_;
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression_Context arith_expression_() {
			return getRuleContext(Arith_expression_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_expression_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression_Context(ParserRuleContext parent, int invokingState, int reg, int lplace) {
			super(parent, invokingState);
			this.reg = reg;
			this.lplace = lplace;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression_(this);
		}
	}

	public final Arith_expression_Context arith_expression_(int reg,int lplace) throws RecognitionException {
		Arith_expression_Context _localctx = new Arith_expression_Context(_ctx, getState(), reg, lplace);
		enterRule(_localctx, 42, RULE_arith_expression_);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ADD);
				setState(232);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);

						((Arith_expression_Context)_localctx).place = ((Arith_expression_Context)_localctx).arith_term.place;
						System.out.println("\tadd\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.place));
						((Arith_expression_Context)_localctx).reg =  ((Arith_expression_Context)_localctx).arith_term.nreg-1;
					
				setState(234);
				((Arith_expression_Context)_localctx).arith_expression_ = arith_expression_(_localctx.reg,_localctx.lplace);

						((Arith_expression_Context)_localctx).nreg = ((Arith_expression_Context)_localctx).arith_expression_.nreg;
						((Arith_expression_Context)_localctx).place = ((Arith_expression_Context)_localctx).arith_expression_.place;
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(SUB);
				setState(238);
				((Arith_expression_Context)_localctx).arith_term = arith_term(_localctx.reg);

						((Arith_expression_Context)_localctx).reg =  ((Arith_expression_Context)_localctx).arith_term.nreg;
						((Arith_expression_Context)_localctx).place = ((Arith_expression_Context)_localctx).arith_term.place;
						System.out.println("\tsub\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.place));
					
				setState(240);
				((Arith_expression_Context)_localctx).arith_expression_ = arith_expression_(_localctx.reg,_localctx.lplace);

						((Arith_expression_Context)_localctx).nreg = ((Arith_expression_Context)_localctx).arith_expression_.nreg-1;
						((Arith_expression_Context)_localctx).place = ((Arith_expression_Context)_localctx).arith_expression_.place;
					
				}
				break;
			case LOOP:
			case THEN:
			case OP1:
			case SEMICOLON:
			case EQUAL:
			case OP2:
			case GREATER:
			case GREEQU:
			case LESS:
			case LESEQU:
			case AND:
			case OR:
			case RP:
				enterOuterAlt(_localctx, 3);
				{

						((Arith_expression_Context)_localctx).nreg = _localctx.reg;
						((Arith_expression_Context)_localctx).place = _localctx.lplace;
					
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

	public static class Arith_termContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term_Context arith_term_;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 44, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);

					((Arith_termContext)_localctx).reg = ((Arith_termContext)_localctx).arith_factor.nreg;
					((Arith_termContext)_localctx).place = ((Arith_termContext)_localctx).arith_factor.place;
				
			setState(248);
			((Arith_termContext)_localctx).arith_term_ = arith_term_(_localctx.reg,_localctx.place);

					((Arith_termContext)_localctx).nreg = ((Arith_termContext)_localctx).arith_term_.nreg;
					((Arith_termContext)_localctx).place = ((Arith_termContext)_localctx).arith_term_.place;
				
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

	public static class Arith_term_Context extends ParserRuleContext {
		public int reg;
		public int lplace;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term_Context arith_term_;
		public TerminalNode MUL() { return getToken(RoseParser.MUL, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term_Context arith_term_() {
			return getRuleContext(Arith_term_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(RoseParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(RoseParser.PERCENT, 0); }
		public Arith_term_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term_Context(ParserRuleContext parent, int invokingState, int reg, int lplace) {
			super(parent, invokingState);
			this.reg = reg;
			this.lplace = lplace;
		}
		@Override public int getRuleIndex() { return RULE_arith_term_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term_(this);
		}
	}

	public final Arith_term_Context arith_term_(int reg,int lplace) throws RecognitionException {
		Arith_term_Context _localctx = new Arith_term_Context(_ctx, getState(), reg, lplace);
		enterRule(_localctx, 46, RULE_arith_term_);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(MUL);
				setState(252);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);

						((Arith_term_Context)_localctx).place =  ((Arith_term_Context)_localctx).arith_factor.place;
						System.out.println("\tmul\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.place));
						((Arith_term_Context)_localctx).reg =  ((Arith_term_Context)_localctx).arith_factor.nreg-1;
					
				setState(254);
				((Arith_term_Context)_localctx).arith_term_ = arith_term_(_localctx.reg,_localctx.lplace);

						((Arith_term_Context)_localctx).nreg = ((Arith_term_Context)_localctx).arith_term_.nreg;
						((Arith_term_Context)_localctx).place = ((Arith_term_Context)_localctx).arith_term_.place;
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(DIV);
				setState(258);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);

						((Arith_term_Context)_localctx).reg =  ((Arith_term_Context)_localctx).arith_factor.nreg;
						((Arith_term_Context)_localctx).place =  ((Arith_term_Context)_localctx).arith_factor.place;
						System.out.println("\tdiv\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.place));
					
				setState(260);
				((Arith_term_Context)_localctx).arith_term_ = arith_term_(_localctx.reg,_localctx.lplace);

						((Arith_term_Context)_localctx).nreg = ((Arith_term_Context)_localctx).arith_term_.nreg-1;
						((Arith_term_Context)_localctx).place = ((Arith_term_Context)_localctx).arith_term_.place;
					
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(PERCENT);
				setState(264);
				((Arith_term_Context)_localctx).arith_factor = arith_factor(_localctx.reg);

						((Arith_term_Context)_localctx).reg =  ((Arith_term_Context)_localctx).arith_factor.nreg;
						((Arith_term_Context)_localctx).place =  ((Arith_term_Context)_localctx).arith_factor.place;
						System.out.println("\trem\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.lplace) + ",\t$t" + (_localctx.place));
					
				setState(266);
				((Arith_term_Context)_localctx).arith_term_ = arith_term_(_localctx.reg,_localctx.lplace);

						((Arith_term_Context)_localctx).nreg = ((Arith_term_Context)_localctx).arith_term_.nreg-1;
						((Arith_term_Context)_localctx).place = ((Arith_term_Context)_localctx).arith_term_.place;
					
				}
				break;
			case LOOP:
			case THEN:
			case OP1:
			case SEMICOLON:
			case ADD:
			case SUB:
			case EQUAL:
			case OP2:
			case GREATER:
			case GREEQU:
			case LESS:
			case LESEQU:
			case AND:
			case OR:
			case RP:
				enterOuterAlt(_localctx, 4);
				{

						((Arith_term_Context)_localctx).nreg = _localctx.reg;
						((Arith_term_Context)_localctx).place = _localctx.lplace;
					
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

	public static class Arith_factorContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_primaryContext arith_primary;
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 48, RULE_arith_factor);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(SUB);
				setState(273);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);

						((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
						((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).arith_primary.place;
						System.out.println("\tneg\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place));
					
				}
				break;
			case ID:
			case CONST:
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);

						((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
						((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).arith_primary.place;
					
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

	public static class Arith_primaryContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Token CONST;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode LP() { return getToken(RoseParser.LP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(RoseParser.RP, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_primary(this);
		}
	}

	public final Arith_primaryContext arith_primary(int reg) throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 50, RULE_arith_primary);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((Arith_primaryContext)_localctx).CONST = match(CONST);

						System.out.println("\tli\t$t" + (_localctx.reg) + ",\t" + (((Arith_primaryContext)_localctx).CONST!=null?((Arith_primaryContext)_localctx).CONST.getText():null));
						((Arith_primaryContext)_localctx).nreg = _localctx.reg+1;
						((Arith_primaryContext)_localctx).place = _localctx.reg;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Arith_primaryContext)_localctx).ID = match(ID);

						System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((Arith_primaryContext)_localctx).ID!=null?((Arith_primaryContext)_localctx).ID.getText():null));
						System.out.println("\tlw\t$t" + (_localctx.reg) + ",\t0($t" + (_localctx.reg) + ")");
						((Arith_primaryContext)_localctx).nreg =  _localctx.reg + 1;
						((Arith_primaryContext)_localctx).place = _localctx.reg;
					
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(LP);
				setState(286);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(287);
				match(RP);

						((Arith_primaryContext)_localctx).nreg = ((Arith_primaryContext)_localctx).arith_expression.nreg;
						((Arith_primaryContext)_localctx).place = ((Arith_primaryContext)_localctx).arith_expression.place;
					
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e3\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00f7\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0111\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011a\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0125\n\33\3\33"+
		"\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2"+
		"\u0124\2\66\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bN\3\2\2\2\nW\3\2\2\2\fk\3\2"+
		"\2\2\16m\3\2\2\2\20s\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2\26\u009b"+
		"\3\2\2\2\30\u009f\3\2\2\2\32\u00a4\3\2\2\2\34\u00a9\3\2\2\2\36\u00b6\3"+
		"\2\2\2 \u00b8\3\2\2\2\"\u00c5\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00e2"+
		"\3\2\2\2*\u00e4\3\2\2\2,\u00f6\3\2\2\2.\u00f8\3\2\2\2\60\u0110\3\2\2\2"+
		"\62\u0119\3\2\2\2\64\u0124\3\2\2\2\66\67\7\16\2\2\678\7\22\2\289\7\f\2"+
		"\29:\7\4\2\2:;\b\2\1\2;<\5\4\3\2<=\7\3\2\2=>\b\2\1\2>?\5\b\5\2?@\7\6\2"+
		"\2@A\7\26\2\2A\3\3\2\2\2BC\5\6\4\2CD\5\4\3\2DG\3\2\2\2EG\3\2\2\2FB\3\2"+
		"\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\22\2\2IJ\7\24\2\2JK\7\13\2\2KL\7\26\2\2"+
		"LM\b\4\1\2M\7\3\2\2\2NO\5\n\6\2OP\b\5\1\2P\t\3\2\2\2QR\5\f\7\2RS\b\6\1"+
		"\2ST\5\n\6\2TU\b\6\1\2UX\3\2\2\2VX\b\6\1\2WQ\3\2\2\2WV\3\2\2\2X\13\3\2"+
		"\2\2YZ\5\16\b\2Z[\b\7\1\2[l\3\2\2\2\\]\5\20\t\2]^\b\7\1\2^l\3\2\2\2_`"+
		"\5\24\13\2`a\b\7\1\2al\3\2\2\2bc\5\26\f\2cd\b\7\1\2dl\3\2\2\2ef\5\30\r"+
		"\2fg\b\7\1\2gl\3\2\2\2hi\5\32\16\2ij\b\7\1\2jl\3\2\2\2kY\3\2\2\2k\\\3"+
		"\2\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\r\3\2\2\2mn\7\22\2\2n"+
		"o\7%\2\2op\5*\26\2pq\7\26\2\2qr\b\b\1\2r\17\3\2\2\2st\7\t\2\2tu\b\t\1"+
		"\2uv\5\34\17\2vw\7\20\2\2wx\b\t\1\2xy\5\b\5\2yz\b\t\1\2z{\5\22\n\2{|\b"+
		"\t\1\2|\21\3\2\2\2}~\b\n\1\2~\177\7\6\2\2\177\u0080\7\t\2\2\u0080\u008a"+
		"\7\26\2\2\u0081\u0082\7\5\2\2\u0082\u0083\b\n\1\2\u0083\u0084\5\b\5\2"+
		"\u0084\u0085\b\n\1\2\u0085\u0086\7\6\2\2\u0086\u0087\7\t\2\2\u0087\u0088"+
		"\7\26\2\2\u0088\u008a\3\2\2\2\u0089}\3\2\2\2\u0089\u0081\3\2\2\2\u008a"+
		"\23\3\2\2\2\u008b\u008c\b\13\1\2\u008c\u008d\7\b\2\2\u008d\u008e\7\22"+
		"\2\2\u008e\u008f\7\n\2\2\u008f\u0090\5*\26\2\u0090\u0091\b\13\1\2\u0091"+
		"\u0092\7\25\2\2\u0092\u0093\5*\26\2\u0093\u0094\b\13\1\2\u0094\u0095\7"+
		"\r\2\2\u0095\u0096\5\b\5\2\u0096\u0097\b\13\1\2\u0097\u0098\7\6\2\2\u0098"+
		"\u0099\7\r\2\2\u0099\u009a\7\26\2\2\u009a\25\3\2\2\2\u009b\u009c\7\7\2"+
		"\2\u009c\u009d\7\26\2\2\u009d\u009e\b\f\1\2\u009e\27\3\2\2\2\u009f\u00a0"+
		"\7\17\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\b\r\1"+
		"\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\5*\26\2\u00a6\u00a7"+
		"\7\26\2\2\u00a7\u00a8\b\16\1\2\u00a8\33\3\2\2\2\u00a9\u00aa\5 \21\2\u00aa"+
		"\u00ab\b\17\1\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\b\17\1\2\u00ad\35\3"+
		"\2\2\2\u00ae\u00af\b\20\1\2\u00af\u00b0\7#\2\2\u00b0\u00b1\5 \21\2\u00b1"+
		"\u00b2\b\20\1\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\b\20\1\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b7\b\20\1\2\u00b6\u00ae\3\2\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\37\3\2\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\b\21\1\2\u00ba\u00bb"+
		"\5\"\22\2\u00bb\u00bc\b\21\1\2\u00bc!\3\2\2\2\u00bd\u00be\b\22\1\2\u00be"+
		"\u00bf\7\"\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\b\22\1\2\u00c1\u00c2\5"+
		"\"\22\2\u00c2\u00c3\b\22\1\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\b\22\1\2"+
		"\u00c5\u00bd\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00c8\7"+
		"$\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\b\23\1\2\u00ca\u00cf\3\2\2\2\u00cb"+
		"\u00cc\5&\24\2\u00cc\u00cd\b\23\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00c7\3"+
		"\2\2\2\u00ce\u00cb\3\2\2\2\u00cf%\3\2\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2"+
		"\5(\25\2\u00d2\u00d3\b\24\1\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\b\24\1\2"+
		"\u00d5\'\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00e3\b\25\1\2\u00d8\u00d9"+
		"\7\35\2\2\u00d9\u00e3\b\25\1\2\u00da\u00db\7\36\2\2\u00db\u00e3\b\25\1"+
		"\2\u00dc\u00dd\7\37\2\2\u00dd\u00e3\b\25\1\2\u00de\u00df\7 \2\2\u00df"+
		"\u00e3\b\25\1\2\u00e0\u00e1\7!\2\2\u00e1\u00e3\b\25\1\2\u00e2\u00d6\3"+
		"\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2"+
		"\u00de\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e5\5.\30\2"+
		"\u00e5\u00e6\b\26\1\2\u00e6\u00e7\5,\27\2\u00e7\u00e8\b\26\1\2\u00e8+"+
		"\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\b\27\1\2"+
		"\u00ec\u00ed\5,\27\2\u00ed\u00ee\b\27\1\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0"+
		"\7\30\2\2\u00f0\u00f1\5.\30\2\u00f1\u00f2\b\27\1\2\u00f2\u00f3\5,\27\2"+
		"\u00f3\u00f4\b\27\1\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\b\27\1\2\u00f6\u00e9"+
		"\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7-\3\2\2\2\u00f8"+
		"\u00f9\5\62\32\2\u00f9\u00fa\b\30\1\2\u00fa\u00fb\5\60\31\2\u00fb\u00fc"+
		"\b\30\1\2\u00fc/\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\5\62\32\2\u00ff"+
		"\u0100\b\31\1\2\u0100\u0101\5\60\31\2\u0101\u0102\b\31\1\2\u0102\u0111"+
		"\3\2\2\2\u0103\u0104\7\32\2\2\u0104\u0105\5\62\32\2\u0105\u0106\b\31\1"+
		"\2\u0106\u0107\5\60\31\2\u0107\u0108\b\31\1\2\u0108\u0111\3\2\2\2\u0109"+
		"\u010a\7\33\2\2\u010a\u010b\5\62\32\2\u010b\u010c\b\31\1\2\u010c\u010d"+
		"\5\60\31\2\u010d\u010e\b\31\1\2\u010e\u0111\3\2\2\2\u010f\u0111\b\31\1"+
		"\2\u0110\u00fd\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\61\3\2\2\2\u0112\u0113\7\30\2\2\u0113\u0114\5\64\33\2\u0114"+
		"\u0115\b\32\1\2\u0115\u011a\3\2\2\2\u0116\u0117\5\64\33\2\u0117\u0118"+
		"\b\32\1\2\u0118\u011a\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0116\3\2\2\2"+
		"\u011a\63\3\2\2\2\u011b\u011c\7\23\2\2\u011c\u0125\b\33\1\2\u011d\u011e"+
		"\7\22\2\2\u011e\u0125\b\33\1\2\u011f\u0120\7&\2\2\u0120\u0121\5*\26\2"+
		"\u0121\u0122\7\'\2\2\u0122\u0123\b\33\1\2\u0123\u0125\3\2\2\2\u0124\u011b"+
		"\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u011f\3\2\2\2\u0125\65\3\2\2\2\16F"+
		"Wk\u0089\u00b6\u00c5\u00ce\u00e2\u00f6\u0110\u0119\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
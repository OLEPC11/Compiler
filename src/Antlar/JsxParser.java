// Generated from E:/java projects/Compiler Projects/Compiler For Season 1/src/Antlar\JsxParser.g4 by ANTLR 4.10.1
package Antlar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenParen=1, CloseParen=2, OpenBracket=3, CloseBracket=4, OpenBrace=5, 
		CloseBrace=6, Colon=7, LessThan=8, MoreThan=9, Divide=10, Minus=11, Assign=12, 
		SemiColon=13, ARROW=14, Plus=15, Dot=16, From=17, If=18, Else=19, Hashtag=20, 
		QuestionMark=21, Default=22, Export=23, Import=24, Multiply=25, As=26, 
		Return=27, Var=28, Const=29, StrictLet=30, Comma=31, Async=32, BackTick=33, 
		Function_=34, UseEffect=35, UseRef=36, UseState=37, Ellipsis=38, Identifier=39, 
		WS=40, StringLiteral=41, NullLiteral=42, BooleanLiteral=43, DecimalLiteral=44, 
		HexIntegerLiteral=45, OctalIntegerLiteral=46, OctalIntegerLiteral2=47, 
		BinaryIntegerLiteral=48, BigHexIntegerLiteral=49, BigOctalIntegerLiteral=50, 
		BigBinaryIntegerLiteral=51, BigDecimalIntegerLiteral=52, TemplateStringStartExpression=53, 
		TemplateStringAtom=54, TagOpen=55, TagClose=56, TagSlashClose=57, TagSlash=58, 
		TagName=59, AttributeValue=60, Attribute=61, TagEquals=62;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_statementList = 4, RULE_importStatement = 5, RULE_importFromBlock = 6, 
		RULE_moduleItems = 7, RULE_importDefault = 8, RULE_importNamespace = 9, 
		RULE_importFrom = 10, RULE_aliasName = 11, RULE_exportStatement = 12, 
		RULE_declaration = 13, RULE_variableStatement = 14, RULE_variableDeclarationList = 15, 
		RULE_variableDeclaration = 16, RULE_emptyStatement_ = 17, RULE_expressionStatement = 18, 
		RULE_ifStatement = 19, RULE_varModifier = 20, RULE_returnStatement = 21, 
		RULE_functionDeclaration = 22, RULE_formalParameterList = 23, RULE_formalParameterArg = 24, 
		RULE_lastFormalParameterArg = 25, RULE_functionBody = 26, RULE_sourceElements = 27, 
		RULE_arrayLiteral = 28, RULE_elementList = 29, RULE_arrayElement = 30, 
		RULE_propertyAssignment = 31, RULE_propertyName = 32, RULE_arguments = 33, 
		RULE_argument = 34, RULE_expressionSequence = 35, RULE_reactHook = 36, 
		RULE_useEffectHook = 37, RULE_useRefHook = 38, RULE_useStateHook = 39, 
		RULE_singleExpression = 40, RULE_htmlElements = 41, RULE_htmlElement = 42, 
		RULE_htmlContent = 43, RULE_htmlTagStartName = 44, RULE_htmlTagClosingName = 45, 
		RULE_htmlTagName = 46, RULE_htmlAttribute = 47, RULE_htmlAttributeName = 48, 
		RULE_htmlChardata = 49, RULE_htmlAttributeValue = 50, RULE_assignable = 51, 
		RULE_objectLiteral = 52, RULE_objectExpressionSequence = 53, RULE_anoymousFunction = 54, 
		RULE_arrowFunctionParameters = 55, RULE_arrowFunctionBody = 56, RULE_literal = 57, 
		RULE_templateStringLiteral = 58, RULE_templateStringAtom = 59, RULE_numericLiteral = 60, 
		RULE_identifierName = 61, RULE_identifier = 62, RULE_reservedWord = 63, 
		RULE_keyword = 64, RULE_let_ = 65, RULE_eos = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "statementList", "importStatement", 
			"importFromBlock", "moduleItems", "importDefault", "importNamespace", 
			"importFrom", "aliasName", "exportStatement", "declaration", "variableStatement", 
			"variableDeclarationList", "variableDeclaration", "emptyStatement_", 
			"expressionStatement", "ifStatement", "varModifier", "returnStatement", 
			"functionDeclaration", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "sourceElements", "arrayLiteral", "elementList", "arrayElement", 
			"propertyAssignment", "propertyName", "arguments", "argument", "expressionSequence", 
			"reactHook", "useEffectHook", "useRefHook", "useStateHook", "singleExpression", 
			"htmlElements", "htmlElement", "htmlContent", "htmlTagStartName", "htmlTagClosingName", 
			"htmlTagName", "htmlAttribute", "htmlAttributeName", "htmlChardata", 
			"htmlAttributeValue", "assignable", "objectLiteral", "objectExpressionSequence", 
			"anoymousFunction", "arrowFunctionParameters", "arrowFunctionBody", "literal", 
			"templateStringLiteral", "templateStringAtom", "numericLiteral", "identifierName", 
			"identifier", "reservedWord", "keyword", "let_", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'<'", "'>'", 
			"'/'", "'-'", "'='", "';'", "'=>'", "'+'", "'.'", "'from'", "'if'", "'else'", 
			"'#'", "'?'", "'default'", "'export'", "'import'", "'*'", "'as'", "'return'", 
			"'var'", "'const'", "'let'", "','", "'async'", null, "'function'", "'useEffect'", 
			"'useRef'", "'useState'", "'...'", null, null, null, "'null'", null, 
			null, null, null, null, null, null, null, null, null, "'${'", null, null, 
			null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenParen", "CloseParen", "OpenBracket", "CloseBracket", "OpenBrace", 
			"CloseBrace", "Colon", "LessThan", "MoreThan", "Divide", "Minus", "Assign", 
			"SemiColon", "ARROW", "Plus", "Dot", "From", "If", "Else", "Hashtag", 
			"QuestionMark", "Default", "Export", "Import", "Multiply", "As", "Return", 
			"Var", "Const", "StrictLet", "Comma", "Async", "BackTick", "Function_", 
			"UseEffect", "UseRef", "UseState", "Ellipsis", "Identifier", "WS", "StringLiteral", 
			"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral", 
			"BigDecimalIntegerLiteral", "TemplateStringStartExpression", "TemplateStringAtom", 
			"TagOpen", "TagClose", "TagSlashClose", "TagSlash", "TagName", "AttributeValue", 
			"Attribute", "TagEquals"
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
	public String getGrammarFileName() { return "JsxParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JsxParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(134);
				sourceElements();
				}
			}

			setState(137);
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

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ReactHookContext reactHook() {
			return getRuleContext(ReactHookContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				emptyStatement_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				exportStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				variableStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				importStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				reactHook();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(OpenBrace);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(154);
				statementList();
				}
			}

			setState(157);
			match(CloseBrace);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0) );
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(JsxParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Import);
			setState(165);
			importFromBlock();
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

	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFromBlock);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case From:
			case Default:
			case Export:
			case Import:
			case Multiply:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(167);
					importDefault();
					}
					break;
				}
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(170);
					importNamespace();
					}
					break;
				case 2:
					{
					setState(171);
					moduleItems();
					}
					break;
				}
				setState(174);
				importFrom();
				setState(175);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(StringLiteral);
				setState(178);
				eos();
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

	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public TerminalNode UseState() { return getToken(JsxParser.UseState, 0); }
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleItems);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(OpenBrace);
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(182);
						aliasName();
						setState(183);
						match(Comma);
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier))) != 0)) {
					{
					setState(190);
					aliasName();
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(191);
						match(Comma);
						}
					}

					}
				}

				setState(196);
				match(CloseBrace);
				}
				break;
			case UseState:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(UseState);
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

	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JsxParser.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			aliasName();
			setState(201);
			match(Comma);
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

	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(JsxParser.Multiply, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(JsxParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(203);
				match(Multiply);
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				{
				setState(204);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(207);
				match(As);
				setState(208);
				identifierName();
				}
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

	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(JsxParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(From);
			setState(212);
			match(StringLiteral);
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

	public static class AliasNameContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(JsxParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			identifierName();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(215);
				match(As);
				setState(216);
				identifierName();
				}
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

	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExportDefaultDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(JsxParser.Export, 0); }
		public TerminalNode Default() { return getToken(JsxParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportDefaultDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(JsxParser.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportStatement);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(Export);
				{
				setState(220);
				declaration();
				}
				setState(221);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(Export);
				setState(224);
				match(Default);
				setState(225);
				singleExpression(0);
				setState(226);
				eos();
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

	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case StrictLet:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				variableStatement();
				}
				break;
			case Async:
			case Function_:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				functionDeclaration();
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

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			variableDeclarationList();
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			varModifier();
			setState(237);
			variableDeclaration();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(238);
				match(Comma);
				setState(239);
				variableDeclaration();
				}
				}
				setState(244);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			assignable();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(246);
				match(Assign);
				setState(247);
				singleExpression(0);
				}
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JsxParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expressionSequence();
			setState(253);
			eos();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JsxParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JsxParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(If);
			setState(256);
			match(OpenParen);
			setState(257);
			expressionSequence();
			setState(258);
			match(CloseParen);
			setState(259);
			statement();
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(260);
				match(Else);
				setState(261);
				statement();
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

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JsxParser.Var, 0); }
		public Let_Context let_() {
			return getRuleContext(Let_Context.class,0);
		}
		public TerminalNode Const() { return getToken(JsxParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varModifier);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(Var);
				}
				break;
			case StrictLet:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				let_();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(Const);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JsxParser.Return, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(Return);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(270);
					expressionSequence();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Return);
				setState(274);
				match(OpenParen);
				setState(275);
				htmlElements();
				setState(276);
				match(CloseParen);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(JsxParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(JsxParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(JsxParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(280);
				match(Async);
				}
			}

			setState(283);
			match(Function_);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(284);
				match(Multiply);
				}
			}

			setState(287);
			identifier();
			setState(288);
			match(OpenParen);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
				{
				setState(289);
				formalParameterList();
				}
			}

			setState(292);
			match(CloseParen);
			setState(293);
			match(OpenBrace);
			setState(294);
			functionBody();
			setState(295);
			match(CloseBrace);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				formalParameterArg();
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(Comma);
						setState(299);
						formalParameterArg();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(305);
					match(Comma);
					setState(306);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				lastFormalParameterArg();
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

	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			assignable();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(313);
				match(Assign);
				setState(314);
				singleExpression(0);
				}
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

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(JsxParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Ellipsis);
			setState(318);
			singleExpression(0);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(320);
				sourceElements();
				}
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				sourceElement();
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0) );
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(JsxParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JsxParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(328);
			match(OpenBracket);
			setState(329);
			elementList();
			setState(330);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					match(Comma);
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(338);
				arrayElement();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(341);
						match(Comma);
						}
						}
						setState(344); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(346);
					arrayElement();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(352);
				match(Comma);
				}
				}
				setState(357);
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

	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JsxParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(358);
				match(Ellipsis);
				}
			}

			setState(361);
			singleExpression(0);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JsxParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(JsxParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(JsxParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(JsxParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitComputedPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JsxParser.Ellipsis, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitPropertyShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitPropertyShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(JsxParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(JsxParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFunctionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFunctionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyAssignment);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				propertyName();
				setState(364);
				match(Colon);
				setState(365);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(OpenBracket);
				setState(368);
				singleExpression(0);
				setState(369);
				match(CloseBracket);
				setState(370);
				match(Colon);
				setState(371);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(373);
					match(Async);
					}
					break;
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(376);
					match(Multiply);
					}
				}

				setState(379);
				propertyName();
				setState(380);
				match(OpenParen);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(381);
					formalParameterList();
					}
				}

				setState(384);
				match(CloseParen);
				setState(385);
				match(OpenBrace);
				setState(386);
				functionBody();
				setState(387);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(389);
					match(Ellipsis);
					}
				}

				setState(392);
				singleExpression(0);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(JsxParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JsxParser.CloseBracket, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_propertyName);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case From:
			case Default:
			case Export:
			case Import:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(OpenBracket);
				setState(399);
				singleExpression(0);
				setState(400);
				match(CloseBracket);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(OpenParen);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(405);
				argument();
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						match(Comma);
						setState(407);
						argument();
						}
						} 
					}
					setState(412);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(413);
					match(Comma);
					}
				}

				}
			}

			setState(418);
			match(CloseParen);
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

	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JsxParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(420);
				match(Ellipsis);
				}
			}

			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(423);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(424);
				identifier();
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(JsxParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(JsxParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(427);
				match(Ellipsis);
				}
			}

			setState(430);
			singleExpression(0);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(Comma);
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(432);
						match(Ellipsis);
						}
					}

					setState(435);
					singleExpression(0);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class ReactHookContext extends ParserRuleContext {
		public UseEffectHookContext useEffectHook() {
			return getRuleContext(UseEffectHookContext.class,0);
		}
		public UseRefHookContext useRefHook() {
			return getRuleContext(UseRefHookContext.class,0);
		}
		public UseStateHookContext useStateHook() {
			return getRuleContext(UseStateHookContext.class,0);
		}
		public ReactHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterReactHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitReactHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitReactHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactHookContext reactHook() throws RecognitionException {
		ReactHookContext _localctx = new ReactHookContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_reactHook);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UseEffect:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				useEffectHook();
				}
				break;
			case UseRef:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				useRefHook();
				}
				break;
			case UseState:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				useStateHook();
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

	public static class UseEffectHookContext extends ParserRuleContext {
		public TerminalNode UseEffect() { return getToken(JsxParser.UseEffect, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public TerminalNode Comma() { return getToken(JsxParser.Comma, 0); }
		public UseEffectHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffectHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterUseEffectHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitUseEffectHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitUseEffectHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectHookContext useEffectHook() throws RecognitionException {
		UseEffectHookContext _localctx = new UseEffectHookContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_useEffectHook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(UseEffect);
			setState(447);
			match(OpenParen);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(448);
				expressionSequence();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(449);
					match(Comma);
					setState(450);
					expressionSequence();
					}
				}

				}
			}

			setState(455);
			match(CloseParen);
			setState(456);
			eos();
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

	public static class UseRefHookContext extends ParserRuleContext {
		public TerminalNode UseRef() { return getToken(JsxParser.UseRef, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UseRefHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRefHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterUseRefHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitUseRefHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitUseRefHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefHookContext useRefHook() throws RecognitionException {
		UseRefHookContext _localctx = new UseRefHookContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_useRefHook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(UseRef);
			setState(459);
			match(OpenParen);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(460);
				singleExpression(0);
				}
			}

			setState(463);
			match(CloseParen);
			setState(464);
			eos();
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

	public static class UseStateHookContext extends ParserRuleContext {
		public TerminalNode UseState() { return getToken(JsxParser.UseState, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UseStateHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStateHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterUseStateHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitUseStateHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitUseStateHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateHookContext useStateHook() throws RecognitionException {
		UseStateHookContext _localctx = new UseStateHookContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_useStateHook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(UseState);
			setState(467);
			match(OpenParen);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(468);
				singleExpression(0);
				}
			}

			setState(471);
			match(CloseParen);
			setState(472);
			eos();
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitTemplateStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitTemplateStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HookContext extends SingleExpressionContext {
		public ReactHookContext reactHook() {
			return getRuleContext(ReactHookContext.class,0);
		}
		public HookContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHook(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(JsxParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JsxParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(JsxParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(JsxParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(JsxParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(JsxParser.MoreThan, 0); }
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(JsxParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(JsxParser.QuestionMark, 0); }
		public TerminalNode Hashtag() { return getToken(JsxParser.Hashtag, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(JsxParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JsxParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnoymousFunctionContext anoymousFunction() {
			return getRuleContext(AnoymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportExpressionContext extends SingleExpressionContext {
		public TerminalNode Import() { return getToken(JsxParser.Import, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public ImportExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterImportExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitImportExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitImportExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(JsxParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(JsxParser.Divide, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HtmlElementExpressionContext extends SingleExpressionContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public HtmlElementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlElementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new HtmlElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(475);
				htmlElements();
				}
				break;
			case 2:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(OpenParen);
				setState(477);
				expressionSequence();
				setState(478);
				match(CloseParen);
				}
				break;
			case 3:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				anoymousFunction();
				}
				break;
			case 4:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481);
				match(Import);
				setState(482);
				match(OpenParen);
				setState(483);
				singleExpression(0);
				setState(484);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new HookContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486);
				reactHook();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(487);
				arrayLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(488);
				objectLiteral();
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489);
				identifier();
				}
				break;
			case 9:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(493);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(494);
						_la = _input.LA(1);
						if ( !(_la==Minus || _la==Plus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(495);
						singleExpression(14);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(496);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(497);
						_la = _input.LA(1);
						if ( !(_la==Divide || _la==Multiply) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(498);
						singleExpression(13);
						}
						break;
					case 3:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(499);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(500);
						match(QuestionMark);
						setState(501);
						singleExpression(0);
						setState(502);
						match(Colon);
						setState(503);
						singleExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(505);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(512);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(506);
							match(LessThan);
							}
							break;
						case 2:
							{
							setState(507);
							match(MoreThan);
							}
							break;
						case 3:
							{
							setState(508);
							match(LessThan);
							setState(509);
							match(Assign);
							}
							break;
						case 4:
							{
							setState(510);
							match(MoreThan);
							setState(511);
							match(Assign);
							}
							break;
						}
						setState(514);
						singleExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(515);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(516);
						match(Assign);
						setState(517);
						singleExpression(5);
						}
						break;
					case 6:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(518);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(519);
						templateStringLiteral();
						}
						break;
					case 7:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(520);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(521);
							match(QuestionMark);
							}
						}

						setState(524);
						match(Dot);
						setState(526);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(525);
							match(Hashtag);
							}
						}

						setState(528);
						identifierName();
						}
						break;
					case 8:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(529);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(530);
						arguments();
						}
						break;
					case 9:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(531);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(532);
						match(OpenBracket);
						setState(533);
						expressionSequence();
						setState(534);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(541);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(544); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(JsxParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(JsxParser.LessThan, i);
		}
		public HtmlTagStartNameContext htmlTagStartName() {
			return getRuleContext(HtmlTagStartNameContext.class,0);
		}
		public List<TerminalNode> MoreThan() { return getTokens(JsxParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(JsxParser.MoreThan, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(JsxParser.Divide, 0); }
		public HtmlTagClosingNameContext htmlTagClosingName() {
			return getRuleContext(HtmlTagClosingNameContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(LessThan);
				setState(547);
				htmlTagStartName();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(548);
					htmlAttribute();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				match(MoreThan);
				setState(555);
				htmlContent();
				setState(556);
				match(LessThan);
				setState(557);
				match(Divide);
				setState(558);
				htmlTagClosingName();
				setState(559);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(LessThan);
				setState(562);
				htmlTagName();
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(563);
						htmlAttribute();
						}
						} 
					}
					setState(568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(569);
				htmlContent();
				setState(570);
				match(Divide);
				setState(571);
				match(MoreThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(LessThan);
				setState(574);
				htmlTagName();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(575);
					htmlAttribute();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				match(Divide);
				setState(582);
				match(MoreThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				match(LessThan);
				setState(585);
				htmlTagName();
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==TagName) {
					{
					{
					setState(586);
					htmlAttribute();
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				match(MoreThan);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(LessThan);
				setState(595);
				match(MoreThan);
				setState(596);
				htmlContent();
				setState(597);
				match(LessThan);
				setState(598);
				match(Divide);
				setState(599);
				match(MoreThan);
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

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<ObjectExpressionSequenceContext> objectExpressionSequence() {
			return getRuleContexts(ObjectExpressionSequenceContext.class);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence(int i) {
			return getRuleContext(ObjectExpressionSequenceContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(603);
				htmlChardata();
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(606);
						htmlElement();
						}
						break;
					case OpenBrace:
						{
						setState(607);
						objectExpressionSequence();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(610);
						htmlChardata();
						}
						break;
					}
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class HtmlTagStartNameContext extends ParserRuleContext {
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlTagStartNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagStartName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlTagStartName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlTagStartName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlTagStartName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagStartNameContext htmlTagStartName() throws RecognitionException {
		HtmlTagStartNameContext _localctx = new HtmlTagStartNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_htmlTagStartName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			htmlTagName();
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

	public static class HtmlTagClosingNameContext extends ParserRuleContext {
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlTagClosingNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagClosingName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlTagClosingName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlTagClosingName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlTagClosingName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagClosingNameContext htmlTagClosingName() throws RecognitionException {
		HtmlTagClosingNameContext _localctx = new HtmlTagClosingNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_htmlTagClosingName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			htmlTagName();
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

	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TagName() { return getToken(JsxParser.TagName, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JsxParser.Identifier, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_htmlTagName);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(TagName);
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				keyword();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(Identifier);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_htmlAttribute);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				htmlAttributeName();
				setState(628);
				match(Assign);
				setState(629);
				htmlAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				htmlAttributeName();
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

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TagName() { return getToken(JsxParser.TagName, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JsxParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JsxParser.Identifier, i);
		}
		public List<TerminalNode> Minus() { return getTokens(JsxParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(JsxParser.Minus, i);
		}
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_htmlAttributeName);
		try {
			int _alt;
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(TagName);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(Identifier);
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						match(Minus);
						setState(637);
						match(Identifier);
						}
						} 
					}
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
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

	public static class HtmlChardataContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(JsxParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(JsxParser.LessThan, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(JsxParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(JsxParser.OpenBrace, i);
		}
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_htmlChardata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(645);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==OpenBrace || _la==LessThan) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(648); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode AttributeValue() { return getToken(JsxParser.AttributeValue, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public ObjectExpressionSequenceContext objectExpressionSequence() {
			return getRuleContext(ObjectExpressionSequenceContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(AttributeValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				objectExpressionSequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				match(OpenBrace);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(654);
					objectExpressionSequence();
					}
				}

				setState(657);
				match(CloseBrace);
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

	public static class AssignableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assignable);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				identifier();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				objectLiteral();
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(OpenBrace);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Multiply) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(666);
				propertyAssignment();
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(667);
						match(Comma);
						setState(668);
						propertyAssignment();
						}
						} 
					}
					setState(673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(674);
					match(Comma);
					}
				}

				}
			}

			setState(679);
			match(CloseBrace);
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

	public static class ObjectExpressionSequenceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public ObjectExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterObjectExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitObjectExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitObjectExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionSequenceContext objectExpressionSequence() throws RecognitionException {
		ObjectExpressionSequenceContext _localctx = new ObjectExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(OpenBrace);
			setState(682);
			expressionSequence();
			setState(683);
			match(CloseBrace);
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

	public static class AnoymousFunctionContext extends ParserRuleContext {
		public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousFunction; }
	 
		public AnoymousFunctionContext() { }
		public void copyFrom(AnoymousFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnoymousFunctionDeclContext extends AnoymousFunctionContext {
		public TerminalNode Function_() { return getToken(JsxParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(JsxParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(JsxParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnoymousFunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterAnoymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitAnoymousFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitAnoymousFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowFunctionContext extends AnoymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JsxParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(JsxParser.Async, 0); }
		public ArrowFunctionContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclContext extends AnoymousFunctionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
		AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_anoymousFunction);
		int _la;
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(686);
					match(Async);
					}
				}

				setState(689);
				match(Function_);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(690);
					match(Multiply);
					}
				}

				setState(693);
				match(OpenParen);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(694);
					formalParameterList();
					}
				}

				setState(697);
				match(CloseParen);
				setState(698);
				match(OpenBrace);
				setState(699);
				functionBody();
				setState(700);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(702);
					match(Async);
					}
					break;
				}
				setState(705);
				arrowFunctionParameters();
				setState(706);
				match(ARROW);
				setState(707);
				arrowFunctionBody();
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

	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JsxParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JsxParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrowFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrowFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				identifier();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				match(OpenParen);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(713);
					formalParameterList();
					}
				}

				setState(716);
				match(CloseParen);
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

	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitArrowFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitArrowFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrowFunctionBody);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(OpenBrace);
				setState(721);
				functionBody();
				setState(722);
				match(CloseBrace);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(JsxParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JsxParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				numericLiteral();
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

	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(JsxParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(JsxParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterTemplateStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitTemplateStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitTemplateStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(BackTick);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(733);
				templateStringAtom();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(BackTick);
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

	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TerminalNode TemplateStringAtom() { return getToken(JsxParser.TemplateStringAtom, 0); }
		public TerminalNode TemplateStringStartExpression() { return getToken(JsxParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterTemplateStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitTemplateStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitTemplateStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_templateStringAtom);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(TemplateStringStartExpression);
				setState(743);
				singleExpression(0);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(JsxParser.DecimalLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(DecimalLiteral);
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_identifierName);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				identifier();
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				reservedWord();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JsxParser.Identifier, 0); }
		public TerminalNode Async() { return getToken(JsxParser.Async, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !(_la==Async || _la==Identifier) ) {
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_reservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			keyword();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JsxParser.Default, 0); }
		public TerminalNode Export() { return getToken(JsxParser.Export, 0); }
		public TerminalNode From() { return getToken(JsxParser.From, 0); }
		public TerminalNode Import() { return getToken(JsxParser.Import, 0); }
		public TerminalNode Function_() { return getToken(JsxParser.Function_, 0); }
		public TerminalNode UseState() { return getToken(JsxParser.UseState, 0); }
		public TerminalNode UseEffect() { return getToken(JsxParser.UseEffect, 0); }
		public TerminalNode UseRef() { return getToken(JsxParser.UseRef, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState))) != 0)) ) {
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

	public static class Let_Context extends ParserRuleContext {
		public TerminalNode StrictLet() { return getToken(JsxParser.StrictLet, 0); }
		public Let_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterLet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitLet_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitLet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_Context let_() throws RecognitionException {
		Let_Context _localctx = new Let_Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_let_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(StrictLet);
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JsxParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(JsxParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u02fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0003\u0000\u0088\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0098\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u009c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u00a1\b"+
		"\u0004\u000b\u0004\f\u0004\u00a2\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006\u00a9\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ad"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00b4\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00ba\b\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00c1\b\u0007\u0003\u0007\u00c3\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00c7\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u00ce\b\t\u0001\t\u0001\t\u0003\t\u00d2\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00da\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e5\b\f\u0001\r\u0001\r\u0003\r\u00e9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f1"+
		"\b\u000f\n\u000f\f\u000f\u00f4\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00f9\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0107\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u010c\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0110\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0117\b\u0015\u0001\u0016\u0003\u0016\u011a\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u011e\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0123\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u012d"+
		"\b\u0017\n\u0017\f\u0017\u0130\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0134\b\u0017\u0001\u0017\u0003\u0017\u0137\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u013c\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0003\u001a\u0142\b\u001a\u0001\u001b\u0004\u001b\u0145"+
		"\b\u001b\u000b\u001b\f\u001b\u0146\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0005\u001d\u014e\b\u001d\n\u001d\f\u001d\u0151"+
		"\t\u001d\u0001\u001d\u0003\u001d\u0154\b\u001d\u0001\u001d\u0004\u001d"+
		"\u0157\b\u001d\u000b\u001d\f\u001d\u0158\u0001\u001d\u0005\u001d\u015c"+
		"\b\u001d\n\u001d\f\u001d\u015f\t\u001d\u0001\u001d\u0005\u001d\u0162\b"+
		"\u001d\n\u001d\f\u001d\u0165\t\u001d\u0001\u001e\u0003\u001e\u0168\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0177\b\u001f\u0001\u001f\u0003\u001f\u017a\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u017f\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0187\b\u001f\u0001\u001f\u0003\u001f\u018a\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0193\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u0199\b!\n!\f!\u019c\t!\u0001!\u0003!\u019f\b!\u0003!"+
		"\u01a1\b!\u0001!\u0001!\u0001\"\u0003\"\u01a6\b\"\u0001\"\u0001\"\u0003"+
		"\"\u01aa\b\"\u0001#\u0003#\u01ad\b#\u0001#\u0001#\u0001#\u0003#\u01b2"+
		"\b#\u0001#\u0005#\u01b5\b#\n#\f#\u01b8\t#\u0001$\u0001$\u0001$\u0003$"+
		"\u01bd\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01c4\b%\u0003%\u01c6"+
		"\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u01ce\b&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u01d6\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01ec\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0201"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u020b"+
		"\b(\u0001(\u0001(\u0003(\u020f\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0005(\u0219\b(\n(\f(\u021c\t(\u0001)\u0004)\u021f\b)"+
		"\u000b)\f)\u0220\u0001*\u0001*\u0001*\u0005*\u0226\b*\n*\f*\u0229\t*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u0235\b*\n*\f*\u0238\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u0241\b*\n*\f*\u0244\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u024c\b*\n*\f*\u024f\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u025a\b*\u0001+\u0003+\u025d\b+\u0001+\u0001"+
		"+\u0003+\u0261\b+\u0001+\u0003+\u0264\b+\u0005+\u0266\b+\n+\f+\u0269\t"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u0272\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0279\b/\u00010\u00010\u00010\u0001"+
		"0\u00050\u027f\b0\n0\f0\u0282\t0\u00030\u0284\b0\u00011\u00041\u0287\b"+
		"1\u000b1\f1\u0288\u00012\u00012\u00012\u00012\u00012\u00032\u0290\b2\u0001"+
		"2\u00032\u0293\b2\u00013\u00013\u00013\u00033\u0298\b3\u00014\u00014\u0001"+
		"4\u00014\u00054\u029e\b4\n4\f4\u02a1\t4\u00014\u00034\u02a4\b4\u00034"+
		"\u02a6\b4\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u0003"+
		"6\u02b0\b6\u00016\u00016\u00036\u02b4\b6\u00016\u00016\u00036\u02b8\b"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u02c0\b6\u00016\u0001"+
		"6\u00016\u00016\u00036\u02c6\b6\u00017\u00017\u00017\u00037\u02cb\b7\u0001"+
		"7\u00037\u02ce\b7\u00018\u00018\u00018\u00018\u00018\u00038\u02d5\b8\u0001"+
		"9\u00019\u00019\u00019\u00039\u02db\b9\u0001:\u0001:\u0005:\u02df\b:\n"+
		":\f:\u02e2\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0003;\u02e9\b;\u0001"+
		"<\u0001<\u0001=\u0001=\u0003=\u02ef\b=\u0001>\u0001>\u0001?\u0001?\u0001"+
		"@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001B\u0000\u0001PC\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000"+
		"\u0006\u0002\u0000\u000b\u000b\u000f\u000f\u0002\u0000\n\n\u0019\u0019"+
		"\u0002\u0000\u0005\u0005\b\b\u0002\u0000  \'\'\u0003\u0000\u0011\u0011"+
		"\u0016\u0018\"%\u0001\u0001\r\r\u033e\u0000\u0087\u0001\u0000\u0000\u0000"+
		"\u0002\u008b\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000\u0000\u0000"+
		"\u0006\u0099\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n"+
		"\u00a4\u0001\u0000\u0000\u0000\f\u00b3\u0001\u0000\u0000\u0000\u000e\u00c6"+
		"\u0001\u0000\u0000\u0000\u0010\u00c8\u0001\u0000\u0000\u0000\u0012\u00cd"+
		"\u0001\u0000\u0000\u0000\u0014\u00d3\u0001\u0000\u0000\u0000\u0016\u00d6"+
		"\u0001\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a\u00e8"+
		"\u0001\u0000\u0000\u0000\u001c\u00ea\u0001\u0000\u0000\u0000\u001e\u00ec"+
		"\u0001\u0000\u0000\u0000 \u00f5\u0001\u0000\u0000\u0000\"\u00fa\u0001"+
		"\u0000\u0000\u0000$\u00fc\u0001\u0000\u0000\u0000&\u00ff\u0001\u0000\u0000"+
		"\u0000(\u010b\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000\u0000,"+
		"\u0119\u0001\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u0138\u0001"+
		"\u0000\u0000\u00002\u013d\u0001\u0000\u0000\u00004\u0141\u0001\u0000\u0000"+
		"\u00006\u0144\u0001\u0000\u0000\u00008\u0148\u0001\u0000\u0000\u0000:"+
		"\u014f\u0001\u0000\u0000\u0000<\u0167\u0001\u0000\u0000\u0000>\u0189\u0001"+
		"\u0000\u0000\u0000@\u0192\u0001\u0000\u0000\u0000B\u0194\u0001\u0000\u0000"+
		"\u0000D\u01a5\u0001\u0000\u0000\u0000F\u01ac\u0001\u0000\u0000\u0000H"+
		"\u01bc\u0001\u0000\u0000\u0000J\u01be\u0001\u0000\u0000\u0000L\u01ca\u0001"+
		"\u0000\u0000\u0000N\u01d2\u0001\u0000\u0000\u0000P\u01eb\u0001\u0000\u0000"+
		"\u0000R\u021e\u0001\u0000\u0000\u0000T\u0259\u0001\u0000\u0000\u0000V"+
		"\u025c\u0001\u0000\u0000\u0000X\u026a\u0001\u0000\u0000\u0000Z\u026c\u0001"+
		"\u0000\u0000\u0000\\\u0271\u0001\u0000\u0000\u0000^\u0278\u0001\u0000"+
		"\u0000\u0000`\u0283\u0001\u0000\u0000\u0000b\u0286\u0001\u0000\u0000\u0000"+
		"d\u0292\u0001\u0000\u0000\u0000f\u0297\u0001\u0000\u0000\u0000h\u0299"+
		"\u0001\u0000\u0000\u0000j\u02a9\u0001\u0000\u0000\u0000l\u02c5\u0001\u0000"+
		"\u0000\u0000n\u02cd\u0001\u0000\u0000\u0000p\u02d4\u0001\u0000\u0000\u0000"+
		"r\u02da\u0001\u0000\u0000\u0000t\u02dc\u0001\u0000\u0000\u0000v\u02e8"+
		"\u0001\u0000\u0000\u0000x\u02ea\u0001\u0000\u0000\u0000z\u02ee\u0001\u0000"+
		"\u0000\u0000|\u02f0\u0001\u0000\u0000\u0000~\u02f2\u0001\u0000\u0000\u0000"+
		"\u0080\u02f4\u0001\u0000\u0000\u0000\u0082\u02f6\u0001\u0000\u0000\u0000"+
		"\u0084\u02f8\u0001\u0000\u0000\u0000\u0086\u0088\u00036\u001b\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0000\u0000\u0001\u008a"+
		"\u0001\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0004\u0002\u0000\u008c"+
		"\u0003\u0001\u0000\u0000\u0000\u008d\u0098\u0003\u0006\u0003\u0000\u008e"+
		"\u0098\u0003\"\u0011\u0000\u008f\u0098\u0003,\u0016\u0000\u0090\u0098"+
		"\u0003*\u0015\u0000\u0091\u0098\u0003$\u0012\u0000\u0092\u0098\u0003\u0018"+
		"\f\u0000\u0093\u0098\u0003&\u0013\u0000\u0094\u0098\u0003\u001c\u000e"+
		"\u0000\u0095\u0098\u0003\n\u0005\u0000\u0096\u0098\u0003H$\u0000\u0097"+
		"\u008d\u0001\u0000\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097"+
		"\u008f\u0001\u0000\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097"+
		"\u0091\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097"+
		"\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0005\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0005\u0000\u0000\u009a"+
		"\u009c\u0003\b\u0004\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0006\u0000\u0000\u009e\u0007\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0003\u0004\u0002\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\t\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0018\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u000b\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0003\u0010\b\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0003\u0012\t\u0000\u00ab\u00ad\u0003\u000e\u0007\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af"+
		"\u00b0\u0003\u0084B\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005)\u0000\u0000\u00b2\u00b4\u0003\u0084B\u0000\u00b3\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\r\u0001\u0000\u0000"+
		"\u0000\u00b5\u00bb\u0005\u0005\u0000\u0000\u00b6\u00b7\u0003\u0016\u000b"+
		"\u0000\u00b7\u00b8\u0005\u001f\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c2\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00c0\u0003\u0016\u000b\u0000\u00bf\u00c1\u0005\u001f\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0005\u0006\u0000\u0000\u00c5\u00c7\u0005%\u0000\u0000"+
		"\u00c6\u00b5\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u000f\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0016\u000b\u0000"+
		"\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca\u0011\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0005\u0019\u0000\u0000\u00cc\u00ce\u0003z=\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001a\u0000\u0000\u00d0\u00d2"+
		"\u0003z=\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u0013\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0011"+
		"\u0000\u0000\u00d4\u00d5\u0005)\u0000\u0000\u00d5\u0015\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0003z=\u0000\u00d7\u00d8\u0005\u001a\u0000\u0000\u00d8"+
		"\u00da\u0003z=\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u0017\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0017\u0000\u0000\u00dc\u00dd\u0003\u001a\r\u0000\u00dd\u00de\u0003\u0084"+
		"B\u0000\u00de\u00e5\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0017\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0016\u0000\u0000\u00e1\u00e2\u0003P(\u0000\u00e2"+
		"\u00e3\u0003\u0084B\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00db"+
		"\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000\u0000\u0000\u00e5\u0019"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0003\u001c\u000e\u0000\u00e7\u00e9"+
		"\u0003,\u0016\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"\u001e\u000f\u0000\u00eb\u001d\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003"+
		"(\u0014\u0000\u00ed\u00f2\u0003 \u0010\u0000\u00ee\u00ef\u0005\u001f\u0000"+
		"\u0000\u00ef\u00f1\u0003 \u0010\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003f3\u0000\u00f6\u00f7"+
		"\u0005\f\u0000\u0000\u00f7\u00f9\u0003P(\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9!\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\r\u0000\u0000\u00fb#\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0003F#\u0000\u00fd\u00fe\u0003\u0084B\u0000\u00fe%\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0012\u0000\u0000\u0100\u0101\u0005"+
		"\u0001\u0000\u0000\u0101\u0102\u0003F#\u0000\u0102\u0103\u0005\u0002\u0000"+
		"\u0000\u0103\u0106\u0003\u0004\u0002\u0000\u0104\u0105\u0005\u0013\u0000"+
		"\u0000\u0105\u0107\u0003\u0004\u0002\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\'\u0001\u0000\u0000\u0000"+
		"\u0108\u010c\u0005\u001c\u0000\u0000\u0109\u010c\u0003\u0082A\u0000\u010a"+
		"\u010c\u0005\u001d\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		")\u0001\u0000\u0000\u0000\u010d\u010f\u0005\u001b\u0000\u0000\u010e\u0110"+
		"\u0003F#\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0117\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u001b"+
		"\u0000\u0000\u0112\u0113\u0005\u0001\u0000\u0000\u0113\u0114\u0003R)\u0000"+
		"\u0114\u0115\u0005\u0002\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000"+
		"\u0117+\u0001\u0000\u0000\u0000\u0118\u011a\u0005 \u0000\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0005\"\u0000\u0000\u011c\u011e\u0005"+
		"\u0019\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0003"+
		"|>\u0000\u0120\u0122\u0005\u0001\u0000\u0000\u0121\u0123\u0003.\u0017"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0002\u0000"+
		"\u0000\u0125\u0126\u0005\u0005\u0000\u0000\u0126\u0127\u00034\u001a\u0000"+
		"\u0127\u0128\u0005\u0006\u0000\u0000\u0128-\u0001\u0000\u0000\u0000\u0129"+
		"\u012e\u00030\u0018\u0000\u012a\u012b\u0005\u001f\u0000\u0000\u012b\u012d"+
		"\u00030\u0018\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0133\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u0134\u0003"+
		"2\u0019\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0137\u00032\u0019"+
		"\u0000\u0136\u0129\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137/\u0001\u0000\u0000\u0000\u0138\u013b\u0003f3\u0000\u0139"+
		"\u013a\u0005\f\u0000\u0000\u013a\u013c\u0003P(\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c1\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005&\u0000\u0000\u013e\u013f\u0003P(\u0000"+
		"\u013f3\u0001\u0000\u0000\u0000\u0140\u0142\u00036\u001b\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u01425\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0003\u0002\u0001\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u01477\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0003\u0000\u0000\u0149\u014a\u0003:\u001d"+
		"\u0000\u014a\u014b\u0005\u0004\u0000\u0000\u014b9\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0005\u001f\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0003<\u001e\u0000\u0153"+
		"\u0152\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154"+
		"\u015d\u0001\u0000\u0000\u0000\u0155\u0157\u0005\u001f\u0000\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0003<\u001e\u0000\u015b\u0156"+
		"\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0163"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0005\u001f\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165"+
		"\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164;\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0166\u0168\u0005&\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0003P(\u0000\u016a=\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0003@ \u0000\u016c\u016d\u0005\u0007\u0000\u0000\u016d\u016e"+
		"\u0003P(\u0000\u016e\u018a\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0003"+
		"\u0000\u0000\u0170\u0171\u0003P(\u0000\u0171\u0172\u0005\u0004\u0000\u0000"+
		"\u0172\u0173\u0005\u0007\u0000\u0000\u0173\u0174\u0003P(\u0000\u0174\u018a"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0005 \u0000\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0005\u0019\u0000\u0000\u0179\u0178\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0003@ \u0000\u017c\u017e\u0005\u0001\u0000"+
		"\u0000\u017d\u017f\u0003.\u0017\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005\u0002\u0000\u0000\u0181\u0182\u0005\u0005\u0000\u0000"+
		"\u0182\u0183\u00034\u001a\u0000\u0183\u0184\u0005\u0006\u0000\u0000\u0184"+
		"\u018a\u0001\u0000\u0000\u0000\u0185\u0187\u0005&\u0000\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u018a\u0003P(\u0000\u0189\u016b\u0001\u0000"+
		"\u0000\u0000\u0189\u016f\u0001\u0000\u0000\u0000\u0189\u0176\u0001\u0000"+
		"\u0000\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u018a?\u0001\u0000\u0000"+
		"\u0000\u018b\u0193\u0003z=\u0000\u018c\u0193\u0005)\u0000\u0000\u018d"+
		"\u0193\u0003x<\u0000\u018e\u018f\u0005\u0003\u0000\u0000\u018f\u0190\u0003"+
		"P(\u0000\u0190\u0191\u0005\u0004\u0000\u0000\u0191\u0193\u0001\u0000\u0000"+
		"\u0000\u0192\u018b\u0001\u0000\u0000\u0000\u0192\u018c\u0001\u0000\u0000"+
		"\u0000\u0192\u018d\u0001\u0000\u0000\u0000\u0192\u018e\u0001\u0000\u0000"+
		"\u0000\u0193A\u0001\u0000\u0000\u0000\u0194\u01a0\u0005\u0001\u0000\u0000"+
		"\u0195\u019a\u0003D\"\u0000\u0196\u0197\u0005\u001f\u0000\u0000\u0197"+
		"\u0199\u0003D\"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c"+
		"\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0005\u001f\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u0195\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0002\u0000\u0000\u01a3C\u0001\u0000\u0000\u0000\u01a4\u01a6\u0005"+
		"&\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01aa\u0003P(\u0000"+
		"\u01a8\u01aa\u0003|>\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01a8"+
		"\u0001\u0000\u0000\u0000\u01aaE\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005"+
		"&\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b6\u0003P(\u0000"+
		"\u01af\u01b1\u0005\u001f\u0000\u0000\u01b0\u01b2\u0005&\u0000\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003P(\u0000\u01b4\u01af\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7G\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bd\u0003J%\u0000"+
		"\u01ba\u01bd\u0003L&\u0000\u01bb\u01bd\u0003N\'\u0000\u01bc\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bdI\u0001\u0000\u0000\u0000\u01be\u01bf\u0005#\u0000"+
		"\u0000\u01bf\u01c5\u0005\u0001\u0000\u0000\u01c0\u01c3\u0003F#\u0000\u01c1"+
		"\u01c2\u0005\u001f\u0000\u0000\u01c2\u01c4\u0003F#\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0002\u0000\u0000\u01c8\u01c9\u0003\u0084B\u0000\u01c9K\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0005$\u0000\u0000\u01cb\u01cd\u0005\u0001\u0000\u0000"+
		"\u01cc\u01ce\u0003P(\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005\u0002\u0000\u0000\u01d0\u01d1\u0003\u0084B\u0000\u01d1M\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005%\u0000\u0000\u01d3\u01d5\u0005\u0001\u0000"+
		"\u0000\u01d4\u01d6\u0003P(\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005\u0002\u0000\u0000\u01d8\u01d9\u0003\u0084B\u0000\u01d9O\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0006(\uffff\uffff\u0000\u01db\u01ec\u0003"+
		"R)\u0000\u01dc\u01dd\u0005\u0001\u0000\u0000\u01dd\u01de\u0003F#\u0000"+
		"\u01de\u01df\u0005\u0002\u0000\u0000\u01df\u01ec\u0001\u0000\u0000\u0000"+
		"\u01e0\u01ec\u0003l6\u0000\u01e1\u01e2\u0005\u0018\u0000\u0000\u01e2\u01e3"+
		"\u0005\u0001\u0000\u0000\u01e3\u01e4\u0003P(\u0000\u01e4\u01e5\u0005\u0002"+
		"\u0000\u0000\u01e5\u01ec\u0001\u0000\u0000\u0000\u01e6\u01ec\u0003H$\u0000"+
		"\u01e7\u01ec\u00038\u001c\u0000\u01e8\u01ec\u0003h4\u0000\u01e9\u01ec"+
		"\u0003|>\u0000\u01ea\u01ec\u0003r9\u0000\u01eb\u01da\u0001\u0000\u0000"+
		"\u0000\u01eb\u01dc\u0001\u0000\u0000\u0000\u01eb\u01e0\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e1\u0001\u0000\u0000\u0000\u01eb\u01e6\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e7\u0001\u0000\u0000\u0000\u01eb\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u021a\u0001\u0000\u0000\u0000\u01ed\u01ee\n\r\u0000\u0000"+
		"\u01ee\u01ef\u0007\u0000\u0000\u0000\u01ef\u0219\u0003P(\u000e\u01f0\u01f1"+
		"\n\f\u0000\u0000\u01f1\u01f2\u0007\u0001\u0000\u0000\u01f2\u0219\u0003"+
		"P(\r\u01f3\u01f4\n\u0007\u0000\u0000\u01f4\u01f5\u0005\u0015\u0000\u0000"+
		"\u01f5\u01f6\u0003P(\u0000\u01f6\u01f7\u0005\u0007\u0000\u0000\u01f7\u01f8"+
		"\u0003P(\b\u01f8\u0219\u0001\u0000\u0000\u0000\u01f9\u0200\n\u0006\u0000"+
		"\u0000\u01fa\u0201\u0005\b\u0000\u0000\u01fb\u0201\u0005\t\u0000\u0000"+
		"\u01fc\u01fd\u0005\b\u0000\u0000\u01fd\u0201\u0005\f\u0000\u0000\u01fe"+
		"\u01ff\u0005\t\u0000\u0000\u01ff\u0201\u0005\f\u0000\u0000\u0200\u01fa"+
		"\u0001\u0000\u0000\u0000\u0200\u01fb\u0001\u0000\u0000\u0000\u0200\u01fc"+
		"\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u0219\u0003P(\u0007\u0203\u0204\n\u0005"+
		"\u0000\u0000\u0204\u0205\u0005\f\u0000\u0000\u0205\u0219\u0003P(\u0005"+
		"\u0206\u0207\n\u0004\u0000\u0000\u0207\u0219\u0003t:\u0000\u0208\u020a"+
		"\n\u0003\u0000\u0000\u0209\u020b\u0005\u0015\u0000\u0000\u020a\u0209\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020e\u0005\u0010\u0000\u0000\u020d\u020f\u0005"+
		"\u0014\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0219\u0003"+
		"z=\u0000\u0211\u0212\n\u0002\u0000\u0000\u0212\u0219\u0003B!\u0000\u0213"+
		"\u0214\n\u0001\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u0216"+
		"\u0003F#\u0000\u0216\u0217\u0005\u0004\u0000\u0000\u0217\u0219\u0001\u0000"+
		"\u0000\u0000\u0218\u01ed\u0001\u0000\u0000\u0000\u0218\u01f0\u0001\u0000"+
		"\u0000\u0000\u0218\u01f3\u0001\u0000\u0000\u0000\u0218\u01f9\u0001\u0000"+
		"\u0000\u0000\u0218\u0203\u0001\u0000\u0000\u0000\u0218\u0206\u0001\u0000"+
		"\u0000\u0000\u0218\u0208\u0001\u0000\u0000\u0000\u0218\u0211\u0001\u0000"+
		"\u0000\u0000\u0218\u0213\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021bQ\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0003T*\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u0221S\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0005\b\u0000\u0000\u0223\u0227\u0003X,\u0000\u0224\u0226\u0003^/\u0000"+
		"\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000"+
		"\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0005\t\u0000\u0000\u022b\u022c\u0003V+\u0000\u022c\u022d"+
		"\u0005\b\u0000\u0000\u022d\u022e\u0005\n\u0000\u0000\u022e\u022f\u0003"+
		"Z-\u0000\u022f\u0230\u0005\t\u0000\u0000\u0230\u025a\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0005\b\u0000\u0000\u0232\u0236\u0003\\.\u0000\u0233"+
		"\u0235\u0003^/\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0238\u0001"+
		"\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0003V+\u0000\u023a\u023b\u0005\n\u0000"+
		"\u0000\u023b\u023c\u0005\t\u0000\u0000\u023c\u025a\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0005\b\u0000\u0000\u023e\u0242\u0003\\.\u0000\u023f\u0241"+
		"\u0003^/\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0005\n\u0000\u0000\u0246\u0247\u0005\t\u0000"+
		"\u0000\u0247\u025a\u0001\u0000\u0000\u0000\u0248\u0249\u0005\b\u0000\u0000"+
		"\u0249\u024d\u0003\\.\u0000\u024a\u024c\u0003^/\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001"+
		"\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0005"+
		"\t\u0000\u0000\u0251\u025a\u0001\u0000\u0000\u0000\u0252\u0253\u0005\b"+
		"\u0000\u0000\u0253\u0254\u0005\t\u0000\u0000\u0254\u0255\u0003V+\u0000"+
		"\u0255\u0256\u0005\b\u0000\u0000\u0256\u0257\u0005\n\u0000\u0000\u0257"+
		"\u0258\u0005\t\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0222"+
		"\u0001\u0000\u0000\u0000\u0259\u0231\u0001\u0000\u0000\u0000\u0259\u023d"+
		"\u0001\u0000\u0000\u0000\u0259\u0248\u0001\u0000\u0000\u0000\u0259\u0252"+
		"\u0001\u0000\u0000\u0000\u025aU\u0001\u0000\u0000\u0000\u025b\u025d\u0003"+
		"b1\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000"+
		"\u0000\u025d\u0267\u0001\u0000\u0000\u0000\u025e\u0261\u0003T*\u0000\u025f"+
		"\u0261\u0003j5\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0264\u0003"+
		"b1\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0260\u0001\u0000\u0000"+
		"\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268W\u0001\u0000\u0000\u0000"+
		"\u0269\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0003\\.\u0000\u026b"+
		"Y\u0001\u0000\u0000\u0000\u026c\u026d\u0003\\.\u0000\u026d[\u0001\u0000"+
		"\u0000\u0000\u026e\u0272\u0005;\u0000\u0000\u026f\u0272\u0003\u0080@\u0000"+
		"\u0270\u0272\u0005\'\u0000\u0000\u0271\u026e\u0001\u0000\u0000\u0000\u0271"+
		"\u026f\u0001\u0000\u0000\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272"+
		"]\u0001\u0000\u0000\u0000\u0273\u0274\u0003`0\u0000\u0274\u0275\u0005"+
		"\f\u0000\u0000\u0275\u0276\u0003d2\u0000\u0276\u0279\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0003`0\u0000\u0278\u0273\u0001\u0000\u0000\u0000\u0278"+
		"\u0277\u0001\u0000\u0000\u0000\u0279_\u0001\u0000\u0000\u0000\u027a\u0284"+
		"\u0005;\u0000\u0000\u027b\u0280\u0005\'\u0000\u0000\u027c\u027d\u0005"+
		"\u000b\u0000\u0000\u027d\u027f\u0005\'\u0000\u0000\u027e\u027c\u0001\u0000"+
		"\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000"+
		"\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u027a\u0001\u0000"+
		"\u0000\u0000\u0283\u027b\u0001\u0000\u0000\u0000\u0284a\u0001\u0000\u0000"+
		"\u0000\u0285\u0287\b\u0002\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\u0001\u0000\u0000\u0000\u0289c\u0001\u0000\u0000\u0000\u028a"+
		"\u0293\u0005<\u0000\u0000\u028b\u0293\u0005)\u0000\u0000\u028c\u0293\u0003"+
		"j5\u0000\u028d\u028f\u0005\u0005\u0000\u0000\u028e\u0290\u0003j5\u0000"+
		"\u028f\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0005\u0006\u0000\u0000"+
		"\u0292\u028a\u0001\u0000\u0000\u0000\u0292\u028b\u0001\u0000\u0000\u0000"+
		"\u0292\u028c\u0001\u0000\u0000\u0000\u0292\u028d\u0001\u0000\u0000\u0000"+
		"\u0293e\u0001\u0000\u0000\u0000\u0294\u0298\u0003|>\u0000\u0295\u0298"+
		"\u00038\u001c\u0000\u0296\u0298\u0003h4\u0000\u0297\u0294\u0001\u0000"+
		"\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0296\u0001\u0000"+
		"\u0000\u0000\u0298g\u0001\u0000\u0000\u0000\u0299\u02a5\u0005\u0005\u0000"+
		"\u0000\u029a\u029f\u0003>\u001f\u0000\u029b\u029c\u0005\u001f\u0000\u0000"+
		"\u029c\u029e\u0003>\u001f\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e"+
		"\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1"+
		"\u029f\u0001\u0000\u0000\u0000\u02a2\u02a4\u0005\u001f\u0000\u0000\u02a3"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a5\u029a\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a8\u0005\u0006\u0000\u0000\u02a8i\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0005\u0005\u0000\u0000\u02aa\u02ab\u0003F#\u0000\u02ab\u02ac\u0005\u0006"+
		"\u0000\u0000\u02ack\u0001\u0000\u0000\u0000\u02ad\u02c6\u0003,\u0016\u0000"+
		"\u02ae\u02b0\u0005 \u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b3\u0005\"\u0000\u0000\u02b2\u02b4\u0005\u0019\u0000\u0000\u02b3\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b7\u0005\u0001\u0000\u0000\u02b6\u02b8"+
		"\u0003.\u0017\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005"+
		"\u0002\u0000\u0000\u02ba\u02bb\u0005\u0005\u0000\u0000\u02bb\u02bc\u0003"+
		"4\u001a\u0000\u02bc\u02bd\u0005\u0006\u0000\u0000\u02bd\u02c6\u0001\u0000"+
		"\u0000\u0000\u02be\u02c0\u0005 \u0000\u0000\u02bf\u02be\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0003n7\u0000\u02c2\u02c3\u0005\u000e\u0000\u0000\u02c3"+
		"\u02c4\u0003p8\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02ad\u0001"+
		"\u0000\u0000\u0000\u02c5\u02af\u0001\u0000\u0000\u0000\u02c5\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c6m\u0001\u0000\u0000\u0000\u02c7\u02ce\u0003|>"+
		"\u0000\u02c8\u02ca\u0005\u0001\u0000\u0000\u02c9\u02cb\u0003.\u0017\u0000"+
		"\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0005\u0002\u0000\u0000"+
		"\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02c8\u0001\u0000\u0000\u0000"+
		"\u02ceo\u0001\u0000\u0000\u0000\u02cf\u02d5\u0003P(\u0000\u02d0\u02d1"+
		"\u0005\u0005\u0000\u0000\u02d1\u02d2\u00034\u001a\u0000\u02d2\u02d3\u0005"+
		"\u0006\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000\u0000\u0000\u02d5q\u0001\u0000"+
		"\u0000\u0000\u02d6\u02db\u0005*\u0000\u0000\u02d7\u02db\u0005+\u0000\u0000"+
		"\u02d8\u02db\u0005)\u0000\u0000\u02d9\u02db\u0003x<\u0000\u02da\u02d6"+
		"\u0001\u0000\u0000\u0000\u02da\u02d7\u0001\u0000\u0000\u0000\u02da\u02d8"+
		"\u0001\u0000\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02dbs\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e0\u0005!\u0000\u0000\u02dd\u02df\u0003v;"+
		"\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0005!\u0000\u0000\u02e4u\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e9\u00056\u0000\u0000\u02e6\u02e7\u00055\u0000\u0000\u02e7\u02e9\u0003"+
		"P(\u0000\u02e8\u02e5\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e9w\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005,\u0000\u0000\u02eb"+
		"y\u0001\u0000\u0000\u0000\u02ec\u02ef\u0003|>\u0000\u02ed\u02ef\u0003"+
		"~?\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ef{\u0001\u0000\u0000\u0000\u02f0\u02f1\u0007\u0003\u0000\u0000"+
		"\u02f1}\u0001\u0000\u0000\u0000\u02f2\u02f3\u0003\u0080@\u0000\u02f3\u007f"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f5\u0007\u0004\u0000\u0000\u02f5\u0081"+
		"\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\u001e\u0000\u0000\u02f7\u0083"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f9\u0007\u0005\u0000\u0000\u02f9\u0085"+
		"\u0001\u0000\u0000\u0000_\u0087\u0097\u009b\u00a2\u00a8\u00ac\u00b3\u00bb"+
		"\u00c0\u00c2\u00c6\u00cd\u00d1\u00d9\u00e4\u00e8\u00f2\u00f8\u0106\u010b"+
		"\u010f\u0116\u0119\u011d\u0122\u012e\u0133\u0136\u013b\u0141\u0146\u014f"+
		"\u0153\u0158\u015d\u0163\u0167\u0176\u0179\u017e\u0186\u0189\u0192\u019a"+
		"\u019e\u01a0\u01a5\u01a9\u01ac\u01b1\u01b6\u01bc\u01c3\u01c5\u01cd\u01d5"+
		"\u01eb\u0200\u020a\u020e\u0218\u021a\u0220\u0227\u0236\u0242\u024d\u0259"+
		"\u025c\u0260\u0263\u0267\u0271\u0278\u0280\u0283\u0288\u028f\u0292\u0297"+
		"\u029f\u02a3\u02a5\u02af\u02b3\u02b7\u02bf\u02c5\u02ca\u02cd\u02d4\u02da"+
		"\u02e0\u02e8\u02ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
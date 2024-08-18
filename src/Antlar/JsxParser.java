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
		QuestionMark=21, Default=22, Export=23, Import=24, Style=25, Image=26, 
		Button=27, Height=28, Width=29, MarginLeft=30, MarginRight=31, MarginTop=32, 
		MarginBottom=33, Multiply=34, As=35, Return=36, Var=37, Const=38, StrictLet=39, 
		Comma=40, Async=41, BackTick=42, Function_=43, UseEffect=44, UseRef=45, 
		UseState=46, Ellipsis=47, Identifier=48, WS=49, StringLiteral=50, NullLiteral=51, 
		BooleanLiteral=52, DecimalLiteral=53, HexIntegerLiteral=54, OctalIntegerLiteral=55, 
		OctalIntegerLiteral2=56, BinaryIntegerLiteral=57, BigHexIntegerLiteral=58, 
		BigOctalIntegerLiteral=59, BigBinaryIntegerLiteral=60, BigDecimalIntegerLiteral=61, 
		TemplateStringStartExpression=62, TemplateStringAtom=63, TagOpen=64, TagClose=65, 
		TagSlashClose=66, TagSlash=67, TagName=68, AttributeValue=69, Attribute=70, 
		TagEquals=71;
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
		RULE_htmlChardata = 49, RULE_htmlAttributeValue = 50, RULE_style = 51, 
		RULE_height = 52, RULE_width = 53, RULE_margin = 54, RULE_marginKay = 55, 
		RULE_assignable = 56, RULE_objectLiteral = 57, RULE_objectExpressionSequence = 58, 
		RULE_anoymousFunction = 59, RULE_arrowFunctionParameters = 60, RULE_arrowFunctionBody = 61, 
		RULE_literal = 62, RULE_templateStringLiteral = 63, RULE_templateStringAtom = 64, 
		RULE_numericLiteral = 65, RULE_identifierName = 66, RULE_identifier = 67, 
		RULE_reservedWord = 68, RULE_keyword = 69, RULE_let_ = 70, RULE_eos = 71;
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
			"htmlAttributeValue", "style", "height", "width", "margin", "marginKay", 
			"assignable", "objectLiteral", "objectExpressionSequence", "anoymousFunction", 
			"arrowFunctionParameters", "arrowFunctionBody", "literal", "templateStringLiteral", 
			"templateStringAtom", "numericLiteral", "identifierName", "identifier", 
			"reservedWord", "keyword", "let_", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'<'", "'>'", 
			"'/'", "'-'", "'='", "';'", "'=>'", "'+'", "'.'", "'from'", "'if'", "'else'", 
			"'#'", "'?'", "'default'", "'export'", "'import'", "'style'", "'image'", 
			"'button'", "'height'", "'width'", "'margin-left'", "'margin-right'", 
			"' margin-top'", "'margin-bottom'", "'*'", "'as'", "'return'", "'var'", 
			"'const'", "'let'", "','", "'async'", null, "'function'", "'useEffect'", 
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
			"QuestionMark", "Default", "Export", "Import", "Style", "Image", "Button", 
			"Height", "Width", "MarginLeft", "MarginRight", "MarginTop", "MarginBottom", 
			"Multiply", "As", "Return", "Var", "Const", "StrictLet", "Comma", "Async", 
			"BackTick", "Function_", "UseEffect", "UseRef", "UseState", "Ellipsis", 
			"Identifier", "WS", "StringLiteral", "NullLiteral", "BooleanLiteral", 
			"DecimalLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "OctalIntegerLiteral2", 
			"BinaryIntegerLiteral", "BigHexIntegerLiteral", "BigOctalIntegerLiteral", 
			"BigBinaryIntegerLiteral", "BigDecimalIntegerLiteral", "TemplateStringStartExpression", 
			"TemplateStringAtom", "TagOpen", "TagClose", "TagSlashClose", "TagSlash", 
			"TagName", "AttributeValue", "Attribute", "TagEquals"
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(144);
				sourceElements();
				}
			}

			setState(147);
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
			setState(149);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				emptyStatement_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				exportStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				variableStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				importStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
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
			setState(163);
			match(OpenBrace);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(164);
				statementList();
				}
			}

			setState(167);
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
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				statement();
				}
				}
				setState(172); 
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
			setState(174);
			match(Import);
			setState(175);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case From:
			case Default:
			case Export:
			case Import:
			case Style:
			case Multiply:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(177);
					importDefault();
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(180);
					importNamespace();
					}
					break;
				case 2:
					{
					setState(181);
					moduleItems();
					}
					break;
				}
				setState(184);
				importFrom();
				setState(185);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(StringLiteral);
				setState(188);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(OpenBrace);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						aliasName();
						setState(193);
						match(Comma);
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Style) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier))) != 0)) {
					{
					setState(200);
					aliasName();
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(201);
						match(Comma);
						}
					}

					}
				}

				setState(206);
				match(CloseBrace);
				}
				break;
			case UseState:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
			setState(210);
			aliasName();
			setState(211);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(213);
				match(Multiply);
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Style:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				{
				setState(214);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(217);
				match(As);
				setState(218);
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
			setState(221);
			match(From);
			setState(222);
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
			setState(224);
			identifierName();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(225);
				match(As);
				setState(226);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(Export);
				{
				setState(230);
				declaration();
				}
				setState(231);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(Export);
				setState(234);
				match(Default);
				setState(235);
				singleExpression(0);
				setState(236);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case StrictLet:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				variableStatement();
				}
				break;
			case Async:
			case Function_:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
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
			setState(244);
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
			setState(246);
			varModifier();
			setState(247);
			variableDeclaration();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(248);
				match(Comma);
				setState(249);
				variableDeclaration();
				}
				}
				setState(254);
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
			setState(255);
			assignable();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(256);
				match(Assign);
				setState(257);
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
			setState(260);
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
			setState(262);
			expressionSequence();
			setState(263);
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
			setState(265);
			match(If);
			setState(266);
			match(OpenParen);
			setState(267);
			expressionSequence();
			setState(268);
			match(CloseParen);
			setState(269);
			statement();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(270);
				match(Else);
				setState(271);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(Var);
				}
				break;
			case StrictLet:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				let_();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(Return);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(280);
					expressionSequence();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(Return);
				setState(284);
				match(OpenParen);
				setState(285);
				htmlElements();
				setState(286);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(290);
				match(Async);
				}
			}

			setState(293);
			match(Function_);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(294);
				match(Multiply);
				}
			}

			setState(297);
			identifier();
			setState(298);
			match(OpenParen);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
				{
				setState(299);
				formalParameterList();
				}
			}

			setState(302);
			match(CloseParen);
			setState(303);
			match(OpenBrace);
			setState(304);
			functionBody();
			setState(305);
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				formalParameterArg();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(Comma);
						setState(309);
						formalParameterArg();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(315);
					match(Comma);
					setState(316);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
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
			setState(322);
			assignable();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(323);
				match(Assign);
				setState(324);
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
			setState(327);
			match(Ellipsis);
			setState(328);
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << SemiColon) | (1L << If) | (1L << Export) | (1L << Import) | (1L << Return) | (1L << Var) | (1L << Const) | (1L << StrictLet) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(330);
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
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				sourceElement();
				}
				}
				setState(336); 
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
			setState(338);
			match(OpenBracket);
			setState(339);
			elementList();
			setState(340);
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
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(Comma);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(348);
				arrayElement();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(351);
						match(Comma);
						}
						}
						setState(354); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(356);
					arrayElement();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(362);
				match(Comma);
				}
				}
				setState(367);
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
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(368);
				match(Ellipsis);
				}
			}

			setState(371);
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
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				propertyName();
				setState(374);
				match(Colon);
				setState(375);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(OpenBracket);
				setState(378);
				singleExpression(0);
				setState(379);
				match(CloseBracket);
				setState(380);
				match(Colon);
				setState(381);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(383);
					match(Async);
					}
					break;
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(386);
					match(Multiply);
					}
				}

				setState(389);
				propertyName();
				setState(390);
				match(OpenParen);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(391);
					formalParameterList();
					}
				}

				setState(394);
				match(CloseParen);
				setState(395);
				match(OpenBrace);
				setState(396);
				functionBody();
				setState(397);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(399);
					match(Ellipsis);
					}
				}

				setState(402);
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
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case From:
			case Default:
			case Export:
			case Import:
			case Style:
			case Async:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(OpenBracket);
				setState(409);
				singleExpression(0);
				setState(410);
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
			setState(414);
			match(OpenParen);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(415);
				argument();
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						match(Comma);
						setState(417);
						argument();
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(423);
					match(Comma);
					}
				}

				}
			}

			setState(428);
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
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(430);
				match(Ellipsis);
				}
			}

			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(433);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(434);
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
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(437);
				match(Ellipsis);
				}
			}

			setState(440);
			singleExpression(0);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(Comma);
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(442);
						match(Ellipsis);
						}
					}

					setState(445);
					singleExpression(0);
					}
					} 
				}
				setState(450);
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
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UseEffect:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				useEffectHook();
				}
				break;
			case UseRef:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				useRefHook();
				}
				break;
			case UseState:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
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
			setState(456);
			match(UseEffect);
			setState(457);
			match(OpenParen);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(458);
				expressionSequence();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(459);
					match(Comma);
					setState(460);
					expressionSequence();
					}
				}

				}
			}

			setState(465);
			match(CloseParen);
			setState(466);
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
			setState(468);
			match(UseRef);
			setState(469);
			match(OpenParen);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(470);
				singleExpression(0);
				}
			}

			setState(473);
			match(CloseParen);
			setState(474);
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
			setState(476);
			match(UseState);
			setState(477);
			match(OpenParen);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << Import) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(478);
				singleExpression(0);
				}
			}

			setState(481);
			match(CloseParen);
			setState(482);
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
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new HtmlElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(485);
				htmlElements();
				}
				break;
			case 2:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486);
				match(OpenParen);
				setState(487);
				expressionSequence();
				setState(488);
				match(CloseParen);
				}
				break;
			case 3:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490);
				anoymousFunction();
				}
				break;
			case 4:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				match(Import);
				setState(492);
				match(OpenParen);
				setState(493);
				singleExpression(0);
				setState(494);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new HookContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				reactHook();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				arrayLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				objectLiteral();
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				identifier();
				}
				break;
			case 9:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(503);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(504);
						_la = _input.LA(1);
						if ( !(_la==Minus || _la==Plus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						singleExpression(14);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(506);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(507);
						_la = _input.LA(1);
						if ( !(_la==Divide || _la==Multiply) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(508);
						singleExpression(13);
						}
						break;
					case 3:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(509);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(510);
						match(QuestionMark);
						setState(511);
						singleExpression(0);
						setState(512);
						match(Colon);
						setState(513);
						singleExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(515);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(522);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(516);
							match(LessThan);
							}
							break;
						case 2:
							{
							setState(517);
							match(MoreThan);
							}
							break;
						case 3:
							{
							setState(518);
							match(LessThan);
							setState(519);
							match(Assign);
							}
							break;
						case 4:
							{
							setState(520);
							match(MoreThan);
							setState(521);
							match(Assign);
							}
							break;
						}
						setState(524);
						singleExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(525);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(526);
						match(Assign);
						setState(527);
						singleExpression(5);
						}
						break;
					case 6:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(528);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(529);
						templateStringLiteral();
						}
						break;
					case 7:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(530);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(532);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(531);
							match(QuestionMark);
							}
						}

						setState(534);
						match(Dot);
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(535);
							match(Hashtag);
							}
						}

						setState(538);
						identifierName();
						}
						break;
					case 8:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(539);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(540);
						arguments();
						}
						break;
					case 9:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(541);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(542);
						match(OpenBracket);
						setState(543);
						expressionSequence();
						setState(544);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(550);
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
			setState(552); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(551);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(554); 
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
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(LessThan);
				setState(557);
				htmlTagStartName();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (Style - 25)) | (1L << (Identifier - 25)) | (1L << (TagName - 25)))) != 0)) {
					{
					{
					setState(558);
					htmlAttribute();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(MoreThan);
				setState(565);
				htmlContent();
				setState(566);
				match(LessThan);
				setState(567);
				match(Divide);
				setState(568);
				htmlTagClosingName();
				setState(569);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(LessThan);
				setState(572);
				htmlTagName();
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(573);
						htmlAttribute();
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(579);
				htmlContent();
				setState(580);
				match(Divide);
				setState(581);
				match(MoreThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(LessThan);
				setState(584);
				htmlTagName();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (Style - 25)) | (1L << (Identifier - 25)) | (1L << (TagName - 25)))) != 0)) {
					{
					{
					setState(585);
					htmlAttribute();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(Divide);
				setState(592);
				match(MoreThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(LessThan);
				setState(595);
				htmlTagName();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (Style - 25)) | (1L << (Identifier - 25)) | (1L << (TagName - 25)))) != 0)) {
					{
					{
					setState(596);
					htmlAttribute();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				match(MoreThan);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				match(LessThan);
				setState(605);
				match(MoreThan);
				setState(606);
				htmlContent();
				setState(607);
				match(LessThan);
				setState(608);
				match(Divide);
				setState(609);
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
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(613);
				htmlChardata();
				}
				break;
			}
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(618);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(616);
						htmlElement();
						}
						break;
					case OpenBrace:
						{
						setState(617);
						objectExpressionSequence();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(621);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(620);
						htmlChardata();
						}
						break;
					}
					}
					} 
				}
				setState(627);
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
			setState(628);
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
			setState(630);
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
		public TerminalNode Button() { return getToken(JsxParser.Button, 0); }
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
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Button:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(Button);
				}
				break;
			case TagName:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(TagName);
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Style:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				keyword();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
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
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				style();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				htmlAttributeName();
				setState(640);
				match(Assign);
				setState(641);
				htmlAttributeValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
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
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(TagName);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(Identifier);
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(Minus);
						setState(649);
						match(Identifier);
						}
						} 
					}
					setState(654);
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
			setState(658); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(657);
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
				setState(660); 
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
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(AttributeValue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				objectExpressionSequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(OpenBrace);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(666);
					objectExpressionSequence();
					}
				}

				setState(669);
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode Style() { return getToken(JsxParser.Style, 0); }
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public TerminalNode OpenBrace() { return getToken(JsxParser.OpenBrace, 0); }
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(JsxParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JsxParser.Comma, i);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JsxParser.CloseBrace, 0); }
		public List<MarginContext> margin() {
			return getRuleContexts(MarginContext.class);
		}
		public MarginContext margin(int i) {
			return getRuleContext(MarginContext.class,i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_style);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(Style);
			setState(673);
			match(Assign);
			setState(674);
			match(OpenBrace);
			setState(675);
			height();
			setState(676);
			match(Comma);
			setState(677);
			width();
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(678);
					match(Comma);
					setState(679);
					margin();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(685);
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

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode Height() { return getToken(JsxParser.Height, 0); }
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(Height);
			setState(688);
			match(Assign);
			setState(689);
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

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode Width() { return getToken(JsxParser.Width, 0); }
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(Width);
			setState(692);
			match(Assign);
			setState(693);
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

	public static class MarginContext extends ParserRuleContext {
		public MarginKayContext marginKay() {
			return getRuleContext(MarginKayContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JsxParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(JsxParser.StringLiteral, 0); }
		public MarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterMargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitMargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitMargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginContext margin() throws RecognitionException {
		MarginContext _localctx = new MarginContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_margin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			marginKay();
			setState(696);
			match(Assign);
			setState(697);
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

	public static class MarginKayContext extends ParserRuleContext {
		public TerminalNode MarginLeft() { return getToken(JsxParser.MarginLeft, 0); }
		public TerminalNode MarginRight() { return getToken(JsxParser.MarginRight, 0); }
		public TerminalNode MarginTop() { return getToken(JsxParser.MarginTop, 0); }
		public TerminalNode MarginBottom() { return getToken(JsxParser.MarginBottom, 0); }
		public MarginKayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginKay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).enterMarginKay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsxParserListener ) ((JsxParserListener)listener).exitMarginKay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsxParserVisitor ) return ((JsxParserVisitor<? extends T>)visitor).visitMarginKay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginKayContext marginKay() throws RecognitionException {
		MarginKayContext _localctx = new MarginKayContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_marginKay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MarginLeft) | (1L << MarginRight) | (1L << MarginTop) | (1L << MarginBottom))) != 0)) ) {
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
		enterRule(_localctx, 112, RULE_assignable);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				identifier();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
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
		enterRule(_localctx, 114, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(OpenBrace);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParen) | (1L << OpenBracket) | (1L << OpenBrace) | (1L << LessThan) | (1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Style) | (1L << Multiply) | (1L << Async) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState) | (1L << Ellipsis) | (1L << Identifier) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(707);
				propertyAssignment();
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(708);
						match(Comma);
						setState(709);
						propertyAssignment();
						}
						} 
					}
					setState(714);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(715);
					match(Comma);
					}
				}

				}
			}

			setState(720);
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
		enterRule(_localctx, 116, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(OpenBrace);
			setState(723);
			expressionSequence();
			setState(724);
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
		enterRule(_localctx, 118, RULE_anoymousFunction);
		int _la;
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(727);
					match(Async);
					}
				}

				setState(730);
				match(Function_);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(731);
					match(Multiply);
					}
				}

				setState(734);
				match(OpenParen);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(735);
					formalParameterList();
					}
				}

				setState(738);
				match(CloseParen);
				setState(739);
				match(OpenBrace);
				setState(740);
				functionBody();
				setState(741);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(743);
					match(Async);
					}
					break;
				}
				setState(746);
				arrowFunctionParameters();
				setState(747);
				match(ARROW);
				setState(748);
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
		enterRule(_localctx, 120, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				identifier();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(OpenParen);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Async) | (1L << Ellipsis) | (1L << Identifier))) != 0)) {
					{
					setState(754);
					formalParameterList();
					}
				}

				setState(757);
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
		enterRule(_localctx, 122, RULE_arrowFunctionBody);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(OpenBrace);
				setState(762);
				functionBody();
				setState(763);
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
		enterRule(_localctx, 124, RULE_literal);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
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
		enterRule(_localctx, 126, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(BackTick);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(774);
				templateStringAtom();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
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
		enterRule(_localctx, 128, RULE_templateStringAtom);
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(TemplateStringStartExpression);
				setState(784);
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
		enterRule(_localctx, 130, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
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
		enterRule(_localctx, 132, RULE_identifierName);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				identifier();
				}
				break;
			case From:
			case Default:
			case Export:
			case Import:
			case Style:
			case Function_:
			case UseEffect:
			case UseRef:
			case UseState:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
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
		enterRule(_localctx, 134, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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
		enterRule(_localctx, 136, RULE_reservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
		public TerminalNode Style() { return getToken(JsxParser.Style, 0); }
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
		enterRule(_localctx, 138, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << From) | (1L << Default) | (1L << Export) | (1L << Import) | (1L << Style) | (1L << Function_) | (1L << UseEffect) | (1L << UseRef) | (1L << UseState))) != 0)) ) {
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
		enterRule(_localctx, 140, RULE_let_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
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
		enterRule(_localctx, 142, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
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
		"\u0004\u0001G\u0324\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0003\u0000\u0092\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00a6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u00ab\b"+
		"\u0004\u000b\u0004\f\u0004\u00ac\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b7"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00be\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00c4\b\u0007\n\u0007\f\u0007\u00c7\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00cb\b\u0007\u0003\u0007\u00cd\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00d1\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u00d8\b\t\u0001\t\u0001\t\u0003\t\u00dc\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e4\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ef\b\f\u0001\r\u0001\r\u0003\r\u00f3\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fb"+
		"\b\u000f\n\u000f\f\u000f\u00fe\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0103\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0111\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0116\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u011a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0121\b\u0015\u0001\u0016\u0003\u0016\u0124\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0128\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u012d\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0137"+
		"\b\u0017\n\u0017\f\u0017\u013a\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u013e\b\u0017\u0001\u0017\u0003\u0017\u0141\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0146\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0003\u001a\u014c\b\u001a\u0001\u001b\u0004\u001b\u014f"+
		"\b\u001b\u000b\u001b\f\u001b\u0150\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0005\u001d\u0158\b\u001d\n\u001d\f\u001d\u015b"+
		"\t\u001d\u0001\u001d\u0003\u001d\u015e\b\u001d\u0001\u001d\u0004\u001d"+
		"\u0161\b\u001d\u000b\u001d\f\u001d\u0162\u0001\u001d\u0005\u001d\u0166"+
		"\b\u001d\n\u001d\f\u001d\u0169\t\u001d\u0001\u001d\u0005\u001d\u016c\b"+
		"\u001d\n\u001d\f\u001d\u016f\t\u001d\u0001\u001e\u0003\u001e\u0172\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0181\b\u001f\u0001\u001f\u0003\u001f\u0184\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0189\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0191\b\u001f\u0001\u001f\u0003\u001f\u0194\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u019d\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u01a3\b!\n!\f!\u01a6\t!\u0001!\u0003!\u01a9\b!\u0003!"+
		"\u01ab\b!\u0001!\u0001!\u0001\"\u0003\"\u01b0\b\"\u0001\"\u0001\"\u0003"+
		"\"\u01b4\b\"\u0001#\u0003#\u01b7\b#\u0001#\u0001#\u0001#\u0003#\u01bc"+
		"\b#\u0001#\u0005#\u01bf\b#\n#\f#\u01c2\t#\u0001$\u0001$\u0001$\u0003$"+
		"\u01c7\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01ce\b%\u0003%\u01d0"+
		"\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u01d8\b&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u01e0\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01f6\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u020b"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0215"+
		"\b(\u0001(\u0001(\u0003(\u0219\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0005(\u0223\b(\n(\f(\u0226\t(\u0001)\u0004)\u0229\b)"+
		"\u000b)\f)\u022a\u0001*\u0001*\u0001*\u0005*\u0230\b*\n*\f*\u0233\t*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u023f\b*\n*\f*\u0242\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u024b\b*\n*\f*\u024e\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u0256\b*\n*\f*\u0259\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0264\b*\u0001+\u0003+\u0267\b+\u0001+\u0001"+
		"+\u0003+\u026b\b+\u0001+\u0003+\u026e\b+\u0005+\u0270\b+\n+\f+\u0273\t"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003.\u027d"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0285\b/\u00010\u0001"+
		"0\u00010\u00010\u00050\u028b\b0\n0\f0\u028e\t0\u00030\u0290\b0\u00011"+
		"\u00041\u0293\b1\u000b1\f1\u0294\u00012\u00012\u00012\u00012\u00012\u0003"+
		"2\u029c\b2\u00012\u00032\u029f\b2\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u02a9\b3\n3\f3\u02ac\t3\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00018\u00038\u02c1\b8\u00019\u00019\u0001"+
		"9\u00019\u00059\u02c7\b9\n9\f9\u02ca\t9\u00019\u00039\u02cd\b9\u00039"+
		"\u02cf\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0003"+
		";\u02d9\b;\u0001;\u0001;\u0003;\u02dd\b;\u0001;\u0001;\u0003;\u02e1\b"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02e9\b;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u02ef\b;\u0001<\u0001<\u0001<\u0003<\u02f4\b<\u0001"+
		"<\u0003<\u02f7\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u02fe\b=\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0304\b>\u0001?\u0001?\u0005?\u0308\b?\n"+
		"?\f?\u030b\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u0312\b@\u0001"+
		"A\u0001A\u0001B\u0001B\u0003B\u0318\bB\u0001C\u0001C\u0001D\u0001D\u0001"+
		"E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0001\u02aa\u0001PH\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0000\u0007\u0002\u0000\u000b\u000b\u000f"+
		"\u000f\u0002\u0000\n\n\"\"\u0002\u0000\u0005\u0005\b\b\u0001\u0000\u001e"+
		"!\u0002\u0000))00\u0003\u0000\u0011\u0011\u0016\u0019+.\u0001\u0001\r"+
		"\r\u0365\u0000\u0091\u0001\u0000\u0000\u0000\u0002\u0095\u0001\u0000\u0000"+
		"\u0000\u0004\u00a1\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000"+
		"\u0000\b\u00aa\u0001\u0000\u0000\u0000\n\u00ae\u0001\u0000\u0000\u0000"+
		"\f\u00bd\u0001\u0000\u0000\u0000\u000e\u00d0\u0001\u0000\u0000\u0000\u0010"+
		"\u00d2\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014"+
		"\u00dd\u0001\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018"+
		"\u00ee\u0001\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000\u0000\u001c"+
		"\u00f4\u0001\u0000\u0000\u0000\u001e\u00f6\u0001\u0000\u0000\u0000 \u00ff"+
		"\u0001\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000$\u0106\u0001"+
		"\u0000\u0000\u0000&\u0109\u0001\u0000\u0000\u0000(\u0115\u0001\u0000\u0000"+
		"\u0000*\u0120\u0001\u0000\u0000\u0000,\u0123\u0001\u0000\u0000\u0000."+
		"\u0140\u0001\u0000\u0000\u00000\u0142\u0001\u0000\u0000\u00002\u0147\u0001"+
		"\u0000\u0000\u00004\u014b\u0001\u0000\u0000\u00006\u014e\u0001\u0000\u0000"+
		"\u00008\u0152\u0001\u0000\u0000\u0000:\u0159\u0001\u0000\u0000\u0000<"+
		"\u0171\u0001\u0000\u0000\u0000>\u0193\u0001\u0000\u0000\u0000@\u019c\u0001"+
		"\u0000\u0000\u0000B\u019e\u0001\u0000\u0000\u0000D\u01af\u0001\u0000\u0000"+
		"\u0000F\u01b6\u0001\u0000\u0000\u0000H\u01c6\u0001\u0000\u0000\u0000J"+
		"\u01c8\u0001\u0000\u0000\u0000L\u01d4\u0001\u0000\u0000\u0000N\u01dc\u0001"+
		"\u0000\u0000\u0000P\u01f5\u0001\u0000\u0000\u0000R\u0228\u0001\u0000\u0000"+
		"\u0000T\u0263\u0001\u0000\u0000\u0000V\u0266\u0001\u0000\u0000\u0000X"+
		"\u0274\u0001\u0000\u0000\u0000Z\u0276\u0001\u0000\u0000\u0000\\\u027c"+
		"\u0001\u0000\u0000\u0000^\u0284\u0001\u0000\u0000\u0000`\u028f\u0001\u0000"+
		"\u0000\u0000b\u0292\u0001\u0000\u0000\u0000d\u029e\u0001\u0000\u0000\u0000"+
		"f\u02a0\u0001\u0000\u0000\u0000h\u02af\u0001\u0000\u0000\u0000j\u02b3"+
		"\u0001\u0000\u0000\u0000l\u02b7\u0001\u0000\u0000\u0000n\u02bb\u0001\u0000"+
		"\u0000\u0000p\u02c0\u0001\u0000\u0000\u0000r\u02c2\u0001\u0000\u0000\u0000"+
		"t\u02d2\u0001\u0000\u0000\u0000v\u02ee\u0001\u0000\u0000\u0000x\u02f6"+
		"\u0001\u0000\u0000\u0000z\u02fd\u0001\u0000\u0000\u0000|\u0303\u0001\u0000"+
		"\u0000\u0000~\u0305\u0001\u0000\u0000\u0000\u0080\u0311\u0001\u0000\u0000"+
		"\u0000\u0082\u0313\u0001\u0000\u0000\u0000\u0084\u0317\u0001\u0000\u0000"+
		"\u0000\u0086\u0319\u0001\u0000\u0000\u0000\u0088\u031b\u0001\u0000\u0000"+
		"\u0000\u008a\u031d\u0001\u0000\u0000\u0000\u008c\u031f\u0001\u0000\u0000"+
		"\u0000\u008e\u0321\u0001\u0000\u0000\u0000\u0090\u0092\u00036\u001b\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0000\u0000\u0001"+
		"\u0094\u0001\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000"+
		"\u0096\u0003\u0001\u0000\u0000\u0000\u0097\u00a2\u0003\u0006\u0003\u0000"+
		"\u0098\u00a2\u0003\"\u0011\u0000\u0099\u00a2\u0003,\u0016\u0000\u009a"+
		"\u00a2\u0003*\u0015\u0000\u009b\u00a2\u0003$\u0012\u0000\u009c\u00a2\u0003"+
		"\u0018\f\u0000\u009d\u00a2\u0003&\u0013\u0000\u009e\u00a2\u0003\u001c"+
		"\u000e\u0000\u009f\u00a2\u0003\n\u0005\u0000\u00a0\u00a2\u0003H$\u0000"+
		"\u00a1\u0097\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000"+
		"\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000\u0000"+
		"\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000"+
		"\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0005\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0005\u0000\u0000"+
		"\u00a4\u00a6\u0003\b\u0004\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0006\u0000\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0003\u0004\u0002\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\t\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0018\u0000\u0000\u00af\u00b0\u0003\f\u0006\u0000\u00b0\u000b\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0003\u0010\b\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0003\u0012\t\u0000\u00b5\u00b7\u0003\u000e\u0007"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0014\n\u0000"+
		"\u00b9\u00ba\u0003\u008eG\u0000\u00ba\u00be\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u00052\u0000\u0000\u00bc\u00be\u0003\u008eG\u0000\u00bd\u00b2\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\r\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c5\u0005\u0005\u0000\u0000\u00c0\u00c1\u0003\u0016"+
		"\u000b\u0000\u00c1\u00c2\u0005(\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00cc\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0003\u0016\u000b\u0000\u00c9\u00cb\u0005(\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d1\u0005\u0006\u0000\u0000\u00cf\u00d1\u0005.\u0000\u0000\u00d0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u000f\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0016\u000b\u0000\u00d3"+
		"\u00d4\u0005(\u0000\u0000\u00d4\u0011\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0005\"\u0000\u0000\u00d6\u00d8\u0003\u0084B\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005#\u0000\u0000\u00da\u00dc\u0003\u0084"+
		"B\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0011\u0000"+
		"\u0000\u00de\u00df\u00052\u0000\u0000\u00df\u0015\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0003\u0084B\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2\u00e4"+
		"\u0003\u0084B\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u0017\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0017\u0000\u0000\u00e6\u00e7\u0003\u001a\r\u0000\u00e7\u00e8\u0003\u008e"+
		"G\u0000\u00e8\u00ef\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0017\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000\u00eb\u00ec\u0003P(\u0000\u00ec"+
		"\u00ed\u0003\u008eG\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e5"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ef\u0019"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003\u001c\u000e\u0000\u00f1\u00f3"+
		"\u0003,\u0016\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u001b\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003"+
		"\u001e\u000f\u0000\u00f5\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003"+
		"(\u0014\u0000\u00f7\u00fc\u0003 \u0010\u0000\u00f8\u00f9\u0005(\u0000"+
		"\u0000\u00f9\u00fb\u0003 \u0010\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u001f\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0003p8\u0000\u0100\u0101"+
		"\u0005\f\u0000\u0000\u0101\u0103\u0003P(\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103!\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\r\u0000\u0000\u0105#\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0003F#\u0000\u0107\u0108\u0003\u008eG\u0000\u0108%\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0012\u0000\u0000\u010a\u010b\u0005"+
		"\u0001\u0000\u0000\u010b\u010c\u0003F#\u0000\u010c\u010d\u0005\u0002\u0000"+
		"\u0000\u010d\u0110\u0003\u0004\u0002\u0000\u010e\u010f\u0005\u0013\u0000"+
		"\u0000\u010f\u0111\u0003\u0004\u0002\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000\u0000"+
		"\u0112\u0116\u0005%\u0000\u0000\u0113\u0116\u0003\u008cF\u0000\u0114\u0116"+
		"\u0005&\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116)\u0001\u0000"+
		"\u0000\u0000\u0117\u0119\u0005$\u0000\u0000\u0118\u011a\u0003F#\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u0121\u0001\u0000\u0000\u0000\u011b\u011c\u0005$\u0000\u0000\u011c"+
		"\u011d\u0005\u0001\u0000\u0000\u011d\u011e\u0003R)\u0000\u011e\u011f\u0005"+
		"\u0002\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0117\u0001"+
		"\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0121+\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0005)\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0005+\u0000\u0000\u0126\u0128\u0005\"\u0000\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0003\u0086C\u0000\u012a"+
		"\u012c\u0005\u0001\u0000\u0000\u012b\u012d\u0003.\u0017\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0002\u0000\u0000\u012f\u0130"+
		"\u0005\u0005\u0000\u0000\u0130\u0131\u00034\u001a\u0000\u0131\u0132\u0005"+
		"\u0006\u0000\u0000\u0132-\u0001\u0000\u0000\u0000\u0133\u0138\u00030\u0018"+
		"\u0000\u0134\u0135\u0005(\u0000\u0000\u0135\u0137\u00030\u0018\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013d\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005(\u0000\u0000\u013c\u013e\u00032\u0019\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u00032\u0019\u0000\u0140\u0133\u0001\u0000"+
		"\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141/\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0003p8\u0000\u0143\u0144\u0005\f\u0000\u0000\u0144"+
		"\u0146\u0003P(\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u01461\u0001\u0000\u0000\u0000\u0147\u0148\u0005/\u0000"+
		"\u0000\u0148\u0149\u0003P(\u0000\u01493\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u00036\u001b\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c5\u0001\u0000\u0000\u0000\u014d\u014f\u0003"+
		"\u0002\u0001\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u01517\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0003"+
		"\u0000\u0000\u0153\u0154\u0003:\u001d\u0000\u0154\u0155\u0005\u0004\u0000"+
		"\u0000\u01559\u0001\u0000\u0000\u0000\u0156\u0158\u0005(\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"+
		"\u015e\u0003<\u001e\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0167\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0005(\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0003"+
		"<\u001e\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u016d\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0005(\u0000\u0000\u016b\u016a\u0001\u0000\u0000"+
		"\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e;\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0172\u0005/\u0000\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0003P(\u0000\u0174=\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0003@ \u0000\u0176\u0177\u0005\u0007\u0000"+
		"\u0000\u0177\u0178\u0003P(\u0000\u0178\u0194\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0005\u0003\u0000\u0000\u017a\u017b\u0003P(\u0000\u017b\u017c\u0005"+
		"\u0004\u0000\u0000\u017c\u017d\u0005\u0007\u0000\u0000\u017d\u017e\u0003"+
		"P(\u0000\u017e\u0194\u0001\u0000\u0000\u0000\u017f\u0181\u0005)\u0000"+
		"\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0184\u0005\"\u0000\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0003@ \u0000\u0186\u0188"+
		"\u0005\u0001\u0000\u0000\u0187\u0189\u0003.\u0017\u0000\u0188\u0187\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0005\u0002\u0000\u0000\u018b\u018c\u0005"+
		"\u0005\u0000\u0000\u018c\u018d\u00034\u001a\u0000\u018d\u018e\u0005\u0006"+
		"\u0000\u0000\u018e\u0194\u0001\u0000\u0000\u0000\u018f\u0191\u0005/\u0000"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0003P(\u0000\u0193"+
		"\u0175\u0001\u0000\u0000\u0000\u0193\u0179\u0001\u0000\u0000\u0000\u0193"+
		"\u0180\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0194"+
		"?\u0001\u0000\u0000\u0000\u0195\u019d\u0003\u0084B\u0000\u0196\u019d\u0005"+
		"2\u0000\u0000\u0197\u019d\u0003\u0082A\u0000\u0198\u0199\u0005\u0003\u0000"+
		"\u0000\u0199\u019a\u0003P(\u0000\u019a\u019b\u0005\u0004\u0000\u0000\u019b"+
		"\u019d\u0001\u0000\u0000\u0000\u019c\u0195\u0001\u0000\u0000\u0000\u019c"+
		"\u0196\u0001\u0000\u0000\u0000\u019c\u0197\u0001\u0000\u0000\u0000\u019c"+
		"\u0198\u0001\u0000\u0000\u0000\u019dA\u0001\u0000\u0000\u0000\u019e\u01aa"+
		"\u0005\u0001\u0000\u0000\u019f\u01a4\u0003D\"\u0000\u01a0\u01a1\u0005"+
		"(\u0000\u0000\u01a1\u01a3\u0003D\"\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0005(\u0000\u0000"+
		"\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u019f\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0005\u0002\u0000\u0000\u01adC\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b0\u0005/\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01b4"+
		"\u0003P(\u0000\u01b2\u01b4\u0003\u0086C\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4E\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b7\u0005/\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8\u01c0\u0003P(\u0000\u01b9\u01bb\u0005(\u0000\u0000\u01ba\u01bc"+
		"\u0005/\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003"+
		"P(\u0000\u01be\u01b9\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1G\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c7\u0003J%\u0000\u01c4\u01c7\u0003L&\u0000\u01c5\u01c7\u0003"+
		"N\'\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7I\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005,\u0000\u0000\u01c9\u01cf\u0005\u0001\u0000\u0000"+
		"\u01ca\u01cd\u0003F#\u0000\u01cb\u01cc\u0005(\u0000\u0000\u01cc\u01ce"+
		"\u0003F#\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0005\u0002\u0000\u0000\u01d2\u01d3\u0003\u008e"+
		"G\u0000\u01d3K\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005-\u0000\u0000"+
		"\u01d5\u01d7\u0005\u0001\u0000\u0000\u01d6\u01d8\u0003P(\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u0002\u0000\u0000\u01da\u01db"+
		"\u0003\u008eG\u0000\u01dbM\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005."+
		"\u0000\u0000\u01dd\u01df\u0005\u0001\u0000\u0000\u01de\u01e0\u0003P(\u0000"+
		"\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u0002\u0000\u0000"+
		"\u01e2\u01e3\u0003\u008eG\u0000\u01e3O\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0006(\uffff\uffff\u0000\u01e5\u01f6\u0003R)\u0000\u01e6\u01e7\u0005"+
		"\u0001\u0000\u0000\u01e7\u01e8\u0003F#\u0000\u01e8\u01e9\u0005\u0002\u0000"+
		"\u0000\u01e9\u01f6\u0001\u0000\u0000\u0000\u01ea\u01f6\u0003v;\u0000\u01eb"+
		"\u01ec\u0005\u0018\u0000\u0000\u01ec\u01ed\u0005\u0001\u0000\u0000\u01ed"+
		"\u01ee\u0003P(\u0000\u01ee\u01ef\u0005\u0002\u0000\u0000\u01ef\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f6\u0003H$\u0000\u01f1\u01f6\u00038\u001c"+
		"\u0000\u01f2\u01f6\u0003r9\u0000\u01f3\u01f6\u0003\u0086C\u0000\u01f4"+
		"\u01f6\u0003|>\u0000\u01f5\u01e4\u0001\u0000\u0000\u0000\u01f5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01f5\u01ea\u0001\u0000\u0000\u0000\u01f5\u01eb\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6\u0224\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\n\r\u0000\u0000\u01f8\u01f9\u0007\u0000"+
		"\u0000\u0000\u01f9\u0223\u0003P(\u000e\u01fa\u01fb\n\f\u0000\u0000\u01fb"+
		"\u01fc\u0007\u0001\u0000\u0000\u01fc\u0223\u0003P(\r\u01fd\u01fe\n\u0007"+
		"\u0000\u0000\u01fe\u01ff\u0005\u0015\u0000\u0000\u01ff\u0200\u0003P(\u0000"+
		"\u0200\u0201\u0005\u0007\u0000\u0000\u0201\u0202\u0003P(\b\u0202\u0223"+
		"\u0001\u0000\u0000\u0000\u0203\u020a\n\u0006\u0000\u0000\u0204\u020b\u0005"+
		"\b\u0000\u0000\u0205\u020b\u0005\t\u0000\u0000\u0206\u0207\u0005\b\u0000"+
		"\u0000\u0207\u020b\u0005\f\u0000\u0000\u0208\u0209\u0005\t\u0000\u0000"+
		"\u0209\u020b\u0005\f\u0000\u0000\u020a\u0204\u0001\u0000\u0000\u0000\u020a"+
		"\u0205\u0001\u0000\u0000\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020a"+
		"\u0208\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u0223\u0003P(\u0007\u020d\u020e\n\u0005\u0000\u0000\u020e\u020f\u0005"+
		"\f\u0000\u0000\u020f\u0223\u0003P(\u0005\u0210\u0211\n\u0004\u0000\u0000"+
		"\u0211\u0223\u0003~?\u0000\u0212\u0214\n\u0003\u0000\u0000\u0213\u0215"+
		"\u0005\u0015\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218"+
		"\u0005\u0010\u0000\u0000\u0217\u0219\u0005\u0014\u0000\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u0223\u0003\u0084B\u0000\u021b\u021c\n"+
		"\u0002\u0000\u0000\u021c\u0223\u0003B!\u0000\u021d\u021e\n\u0001\u0000"+
		"\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0220\u0003F#\u0000\u0220"+
		"\u0221\u0005\u0004\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222"+
		"\u01f7\u0001\u0000\u0000\u0000\u0222\u01fa\u0001\u0000\u0000\u0000\u0222"+
		"\u01fd\u0001\u0000\u0000\u0000\u0222\u0203\u0001\u0000\u0000\u0000\u0222"+
		"\u020d\u0001\u0000\u0000\u0000\u0222\u0210\u0001\u0000\u0000\u0000\u0222"+
		"\u0212\u0001\u0000\u0000\u0000\u0222\u021b\u0001\u0000\u0000\u0000\u0222"+
		"\u021d\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225"+
		"Q\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0229"+
		"\u0003T*\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022bS\u0001\u0000\u0000\u0000\u022c\u022d\u0005\b\u0000"+
		"\u0000\u022d\u0231\u0003X,\u0000\u022e\u0230\u0003^/\u0000\u022f\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0005\t\u0000\u0000\u0235\u0236\u0003V+\u0000\u0236\u0237\u0005\b\u0000"+
		"\u0000\u0237\u0238\u0005\n\u0000\u0000\u0238\u0239\u0003Z-\u0000\u0239"+
		"\u023a\u0005\t\u0000\u0000\u023a\u0264\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005\b\u0000\u0000\u023c\u0240\u0003\\.\u0000\u023d\u023f\u0003^/\u0000"+
		"\u023e\u023d\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0003V+\u0000\u0244\u0245\u0005\n\u0000\u0000\u0245\u0246"+
		"\u0005\t\u0000\u0000\u0246\u0264\u0001\u0000\u0000\u0000\u0247\u0248\u0005"+
		"\b\u0000\u0000\u0248\u024c\u0003\\.\u0000\u0249\u024b\u0003^/\u0000\u024a"+
		"\u0249\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c"+
		"\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024f\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0005\n\u0000\u0000\u0250\u0251\u0005\t\u0000\u0000\u0251\u0264"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0005\b\u0000\u0000\u0253\u0257\u0003"+
		"\\.\u0000\u0254\u0256\u0003^/\u0000\u0255\u0254\u0001\u0000\u0000\u0000"+
		"\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000"+
		"\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000"+
		"\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025b\u0005\t\u0000\u0000\u025b"+
		"\u0264\u0001\u0000\u0000\u0000\u025c\u025d\u0005\b\u0000\u0000\u025d\u025e"+
		"\u0005\t\u0000\u0000\u025e\u025f\u0003V+\u0000\u025f\u0260\u0005\b\u0000"+
		"\u0000\u0260\u0261\u0005\n\u0000\u0000\u0261\u0262\u0005\t\u0000\u0000"+
		"\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u022c\u0001\u0000\u0000\u0000"+
		"\u0263\u023b\u0001\u0000\u0000\u0000\u0263\u0247\u0001\u0000\u0000\u0000"+
		"\u0263\u0252\u0001\u0000\u0000\u0000\u0263\u025c\u0001\u0000\u0000\u0000"+
		"\u0264U\u0001\u0000\u0000\u0000\u0265\u0267\u0003b1\u0000\u0266\u0265"+
		"\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0271"+
		"\u0001\u0000\u0000\u0000\u0268\u026b\u0003T*\u0000\u0269\u026b\u0003t"+
		":\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u026e\u0003b1\u0000\u026d"+
		"\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e"+
		"\u0270\u0001\u0000\u0000\u0000\u026f\u026a\u0001\u0000\u0000\u0000\u0270"+
		"\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0001\u0000\u0000\u0000\u0272W\u0001\u0000\u0000\u0000\u0273\u0271"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0003\\.\u0000\u0275Y\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0003\\.\u0000\u0277[\u0001\u0000\u0000\u0000"+
		"\u0278\u027d\u0005\u001b\u0000\u0000\u0279\u027d\u0005D\u0000\u0000\u027a"+
		"\u027d\u0003\u008aE\u0000\u027b\u027d\u00050\u0000\u0000\u027c\u0278\u0001"+
		"\u0000\u0000\u0000\u027c\u0279\u0001\u0000\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d]\u0001\u0000"+
		"\u0000\u0000\u027e\u0285\u0003f3\u0000\u027f\u0280\u0003`0\u0000\u0280"+
		"\u0281\u0005\f\u0000\u0000\u0281\u0282\u0003d2\u0000\u0282\u0285\u0001"+
		"\u0000\u0000\u0000\u0283\u0285\u0003`0\u0000\u0284\u027e\u0001\u0000\u0000"+
		"\u0000\u0284\u027f\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000\u0000"+
		"\u0000\u0285_\u0001\u0000\u0000\u0000\u0286\u0290\u0005D\u0000\u0000\u0287"+
		"\u028c\u00050\u0000\u0000\u0288\u0289\u0005\u000b\u0000\u0000\u0289\u028b"+
		"\u00050\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028e\u0001"+
		"\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001"+
		"\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001"+
		"\u0000\u0000\u0000\u028f\u0286\u0001\u0000\u0000\u0000\u028f\u0287\u0001"+
		"\u0000\u0000\u0000\u0290a\u0001\u0000\u0000\u0000\u0291\u0293\b\u0002"+
		"\u0000\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000"+
		"\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295c\u0001\u0000\u0000\u0000\u0296\u029f\u0005E\u0000\u0000"+
		"\u0297\u029f\u00052\u0000\u0000\u0298\u029f\u0003t:\u0000\u0299\u029b"+
		"\u0005\u0005\u0000\u0000\u029a\u029c\u0003t:\u0000\u029b\u029a\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000"+
		"\u0000\u0000\u029d\u029f\u0005\u0006\u0000\u0000\u029e\u0296\u0001\u0000"+
		"\u0000\u0000\u029e\u0297\u0001\u0000\u0000\u0000\u029e\u0298\u0001\u0000"+
		"\u0000\u0000\u029e\u0299\u0001\u0000\u0000\u0000\u029fe\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0005\u0019\u0000\u0000\u02a1\u02a2\u0005\f\u0000\u0000"+
		"\u02a2\u02a3\u0005\u0005\u0000\u0000\u02a3\u02a4\u0003h4\u0000\u02a4\u02a5"+
		"\u0005(\u0000\u0000\u02a5\u02aa\u0003j5\u0000\u02a6\u02a7\u0005(\u0000"+
		"\u0000\u02a7\u02a9\u0003l6\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ac\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005\u0006\u0000\u0000\u02ae"+
		"g\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\u001c\u0000\u0000\u02b0\u02b1"+
		"\u0005\f\u0000\u0000\u02b1\u02b2\u00052\u0000\u0000\u02b2i\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u0005\u001d\u0000\u0000\u02b4\u02b5\u0005\f\u0000"+
		"\u0000\u02b5\u02b6\u00052\u0000\u0000\u02b6k\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0003n7\u0000\u02b8\u02b9\u0005\f\u0000\u0000\u02b9\u02ba\u0005"+
		"2\u0000\u0000\u02bam\u0001\u0000\u0000\u0000\u02bb\u02bc\u0007\u0003\u0000"+
		"\u0000\u02bco\u0001\u0000\u0000\u0000\u02bd\u02c1\u0003\u0086C\u0000\u02be"+
		"\u02c1\u00038\u001c\u0000\u02bf\u02c1\u0003r9\u0000\u02c0\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1q\u0001\u0000\u0000\u0000\u02c2\u02ce\u0005\u0005"+
		"\u0000\u0000\u02c3\u02c8\u0003>\u001f\u0000\u02c4\u02c5\u0005(\u0000\u0000"+
		"\u02c5\u02c7\u0003>\u001f\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7"+
		"\u02ca\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02cb\u02cd\u0005(\u0000\u0000\u02cc\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf"+
		"\u0001\u0000\u0000\u0000\u02ce\u02c3\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1"+
		"\u0005\u0006\u0000\u0000\u02d1s\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005"+
		"\u0005\u0000\u0000\u02d3\u02d4\u0003F#\u0000\u02d4\u02d5\u0005\u0006\u0000"+
		"\u0000\u02d5u\u0001\u0000\u0000\u0000\u02d6\u02ef\u0003,\u0016\u0000\u02d7"+
		"\u02d9\u0005)\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9"+
		"\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02dc"+
		"\u0005+\u0000\u0000\u02db\u02dd\u0005\"\u0000\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0005\u0001\u0000\u0000\u02df\u02e1\u0003"+
		".\u0017\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005\u0002"+
		"\u0000\u0000\u02e3\u02e4\u0005\u0005\u0000\u0000\u02e4\u02e5\u00034\u001a"+
		"\u0000\u02e5\u02e6\u0005\u0006\u0000\u0000\u02e6\u02ef\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e9\u0005)\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0003x<\u0000\u02eb\u02ec\u0005\u000e\u0000\u0000\u02ec\u02ed"+
		"\u0003z=\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee\u02d6\u0001\u0000"+
		"\u0000\u0000\u02ee\u02d8\u0001\u0000\u0000\u0000\u02ee\u02e8\u0001\u0000"+
		"\u0000\u0000\u02efw\u0001\u0000\u0000\u0000\u02f0\u02f7\u0003\u0086C\u0000"+
		"\u02f1\u02f3\u0005\u0001\u0000\u0000\u02f2\u02f4\u0003.\u0017\u0000\u02f3"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f7\u0005\u0002\u0000\u0000\u02f6"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f6\u02f1\u0001\u0000\u0000\u0000\u02f7"+
		"y\u0001\u0000\u0000\u0000\u02f8\u02fe\u0003P(\u0000\u02f9\u02fa\u0005"+
		"\u0005\u0000\u0000\u02fa\u02fb\u00034\u001a\u0000\u02fb\u02fc\u0005\u0006"+
		"\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02f8\u0001\u0000"+
		"\u0000\u0000\u02fd\u02f9\u0001\u0000\u0000\u0000\u02fe{\u0001\u0000\u0000"+
		"\u0000\u02ff\u0304\u00053\u0000\u0000\u0300\u0304\u00054\u0000\u0000\u0301"+
		"\u0304\u00052\u0000\u0000\u0302\u0304\u0003\u0082A\u0000\u0303\u02ff\u0001"+
		"\u0000\u0000\u0000\u0303\u0300\u0001\u0000\u0000\u0000\u0303\u0301\u0001"+
		"\u0000\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0304}\u0001\u0000"+
		"\u0000\u0000\u0305\u0309\u0005*\u0000\u0000\u0306\u0308\u0003\u0080@\u0000"+
		"\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000"+
		"\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000"+
		"\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u0005*\u0000\u0000\u030d\u007f\u0001\u0000\u0000\u0000\u030e"+
		"\u0312\u0005?\u0000\u0000\u030f\u0310\u0005>\u0000\u0000\u0310\u0312\u0003"+
		"P(\u0000\u0311\u030e\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000"+
		"\u0000\u0312\u0081\u0001\u0000\u0000\u0000\u0313\u0314\u00055\u0000\u0000"+
		"\u0314\u0083\u0001\u0000\u0000\u0000\u0315\u0318\u0003\u0086C\u0000\u0316"+
		"\u0318\u0003\u0088D\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0316"+
		"\u0001\u0000\u0000\u0000\u0318\u0085\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0007\u0004\u0000\u0000\u031a\u0087\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0003\u008aE\u0000\u031c\u0089\u0001\u0000\u0000\u0000\u031d\u031e\u0007"+
		"\u0005\u0000\u0000\u031e\u008b\u0001\u0000\u0000\u0000\u031f\u0320\u0005"+
		"\'\u0000\u0000\u0320\u008d\u0001\u0000\u0000\u0000\u0321\u0322\u0007\u0006"+
		"\u0000\u0000\u0322\u008f\u0001\u0000\u0000\u0000`\u0091\u00a1\u00a5\u00ac"+
		"\u00b2\u00b6\u00bd\u00c5\u00ca\u00cc\u00d0\u00d7\u00db\u00e3\u00ee\u00f2"+
		"\u00fc\u0102\u0110\u0115\u0119\u0120\u0123\u0127\u012c\u0138\u013d\u0140"+
		"\u0145\u014b\u0150\u0159\u015d\u0162\u0167\u016d\u0171\u0180\u0183\u0188"+
		"\u0190\u0193\u019c\u01a4\u01a8\u01aa\u01af\u01b3\u01b6\u01bb\u01c0\u01c6"+
		"\u01cd\u01cf\u01d7\u01df\u01f5\u020a\u0214\u0218\u0222\u0224\u022a\u0231"+
		"\u0240\u024c\u0257\u0263\u0266\u026a\u026d\u0271\u027c\u0284\u028c\u028f"+
		"\u0294\u029b\u029e\u02aa\u02c0\u02c8\u02cc\u02ce\u02d8\u02dc\u02e0\u02e8"+
		"\u02ee\u02f3\u02f6\u02fd\u0303\u0309\u0311\u0317";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
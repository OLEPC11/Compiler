// Generated from E:/java projects/Compiler Projects/Compiler For Season 1/src/Antlar\JsxParser.g4 by ANTLR 4.10.1
package Antlar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsxParser}.
 */
public interface JsxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JsxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JsxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(JsxParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(JsxParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JsxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JsxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JsxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JsxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(JsxParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(JsxParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JsxParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JsxParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(JsxParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(JsxParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(JsxParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(JsxParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(JsxParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(JsxParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(JsxParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(JsxParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(JsxParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(JsxParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(JsxParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(JsxParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(JsxParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(JsxParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(JsxParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(JsxParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JsxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JsxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(JsxParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(JsxParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(JsxParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(JsxParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JsxParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JsxParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(JsxParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(JsxParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JsxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JsxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JsxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JsxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(JsxParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(JsxParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JsxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JsxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JsxParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JsxParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JsxParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JsxParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(JsxParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(JsxParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(JsxParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(JsxParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JsxParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JsxParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(JsxParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(JsxParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(JsxParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(JsxParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(JsxParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(JsxParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(JsxParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(JsxParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(JsxParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(JsxParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(JsxParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(JsxParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(JsxParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(JsxParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(JsxParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(JsxParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(JsxParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(JsxParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JsxParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JsxParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JsxParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JsxParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(JsxParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(JsxParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#reactHook}.
	 * @param ctx the parse tree
	 */
	void enterReactHook(JsxParser.ReactHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#reactHook}.
	 * @param ctx the parse tree
	 */
	void exitReactHook(JsxParser.ReactHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#useEffectHook}.
	 * @param ctx the parse tree
	 */
	void enterUseEffectHook(JsxParser.UseEffectHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#useEffectHook}.
	 * @param ctx the parse tree
	 */
	void exitUseEffectHook(JsxParser.UseEffectHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#useRefHook}.
	 * @param ctx the parse tree
	 */
	void enterUseRefHook(JsxParser.UseRefHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#useRefHook}.
	 * @param ctx the parse tree
	 */
	void exitUseRefHook(JsxParser.UseRefHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#useStateHook}.
	 * @param ctx the parse tree
	 */
	void enterUseStateHook(JsxParser.UseStateHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#useStateHook}.
	 * @param ctx the parse tree
	 */
	void exitUseStateHook(JsxParser.UseStateHookContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(JsxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(JsxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(JsxParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(JsxParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hook}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterHook(JsxParser.HookContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hook}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitHook(JsxParser.HookContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JsxParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JsxParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(JsxParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(JsxParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JsxParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JsxParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(JsxParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(JsxParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(JsxParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(JsxParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(JsxParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(JsxParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(JsxParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(JsxParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(JsxParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(JsxParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JsxParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JsxParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(JsxParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(JsxParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(JsxParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(JsxParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JsxParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JsxParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(JsxParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(JsxParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JsxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JsxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElementExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementExpression(JsxParser.HtmlElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElementExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementExpression(JsxParser.HtmlElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(JsxParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(JsxParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(JsxParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(JsxParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(JsxParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(JsxParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagStartName(JsxParser.HtmlTagStartNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagStartName(JsxParser.HtmlTagStartNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagClosingName(JsxParser.HtmlTagClosingNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagClosingName(JsxParser.HtmlTagClosingNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(JsxParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(JsxParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(JsxParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(JsxParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(JsxParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(JsxParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(JsxParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(JsxParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(JsxParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(JsxParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(JsxParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(JsxParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(JsxParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(JsxParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionSequence(JsxParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionSequence(JsxParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(JsxParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(JsxParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunctionDecl(JsxParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunctionDecl(JsxParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(JsxParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(JsxParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(JsxParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(JsxParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(JsxParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(JsxParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JsxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JsxParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringLiteral(JsxParser.TemplateStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringLiteral(JsxParser.TemplateStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringAtom(JsxParser.TemplateStringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringAtom(JsxParser.TemplateStringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(JsxParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(JsxParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(JsxParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(JsxParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JsxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JsxParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(JsxParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(JsxParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(JsxParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(JsxParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#let_}.
	 * @param ctx the parse tree
	 */
	void enterLet_(JsxParser.Let_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#let_}.
	 * @param ctx the parse tree
	 */
	void exitLet_(JsxParser.Let_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JsxParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(JsxParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsxParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(JsxParser.EosContext ctx);
}
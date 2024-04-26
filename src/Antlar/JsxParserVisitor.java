// Generated from E:/java projects/Compiler Projects/Compiler For Season 1/src/Antlar\JsxParser.g4 by ANTLR 4.10.1
package Antlar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsxParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JsxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(JsxParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JsxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JsxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(JsxParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(JsxParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(JsxParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#moduleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleItems(JsxParser.ModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(JsxParser.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(JsxParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(JsxParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(JsxParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(JsxParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JsxParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(JsxParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JsxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(JsxParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(JsxParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JsxParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(JsxParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JsxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JsxParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(JsxParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JsxParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JsxParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JsxParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(JsxParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(JsxParser.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(JsxParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(JsxParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(JsxParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(JsxParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(JsxParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(JsxParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedPropertyExpressionAssignment(JsxParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionProperty(JsxParser.FunctionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JsxParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyShorthand(JsxParser.PropertyShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(JsxParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JsxParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JsxParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(JsxParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#reactHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactHook(JsxParser.ReactHookContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#useEffectHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffectHook(JsxParser.UseEffectHookContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#useRefHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRefHook(JsxParser.UseRefHookContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#useStateHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateHook(JsxParser.UseStateHookContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JsxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringExpression(JsxParser.TemplateStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hook}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHook(JsxParser.HookContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JsxParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(JsxParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JsxParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(JsxParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(JsxParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(JsxParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(JsxParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(JsxParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(JsxParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(JsxParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(JsxParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JsxParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpression(JsxParser.ImportExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JsxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlElementExpression}
	 * labeled alternative in {@link JsxParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementExpression(JsxParser.HtmlElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(JsxParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(JsxParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(JsxParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlTagStartName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagStartName(JsxParser.HtmlTagStartNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlTagClosingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagClosingName(JsxParser.HtmlTagClosingNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(JsxParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(JsxParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeName(JsxParser.HtmlAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(JsxParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValue(JsxParser.HtmlAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(JsxParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(JsxParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionSequence(JsxParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(JsxParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnoymousFunctionDecl(JsxParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JsxParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(JsxParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionParameters(JsxParser.ArrowFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBody(JsxParser.ArrowFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JsxParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringLiteral(JsxParser.TemplateStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringAtom(JsxParser.TemplateStringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(JsxParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(JsxParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JsxParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(JsxParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(JsxParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#let_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_(JsxParser.Let_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JsxParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(JsxParser.EosContext ctx);
}
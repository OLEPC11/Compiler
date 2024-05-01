package VisitParserTree;
import Antlar.JsxParser;
import Antlar.JsxParserBaseVisitor;
import AstClasses.*;


import java.util.ArrayList;

public class Visitor extends JsxParserBaseVisitor {


    @Override
    public Program visitProgram(JsxParser.ProgramContext ctx) {
        Program program =new Program();
        if(ctx.sourceElements()!=null){
            program.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        return program;
    }
    @Override
    public SourceElements visitSourceElements(JsxParser.SourceElementsContext ctx){
        SourceElements sourceElements=new SourceElements();
        if(ctx.sourceElement()!=null){
          for (int i=0;i<ctx.sourceElement().size();i++){
              sourceElements.add(visitSourceElement(ctx.sourceElement(i)));
          }
        }
        return sourceElements;
    }

    @Override
    public SourceElement visitSourceElement(JsxParser.SourceElementContext ctx) {
       SourceElement sourceElement=new SourceElement();
       if(ctx.statement()!=null){
           sourceElement.setStatement(visitStatement(ctx.statement()));
       }
       return sourceElement;
    }

    @Override
    public Statement visitStatement(JsxParser.StatementContext ctx) {
        Statement statement=new Statement();
        if(ctx.block()!=null){
            statement.setBlock(visitBlock(ctx.block()));
        }
        if(ctx.emptyStatement_()!=null){
            statement.setEmptyStatement(visitEmptyStatement_(ctx.emptyStatement_()));
        }
        if(ctx.functionDeclaration()!=null){
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if(ctx.returnStatement()!=null){
            statement.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        }
        if(ctx.expressionStatement()!=null){
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if(ctx.exportStatement()!=null){
            statement.setExportStatement((ExportStatement)visit(ctx.exportStatement()));
        }
        if(ctx.ifStatement()!=null){
            statement.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }
        if(ctx.variableStatement()!=null){
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if(ctx.importStatement()!=null){
            statement.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        if(ctx.reactHook()!=null){
            statement.setReactHook(visitReactHook(ctx.reactHook()));
        }
        return statement;
    }

    @Override
    public Block visitBlock(JsxParser.BlockContext ctx) {
     Block block =new Block();
     if(ctx.statementList()!=null){
         block.setStatementList(visitStatementList(ctx.statementList()));
     }
     return block;
    }

    @Override
    public StatementList visitStatementList(JsxParser.StatementListContext ctx) {
        StatementList statementList=new StatementList();
        if(ctx.statement()!=null){
            for(int i=0;i<ctx.statement().size();i++){
                statementList.add(visitStatement(ctx.statement(i)));
            }
        }
        return statementList;
    }

    @Override
    public ImportStatement visitImportStatement(JsxParser.ImportStatementContext ctx) {
       ImportStatement importStatement=new ImportStatement();
       if(ctx.Import()!=null){
           importStatement.setImport(ctx.Import().getText());
       }
       if(ctx.importFromBlock()!=null){
           importStatement.setImportFromBlock(visitImportFromBlock(ctx.importFromBlock()));
       }
       return importStatement;
    }

    @Override
    public ImportFromBlock visitImportFromBlock(JsxParser.ImportFromBlockContext ctx) {
        ImportFromBlock importFromBlock=new ImportFromBlock();
        if(ctx.importDefault()!=null){
            importFromBlock.setImportDefault(visitImportDefault(ctx.importDefault()));
        }
        if(ctx.moduleItems()!=null){
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));
        }
        if(ctx.importNamespace()!=null){
            importFromBlock.setImportNamespace(visitImportNamespace(ctx.importNamespace()));
        }
        if(ctx.importFrom()!=null){
            importFromBlock.setImportFrom(visitImportFrom(ctx.importFrom()));
        }
        if(ctx.StringLiteral()!=null){
            importFromBlock.setStringLiteral(ctx.StringLiteral().getText());
        }
        if(ctx.eos()!=null){
            importFromBlock.setEos(visitEos(ctx.eos()));
        }
        return importFromBlock;
    }

    @Override
    public ModuleItems visitModuleItems(JsxParser.ModuleItemsContext ctx) {
        ModuleItems moduleItems=new ModuleItems();
        if(ctx.aliasName()!=null){
           for (int i=0;i<ctx.aliasName().size();i++){
               moduleItems.add(visitAliasName(ctx.aliasName(i)));
           }
        }
        return moduleItems;
    }

    @Override
    public ImportDefault visitImportDefault(JsxParser.ImportDefaultContext ctx) {
        ImportDefault importDefault=new ImportDefault();
        if(ctx.aliasName()!=null){
            importDefault.setAliasName(visitAliasName(ctx.aliasName()));
        }
        if(ctx.Comma()!=null){
            importDefault.setComma(ctx.Comma().getText());
        }
        return importDefault;
    }

    @Override
    public ImportNamespace visitImportNamespace(JsxParser.ImportNamespaceContext ctx) {
        ImportNamespace importNamespace=new ImportNamespace();
        if(ctx.identifierName()!=null){
            for(int i=0;i<ctx.identifierName().size();i++){
                importNamespace.add(visitIdentifierName(ctx.identifierName().get(i)));
                if(ctx.As()!=null){
                    importNamespace.setAs(ctx.As().getText());
                }
            }

        }
        return importNamespace;
    }

    @Override
    public ImportFrom visitImportFrom(JsxParser.ImportFromContext ctx) {
        ImportFrom importFrom=new ImportFrom();
        if(ctx.From()!=null){
            importFrom.setFrom(ctx.From().getText());
        }
        if(ctx.StringLiteral()!=null){
            importFrom.setStringLiteral(ctx.StringLiteral().getText());
        }
        return importFrom;
    }

    @Override
    public AliasName visitAliasName(JsxParser.AliasNameContext ctx) {
       AliasName aliasName=new AliasName();
       if(ctx.identifierName()!=null){
           for(int i=0;i<ctx.identifierName().size();i++) {
               aliasName.add(visitIdentifierName(ctx.identifierName(i)));
           }
       }
       if(ctx.As()!=null){
           aliasName.setAs(ctx.As().getText());
       }
       return aliasName;
    }

    @Override
    public ExportDeclaration visitExportDeclaration(JsxParser.ExportDeclarationContext ctx) {
        ExportDeclaration exportDeclaration=new ExportDeclaration();
        if(ctx.Export()!=null){
            exportDeclaration.setExport(ctx.Export().getText());
        }
        if(ctx.declaration()!=null){
            exportDeclaration.setDeclaration(visitDeclaration(ctx.declaration()));
        }
        if(ctx.eos()!=null){
            exportDeclaration.setEos(visitEos(ctx.eos()));
        }
        return exportDeclaration;
    }

    @Override
    public ExportDefaultDeclaration visitExportDefaultDeclaration(JsxParser.ExportDefaultDeclarationContext ctx) {
        ExportDefaultDeclaration exportDefaultDeclaration=new ExportDefaultDeclaration();
        if(ctx.Export()!=null){
            exportDefaultDeclaration.setExport(ctx.Export().getText());
        }
        if(ctx.Default()!=null){
            exportDefaultDeclaration.setDefaultToken(ctx.Default().getText());
        }
        if(ctx.singleExpression()!=null){
            exportDefaultDeclaration.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        if(ctx.eos()!=null){
            exportDefaultDeclaration.setEos(visitEos(ctx.eos()));
        }
        return exportDefaultDeclaration;
    }

    @Override
    public Declaration visitDeclaration(JsxParser.DeclarationContext ctx) {
        Declaration declaration=new Declaration();
        if(ctx.variableStatement()!=null){
            declaration.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if(ctx.functionDeclaration()!=null){
            declaration.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        return declaration;
    }
    @Override
    public VariableStatement visitVariableStatement(JsxParser.VariableStatementContext ctx) {
        VariableStatement variableStatement=new VariableStatement();
        if(ctx.variableDeclarationList()!=null){
            variableStatement.setVariableDeclarationList(visitVariableDeclarationList(ctx.variableDeclarationList()));
        }
        return variableStatement;
    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(JsxParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList=new VariableDeclarationList();

        if(ctx.varModifier()!=null){
            variableDeclarationList.setVarModifier(visitVarModifier(ctx.varModifier()));
        }
        if(ctx.variableDeclaration()!=null){
            for(int i=0;i<ctx.variableDeclaration().size();i++){
                variableDeclarationList.add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        return variableDeclarationList;
    }


    @Override
    public VariableDeclaration visitVariableDeclaration(JsxParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration=new VariableDeclaration();
        if(ctx.assignable()!=null){
            variableDeclaration.setAssignable(visitAssignable(ctx.assignable()));
        }
        if(ctx.singleExpression()!=null){
            variableDeclaration.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return variableDeclaration;
    }

    @Override
    public EmptyStatement visitEmptyStatement_(JsxParser.EmptyStatement_Context ctx) {
       EmptyStatement emptyStatement=new EmptyStatement();
       if(ctx.SemiColon()!=null){
           emptyStatement.setSemiColon(ctx.SemiColon().getText());
       }
       return emptyStatement;
    }

    @Override
    public ExpressionStatement visitExpressionStatement(JsxParser.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement=new ExpressionStatement();
        if(ctx.expressionSequence()!=null){
            expressionStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        if(ctx.eos()!=null){
            expressionStatement.setEos(visitEos(ctx.eos()));
        }
        return expressionStatement;
    }

    @Override
    public IfStatement visitIfStatement(JsxParser.IfStatementContext ctx) {
       IfStatement ifStatement=new IfStatement();
       if(ctx.If()!=null){
           ifStatement.setIfToken(ctx.If().getText());
       }
       if(ctx.expressionSequence()!=null){
           ifStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
       }
       if(ctx.statement()!=null){
           for(int i=0;i<ctx.statement().size();i++){
               ifStatement.add(visitStatement(ctx.statement(i)));
           }
       }
       if(ctx.Else()!=null){
           ifStatement.setElseToken(ctx.Else().getText());
       }
       return ifStatement;
    }

    @Override
    public VarModifier visitVarModifier(JsxParser.VarModifierContext ctx) {
        VarModifier varModifier=new VarModifier();
        if(ctx.Const()!=null){
            varModifier.setConst(ctx.Const().getText());

        }
        if(ctx.Var()!=null){
            varModifier.setVar(ctx.Var().getText());

        }
        if(ctx.let_()!=null){
            varModifier.setLet(visitLet_(ctx.let_()));
        }
        return varModifier;
    }

    @Override
    public ReturnStatement visitReturnStatement(JsxParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement=new ReturnStatement();
        if(ctx.Return()!=null){
            returnStatement.setReturn(ctx.Return().getText());
        }
        if(ctx.expressionSequence()!=null){
            returnStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        if(ctx.htmlElements()!=null){
            returnStatement.setHtmlElements(visitHtmlElements(ctx.htmlElements()));
        }
        return returnStatement;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(JsxParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();
        if(ctx.Async()!=null){
            functionDeclaration.setAsync(ctx.Async().getText());
        }
        if(ctx.Function_()!=null){
            functionDeclaration.setFunction(ctx.Function_().getText());
        }
        if(ctx.identifier()!=null){
            functionDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if(ctx.formalParameterList()!=null){
            functionDeclaration.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if(ctx.functionBody()!=null){
            functionDeclaration.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        return functionDeclaration;
    }

    @Override
    public FormalParameterList visitFormalParameterList(JsxParser.FormalParameterListContext ctx) {
        FormalParameterList formalParameterList=new FormalParameterList();
        if(ctx.formalParameterArg()!=null){
            for(int i=0;i<ctx.formalParameterArg().size();i++){
            formalParameterList.add(visitFormalParameterArg(ctx.formalParameterArg(i)));
            }
        }
        if(ctx.lastFormalParameterArg()!=null){
            formalParameterList.setLastFormalParameterArg(visitLastFormalParameterArg(ctx.lastFormalParameterArg()));
        }
        return  formalParameterList;
    }

    @Override
    public FormalParameterArg visitFormalParameterArg(JsxParser.FormalParameterArgContext ctx) {
        FormalParameterArg formalParameterArg=new FormalParameterArg();
        if(ctx.assignable()!=null){
            formalParameterArg.setAssignable(visitAssignable(ctx.assignable()));
        }
        if(ctx.singleExpression()!=null){
            formalParameterArg.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return formalParameterArg;
    }

    @Override
    public LastFormalParameterArg visitLastFormalParameterArg(JsxParser.LastFormalParameterArgContext ctx) {
        LastFormalParameterArg lastFormalParameterArg=new LastFormalParameterArg();
        if(ctx.Ellipsis()!=null){
            lastFormalParameterArg.setEllipsis(ctx.Ellipsis().getText());
        }
        if(ctx.singleExpression()!=null){
            lastFormalParameterArg.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return lastFormalParameterArg;
    }

    @Override
    public FunctionBody visitFunctionBody(JsxParser.FunctionBodyContext ctx) {
        FunctionBody functionBody=new FunctionBody();
        if(ctx.sourceElements()!=null){
            functionBody.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        return functionBody;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(JsxParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral=new ArrayLiteral();
        if(ctx.elementList()!=null){
            arrayLiteral.setElementList(visitElementList(ctx.elementList()));
        }
        return arrayLiteral;
    }

    @Override
    public ElementList visitElementList(JsxParser.ElementListContext ctx) {
        ElementList elementList=new ElementList();
        if(ctx.arrayElement()!=null){
            for(int i=0;i<ctx.arrayElement().size();i++){
                elementList.add(visitArrayElement(ctx.arrayElement(i)));
            }
        }
        return  elementList;
    }

    @Override
    public ArrayElement visitArrayElement(JsxParser.ArrayElementContext ctx) {
        ArrayElement arrayElement=new ArrayElement();
        if(ctx.Ellipsis()!=null){
            arrayElement.setEllipsis(ctx.Ellipsis().getText());
        }
        if(ctx.singleExpression()!=null){
            arrayElement.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return arrayElement;
    }

    @Override
    public PropertyExpressionAssignment visitPropertyExpressionAssignment(JsxParser.PropertyExpressionAssignmentContext ctx) {
        PropertyExpressionAssignment propertyExpressionAssignment=new PropertyExpressionAssignment();
        if(ctx.propertyName()!=null){
            propertyExpressionAssignment.setPropertyName(visitPropertyName(ctx.propertyName()));
        }
        if(ctx.singleExpression()!=null){
            propertyExpressionAssignment.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return  propertyExpressionAssignment;
    }

    @Override
    public ComputedPropertyExpressionAssignment visitComputedPropertyExpressionAssignment(JsxParser.ComputedPropertyExpressionAssignmentContext ctx) {
        ComputedPropertyExpressionAssignment computedPropertyExpressionAssignment=new ComputedPropertyExpressionAssignment();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
            computedPropertyExpressionAssignment.add((SingleExpression)visit(ctx.singleExpression(i)));}
        }
        return computedPropertyExpressionAssignment;
    }

    @Override
    public FunctionProperty visitFunctionProperty(JsxParser.FunctionPropertyContext ctx) {
        FunctionProperty functionProperty=new FunctionProperty();
        if(ctx.propertyName()!=null){
            functionProperty.setPropertyName(visitPropertyName(ctx.propertyName()));
        }
        if(ctx.formalParameterList()!=null){
            functionProperty.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if(ctx.functionBody()!=null){
            functionProperty.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        return functionProperty;
    }

    @Override
    public PropertyShorthand visitPropertyShorthand(JsxParser.PropertyShorthandContext ctx) {
        PropertyShorthand propertyShorthand=new PropertyShorthand();
        if(ctx.Ellipsis()!=null){
            propertyShorthand.setEllipsis(ctx.Ellipsis().getText());
        }
        if(ctx.singleExpression()!=null){
            propertyShorthand.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return propertyShorthand;
    }

    @Override
    public PropertyName visitPropertyName(JsxParser.PropertyNameContext ctx) {
       PropertyName propertyName=new PropertyName();
       if(ctx.identifierName()!=null){
           propertyName.setIdentifierName(visitIdentifierName(ctx.identifierName()));
       }
       if(ctx.StringLiteral()!=null){
           propertyName.setStringLiteral(ctx.StringLiteral().getText());
       }
       if(ctx.numericLiteral()!=null){
           propertyName.setNumericLiteral(visitNumericLiteral(ctx.numericLiteral()));
       }
       if(ctx.singleExpression()!=null){
           propertyName.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
       }
       return propertyName;
    }

    @Override
    public Arguments visitArguments(JsxParser.ArgumentsContext ctx) {
        Arguments arguments=new Arguments();
        if(ctx.argument()!=null){
           for(int i=0;i<ctx.argument().size();i++){
               arguments.add(visitArgument(ctx.argument(i)));
           }
        }
        return arguments;
    }

    @Override
    public Argument visitArgument(JsxParser.ArgumentContext ctx) {
        Argument argument=new Argument();
        if(ctx.Ellipsis()!=null){
            argument.setEllipsis(ctx.Ellipsis().getText());
        }
        if(ctx.singleExpression()!=null){
            argument.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return argument;
    }

    @Override
    public ExpressionSequence visitExpressionSequence(JsxParser.ExpressionSequenceContext ctx) {
        ExpressionSequence expressionSequence=new ExpressionSequence();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
            expressionSequence.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        return expressionSequence;
    }

    @Override
    public ReactHook visitReactHook(JsxParser.ReactHookContext ctx) {
        ReactHook reactHook=new ReactHook();
        if(ctx.useEffectHook()!=null){
            reactHook.setUseEffectHook(visitUseEffectHook(ctx.useEffectHook()));
        }
        if(ctx.useRefHook()!=null){
            reactHook.setUseRefHook(visitUseRefHook(ctx.useRefHook()));
        }
        if(ctx.useStateHook()!=null){
            reactHook.setUseStateHook(visitUseStateHook(ctx.useStateHook()));
        }
        return reactHook;
    }

    @Override
    public UseEffectHook visitUseEffectHook(JsxParser.UseEffectHookContext ctx) {
        UseEffectHook useEffectHook=new UseEffectHook();
        if(ctx.UseEffect()!=null){
            useEffectHook.setUseEffect(ctx.UseEffect().getText());
        }
        if(ctx.expressionSequence()!=null){
            for(int i=0;i<ctx.expressionSequence().size();i++){
                useEffectHook.add(visitExpressionSequence(ctx.expressionSequence(i)));
            }
        }
        return useEffectHook;
    }

    @Override
    public UseRefHook visitUseRefHook(JsxParser.UseRefHookContext ctx) {
        UseRefHook useRefHook=new UseRefHook();
        if(ctx.UseRef()!=null){
            useRefHook.setUseRef(ctx.UseRef().getText());
        }
        if(ctx.singleExpression()!=null){
            useRefHook.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
        }
        return useRefHook;
    }

    @Override
    public UseStateHook visitUseStateHook(JsxParser.UseStateHookContext ctx) {
        UseStateHook useStateHook=new UseStateHook();
        if(ctx.UseState()!=null){
            useStateHook.setUseState(ctx.UseState().getText());
        }
        if(ctx.singleExpression()!=null){
            useStateHook.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
        }
        return useStateHook;
    }

    @Override
    public ParenthesizedExpression visitParenthesizedExpression(JsxParser.ParenthesizedExpressionContext ctx) {
        ParenthesizedExpression parenthesizedExpression=new ParenthesizedExpression();
        if(ctx.expressionSequence()!=null){
            parenthesizedExpression.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return parenthesizedExpression;
    }

    @Override
    public AdditiveExpression visitAdditiveExpression(JsxParser.AdditiveExpressionContext ctx) {
        AdditiveExpression additiveExpression=new AdditiveExpression();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
                additiveExpression.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        if(ctx.Plus()!=null){
            additiveExpression.setPlus(ctx.Plus().getText());
        }
        if(ctx.Minus()!=null){
            additiveExpression.setSub(ctx.Minus().getText());
        }
        return additiveExpression;
    }

    @Override
    public TernaryExpression visitTernaryExpression(JsxParser.TernaryExpressionContext ctx) {
        TernaryExpression ternaryExpression=new TernaryExpression();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
            ternaryExpression.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        return ternaryExpression;
    }

    @Override
    public Hook visitHook(JsxParser.HookContext ctx) {
       Hook hook=new Hook();
       if(ctx.reactHook()!=null){
           hook.setReactHook(visitReactHook(ctx.reactHook()));
       }
       return hook;
    }

    @Override
    public RelationalExpression visitRelationalExpression(JsxParser.RelationalExpressionContext ctx) {
        RelationalExpression relationalExpression=new RelationalExpression();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
                relationalExpression.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        return relationalExpression;
    }

    @Override
    public ImportExpression visitImportExpression(JsxParser.ImportExpressionContext ctx) {
        ImportExpression importExpression=new ImportExpression();
        if(ctx.Import()!=null){
            importExpression.setImport(ctx.Import().getText());
        }
        if(ctx.singleExpression()!=null){
            importExpression.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
        }
        return importExpression;
    }

    @Override
    public TemplateStringExpression visitTemplateStringExpression(JsxParser.TemplateStringExpressionContext ctx) {
        TemplateStringExpression templateStringExpression=new TemplateStringExpression();
        if(ctx.singleExpression()!=null){
            templateStringExpression.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        if(ctx.templateStringLiteral()!=null){
            templateStringExpression.setTemplateStringLiteral(visitTemplateStringLiteral(ctx.templateStringLiteral()));
        }
        return templateStringExpression;
    }

    @Override
    public ObjectLiteralExpression visitObjectLiteralExpression(JsxParser.ObjectLiteralExpressionContext ctx) {
        ObjectLiteralExpression objectLiteralExpression=new ObjectLiteralExpression();
        if(ctx.objectLiteral()!=null){
            objectLiteralExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
       return objectLiteralExpression;
    }

    @Override
    public LiteralExpression visitLiteralExpression(JsxParser.LiteralExpressionContext ctx) {
        LiteralExpression literalExpression=new LiteralExpression();
        if(ctx.literal()!=null){
            literalExpression.setLiteral(visitLiteral(ctx.literal()));
        }
        return literalExpression;
    }

    @Override
    public ArrayLiteralExpression visitArrayLiteralExpression(JsxParser.ArrayLiteralExpressionContext ctx) {
        ArrayLiteralExpression arrayLiteralExpression=new ArrayLiteralExpression();
        if(ctx.arrayLiteral()!=null){
            arrayLiteralExpression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return arrayLiteralExpression;
    }

    @Override
    public MemberDotExpression visitMemberDotExpression(JsxParser.MemberDotExpressionContext ctx) {
        MemberDotExpression memberDotExpression=new MemberDotExpression();
        if(ctx.singleExpression()!=null){
            memberDotExpression.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        if(ctx.identifierName()!=null){
            memberDotExpression.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        return memberDotExpression;
    }

    @Override
    public MemberIndexExpression visitMemberIndexExpression(JsxParser.MemberIndexExpressionContext ctx) {
        MemberIndexExpression memberIndexExpression=new MemberIndexExpression();
        if(ctx.singleExpression()!=null){
            memberIndexExpression.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
        }
        if(ctx.expressionSequence()!=null){
            memberIndexExpression.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return memberIndexExpression;
    }

    @Override
    public IdentifierExpression visitIdentifierExpression(JsxParser.IdentifierExpressionContext ctx) {
       IdentifierExpression identifierExpression=new IdentifierExpression();
       if(ctx.identifier()!=null){
          identifierExpression.setIdentifier(visitIdentifier(ctx.identifier()));
       }
       return identifierExpression;
    }

    @Override
    public ArgumentsExpression visitArgumentsExpression(JsxParser.ArgumentsExpressionContext ctx) {
        ArgumentsExpression argumentsExpression=new ArgumentsExpression();
        if(ctx.singleExpression()!=null){
            argumentsExpression.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        if(ctx.arguments()!=null){
            argumentsExpression.setArguments(visitArguments(ctx.arguments()));
        }
        return argumentsExpression;
    }

    @Override
    public FunctionExpression visitFunctionExpression(JsxParser.FunctionExpressionContext ctx) {
        FunctionExpression functionExpression=new FunctionExpression();
        if(ctx.anoymousFunction()!=null){
            functionExpression.setAnoymousFunction((AnoymousFunction)visit(ctx.anoymousFunction()));
        }
        return functionExpression;
    }

    @Override
    public AssignmentExpression visitAssignmentExpression(JsxParser.AssignmentExpressionContext ctx) {
        AssignmentExpression assignmentExpression=new AssignmentExpression();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
            assignmentExpression.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        return assignmentExpression;
    }

    @Override
    public MultiplicativeExpression visitMultiplicativeExpression(JsxParser.MultiplicativeExpressionContext ctx) {
        MultiplicativeExpression multiplicativeExpression=new MultiplicativeExpression();
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
                multiplicativeExpression.add((SingleExpression)visit(ctx.singleExpression(i)));
            }
        }
        return multiplicativeExpression;
    }

    @Override
    public HtmlElementExpression visitHtmlElementExpression(JsxParser.HtmlElementExpressionContext ctx) {
        HtmlElementExpression htmlElementExpression=new HtmlElementExpression();
        if(ctx.htmlElements()!=null){
            htmlElementExpression.setHtmlElements(visitHtmlElements(ctx.htmlElements()));
        }
        return htmlElementExpression;
    }

    @Override
    public HtmlElements visitHtmlElements(JsxParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements=new HtmlElements();
        if(ctx.htmlElement()!=null){
            for (int i=0;i<ctx.htmlElement().size();i++){
                htmlElements.add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        return htmlElements;
    }

    @Override
    public HtmlElement visitHtmlElement(JsxParser.HtmlElementContext ctx) {
        HtmlElement htmlElement =new HtmlElement();

        if(ctx.htmlTagStartName()!=null){
            htmlElement.setHtmlTagStartName(visitHtmlTagStartName(ctx.htmlTagStartName()));
        }
        if(ctx.htmlAttribute()!=null){
            for(int i=0;i<ctx.htmlAttribute().size();i++){
                htmlElement.add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        if(ctx.htmlContent()!=null){
            htmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
        if(ctx.htmlTagName()!=null){
            htmlElement.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        if(ctx.htmlTagClosingName()!=null){
            htmlElement.setHtmlTagClosingName(visitHtmlTagClosingName(ctx.htmlTagClosingName()));
        }
        return htmlElement;
    }

    @Override
    public HtmlContent visitHtmlContent(JsxParser.HtmlContentContext ctx) {
        HtmlContent htmlContent=new HtmlContent();
        if(ctx.htmlChardata()!=null){
            for (int i=0;i<ctx.htmlChardata().size();i++){
                htmlContent.add(visitHtmlChardata(ctx.htmlChardata(i)));
            }
        }
        if(ctx.htmlElement()!=null){
            for (int i=0;i<ctx.htmlElement().size();i++){
                htmlContent.add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        if(ctx.objectExpressionSequence()!=null){
            for (int i=0;i<ctx.objectExpressionSequence().size();i++){
                htmlContent.add(visitObjectExpressionSequence(ctx.objectExpressionSequence(i)));
            }
        }
        return htmlContent;
    }

    @Override
    public HtmlTagStartName visitHtmlTagStartName(JsxParser.HtmlTagStartNameContext ctx) {
        HtmlTagStartName htmlTagStartName=new HtmlTagStartName();
        if(ctx.htmlTagName()!=null){
            htmlTagStartName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagStartName;
    }

    @Override
    public HtmlTagClosingName visitHtmlTagClosingName(JsxParser.HtmlTagClosingNameContext ctx) {
        HtmlTagClosingName htmlTagClosingName=new HtmlTagClosingName();
        if(ctx.htmlTagName()!=null){
            htmlTagClosingName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagClosingName;
    }

    @Override
    public HtmlTagName visitHtmlTagName(JsxParser.HtmlTagNameContext ctx) {
        HtmlTagName htmlTagName=new HtmlTagName();
        if(ctx.TagName()!=null){
            htmlTagName.setTagName(ctx.TagName().getText());
        }
        if(ctx.keyword()!=null){
            htmlTagName.setKeyword(visitKeyword(ctx.keyword()));
        }
        if(ctx.Identifier()!=null){
            htmlTagName.setIdentifier(ctx.Identifier().getText());
        }
        return htmlTagName;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(JsxParser.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute =new HtmlAttribute();
        if(ctx.htmlAttributeName()!=null){
            htmlAttribute.setHtmlAttributeName(visitHtmlAttributeName(ctx.htmlAttributeName()));
        }
        if(ctx.htmlAttributeValue()!=null){
            htmlAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        return htmlAttribute;
    }

    @Override
    public HtmlAttributeName visitHtmlAttributeName(JsxParser.HtmlAttributeNameContext ctx) {
       HtmlAttributeName htmlAttributeName=new HtmlAttributeName();
       if(ctx.TagName()!=null){
           htmlAttributeName.setTagName(ctx.TagName().getText());
       }
       if(ctx.Identifier()!=null){
           for (int i=0;i<ctx.Identifier().size();i++){
               htmlAttributeName.add(ctx.Identifier(i).getText());
           }
       }
       return htmlAttributeName;
    }

    @Override
    public HtmlChardata visitHtmlChardata(JsxParser.HtmlChardataContext ctx) {
        HtmlChardata htmlChardata=new HtmlChardata();
        if(ctx.LessThan()!=null){
            for (int i=0;i<ctx.LessThan().size();i++){
            htmlChardata.add(ctx.LessThan(i).getText());
            }
        }
        if(ctx.OpenBrace()!=null){
            for (int i=0;i<ctx.OpenBrace().size();i++){
                htmlChardata.add(ctx.OpenBrace(i).getText());
            }
        }
        return htmlChardata;
    }

    @Override
    public HtmlAttributeValue visitHtmlAttributeValue(JsxParser.HtmlAttributeValueContext ctx) {
        HtmlAttributeValue htmlAttributeValue=new HtmlAttributeValue();
        if(ctx.StringLiteral()!=null){
            htmlAttributeValue.setStringLiteral(ctx.StringLiteral().getText());
        }
        if(ctx.AttributeValue()!=null){
            htmlAttributeValue.setAttributeValue(ctx.AttributeValue().getText());
        }
        if(ctx.objectExpressionSequence()!=null){
            htmlAttributeValue.setObjectExpressionSequence(visitObjectExpressionSequence(ctx.objectExpressionSequence()));
        }
        return htmlAttributeValue;
    }

    @Override
    public Assignable visitAssignable(JsxParser.AssignableContext ctx) {
        Assignable assignable=new Assignable();
        if(ctx.arrayLiteral()!=null){
            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));

        }
        if(ctx.identifier()!=null){
            assignable.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if(ctx.objectLiteral()!=null){
            assignable.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        return assignable;
    }

    @Override
    public ObjectLiteral visitObjectLiteral(JsxParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral=new ObjectLiteral();
        if(ctx.propertyAssignment()!=null){
            for(int i=0;i<ctx.propertyAssignment().size();i++){
                objectLiteral.add((PropertyAssignment)visit(ctx.propertyAssignment(i)));
            }
        }
        return objectLiteral;
    }

    @Override
    public ObjectExpressionSequence visitObjectExpressionSequence(JsxParser.ObjectExpressionSequenceContext ctx) {
        ObjectExpressionSequence objectExpressionSequence=new ObjectExpressionSequence();
        if(ctx.expressionSequence()!=null){
            objectExpressionSequence.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return objectExpressionSequence;
    }

    @Override
    public FunctionDecl visitFunctionDecl(JsxParser.FunctionDeclContext ctx) {
        FunctionDecl functionDecl=new FunctionDecl();
        if(ctx.functionDeclaration()!=null){
            functionDecl.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        return functionDecl;
    }

    @Override
    public AnoymousFunctionDecl visitAnoymousFunctionDecl(JsxParser.AnoymousFunctionDeclContext ctx) {
       AnoymousFunctionDecl anoymousFunctionDecl=new AnoymousFunctionDecl();
       if(ctx.Async()!=null){
           anoymousFunctionDecl.setAsync(ctx.Async().getText());
       }
        if(ctx.Function_()!=null){
            anoymousFunctionDecl.setFunction(ctx.Function_().getText());
        }
        if(ctx.formalParameterList()!=null){
            anoymousFunctionDecl.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if(ctx.functionBody()!=null){
            anoymousFunctionDecl.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
       return anoymousFunctionDecl;
    }

    @Override
    public ArrowFunction visitArrowFunction(JsxParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction =new ArrowFunction();
        if(ctx.arrowFunctionParameters()!=null){
            arrowFunction.setArrowFunctionParameters(visitArrowFunctionParameters(ctx.arrowFunctionParameters()));
        }
        if(ctx.arrowFunctionBody()!=null){
            arrowFunction.setArrowFunctionBody(visitArrowFunctionBody(ctx.arrowFunctionBody()));
        }
        return arrowFunction;
    }

    @Override
    public ArrowFunctionParameters visitArrowFunctionParameters(JsxParser.ArrowFunctionParametersContext ctx) {
        ArrowFunctionParameters arrowFunctionParameters=new ArrowFunctionParameters();
        if(ctx.formalParameterList()!=null){
            arrowFunctionParameters.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if(ctx.identifier()!=null){
            arrowFunctionParameters.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        return arrowFunctionParameters;
    }

    @Override
    public ArrowFunctionBody visitArrowFunctionBody(JsxParser.ArrowFunctionBodyContext ctx) {
        ArrowFunctionBody arrowFunctionBody=new ArrowFunctionBody();
        if(ctx.functionBody()!=null){
            arrowFunctionBody.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        if(ctx.singleExpression()!=null){
            arrowFunctionBody.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return arrowFunctionBody;
    }

    @Override
    public Literal visitLiteral(JsxParser.LiteralContext ctx) {
       Literal literal=new Literal();
       if(ctx.NullLiteral()!=null){
           literal.setNullLiteral(ctx.NullLiteral().getText());
       }
        if(ctx.BooleanLiteral()!=null){
            literal.setBooleanLiteral(ctx.BooleanLiteral().getText());
        }
        if(ctx.StringLiteral()!=null){
            literal.setStringLiteral(ctx.StringLiteral().getText());
        }
        if(ctx.numericLiteral()!=null){
            literal.setNumericLiteral(visitNumericLiteral(ctx.numericLiteral()));
        }
       return literal;
    }

    @Override
    public TemplateStringLiteral visitTemplateStringLiteral(JsxParser.TemplateStringLiteralContext ctx) {
        TemplateStringLiteral templateStringLiteral=new TemplateStringLiteral();
        if(ctx.BackTick()!=null){
            templateStringLiteral.setFirstBackTick(ctx.BackTick().get(0).getText());
        }
        if(ctx.templateStringAtom()!=null){
            for(int i=0;i<ctx.templateStringAtom().size();i++){
                templateStringLiteral.add(visitTemplateStringAtom(ctx.templateStringAtom(i)));
            }
        }
        if(ctx.BackTick()!=null){
            templateStringLiteral.setLastBackTick(ctx.BackTick().get(1).getText());
        }
        return templateStringLiteral;
    }

    @Override
    public TemplateStringAtom visitTemplateStringAtom(JsxParser.TemplateStringAtomContext ctx) {
        TemplateStringAtom templateStringAtom=new TemplateStringAtom();
        if(ctx.TemplateStringAtom()!=null){
            templateStringAtom.setTemplateStringAtom(ctx.TemplateStringAtom().getText());
        }
        if(ctx.TemplateStringStartExpression()!=null){
            templateStringAtom.setTemplateStringStartExpression(ctx.TemplateStringStartExpression().getText());
        }
        if(ctx.singleExpression()!=null){
            templateStringAtom.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
        }
        return templateStringAtom;
    }

    @Override
    public NumericLiteral visitNumericLiteral(JsxParser.NumericLiteralContext ctx) {
        NumericLiteral numericLiteral=new NumericLiteral();
        if(ctx.DecimalLiteral()!=null){
            numericLiteral.setDecimalLiteral(ctx.DecimalLiteral().getText());
        }
        return numericLiteral;
    }


    @Override
    public IdentifierName visitIdentifierName(JsxParser.IdentifierNameContext ctx) {
        IdentifierName identifierName=new IdentifierName();
        if(ctx.identifier()!=null){
            identifierName.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if(ctx.reservedWord()!=null){
            identifierName.setReservedWord(visitReservedWord(ctx.reservedWord()));
        }
        return identifierName;
    }

    @Override
    public Identifier visitIdentifier(JsxParser.IdentifierContext ctx) {
        Identifier identifier=new Identifier();
        if(ctx.Async()!=null){
            identifier.setIdentifier(ctx.Async().getText());

        }
        if (ctx.Identifier() != null) {
            identifier.setIdentifier(ctx.Identifier().getText());

        }

        return identifier;
    }

    @Override
    public ReservedWord visitReservedWord(JsxParser.ReservedWordContext ctx) {
        ReservedWord reservedWord=new ReservedWord();
        if(ctx.keyword()!=null){
            reservedWord.setKeyword(visitKeyword(ctx.keyword()));
        }
        return reservedWord;
    }

    @Override
    public Keyword visitKeyword(JsxParser.KeywordContext ctx) {
        Keyword keyword=new Keyword();

        if(ctx.Default()!=null){
            keyword.setKeyword(ctx.Default().getText());
        }
        if(ctx.Export()!=null){
            keyword.setKeyword(ctx.Export().getText());
        }
        if(ctx.From()!=null){
            keyword.setKeyword(ctx.From().getText());
        }
        if(ctx.Import()!=null){
            keyword.setKeyword(ctx.Import().getText());
        }
        if(ctx.Function_()!=null){
            keyword.setKeyword(ctx.Function_().getText());
        }
        return keyword;
    }

    @Override
    public Let visitLet_(JsxParser.Let_Context ctx) {
        Let let=new Let();
        if(ctx.StrictLet()!=null){
            let.setStrictLet(ctx.StrictLet().getText());
        }
        return let;
    }

    @Override
    public Eos visitEos(JsxParser.EosContext ctx) {
        Eos eos=new Eos();
        if(ctx.EOF()!=null){
            eos.setEof(ctx.EOF().getText());
        }
        if(ctx.SemiColon()!=null){
            eos.setSemiColon(ctx.SemiColon().getText());
        }
        return eos;
    }
}

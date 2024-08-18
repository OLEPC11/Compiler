package VisitParserTree;
import Antlar.JsxParser;
import Antlar.JsxParserBaseVisitor;
import AstClasses.*;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.Scope;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Visitor extends JsxParserBaseVisitor {


    @Override
    public Program visitProgram(JsxParser.ProgramContext ctx) {
        Program program =new Program();
        program.createScope("Global");
        program.setScopeID(program.getCurrentScope().getId());
        if(ctx.sourceElements()!=null){
            program.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        Node.removeScope();
        return program;
    }
    @Override
    public SourceElements visitSourceElements(JsxParser.SourceElementsContext ctx){
        SourceElements sourceElements=new SourceElements();
        sourceElements.setScopeID(sourceElements.getCurrentScope().getId());
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
        sourceElement.setScopeID(sourceElement.getCurrentScope().getId());
       if(ctx.statement()!=null){
           sourceElement.setStatement(visitStatement(ctx.statement()));
       }
       return sourceElement;
    }

    @Override
    public Statement visitStatement(JsxParser.StatementContext ctx) {
        Statement statement=new Statement();
        statement.setScopeID(statement.getCurrentScope().getId());
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
     block.setScopeID(block.getCurrentScope().getId());
     if(ctx.statementList()!=null){
         block.setStatementList(visitStatementList(ctx.statementList()));
     }
     return block;
    }

    @Override
    public StatementList visitStatementList(JsxParser.StatementListContext ctx) {
        StatementList statementList=new StatementList();
        statementList.setScopeID(statementList.getCurrentScope().getId());
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
        importStatement.setScopeID(importStatement.getCurrentScope().getId());
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
        importFromBlock.setScopeID(importFromBlock.getCurrentScope().getId());
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
        moduleItems.setScopeID(moduleItems.getCurrentScope().getId());
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
        importDefault.setScopeID(importDefault.getCurrentScope().getId());
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
        importNamespace.setScopeID(importNamespace.getCurrentScope().getId());
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
        importFrom.setScopeID(importFrom.getCurrentScope().getId());
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
        aliasName.setScopeID(aliasName.getCurrentScope().getId());
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
        exportDeclaration.setScopeID(exportDeclaration.getCurrentScope().getId());
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
        exportDefaultDeclaration.setScopeID(exportDefaultDeclaration.getCurrentScope().getId());
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
        declaration.setScopeID(declaration.getCurrentScope().getId());
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
        variableStatement.setScopeID(variableStatement.getCurrentScope().getId());
        if(ctx.variableDeclarationList()!=null){
            variableStatement.setVariableDeclarationList(visitVariableDeclarationList(ctx.variableDeclarationList()));
        }
        return variableStatement;
    }
    Symbol symbol=new Symbol();
    @Override
    public VariableDeclarationList visitVariableDeclarationList(JsxParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList=new VariableDeclarationList();
        variableDeclarationList.setScopeID(variableDeclarationList.getCurrentScope().getId());
        if(ctx.varModifier()!=null){
            variableDeclarationList.setVarModifier(visitVarModifier(ctx.varModifier()));
        symbol.setType(ctx.varModifier().getText());
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
        variableDeclaration.setScopeID(variableDeclaration.getCurrentScope().getId());

         symbol.setNodeName("VariableDeclaration");
        if(ctx.assignable()!=null){
            variableDeclaration.setAssignable(visitAssignable(ctx.assignable()));
             symbol.setName(ctx.assignable().getText());
        }
        if(ctx.singleExpression()!=null){
            variableDeclaration.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));

            symbol.setValue(ctx.singleExpression().getText());
        }
        if (variableDeclaration.getCurrentScope().searchForSymbol(ctx.assignable().getText()) != null) {
            System.err.println("Variable Declare Before  "+ctx.assignable().getText());
        }
        else {
            variableDeclaration.createSymbol(variableDeclaration.getScopeID(),symbol.getName(),symbol.getType(),symbol.getValue(),symbol.getNodeName());
        }
        //scope.addSymbol(symbol);
        return variableDeclaration;
    }

    @Override
    public EmptyStatement visitEmptyStatement_(JsxParser.EmptyStatement_Context ctx) {
       EmptyStatement emptyStatement=new EmptyStatement();
        emptyStatement.setScopeID(emptyStatement.getCurrentScope().getId());
       if(ctx.SemiColon()!=null){
           emptyStatement.setSemiColon(ctx.SemiColon().getText());
       }
       return emptyStatement;
    }

    @Override
    public ExpressionStatement visitExpressionStatement(JsxParser.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement=new ExpressionStatement();
        expressionStatement.setScopeID(expressionStatement.getCurrentScope().getId());
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
        ifStatement.setScopeID(ifStatement.getCurrentScope().getId());
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
        varModifier.setScopeID(varModifier.getCurrentScope().getId());
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
        returnStatement.setScopeID(returnStatement.getCurrentScope().getId());
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
        functionDeclaration.setScopeID(functionDeclaration.getCurrentScope().getId());
        functionDeclaration.createScope("function");
        if(ctx.Async()!=null){
            functionDeclaration.setAsync(ctx.Async().getText());
        }
        if(ctx.Function_()!=null){
            functionDeclaration.setFunction(ctx.Function_().getText());
        }
        if(ctx.identifier()!=null){
            functionDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
            functionDeclaration.createSymbol(functionDeclaration.getScopeID(),ctx.identifier().getText()," "," ","FunctionDeclaration");
        }
        if(ctx.formalParameterList()!=null){
            functionDeclaration.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if(ctx.functionBody()!=null){
            functionDeclaration.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        Node.removeScope();
        return functionDeclaration;
    }

    @Override
    public FormalParameterList visitFormalParameterList(JsxParser.FormalParameterListContext ctx) {
        FormalParameterList formalParameterList=new FormalParameterList();
        formalParameterList.setScopeID(formalParameterList.getCurrentScope().getId());
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
        formalParameterArg.setScopeID(formalParameterArg.getCurrentScope().getId());
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
        lastFormalParameterArg.setScopeID(lastFormalParameterArg.getCurrentScope().getId());
        Scope scope=new Scope();
        Symbol symbol=new Symbol();
       symbol.setNodeName("LastFormalParameterArg");
        if(ctx.Ellipsis()!=null){
            lastFormalParameterArg.setEllipsis(ctx.Ellipsis().getText());
        }
        if(ctx.singleExpression()!=null){
            lastFormalParameterArg.setSingleExpression((SingleExpression)visit(ctx.singleExpression()));
            symbol.setName(ctx.singleExpression().getText());
        }
        lastFormalParameterArg.createSymbol(lastFormalParameterArg.getScopeID(),symbol.getName()," ",symbol.getValue(),symbol.getNodeName());
        //scope.addSymbol(symbol);
        return lastFormalParameterArg;
    }

    @Override
    public FunctionBody visitFunctionBody(JsxParser.FunctionBodyContext ctx) {
        FunctionBody functionBody=new FunctionBody();
        functionBody.setScopeID(functionBody.getCurrentScope().getId());
        if(ctx.sourceElements()!=null){
            functionBody.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        return functionBody;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(JsxParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral=new ArrayLiteral();
        arrayLiteral.setScopeID(arrayLiteral.getCurrentScope().getId());        if(ctx.elementList()!=null){
            arrayLiteral.setElementList(visitElementList(ctx.elementList()));
        }
        return arrayLiteral;
    }

    @Override
    public ElementList visitElementList(JsxParser.ElementListContext ctx) {
        ElementList elementList=new ElementList();
        elementList.setScopeID(elementList.getCurrentScope().getId());
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
        arrayElement.setScopeID(arrayElement.getCurrentScope().getId());
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
        propertyExpressionAssignment.setScopeID(propertyExpressionAssignment.getCurrentScope().getId());
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
        computedPropertyExpressionAssignment.setScopeID(computedPropertyExpressionAssignment.getCurrentScope().getId());
        if(ctx.singleExpression()!=null){
            for(int i=0;i<ctx.singleExpression().size();i++){
            computedPropertyExpressionAssignment.add((SingleExpression)visit(ctx.singleExpression(i)));}
        }
        return computedPropertyExpressionAssignment;
    }

    @Override
    public FunctionProperty visitFunctionProperty(JsxParser.FunctionPropertyContext ctx) {
        FunctionProperty functionProperty=new FunctionProperty();
        functionProperty.setScopeID(functionProperty.getCurrentScope().getId());
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
        propertyShorthand.setScopeID(propertyShorthand.getCurrentScope().getId());
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
        propertyName.setScopeID(propertyName.getCurrentScope().getId());
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
        arguments.setScopeID(arguments.getCurrentScope().getId());
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
        argument.setScopeID(argument.getCurrentScope().getId());
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
        expressionSequence.setScopeID(expressionSequence.getCurrentScope().getId());
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
        reactHook.setScopeID(reactHook.getCurrentScope().getId());
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
        useEffectHook.setScopeID(useEffectHook.getCurrentScope().getId());
       Scope scope=new Scope();
        Symbol symbol=new Symbol();
        symbol.setNodeName("UseEffectHook");
        if(ctx.UseEffect()!=null){
            useEffectHook.setUseEffect(ctx.UseEffect().getText());
            symbol.setName(ctx.UseEffect().getText());
        }
        if(ctx.expressionSequence()!=null){
            for(int i=0;i<ctx.expressionSequence().size();i++){
                useEffectHook.add(visitExpressionSequence(ctx.expressionSequence(i)));
                symbol.setValue(ctx.expressionSequence().get(i).getText());
            }
        }
        if(useEffectHook.getScopeID()!=2){
            System.err.println("Cant Defined Out Function "+ctx.UseEffect().getText());
        }
        else {
            useEffectHook.createSymbol(useEffectHook.getScopeID(), symbol.getName(), " ", symbol.getValue(), symbol.getNodeName());
        }
        //scope.addSymbol(symbol);
        return useEffectHook;
    }

    @Override
    public UseRefHook visitUseRefHook(JsxParser.UseRefHookContext ctx) {
        UseRefHook useRefHook=new UseRefHook();
        useRefHook.setScopeID(useRefHook.getCurrentScope().getId());
        Scope scope=new Scope();
        Symbol symbol=new Symbol();
        symbol.setNodeName("UseRefHook");
        if(ctx.UseRef()!=null){
            useRefHook.setUseRef(ctx.UseRef().getText());
            symbol.setName(ctx.UseRef().getText());
        }
        if(ctx.singleExpression()!=null){
            useRefHook.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
            symbol.setValue(ctx.singleExpression().getText());
        }
        if(useRefHook.getScopeID()!=2){
            System.err.println("Cant Defined Out Function  "+ctx.UseRef().getText());
        }
        else {
            useRefHook.createSymbol(useRefHook.getScopeID(), symbol.getName(), " ", symbol.getValue(), symbol.getNodeName());
        }
        //scope.addSymbol(symbol);
        return useRefHook;
    }

    @Override
    public UseStateHook visitUseStateHook(JsxParser.UseStateHookContext ctx) {
        UseStateHook useStateHook=new UseStateHook();
        useStateHook.setScopeID(useStateHook.getCurrentScope().getId());
        Scope scope=new Scope();
        Symbol symbol=new Symbol();
        symbol.setNodeName("UseStateHook");
        if(ctx.UseState()!=null){
            useStateHook.setUseState(ctx.UseState().getText());
            symbol.setName(ctx.UseState().getText());
        }
        if(ctx.singleExpression()!=null){
            useStateHook.setSingleExpression((SingleExpression) visit(ctx.singleExpression()));
        symbol.setValue(ctx.singleExpression().getText());
        }
        if(useStateHook.getScopeID()!=2){
            System.err.println("Cant Defined Out Function "+ctx.UseState().getText());
        }
        else {
            useStateHook.createSymbol(useStateHook.getScopeID(), symbol.getName(), " ", symbol.getValue(), symbol.getNodeName());
        }//scope.addSymbol(symbol);
        return useStateHook;
    }

    @Override
    public ParenthesizedExpression visitParenthesizedExpression(JsxParser.ParenthesizedExpressionContext ctx) {
        ParenthesizedExpression parenthesizedExpression=new ParenthesizedExpression();
        parenthesizedExpression.setScopeID(parenthesizedExpression.getCurrentScope().getId());
        if(ctx.expressionSequence()!=null){
            parenthesizedExpression.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return parenthesizedExpression;
    }

    @Override
    public AdditiveExpression visitAdditiveExpression(JsxParser.AdditiveExpressionContext ctx) {
        AdditiveExpression additiveExpression=new AdditiveExpression();
        additiveExpression.setScopeID(additiveExpression.getCurrentScope().getId());
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
        ternaryExpression.setScopeID(ternaryExpression.getCurrentScope().getId());
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
       hook.setScopeID(hook.getCurrentScope().getId());
       if(ctx.reactHook()!=null){
           hook.setReactHook(visitReactHook(ctx.reactHook()));
       }
       return hook;
    }

    @Override
    public RelationalExpression visitRelationalExpression(JsxParser.RelationalExpressionContext ctx) {
        RelationalExpression relationalExpression=new RelationalExpression();
        relationalExpression.setScopeID(relationalExpression.getCurrentScope().getId());
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
        importExpression.setScopeID(importExpression.getCurrentScope().getId());
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
        templateStringExpression.setScopeID(templateStringExpression.getCurrentScope().getId());
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
        objectLiteralExpression.setScopeID(objectLiteralExpression.getCurrentScope().getId());
        if(ctx.objectLiteral()!=null){
            objectLiteralExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
       return objectLiteralExpression;
    }

    @Override
    public LiteralExpression visitLiteralExpression(JsxParser.LiteralExpressionContext ctx) {
        LiteralExpression literalExpression=new LiteralExpression();
        literalExpression.setScopeID(literalExpression.getCurrentScope().getId());
        if(ctx.literal()!=null){
            literalExpression.setLiteral(visitLiteral(ctx.literal()));
        }
        return literalExpression;
    }

    @Override
    public ArrayLiteralExpression visitArrayLiteralExpression(JsxParser.ArrayLiteralExpressionContext ctx) {
        ArrayLiteralExpression arrayLiteralExpression=new ArrayLiteralExpression();
        arrayLiteralExpression.setScopeID(arrayLiteralExpression.getCurrentScope().getId());
        if(ctx.arrayLiteral()!=null){
            arrayLiteralExpression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return arrayLiteralExpression;
    }

    @Override
    public MemberDotExpression visitMemberDotExpression(JsxParser.MemberDotExpressionContext ctx) {
        MemberDotExpression memberDotExpression=new MemberDotExpression();
        memberDotExpression.setScopeID(memberDotExpression.getCurrentScope().getId());
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
        memberIndexExpression.setScopeID(memberIndexExpression.getCurrentScope().getId());
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
        identifierExpression.setScopeID(identifierExpression.getCurrentScope().getId());
       if(ctx.identifier()!=null){
          identifierExpression.setIdentifier(visitIdentifier(ctx.identifier()));
       }
       return identifierExpression;
    }

    @Override
    public ArgumentsExpression visitArgumentsExpression(JsxParser.ArgumentsExpressionContext ctx) {
        ArgumentsExpression argumentsExpression=new ArgumentsExpression();
        argumentsExpression.setScopeID(argumentsExpression.getCurrentScope().getId());
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
        functionExpression.setScopeID(functionExpression.getCurrentScope().getId());
        functionExpression.createScope("function");
        if(ctx.anoymousFunction()!=null){
            functionExpression.setAnoymousFunction((AnoymousFunction)visit(ctx.anoymousFunction()));
        }
        Node.removeScope();
        return functionExpression;
    }

    @Override
    public AssignmentExpression visitAssignmentExpression(JsxParser.AssignmentExpressionContext ctx) {
        AssignmentExpression assignmentExpression=new AssignmentExpression();
        assignmentExpression.setScopeID(assignmentExpression.getCurrentScope().getId());
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
        multiplicativeExpression.setScopeID(multiplicativeExpression.getCurrentScope().getId());
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
        htmlElementExpression.setScopeID(htmlElementExpression.getCurrentScope().getId());
        if(ctx.htmlElements()!=null){
            htmlElementExpression.setHtmlElements(visitHtmlElements(ctx.htmlElements()));
        }
        return htmlElementExpression;
    }

    @Override
    public HtmlElements visitHtmlElements(JsxParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements=new HtmlElements();
        htmlElements.setScopeID(htmlElements.getCurrentScope().getId());if(ctx.htmlElement()!=null){
            for (int i=0;i<ctx.htmlElement().size();i++){
                htmlElements.add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        return htmlElements;
    }

    @Override
    public HtmlElement visitHtmlElement(JsxParser.HtmlElementContext ctx) {
        HtmlElement htmlElement =new HtmlElement();
        htmlElement.setScopeID(htmlElement.getCurrentScope().getId());
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
        htmlContent.setScopeID(htmlContent.getCurrentScope().getId());
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
        htmlTagStartName.setScopeID(htmlTagStartName.getCurrentScope().getId());
        if(ctx.htmlTagName()!=null){
            htmlTagStartName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagStartName;
    }

    @Override
    public HtmlTagClosingName visitHtmlTagClosingName(JsxParser.HtmlTagClosingNameContext ctx) {
        HtmlTagClosingName htmlTagClosingName=new HtmlTagClosingName();
        htmlTagClosingName.setScopeID(htmlTagClosingName.getCurrentScope().getId());
        if(ctx.htmlTagName()!=null){
            htmlTagClosingName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagClosingName;
    }

    @Override
    public HtmlTagName visitHtmlTagName(JsxParser.HtmlTagNameContext ctx) {
        HtmlTagName htmlTagName=new HtmlTagName();
        htmlTagName.setScopeID(htmlTagName.getCurrentScope().getId());
        if(ctx.TagName()!=null){
            htmlTagName.setTagName(ctx.TagName().getText());
        }
        if(ctx.keyword()!=null){
            htmlTagName.setKeyword(visitKeyword(ctx.keyword()));
        }
        if(ctx.Identifier()!=null){
            htmlTagName.setIdentifier(ctx.Identifier().getText());
        }
        if(ctx.Button()!=null){
            htmlTagName.setButton(ctx.Button().getText());
        }
        return htmlTagName;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(JsxParser.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute =new HtmlAttribute();
        htmlAttribute.setScopeID(htmlAttribute.getCurrentScope().getId());
        Scope scope=new Scope();
        Symbol symbol=new Symbol();
        Symbol symbol1=new Symbol();
        symbol.setNodeName("HtmlAttribute");
        if(ctx.htmlAttributeName()!=null){

            htmlAttribute.setHtmlAttributeName(visitHtmlAttributeName(ctx.htmlAttributeName()));
            symbol.setName(ctx.htmlAttributeName().getText());
        }
        if(ctx.htmlAttributeValue()!=null){
            htmlAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
           symbol.setValue(ctx.htmlAttributeValue().getText());
           // scope.addSymbol(symbol);
            htmlAttribute.createSymbol(htmlAttribute.getScopeID(),symbol.getName()," ",symbol.getValue(),symbol.getNodeName());
        }

        if(ctx.style()!=null){
            String cleanedCss="";
            symbol1.setNodeName("styleHtmlAttribute");
            htmlAttribute.setStyle(visitStyle(ctx.style()));
            symbol1.setName("Style");
            symbol1.setValue(ctx.style().getText());
            // Regular expression to match the style attribute including its value
            String patternStr = "style=(.*?)}";
            Pattern pattern = Pattern.compile(patternStr);

            Matcher matcher = pattern.matcher((CharSequence) symbol1.getValue());

            if (matcher.find()) {
                // Extract the matched group (everything inside the braces)
                String cssProperties = matcher.group(1);

                // Remove the first '{' character
                cssProperties = cssProperties.substring(1); // Start from index 1 to skip the first character
                // Further processing to clean up the extracted string
                 cleanedCss = cssProperties.trim().replaceAll("\\s+", "");
                System.out.println(cleanedCss);
            } else {
                System.out.println("No style attribute found.");
            }
            htmlAttribute.createSymbol(htmlAttribute.getScopeID(),symbol1.getName()," ",cleanedCss,symbol1.getNodeName());
            //scope.addSymbol(symbol1);
        }
        return htmlAttribute;
    }

    @Override
    public HtmlAttributeName visitHtmlAttributeName(JsxParser.HtmlAttributeNameContext ctx) {
       HtmlAttributeName htmlAttributeName=new HtmlAttributeName();
        htmlAttributeName.setScopeID(htmlAttributeName.getCurrentScope().getId());
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
        htmlChardata.setScopeID(htmlChardata.getCurrentScope().getId());
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
        htmlAttributeValue.setScopeID(htmlAttributeValue.getCurrentScope().getId());
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
        assignable.setScopeID(assignable.getCurrentScope().getId());
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
        objectLiteral.setScopeID(objectLiteral.getCurrentScope().getId());
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
        objectExpressionSequence.setScopeID(objectExpressionSequence.getCurrentScope().getId());
        if(ctx.expressionSequence()!=null){
            objectExpressionSequence.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return objectExpressionSequence;
    }

    @Override
    public FunctionDecl visitFunctionDecl(JsxParser.FunctionDeclContext ctx) {
        FunctionDecl functionDecl=new FunctionDecl();
        functionDecl.setScopeID(functionDecl.getCurrentScope().getId());
        if(ctx.functionDeclaration()!=null){
            functionDecl.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        return functionDecl;
    }

    @Override
    public AnoymousFunctionDecl visitAnoymousFunctionDecl(JsxParser.AnoymousFunctionDeclContext ctx) {
       AnoymousFunctionDecl anoymousFunctionDecl=new AnoymousFunctionDecl();
        anoymousFunctionDecl.setScopeID(anoymousFunctionDecl.getCurrentScope().getId());
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
        arrowFunction.setScopeID(arrowFunction.getCurrentScope().getId());
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
        arrowFunctionParameters.setScopeID(arrowFunctionParameters.getCurrentScope().getId());
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
        arrowFunctionBody.setScopeID(arrowFunctionBody.getCurrentScope().getId());
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
        literal.setScopeID(literal.getCurrentScope().getId());
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
        templateStringLiteral.setScopeID(templateStringLiteral.getCurrentScope().getId());
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
        templateStringAtom.setScopeID(templateStringAtom.getCurrentScope().getId());
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
        numericLiteral.setScopeID(numericLiteral.getCurrentScope().getId());
        if(ctx.DecimalLiteral()!=null){
            numericLiteral.setDecimalLiteral(ctx.DecimalLiteral().getText());
        }
        return numericLiteral;
    }


    @Override
    public IdentifierName visitIdentifierName(JsxParser.IdentifierNameContext ctx) {
        IdentifierName identifierName=new IdentifierName();
        identifierName.setScopeID(identifierName.getCurrentScope().getId());
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
        identifier.setScopeID(identifier.getCurrentScope().getId());
        if(ctx.Async()!=null){
            identifier.setIdentifier(ctx.Async().getText());

        }
        if (ctx.Identifier() != null) {
            identifier.setIdentifier(ctx.Identifier().getText());

        }

        return identifier;
    }

    @Override
    public Style visitStyle(JsxParser.StyleContext ctx) {
        Style style=new Style();
        style.setScopeID(style.getCurrentScope().getId());
        if(ctx.Style()!=null){
            style.setStyle(ctx.Style().getText());
        }
        if(ctx.height()!=null){
            style.setHeight(visitHeight(ctx.height()));
        }
        if(ctx.width()!=null){
            style.setWidth(visitWidth(ctx.width()));
        }
        if(ctx.margin()!=null){
            for(int i=0;i<ctx.margin().size();i++){
                style.add(visitMargin(ctx.margin(i)));
            }
        }
        return style;
    }

    @Override
    public Height visitHeight(JsxParser.HeightContext ctx) {
        Height height=new Height();
        height.setScopeID(height.getCurrentScope().getId());
       Scope scope=new Scope();
        Symbol symbol=new Symbol();
       symbol.setNodeName("Height");
        if(ctx.Height()!=null){
            height.setHeight(ctx.Height().getText());
            symbol.setName(ctx.Height().getText());
        }
        if(ctx.StringLiteral()!=null){
            height.setStringLiteral(ctx.StringLiteral().getText());
            symbol.setValue(ctx.StringLiteral().getText());
        }
        height.createSymbol(height.getScopeID(),symbol.getName()," ",symbol.getValue(),symbol.getNodeName());
        //scope.addSymbol(symbol);
        return height;
    }

    @Override
    public Width visitWidth(JsxParser.WidthContext ctx) {
       Width width=new Width();
        width.setScopeID(width.getCurrentScope().getId());
       Scope scope=new Scope();
       Symbol symbol=new Symbol();
        symbol.setNodeName("Width");
       if(ctx.Width()!=null){
           width.setWidth(ctx.Width().getText());
           symbol.setName(ctx.Width().getText());
       }
        if(ctx.StringLiteral()!=null){
            width.setStringLiteral(ctx.StringLiteral().getText());
            symbol.setValue(ctx.StringLiteral().getText());
        }
        width.createSymbol(width.getScopeID(),symbol.getName()," ",symbol.getValue(),symbol.getNodeName());
        //scope.addSymbol(symbol);
       return width;
    }

    @Override
    public Margin visitMargin(JsxParser.MarginContext ctx) {
        Margin margin=new Margin();
        margin.setScopeID(margin.getCurrentScope().getId());
        Scope scope=new Scope();
        Symbol symbol=new Symbol();
        symbol.setNodeName("Margin");
        if(ctx.marginKay()!=null){
            margin.setMarginKay(visitMarginKay(ctx.marginKay()));
            symbol.setName(ctx.marginKay().getText());
        }
        if(ctx.StringLiteral()!=null){
            margin.setStringLiteral(ctx.StringLiteral().getText());
            symbol.setValue(ctx.StringLiteral().getText());
        }
        margin.createSymbol(margin.getScopeID(),symbol.getName()," ",symbol.getValue(),symbol.getNodeName());
        //scope.addSymbol(symbol);
        return margin;
    }

    @Override
    public MarginKay visitMarginKay(JsxParser.MarginKayContext ctx) {
       MarginKay marginKay=new MarginKay();
        marginKay.setScopeID(marginKay.getCurrentScope().getId());
       if(ctx.MarginLeft()!=null){
           marginKay.setMarginKay(ctx.MarginLeft().getText());
       }
        if(ctx.MarginRight()!=null){
            marginKay.setMarginKay(ctx.MarginRight().getText());
        }
        if(ctx.MarginTop()!=null){
            marginKay.setMarginKay(ctx.MarginTop().getText());
        }
        if(ctx.MarginBottom()!=null){
            marginKay.setMarginKay(ctx.MarginBottom().getText());
        }
       return marginKay;
    }

    @Override
    public ReservedWord visitReservedWord(JsxParser.ReservedWordContext ctx) {
        ReservedWord reservedWord=new ReservedWord();
        reservedWord.setScopeID(reservedWord.getCurrentScope().getId());
        if(ctx.keyword()!=null){
            reservedWord.setKeyword(visitKeyword(ctx.keyword()));
        }
        return reservedWord;
    }

    @Override
    public Keyword visitKeyword(JsxParser.KeywordContext ctx) {
        Keyword keyword=new Keyword();
        keyword.setScopeID(keyword.getCurrentScope().getId());
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
        let.setScopeID(let.getCurrentScope().getId());
        if(ctx.StrictLet()!=null){
            let.setStrictLet(ctx.StrictLet().getText());
        }
        return let;
    }

    @Override
    public Eos visitEos(JsxParser.EosContext ctx) {
        Eos eos=new Eos();
        eos.setScopeID(eos.getCurrentScope().getId());
        if(ctx.EOF()!=null){
            eos.setEof(ctx.EOF().getText());
        }
        if(ctx.SemiColon()!=null){
            eos.setSemiColon(ctx.SemiColon().getText());
        }
        return eos;
    }
}

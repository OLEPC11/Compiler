package AstClasses;

public class Statement {
    Block block;
    EmptyStatement emptyStatement;
    FunctionDeclaration functionDeclaration;
    ReturnStatement returnStatement;
    ExpressionStatement expressionStatement;
    ExportStatement exportStatement;
    IfStatement ifStatement;
    VariableStatement variableStatement;
    ImportStatement importStatement;
    ReactHook reactHook;

    public Block getBlock() {
        return block;
    }

    public EmptyStatement getEmptyStatement() {
        return emptyStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public void setEmptyStatement(EmptyStatement emptyStatement) {
        this.emptyStatement = emptyStatement;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public ReactHook getReactHook() {
        return reactHook;
    }

    public void setReactHook(ReactHook reactHook) {
        this.reactHook = reactHook;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }
    public void PrintAst(){
        //System.out.println("*******Statement*******");
        if(block!=null){
           block.PrintAst();
           System.out.println();
        }
        if(emptyStatement!=null){
            emptyStatement.PrintAst();
            System.out.println();
        }
        if(functionDeclaration!=null){
            functionDeclaration.PrintAst();
            System.out.println();
        }
        if(returnStatement!=null){
            returnStatement.PrintAst();
            System.out.println();
        }

        if(expressionStatement!=null){
            expressionStatement.PrintAst();
            System.out.println();
        }

        if(exportStatement!=null){
            exportStatement.PrintAst();
        }

        if(ifStatement!=null){
            ifStatement.PrintAst();
            System.out.println();
        }

        if(variableStatement!=null){
            variableStatement.PrintAst();
            System.out.println();
        }

        if(importStatement!=null){
            importStatement.PrintAst();
            System.out.println();
        }
        if(reactHook!=null){
            reactHook.PrintAst();
            System.out.println();
        }
    }
    public String getValue(){

        if(functionDeclaration!=null){
            return functionDeclaration.getValue();
        }
        if(returnStatement!=null){
            return returnStatement.getValue();
        }

        if(expressionStatement!=null){
            return expressionStatement.getValue();
        }

        if(variableStatement!=null){
            return variableStatement.getValue();
        }
        return "No Value";
    }

}

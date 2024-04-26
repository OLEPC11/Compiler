package AstClasses;

public class Declaration {

    VariableStatement variableStatement;
    FunctionDeclaration functionDeclaration;

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }
    public void PrintAst(){
        if(variableStatement!=null){
            variableStatement.PrintAst();
        }
        if(functionDeclaration!=null){
            functionDeclaration.PrintAst();
        }
    }
}

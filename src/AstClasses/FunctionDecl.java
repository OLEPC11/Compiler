package AstClasses;

public class FunctionDecl extends AnoymousFunction {
    FunctionDeclaration functionDeclaration;

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }
    public void PrintAst(){
        if(functionDeclaration!=null){
            functionDeclaration.PrintAst();
        }
    }
    public String getValue(){
        if(functionDeclaration!=null){
            return functionDeclaration.getValue();
        }
        return "No Value";
    }
}

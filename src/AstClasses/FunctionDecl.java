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
        //setScopeID(getCurrentScope().getId());
        if(functionDeclaration!=null){
            functionDeclaration.PrintAst();
        }
    }
    public String getValue(){
        if(functionDeclaration!=null){
            return functionDeclaration.getValue();
        }
        return "    ";
    }
    public String CodeGen(){
        if(functionDeclaration!=null){
            return functionDeclaration.CodeGen();
        }
        return "  ";
    }
}

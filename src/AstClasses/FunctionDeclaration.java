package AstClasses;

public class FunctionDeclaration {
    String Async;
    String function;
    Identifier identifier;
    FormalParameterList formalParameterList;
    FunctionBody functionBody;

    public String getAsync() {
        return Async;
    }

    public void setAsync(String async) {
        Async = async;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
    public void PrintAst(){
        //System.out.println("******FunctionDeclaration******");
        if(Async!=null){
            System.out.print(Async+" ");
        }
        if(function!=null){
            System.out.print(function+" ");
        }
        if(identifier!=null){
            identifier.PrintAst();
        }
        if(formalParameterList!=null){
            System.out.print("("+" ");
           formalParameterList.PrintAst();
            System.out.print(")"+" ");
        }
        if(functionBody!=null){
            System.out.print("{"+" ");
            functionBody.PrintAst();
            System.out.print("}"+" ");
        }
    }
    public String getValue(){
        if(formalParameterList!=null){
            return formalParameterList.getValue();
        }
        if(functionBody!=null){
            return functionBody.getValue();
        }
        else {
            return "No Value";
        }
    }
}

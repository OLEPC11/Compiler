package AstClasses;

public class AnoymousFunctionDecl extends AnoymousFunction {
    String Async;
    String function;
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
        if(Async!=null){
            System.out.print(Async+" ");
        }
        if(function!=null){
            System.out.print(function+" ");
        }
        if(formalParameterList!=null){
            formalParameterList.PrintAst();
        }
        if(functionBody!=null){
            functionBody.PrintAst();
        }
    }

    public String getValue(){
        if(Async!=null){
            return  Async+" ";
        }
        if(function!=null){
            return function+" ";
        }
        if(formalParameterList!=null&&functionBody!=null){
            return formalParameterList.getValue()+" "+functionBody.getValue();
        }

        return "No Value";
    }
}

package AstClasses;

public class FunctionProperty  extends PropertyAssignment{
    PropertyName propertyName;
    FormalParameterList formalParameterList;
    FunctionBody functionBody;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
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
        if(propertyName!=null){
            propertyName.PrintAst();
        }
        if(formalParameterList!=null){
            formalParameterList.PrintAst();
        }
        if(functionBody!=null){
            functionBody.PrintAst();
        }
    }
}

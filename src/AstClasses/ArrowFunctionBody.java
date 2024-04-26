package AstClasses;

public class ArrowFunctionBody {
    SingleExpression singleExpression;
    FunctionBody functionBody;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
    public void PrintAst(){
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(functionBody!=null){
            System.out.print("{"+" ");
            functionBody.PrintAst();
            System.out.print("}"+" ");
        }
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        if(functionBody!=null){
            return "{"+functionBody.getValue()+"}";
        }
        return "No Value";
    }
}

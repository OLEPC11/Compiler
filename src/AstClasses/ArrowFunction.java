package AstClasses;

public class ArrowFunction extends AnoymousFunction {
    ArrowFunctionParameters arrowFunctionParameters;
    ArrowFunctionBody arrowFunctionBody;

    public ArrowFunctionParameters getArrowFunctionParameters() {
        return arrowFunctionParameters;
    }

    public void setArrowFunctionParameters(ArrowFunctionParameters arrowFunctionParameters) {
        this.arrowFunctionParameters = arrowFunctionParameters;
    }

    public ArrowFunctionBody getArrowFunctionBody() {
        return arrowFunctionBody;
    }

    public void setArrowFunctionBody(ArrowFunctionBody arrowFunctionBody) {
        this.arrowFunctionBody = arrowFunctionBody;
    }

    public void PrintAst(){
        if(arrowFunctionParameters!=null){
            arrowFunctionParameters.PrintAst();
        }
        if(arrowFunctionBody!=null){
            System.out.print("=>"+" ");
            arrowFunctionBody.PrintAst();
        }
    }
    String value,value1;
    public String getValue(){
        if(arrowFunctionParameters!=null){
            value= arrowFunctionParameters.getValue();
        }
        if(arrowFunctionBody!=null){
            value1= "=>"+arrowFunctionBody.getValue();
        }
        return value+value1;
    }
}

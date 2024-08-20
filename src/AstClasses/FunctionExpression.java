package AstClasses;

public class FunctionExpression extends SingleExpression{
    AnoymousFunction anoymousFunction;

    public AnoymousFunction getAnoymousFunction() {
        return anoymousFunction;
    }

    public void setAnoymousFunction(AnoymousFunction anoymousFunction) {
        this.anoymousFunction = anoymousFunction;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(anoymousFunction!=null){
            anoymousFunction.PrintAst();
        }
    }
    public String getValue(){
        if(anoymousFunction!=null){
           return anoymousFunction.getValue();
        }
        return "    ";
    }
    public String CodeGen(){
        if(anoymousFunction!=null){

            return anoymousFunction.CodeGen();
        }
        return "  ";
    }


}

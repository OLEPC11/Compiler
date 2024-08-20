package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

public class ArrowFunctionBody extends Node {
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
       // setScopeID(getCurrentScope().getId());
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
        return "    ";
    }
    public String CodeGen(){
        String[] part= Main.useCase.split("\\.");

        if(singleExpression!=null){
            return singleExpression.CodeGen();
        }
        if(functionBody!=null){
            return "\n{"+ Main.currentPrice+" = "+functionBody.CodeGen()+ ";\ndocument.getElementById('"+part[1]+"').textContent = `Current Price: $${"+Main.currentPrice+"}`;}"+"\n";
        }
        return "   ";
    }
}

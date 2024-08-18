package AstClasses;

import VisitParserTree.Node;

public class ArrayElement extends Node {
    String ellipsis;
    SingleExpression singleExpression;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {

        this.ellipsis = ellipsis;
    }

    public void PrintAst(){
        if(ellipsis!=null){
            System.out.print(ellipsis+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        else{
            return "No value";
        }
    }
    public String CodeGen(){
        if(singleExpression!=null){
            return singleExpression.CodeGen();
        }
        else{
            return "  ";
        }
    }
}

package AstClasses;

import VisitParserTree.Node;

public class ObjectExpressionSequence extends Node {
    ExpressionSequence expressionSequence;

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public void PrintAst(){
        if (expressionSequence!=null){
            System.out.print("{"+" ");
            expressionSequence.PrintAst();
            System.out.print("}"+" ");
        }
    }
    public String getValue(){
        if (expressionSequence!=null){
          return expressionSequence.getValue();
        }
        return "No Value";
    }
    public String CodeGen(){
        if (expressionSequence!=null){
            return "${"+expressionSequence.CodeGen()+"}";
        }
        return "  ";
    }
}

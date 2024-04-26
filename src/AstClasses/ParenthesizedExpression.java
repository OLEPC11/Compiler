package AstClasses;

public class ParenthesizedExpression extends SingleExpression{
    ExpressionSequence expressionSequence;

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }
    public void PrintAst(){
        if(expressionSequence!=null){
            expressionSequence.PrintAst();
        }
    }
    public String getValue(){
        if(expressionSequence!=null){
            return  expressionSequence.getValue();
        }
        return "No Value";
    }
}

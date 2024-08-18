package AstClasses;

public class MemberIndexExpression extends SingleExpression{
    SingleExpression singleExpression;
    ExpressionSequence expressionSequence;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }
    public void PrintAst(){
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(expressionSequence!=null){
            System.out.print("["+" ");
            expressionSequence.PrintAst();
            System.out.print("]"+" ");
        }
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        if(expressionSequence!=null){
           return "["+ " "+expressionSequence.getValue()+" "+"]";
        }
        return "No Value";
    }
}

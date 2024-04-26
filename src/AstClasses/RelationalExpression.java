package AstClasses;

import java.util.ArrayList;

public class RelationalExpression extends SingleExpression {
    ArrayList<SingleExpression> singleExpressions=new ArrayList<>();

    public ArrayList<SingleExpression> getSingleExpressions() {
        return singleExpressions;
    }

    public void setSingleExpressions(ArrayList<SingleExpression> singleExpressions) {
        this.singleExpressions = singleExpressions;
    }
    public void add(SingleExpression singleExpression){
        singleExpressions.add(singleExpression);
    }
    public void PrintAst(){
        if (singleExpressions!=null){
            for (SingleExpression singleExpression : singleExpressions) {
                singleExpression.PrintAst();
            }
        }
    }
}

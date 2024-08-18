package AstClasses;

import java.util.ArrayList;

public class ComputedPropertyExpressionAssignment  extends PropertyAssignment {
    ArrayList<SingleExpression>singleExpressions=new ArrayList<>();

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
        if(singleExpressions!=null){
            System.out.print("["+" ");
            for (int i=0;i<singleExpressions.size();i++) {
               singleExpressions.get(i).PrintAst();
                if(i==singleExpressions.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(":"+" ");
                }
            }
            System.out.print("]"+" ");
        }
    }
}

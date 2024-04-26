package AstClasses;

import java.util.ArrayList;

public class ExpressionSequence {
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
        if (singleExpressions!=null){
            //System.out.print("("+" ");
            for (int i=0;i<singleExpressions.size();i++) {
                singleExpressions.get(i).PrintAst();
                if(i==singleExpressions.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
            //System.out.print(")"+" ");
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(singleExpressions!=null){
            for (int i=0;i<singleExpressions.size();i++) {
                if (i == singleExpressions.size() - 1) {
                    stringBuilder.append(singleExpressions.get(i).getValue());
                } else {
                    stringBuilder.append(singleExpressions.get(i).getValue()+",");
                }
            }
            value=stringBuilder.toString();
            return value;
        }
        else {
            return "No Value";
        }
    }
}

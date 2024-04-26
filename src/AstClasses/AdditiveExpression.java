package AstClasses;

import java.util.ArrayList;

public class AdditiveExpression extends SingleExpression{
    String plus;
    String sub;
    ArrayList<SingleExpression>singleExpressions=new ArrayList<>();

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public ArrayList<SingleExpression> getSingleExpressions() {
        return singleExpressions;
    }

    public void setSingleExpressions(ArrayList<SingleExpression> singleExpressions) {
        this.singleExpressions = singleExpressions;
    }
    public void add (SingleExpression singleExpression){
        singleExpressions.add(singleExpression);
    }
    public void PrintAst(){
        if(singleExpressions!=null){
            for(int i=0;i<singleExpressions.size();i++){
                singleExpressions.get(i).PrintAst();
                if(i==singleExpressions.size()-1){
                    System.out.print("");
                }
                else{
                    if(plus!=null){
                    System.out.print("+"+" ");
                    }
                    else if(sub!=null){
                        System.out.print("-"+" ");
                    }
                }
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(singleExpressions!=null){
        for (SingleExpression singleExpression : singleExpressions) {
            stringBuilder.append(singleExpression.getValue());
        }
        value=stringBuilder.toString();
        return value;
        }
        return "No Value";
    }
}

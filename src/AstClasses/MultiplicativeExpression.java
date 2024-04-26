package AstClasses;

import java.util.ArrayList;

public class MultiplicativeExpression extends SingleExpression{
    String multiple;
    String divide;
    ArrayList<SingleExpression> singleExpressions=new ArrayList<>();

    public String getMultiple() {
        return multiple;
    }

    public void setMultiple(String multiple) {
        this.multiple = multiple;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
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
                    if(multiple!=null){
                    System.out.print("*"+" ");
                    }
                    else if(divide!=null){
                        System.out.print("/"+" ");
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

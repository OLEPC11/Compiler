package AstClasses;

import java.util.ArrayList;

public class UseEffectHook {

    String useEffect;
    ArrayList<ExpressionSequence> expressionSequences=new ArrayList<>();

    public String getUseEffect() {
        return useEffect;
    }

    public void setUseEffect(String useEffect) {
        this.useEffect = useEffect;
    }

    public ArrayList<ExpressionSequence> getExpressionSequences() {
        return expressionSequences;
    }

    public void setExpressionSequences(ArrayList<ExpressionSequence> expressionSequences) {
        this.expressionSequences = expressionSequences;
    }
    public void add(ExpressionSequence expressionSequence){
        expressionSequences.add(expressionSequence);
    }
    public void PrintAst() {
        if (useEffect != null) {
            System.out.print(useEffect + " ");
        }
        if (expressionSequences != null) {
            for (ExpressionSequence expressionSequence : expressionSequences) {
                expressionSequence.PrintAst();
            }
        }
    }
}

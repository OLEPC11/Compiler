package AstClasses;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

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
        AddToSymbolTable();
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(useEffect!=null) {
            return useEffect;
        }
        if(expressionSequences!=null){
            for (ExpressionSequence expressionSequence:expressionSequences) {
                stringBuilder.append(expressionSequence.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "No Value";
    }
    public void AddToSymbolTable(){
        Symbol symbol=new Symbol();
        if(useEffect!=null){
            symbol.setName(useEffect);
        }
        if(expressionSequences!=null){
            for(int i=0;i<expressionSequences.size();i++){
            symbol.setValue(expressionSequences.get(i).getValue());
            }
        }
        SymbolTable.list.add(symbol);
    }
}

package AstClasses;

public class ExpressionStatement {
    ExpressionSequence expressionSequence;
    Eos eos;

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }
    public void PrintAst(){
        if(expressionSequence!=null){
            expressionSequence.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }
    public String getValue(){
        if(expressionSequence!=null){
          return   expressionSequence.getValue();
        }
       return "No Value";
    }
}

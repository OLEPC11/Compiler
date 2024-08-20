package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

public class UseStateHook extends Node {

    String UseState;
    SingleExpression singleExpression;
    Eos eos;

    public String getUseState() {
        return UseState;
    }

    public void setUseState(String useState) {
        UseState = useState;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    public void PrintAst() {
        //setScopeID(getCurrentScope().getId());
        if (UseState != null) {
            System.out.print(UseState + " ");
        }
        if (singleExpression != null) {
            singleExpression.PrintAst();
            Main.useCase=singleExpression.CodeGen();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }
    public String CodeGen(){
        if (singleExpression!=null)
        {
              return singleExpression.CodeGen();
        }
        return "  ";
    }
}

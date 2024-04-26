package AstClasses;

import java.util.ArrayList;

public class UseRefHook {
    String useRef;
    SingleExpression singleExpression;
    Eos eos;

    public String getUseRef() {
        return useRef;
    }

    public void setUseRef(String useRef) {
        this.useRef = useRef;
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
        if (useRef != null) {
            System.out.print(useRef + " ");
        }
        if (singleExpression != null) {
            singleExpression.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }
}

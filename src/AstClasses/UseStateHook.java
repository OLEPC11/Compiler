package AstClasses;

public class UseStateHook {

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
        if (UseState != null) {
            System.out.print(UseState + " ");
        }
        System.out.print("(");
        if (singleExpression != null) {
            singleExpression.PrintAst();
        }
        System.out.print(")");
        if(eos!=null){
            eos.PrintAst();
        }
    }
}

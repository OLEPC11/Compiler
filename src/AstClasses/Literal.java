package AstClasses;

public class Literal {
    String NullLiteral;
    String BooleanLiteral;
    String StringLiteral;
    NumericLiteral numericLiteral;


    public String getNullLiteral() {
        return NullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
       this.NullLiteral = nullLiteral;
    }

    public String getBooleanLiteral() {
        return BooleanLiteral;
    }

    public void setBooleanLiteral(String booleanLiteral) {
        this.BooleanLiteral = booleanLiteral;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public NumericLiteral getNumericLiteral() {
        return numericLiteral;
    }

    public void setNumericLiteral(NumericLiteral numericLiteral) {
        this.numericLiteral = numericLiteral;
    }

    public void PrintAst(){
        if(NullLiteral!=null){
            System.out.print(" "+NullLiteral+" ");
        }
        if(StringLiteral!=null){
            System.out.print(" "+StringLiteral+" ");
        }
        if(BooleanLiteral!=null){
            System.out.print(" "+BooleanLiteral+" ");
        }
        if(numericLiteral!=null){
            numericLiteral.PrintAst();

        }
    }
    public String getValue(){
        if(NullLiteral!=null){
            return NullLiteral;
        }
        if(StringLiteral!=null){
            return StringLiteral;
        }
        if(BooleanLiteral!=null){
            return BooleanLiteral;
        }
        if(numericLiteral!=null){
            return numericLiteral.getValue();
        }
        return "No Value";
    }

}

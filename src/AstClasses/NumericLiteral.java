package AstClasses;

public class NumericLiteral {
    String DecimalLiteral;


    public String getDecimalLiteral() {
        return DecimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        DecimalLiteral = decimalLiteral;
    }

    public void PrintAst(){
        if(DecimalLiteral!=null){
            System.out.print(" "+DecimalLiteral+" ");
        }

    }
    public String getValue(){
        if(DecimalLiteral!=null){
            return DecimalLiteral;
        }
        else {
            return "No Value";
        }
    }
}

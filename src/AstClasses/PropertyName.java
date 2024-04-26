package AstClasses;

public class PropertyName {
    IdentifierName identifierName;
    String stringLiteral;
    NumericLiteral numericLiteral;
    SingleExpression singleExpression;

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public NumericLiteral getNumericLiteral() {
        return numericLiteral;
    }

    public void setNumericLiteral(NumericLiteral numericLiteral) {
        this.numericLiteral = numericLiteral;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public void PrintAst(){
        if(identifierName!=null){
            identifierName.PrintAst();
        }
        if(stringLiteral!=null){
            System.out.print(stringLiteral+" ");
        }
        if(numericLiteral!=null){
            numericLiteral.PrintAst();
        }
        if(singleExpression!=null){
            System.out.print("["+" ");
            singleExpression.PrintAst();
            System.out.print("]");
        }
    }
    public String getValue(){
        if(identifierName!=null){
            return identifierName.getValue();
        }
        if(stringLiteral!=null){
            return stringLiteral;
        }
        if(numericLiteral!=null){
            return numericLiteral.getValue();
        }
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        else{
            return "No Value";
        }
    }
}

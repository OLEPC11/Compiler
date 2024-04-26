package AstClasses;

public class MemberDotExpression extends SingleExpression{
    SingleExpression singleExpression;
    IdentifierName identifierName;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }
    public void PrintAst(){
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(identifierName!=null){
            identifierName.PrintAst();
        }
    }
    public String getValue(){
        if(singleExpression!=null&&identifierName!=null) {
            return singleExpression.getValue() + " " + "." + " " + identifierName.getValue();
        }
        else{
            return "No Value";
        }
    }
}

package AstClasses;

public class LiteralExpression extends SingleExpression {
    Literal literal;

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }
    public void PrintAst(){
        if(literal!=null){
            literal.PrintAst();
        }
    }
    public String getValue(){
        if(literal!=null){
            return literal.getValue();
        }
        else {
            return "No Value";
        }
    }
}

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
        //setScopeID(getCurrentScope().getId());
        if(literal!=null){
            literal.PrintAst();
        }
    }
    public String getValue(){
        if(literal!=null){
            return literal.getValue();
        }
        else {
            return "    ";
        }
    }
    public String CodeGen(){
        if(literal!=null){
            return literal.CodeGen();
        }
        else {
            return "  ";
        }
    }
}

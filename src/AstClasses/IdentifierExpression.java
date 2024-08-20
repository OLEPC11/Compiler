package AstClasses;

public class IdentifierExpression extends SingleExpression {
    Identifier identifier;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(identifier!=null){
            identifier.PrintAst();
        }
    }
    public String getValue(){
        if(identifier!=null){
            return identifier.getValue();
        }
        return " ";
    }
    public String CodeGen(){
        if(identifier!=null){
            return identifier.CodeGen();
        }
        return "  ";
    }
}

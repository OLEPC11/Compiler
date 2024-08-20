package AstClasses;

public class ObjectLiteralExpression extends SingleExpression {
    ObjectLiteral objectLiteral;

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }
    public void PrintAst(){
     //   setScopeID(getCurrentScope().getId());
        if(objectLiteral!=null){
            objectLiteral.PrintAst();
        }
    }
    public String getValue(){
        if(objectLiteral!=null){
            return objectLiteral.getValue();
        }
        return "    ";
    }
    public String CodeGen(){
        if(objectLiteral!=null){
            return objectLiteral.CodeGen();
        }
        return "  ";
    }
}

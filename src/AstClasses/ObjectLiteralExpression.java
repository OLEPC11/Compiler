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
        if(objectLiteral!=null){
            objectLiteral.PrintAst();
        }
    }
    public String getValue(){
        if(objectLiteral!=null){
            return objectLiteral.getValue();
        }
        return "No Value";
    }
}

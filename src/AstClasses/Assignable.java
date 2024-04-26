package AstClasses;

public class Assignable {
    Identifier identifier;
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public void PrintAst() {
        if (identifier != null) {
            identifier.PrintAst();
        }
        if (arrayLiteral != null) {
            arrayLiteral.PrintAst();
        }
        if (objectLiteral != null) {
            objectLiteral.PrintAst();
        }
    }
    public String getValue(){
        if(identifier!=null){
            return identifier.getValue();
        }
        if(arrayLiteral!=null){
            return arrayLiteral.getValue();
        }
        if(objectLiteral!=null){
            return objectLiteral.getValue();
        }
        return "No Value";
    }

}
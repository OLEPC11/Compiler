package AstClasses;

public class ArrayLiteralExpression extends SingleExpression{
    ArrayLiteral arrayLiteral;

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }
    public void PrintAst(){
        if(arrayLiteral!=null){
            arrayLiteral.PrintAst();
        }
    }
    public String getValue(){
        if(arrayLiteral!=null){
           return arrayLiteral.getValue();
        }
        return " ";
    }
    public String CodeGen(){
        if(arrayLiteral!=null){
            return arrayLiteral.CodeGen();
        }
        return "  ";
    }
}

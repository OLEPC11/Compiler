package AstClasses;

import VisitParserTree.Node;

public class NumericLiteral extends Node {
    String DecimalLiteral;


    public String getDecimalLiteral() {
        return DecimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        DecimalLiteral = decimalLiteral;
    }

    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(DecimalLiteral!=null){
            System.out.print(" "+DecimalLiteral+" ");
        }

    }
    public String getValue(){
        if(DecimalLiteral!=null){
            return DecimalLiteral;
        }
        else {
            return "    ";
        }
    }
    public String CodeGen(){
        if(DecimalLiteral!=null){
            return DecimalLiteral;
        }
        else {
            return "  ";
        }
    }
}

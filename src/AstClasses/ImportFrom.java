package AstClasses;

import VisitParserTree.Node;

public class ImportFrom extends Node {
    String from;
    String stringLiteral;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(from!=null){
            System.out.print(from+" ");
        }
        if(stringLiteral!=null){
            System.out.print(stringLiteral+" ");
        }
    }
    public String CodeGen()
    {
        return stringLiteral +"\n";
    }
}

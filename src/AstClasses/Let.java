package AstClasses;

import VisitParserTree.Node;

public class Let extends Node {
    String strictLet;

    public String getStrictLet() {
        return strictLet;
    }

    public void setStrictLet(String strictLet) {
        this.strictLet = strictLet;
    }
    public void PrintAst() {
        if(strictLet!=null){
            System.out.print(strictLet+" ");
        }
    }
}

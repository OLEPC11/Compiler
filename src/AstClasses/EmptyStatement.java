package AstClasses;

import VisitParserTree.Node;

public class EmptyStatement extends Node {
    String semiColon;

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }
    public void PrintAst(){
     //   setScopeID(getCurrentScope().getId());
        //System.out.println("******EmptyStatement******");
        if(semiColon!=null){
            System.out.println(semiColon);
        }
    }
}

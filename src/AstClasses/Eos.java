package AstClasses;

import VisitParserTree.Node;

public class Eos extends Node {
    String eof;
    String semiColon;

    public String getEof() {
        return eof;
    }

    public void setEof(String eof) {
        this.eof = eof;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if (eof!=null){
            System.out.println(eof);
        }
        if(semiColon!=null){
            System.out.println(semiColon+" ");
        }
    }
}

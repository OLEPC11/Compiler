package AstClasses;

import VisitParserTree.Node;

public class ReservedWord extends Node {
    Keyword keyword;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(keyword!=null){
            keyword.PrintAst();
        }
    }
}

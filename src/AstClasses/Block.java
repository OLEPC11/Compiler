package AstClasses;

import VisitParserTree.Node;

public class Block extends Node {
    StatementList statementList;

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
    public void PrintAst(){
        //System.out.println("******Block******");
        if (statementList!=null){
            System.out.println("{"+" ");
            statementList.PrintAst();
            System.out.println("}"+" ");
        }
    }
}

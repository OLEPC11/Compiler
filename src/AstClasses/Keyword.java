package AstClasses;

import VisitParserTree.Node;

public class Keyword extends Node {
    String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void PrintAst() {
        //setScopeID(getCurrentScope().getId());
        if (keyword != null) {
            System.out.print(keyword + " ");
        }
    }

    public String CodeGen() {
        if (keyword != null) {
            return keyword + " ";


        }
        return " ";
    }
}
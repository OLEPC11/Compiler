package AstClasses;

import VisitParserTree.Node;

public class MarginKay extends Node {

    String marginKay;

    public String getMarginKay() {
        return marginKay;
    }

    public void setMarginKay(String marginKay) {
        this.marginKay = marginKay;
    }
    public void PrintAst(){
        if(marginKay!=null){
            System.out.print(marginKay+" ");
        }
    }
    public String getValue(){
        return marginKay+" ";

    }
}

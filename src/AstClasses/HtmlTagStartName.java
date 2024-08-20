package AstClasses;

import VisitParserTree.Node;

public class HtmlTagStartName extends Node {
    HtmlTagName htmlTagName;

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(htmlTagName!=null){
            htmlTagName.PrintAst();
        }
    }
    public String getValue(){
        if(htmlTagName!=null){
            return " "+htmlTagName+" ";
        }
        return " No Name";
    }
    public String CodeGen(){
        if(htmlTagName!=null){
            return htmlTagName.CodeGen()+" ";
        }
        return "  ";
    }
}

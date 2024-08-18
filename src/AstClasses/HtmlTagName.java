package AstClasses;

import VisitParserTree.Node;

public class HtmlTagName extends Node {
    String TagName;
    Keyword keyword;
    String Identifier;
    String button;

    public String getTagName() {
        return TagName;
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public void PrintAst(){
        if(TagName!=null){
            System.out.print(TagName+" ");
        }
        if(keyword!=null){
            keyword.PrintAst();
        }
        if(Identifier!=null){
            System.out.print(Identifier+" ");
        }
        if(button!=null){
            System.out.print(button+" ");
        }
    }
    public String getValue(){
        if(Identifier!=null){
            return " "+Identifier+" ";
        }
        if(TagName!=null){
            return " "+TagName+" ";
        }
        return " No Name";
    }
    public String CodeGen(){
        if(getIdentifier()!=null)
        {
            return getIdentifier()+" ";
        }
        if(TagName!=null){
            return TagName+" ";
        }
        if(keyword!=null){
            return keyword.CodeGen();
        }
        if(button!=null){
            return button;
        }
        return "  ";
    }
}

package AstClasses;

public class HtmlTagClosingName {
    HtmlTagName htmlTagName;

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }
    public void PrintAst(){
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
}

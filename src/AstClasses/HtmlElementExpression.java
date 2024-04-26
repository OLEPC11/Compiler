package AstClasses;

public class HtmlElementExpression extends SingleExpression{
    HtmlElements htmlElements;

    public HtmlElements getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(HtmlElements htmlElements) {
        this.htmlElements = htmlElements;
    }
    public void PrintAst(){
        if(htmlElements!=null){
            htmlElements.PrintAst();
        }
    }
    public String getValue(){
        if(htmlElements!=null){
            return htmlElements.getValue();
        }
        else{
            return "No Value";
        }
    }
}

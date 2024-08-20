package AstClasses;

import com.company.Main;

public class HtmlElementExpression extends SingleExpression{
    HtmlElements htmlElements;

    public HtmlElements getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(HtmlElements htmlElements) {
        this.htmlElements = htmlElements;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(htmlElements!=null){
            htmlElements.PrintAst();
        }
    }
    public String getValue(){
        if(htmlElements!=null){
            return htmlElements.getValue();
        }
        else{
            return "    ";
        }
    }
    public String CodeGen(){
        if(htmlElements!=null){
            if(Main.index==1)
            return   "document.getElementById('content').innerHTML = `" +
            htmlElements.CodeGen();
            else
            {

                    return
                            htmlElements.CodeGen();
            }
        }
        else{
            return "  ";
        }
    }
}

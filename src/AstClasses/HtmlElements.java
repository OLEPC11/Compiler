package AstClasses;

import java.util.ArrayList;

public class HtmlElements {
    ArrayList<HtmlElement>htmlElements=new ArrayList<>();

    public ArrayList<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(ArrayList<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }
    public void add(HtmlElement htmlElement){
        htmlElements.add(htmlElement);
    }
    public void PrintAst(){
        if(htmlElements!=null){
            //System.out.println("*****HtmlElements*****");
            for (HtmlElement htmlElement : htmlElements) {
                htmlElement.PrintAst();
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(htmlElements!=null){
            for (HtmlElement htmlElement : htmlElements) {
                stringBuilder.append(htmlElement.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "No Value";
    }
}

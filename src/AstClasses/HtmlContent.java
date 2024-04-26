package AstClasses;

import java.util.ArrayList;

public class HtmlContent {
    ArrayList<HtmlChardata>htmlChardatas=new ArrayList<>();
    ArrayList<HtmlElement>htmlElements=new ArrayList<>();
    ArrayList<ObjectExpressionSequence>objectExpressionSequences=new ArrayList<>();

    public ArrayList<HtmlChardata> getHtmlChardatas() {
        return htmlChardatas;
    }

    public void setHtmlChardatas(ArrayList<HtmlChardata> htmlChardatas) {
        this.htmlChardatas = htmlChardatas;
    }

    public ArrayList<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(ArrayList<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }

    public ArrayList<ObjectExpressionSequence> getObjectExpressionSequences() {
        return objectExpressionSequences;
    }

    public void setObjectExpressionSequences(ArrayList<ObjectExpressionSequence> objectExpressionSequences) {
        this.objectExpressionSequences = objectExpressionSequences;
    }
    public void add(HtmlChardata htmlChardata){
        htmlChardatas.add(htmlChardata);
    }
    public void add(ObjectExpressionSequence objectExpressionSequence){
        objectExpressionSequences.add(objectExpressionSequence);
    }
    public void add(HtmlElement htmlElement){
        htmlElements.add(htmlElement);
    }
    public void PrintAst(){
        if(htmlChardatas!=null){
            for(HtmlChardata htmlChardata:htmlChardatas){
                htmlChardata.PrintAst();
            }
        }
        if(htmlElements!=null){
            for(HtmlElement htmlElement:htmlElements){
                htmlElement.PrintAst();
            }
        }
        if(objectExpressionSequences!=null){
            for(ObjectExpressionSequence objectExpressionSequence:objectExpressionSequences){
                objectExpressionSequence.PrintAst();
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    StringBuilder stringBuilder1=new StringBuilder();
    String value1;
    public String getValue(){
        if(htmlElements!=null){
            for (HtmlElement htmlElement : htmlElements) {
                stringBuilder.append(htmlElement.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        if(objectExpressionSequences!=null){
            for (ObjectExpressionSequence objectExpressionSequence : objectExpressionSequences) {
                stringBuilder.append(objectExpressionSequence.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "No Value";
    }
}

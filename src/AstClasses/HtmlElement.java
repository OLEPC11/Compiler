package AstClasses;

import java.util.ArrayList;

public class HtmlElement {
    HtmlTagStartName htmlTagStartName;
    ArrayList<HtmlAttribute> htmlAttributes=new ArrayList<>();
    HtmlContent htmlContent;
    HtmlTagClosingName htmlTagClosingName;
    HtmlTagName htmlTagName;

    public HtmlTagStartName getHtmlTagStartName() {
        return htmlTagStartName;
    }

    public void setHtmlTagStartName(HtmlTagStartName htmlTagStartName) {
        this.htmlTagStartName = htmlTagStartName;
    }

    public ArrayList<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(ArrayList<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public HtmlTagClosingName getHtmlTagClosingName() {
        return htmlTagClosingName;
    }

    public void setHtmlTagClosingName(HtmlTagClosingName htmlTagClosingName) {
        this.htmlTagClosingName = htmlTagClosingName;
    }

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }
    public void add(HtmlAttribute htmlAttribute){
        htmlAttributes.add(htmlAttribute);
    }
    public void PrintAst(){
        //System.out.println("****HtmlElement****");
        if(htmlTagStartName!=null){
            System.out.print("<"+" ");
            htmlTagStartName.PrintAst();
            System.out.println();
        }
        if(htmlTagName!=null){
            System.out.print("<"+" ");
            htmlTagName.PrintAst();
            System.out.println();
        }
        if(htmlAttributes!=null){
            for(HtmlAttribute htmlAttribute:htmlAttributes){
                htmlAttribute.PrintAst();
                if(htmlContent==null){
                System.out.print("/>"+" ");}
                System.out.println();
            }
        }
        if(htmlContent!=null){
            htmlContent.PrintAst();
            if(htmlTagClosingName==null){
            System.out.print("/>"+" ");}
        }
        if(htmlTagClosingName!=null){
            System.out.println();
            System.out.print("</"+" ");
            htmlTagClosingName.PrintAst();
            System.out.print(">"+" ");
            System.out.println();
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value0;
    String value1;
    String value2;
    String value3;
    String value4;
    public String getValue(){
        if(htmlTagStartName!=null){
           value0= htmlTagStartName.getValue();
        }
        if(htmlTagName!=null){
            value1= htmlTagName.getValue();
        }
        if(htmlAttributes!=null){
            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                stringBuilder.append(htmlAttribute.getValue());
            }
            value2=stringBuilder.toString();
        }
        if(htmlContent!=null){
            value3= htmlContent.getValue();
        }

        if(htmlTagClosingName!=null){
            value4= htmlTagClosingName.getValue();
        }
        return value0+" "+value1+" "+value2+" "+value3+" "+value4;
    }
}

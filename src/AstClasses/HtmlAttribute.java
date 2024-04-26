package AstClasses;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

public class HtmlAttribute {
    HtmlAttributeName htmlAttributeName;
    HtmlAttributeValue htmlAttributeValue;

    public HtmlAttributeName getHtmlAttributeName() {
        return htmlAttributeName;
    }

    public void setHtmlAttributeName(HtmlAttributeName htmlAttributeName) {
        this.htmlAttributeName = htmlAttributeName;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }
    public void PrintAst(){
        //System.out.println("****HtmlAttribute****");
        if(htmlAttributeName!=null){
            htmlAttributeName.PrintAst();
        }
        if(htmlAttributeValue!=null){
            System.out.print("="+" ");
            htmlAttributeValue.PrintAst();
        }
        AddToSymbolTable();
    }
    public void AddToSymbolTable(){
        Symbol symbol=new Symbol();
        if(htmlAttributeName!=null){
            symbol.setName(htmlAttributeName.getValue());
        }
        if(htmlAttributeValue!=null){
            symbol.setValue(htmlAttributeValue.getValue());
        }
        SymbolTable.list.add(symbol);
    }
    public String getValue(){
        if(htmlAttributeName!=null&&htmlAttributeValue!=null){
            return htmlAttributeName.getValue()+"="+htmlAttributeValue.getValue();
        }
        else{
            return "No Value";
        }
    }
}

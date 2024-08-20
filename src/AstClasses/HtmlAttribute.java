package AstClasses;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import VisitParserTree.Node;

public class HtmlAttribute extends Node {
    Style style;
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void PrintAst() {
        // setScopeID(getCurrentScope().getId());
        //System.out.println("****HtmlAttribute****");
        if (htmlAttributeName != null) {
            htmlAttributeName.PrintAst();
        }
        if (htmlAttributeValue != null) {
            System.out.print("=" + " ");
            htmlAttributeValue.PrintAst();
        }
        if (style != null) {
            style.PrintAst();
        }
        //AddToSymbolTable();
    }

    //    public void AddToSymbolTable(){
//        Symbol symbol=new Symbol();
//        if(htmlAttributeName!=null){
//            symbol.setName(htmlAttributeName.getValue());
//        }
//        if(htmlAttributeValue!=null){
//            symbol.setValue(htmlAttributeValue.getValue());
//        }
//        SymbolTable.list.add(symbol);
//    }
    public String getValue() {
        if (htmlAttributeName != null && htmlAttributeValue != null) {
            if (!htmlAttributeName.CodeGen().equals("onClick")) {
                return htmlAttributeName.getValue() +"="+htmlAttributeValue.getValue();
            } else return htmlAttributeValue.getValue();
        } else {
            return "    ";
        }
    }

    public String CodeGen() {
        if (htmlAttributeName != null && htmlAttributeValue != null) {
            if (!htmlAttributeName.CodeGen().equals("onClick"))
                return htmlAttributeName.getValue() + " = " + htmlAttributeValue.CodeGen();
            else return htmlAttributeValue.getValue();
        } else {
            return "  ";
        }
    }
}

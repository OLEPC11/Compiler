package AstClasses;

import VisitParserTree.Node;

public class Margin extends Node {
    MarginKay marginKay;
    String stringLiteral;

    public MarginKay getMarginKay() {
        return marginKay;
    }

    public void setMarginKay(MarginKay marginKay) {
        this.marginKay = marginKay;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }
    public void PrintAst(){
        if(marginKay!=null){
            marginKay.PrintAst();
        }
        System.out.print("=");
        if(stringLiteral!=null){
            System.out.print(stringLiteral);
        }
    }
    StringBuilder stringBuilder = new StringBuilder();

    public String getValue() {
        if (marginKay != null) {
            stringBuilder.append(marginKay.getValue());
        }
        stringBuilder.append(":");
        if (stringLiteral != null) {
            String trimmedString =stringLiteral.substring(1, stringLiteral.length() - 1);
            stringBuilder.append(trimmedString+" ");
        }
        return stringBuilder.toString();
    }
}

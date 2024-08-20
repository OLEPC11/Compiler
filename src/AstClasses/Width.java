package AstClasses;

import VisitParserTree.Node;

public class Width extends Node {

    String width;
    String stringLiteral;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void PrintAst(){
        if(width!=null){
            System.out.print(width+" ");
        }
        System.out.print("=");
        if(stringLiteral!=null){
            System.out.print(stringLiteral+" ");
        }

    }
    StringBuilder stringBuilder=new StringBuilder();
    public String getValue(){
        if(width!=null){
            stringBuilder.append(width+" ");
        }
        stringBuilder.append(":");
        if(stringLiteral!=null){
            String trimmedString =stringLiteral.substring(1, stringLiteral.length() - 1);
            stringBuilder.append(trimmedString+" ");
        }
        return stringBuilder.toString();
    }
}

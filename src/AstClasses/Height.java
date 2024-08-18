package AstClasses;

import VisitParserTree.Node;

public class Height extends Node {

    String height;
    String stringLiteral;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void PrintAst(){
        if(height!=null){
            System.out.print(height+" ");
        }
        System.out.print("=");
        if(stringLiteral!=null){
            System.out.print(stringLiteral+" ");
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    public String getValue(){
        if(height!=null){
            stringBuilder.append(height+" ");
        }
        stringBuilder.append(":");
        if(stringLiteral!=null){
            String trimmedString =stringLiteral.substring(1, stringLiteral.length() - 1);
            stringBuilder.append(trimmedString+" ");
        }
        return stringBuilder.toString();
    }
}

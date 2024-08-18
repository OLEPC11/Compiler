package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class HtmlAttributeName extends Node {
    String TagName;
    ArrayList<String>Identifiers=new ArrayList<>();

    public String getTagName() {
        return TagName;
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }

    public ArrayList<String> getIdentifiers() {
        return Identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        Identifiers = identifiers;
    }
    public void add(String string){
        Identifiers.add(string);
    }
    public void PrintAst(){
        if(TagName!=null){
            System.out.print(TagName+" ");
        }
        if(Identifiers!=null){
            for (int i=0;i<Identifiers.size();i++){
                System.out.print(Identifiers.get(i)+" ");
                if(i==Identifiers.size()-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("-"+" ");
                }
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(TagName!=null){
            return TagName+" ";
        }
        if(Identifiers!=null){
            for (int i=0;i<Identifiers.size();i++){
                stringBuilder.append(Identifiers.get(i)+" ");
            }
            value=stringBuilder.toString();
            return value;
        }
        return " ";
    }
    StringBuilder stringBuilder1=new StringBuilder();
    String value1;
    public String CodeGen(){
        if(TagName!=null){
            return TagName+" ";
        }
        if(Identifiers!=null){
            for (int i=0;i<Identifiers.size();i++){
                stringBuilder1.append(Identifiers.get(i));
            }
            value1=stringBuilder1.toString();
            return value1;
        }
        return "  ";
    }

}

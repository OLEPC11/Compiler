package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class HtmlChardata extends Node {
    ArrayList<String>strings=new ArrayList<>();

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {

        this.strings = strings;
    }
    public void add(String string){
        strings.add(string);
    }
    public void PrintAst(){
        if(strings!=null){
            for (String string : strings) {
                System.out.print(string+" ");
            }
        }
    }
    String s=" " ;
    StringBuilder s1=new StringBuilder();
    public String getValue(){
        if(strings!=null){
            for (String string : strings) {
                s1.append(string);
            }
        }
        s=s1.toString();
        return s;
    }
    public String CodeGen()
    {
        if(strings!=null){
            for (String string : strings) {
                s1.append(string+" ");
            }
            return s1.toString()+"\n";
        }
        return " ";
    }
}

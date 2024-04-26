package AstClasses;

import java.util.ArrayList;

public class HtmlChardata {
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
}

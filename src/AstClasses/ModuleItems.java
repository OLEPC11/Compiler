package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class ModuleItems extends Node {
    ArrayList<AliasName> aliasNames=new ArrayList<>();

    public ArrayList<AliasName> getAliasNames() {
        return aliasNames;
    }

    public void setAliasNames(ArrayList<AliasName> aliasNames) {
        this.aliasNames = aliasNames;
    }

    public void add(AliasName aliasName){
        aliasNames.add(aliasName);
    }
    public void PrintAst(){
        if(aliasNames!=null){
            System.out.print("{");
            for (int i=0;i<aliasNames.size();i++) {
                aliasNames.get(i).PrintAst();
                if(i==aliasNames.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
            System.out.print("}");
        }
    }
    String s;
    public String getValue(){
        if(aliasNames!=null)
        {
            for (int i=0;i<aliasNames.size();i++)
            {
                s+=aliasNames.get(i).getValue();
            }
            return  s;
        }
        return "  ";
    }

}

package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class AliasName extends Node {
    ArrayList<IdentifierName>identifierNames=new ArrayList<>();
    String As;

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public ArrayList<IdentifierName> getIdentifierNames() {
        return identifierNames;
    }

    public void setIdentifierNames(ArrayList<IdentifierName> identifierNames) {
        this.identifierNames = identifierNames;
    }
    public void add(IdentifierName identifierName){
        identifierNames.add(identifierName);
    }
    public void PrintAst(){
      //  setScopeID(getCurrentScope().getId());
        if(identifierNames!=null){
            for (int i=0;i<identifierNames.size();i++) {
                identifierNames.get(i).PrintAst();
                if(i==identifierNames.size()-1){
                    System.out.print("");
                }
                if(As!=null&&i>0&&i<identifierNames.size()-1){
                    System.out.print(As+" ");
                }
            }
        }
    }
    String s;
    public String getValue(){
        if(identifierNames!=null)
        {
            for (int i=0;i<identifierNames.size();i++)
            {
             s+=identifierNames.get(i).getValue();
            }
            return  s;
        }
        return "  ";
    }
}

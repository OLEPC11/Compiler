package AstClasses;

import java.util.ArrayList;

public class ImportNamespace {
    String as;
    ArrayList<IdentifierName> identifierNames=new ArrayList<>();

    public ArrayList<IdentifierName> getIdentifierNames() {
        return identifierNames;
    }

    public void setIdentifierNames(ArrayList<IdentifierName> identifierNames) {
        this.identifierNames = identifierNames;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }


    public void add(IdentifierName identifierName){
        identifierNames.add(identifierName);
    }
    public void PrintAst(){
        if(identifierNames!=null){
            for (int i=0;i<identifierNames.size();i++) {
                identifierNames.get(i).PrintAst();
                if(i==identifierNames.size()-1){
                    System.out.print(" ");
                }
                else{
                System.out.print(as+" ");
                }
            }
        }
    }
    public void GenCode(){
        if(identifierNames!=null){
            for (IdentifierName identifierName : identifierNames) {
                System.err.print("const ");
                identifierName.GenCode();
            }
        }
    }
}

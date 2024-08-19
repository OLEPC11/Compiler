package AstClasses;

import VisitParserTree.Node;

public class Identifier extends Node {
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void PrintAst(){
        if(identifier!=null) {
            System.out.print(identifier+" ");
        }
    }
    public String   getValue(){
        if(identifier!=null){
            return identifier;
        }
        else {
            return "No Value";
        }
    }
    public String  CodeGen(){
        if(identifier!=null){
            return identifier;
        }
        else {
            return "  ";
        }
    }

}

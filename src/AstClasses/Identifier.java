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
        //setScopeID(getCurrentScope().getId());
        if(identifier!=null) {
            System.out.print(identifier+" ");
        }
//        if(identifier.equals("App")&&getCurrentScope().getName().equals("AppFun"))
//        {
//           // System.out.println(getCurrentScope().getParent());
//            createSymbol(getScopeID(),identifier,"AppFunction");
//        }
    }
    public String   getValue(){
        if(identifier!=null){
            return identifier;
        }
        else {
            return "    ";
        }
    }
    public String   CodeGen(){
        if(identifier!=null){
            return identifier;
        }
        else {
            return "  ";
        }
    }

}

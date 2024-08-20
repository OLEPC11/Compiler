package AstClasses;

import VisitParserTree.Node;

public class ArrowFunctionParameters extends Node {
    Identifier identifier;
    FormalParameterList formalParameterList;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }
    public void PrintAst(){
        //setScopeID(getCurrentScope().getId());
        if(identifier!=null){
            identifier.PrintAst();
        }
        if(formalParameterList!=null){
            System.out.print("("+" ");
            formalParameterList.PrintAst();
            System.out.print(")"+" ");
        }
    }

    public String getValue(){
        if(identifier!=null){
            return identifier.getValue();
        }
        if(formalParameterList!=null){
            return "("+formalParameterList.getValue()+")";
        }
        else{
        return "    ";}
    }
    public String CodeGen(){
        if(identifier!=null){
            return identifier.CodeGen();
        }
//        if(formalParameterList!=null){
//            return "("+formalParameterList.CodeGen()+")";
//        }
        else{
            return " () ";}
    }
}

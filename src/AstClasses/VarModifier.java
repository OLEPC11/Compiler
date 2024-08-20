package AstClasses;

import VisitParserTree.Node;

public class VarModifier extends Node  {
    String Var;
    Let let;
    String Const;

    public String getVar() {
        return Var;
    }

    public void setVar(String var) {
        Var = var;
    }

    public Let getLet() {
        return let;
    }

    public void setLet(Let let) {
        this.let = let;
    }

    public String getConst() {
        return Const;
    }

    public void setConst(String aConst) {
        Const = aConst;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(Var!=null){

            System.out.print(Var+" ");
        }
        if(let!=null){
            let.PrintAst();
        }
        if(Const!=null){
            System.out.print(Const+" ");
        }
    }
    public String getValue(){
        if(Var!=null){
           return Var+" ";
        }
        if(Const!=null){
            return Const+" ";
        }
        return "    ";
    }
    public String CodeGen(){
        if(Var!=null){
            return Var+" ";
        }
        if(Const!=null){
            return Const+" ";
        }
        return "  ";
    }
}

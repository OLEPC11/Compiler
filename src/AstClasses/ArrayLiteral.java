package AstClasses;

import VisitParserTree.Node;

public class ArrayLiteral extends Node {
    ElementList elementList;

    public ElementList getElementList() {
        return elementList;
    }

    public void setElementList(ElementList elementList) {
        this.elementList = elementList;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        System.out.print("[");
        if(elementList!=null){
            elementList.PrintAst();
        }
        System.out.print("]");
    }
    public String getValue(){
        if(elementList!=null){
            return elementList.getValue();
        }
        else {
            return "    ";
        }

    }
    public String CodeGen(){
        if(elementList!=null){
            return elementList.CodeGen();
        }
        else {
            return "  ";
        }

    }
}

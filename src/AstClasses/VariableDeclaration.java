package AstClasses;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import VisitParserTree.Node;

public class VariableDeclaration  extends Node {
    Assignable assignable;
    SingleExpression singleExpression;

    public Assignable getAssignable() {
        return assignable;
    }

    public void setAssignable(Assignable assignable) {
        this.assignable = assignable;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }
    public void PrintAst(){
        if(assignable!=null){
            assignable.PrintAst();
        }
        if(singleExpression!=null){
            System.out.print("="+" ");
            singleExpression.PrintAst();
        }
//        AddToSymbolTable();
    }
    public String getValue(){
        if(assignable!=null&&singleExpression!=null) {
            return assignable.getValue()+" = "+singleExpression.getValue();
        }
        return "No Value";
    }

    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String CodeGen() {
        if (assignable != null && singleExpression != null) {

            if (singleExpression.getClass().getTypeName().equals("AstClasses.FunctionExpression")) {

                return "function " + assignable.identifier.identifier+ singleExpression.CodeGen() +"\n"
                        +"document.querySelector('#"+assignable.identifier.identifier+"').addEventListener('click', "+assignable.identifier.identifier+");\n";
            }
//            else if (assignable != null && singleExpression != null && singleExpression.objectLiteralExpression!= null
//                    && singleExpression.objectLiteralExpression.objectLiteral != null
//                    && singleExpression.objectLiteralExpression.objectLiteral.propertyAssignments != null) {
//
//                 value = stringBuilder.append("document.addEventListener('DOMContentLoaded', function() {").toString();
//                if (assignable != null && assignable.CodeGen() != null) {
//                    return value + assignable.CodeGen() + " = " + singleExpression.CodeGen();
//                }
//                // Handle the case where assignable or its CodeGen() returns null
//            }
            else {
                return assignable.CodeGen() + " = " + singleExpression.CodeGen();
            }

        }
        return "  ";
    }

//    public void AddToSymbolTable(){
//        Symbol symbol=new Symbol();
//        symbol.setNodeName("VariableDeclaration");
//        if(assignable!=null){
//            symbol.setName(assignable.getValue());
//        }
//        if(singleExpression!=null){
//            symbol.setValue(singleExpression.getValue());
//        }
//        SymbolTable.list.add(symbol);
//    }


}

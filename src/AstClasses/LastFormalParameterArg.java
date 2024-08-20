package AstClasses;

import SymbolTable.Symbol;
import VisitParserTree.Node;

public class LastFormalParameterArg extends Node {
    String Ellipsis;
    SingleExpression singleExpression;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public String getEllipsis() {
        return Ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        Ellipsis = ellipsis;
    }

    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(Ellipsis!=null){
            System.out.print(Ellipsis+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        //AddToSymbolTable();
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        return "    ";
    }
    public String CodeGen(){
        if(singleExpression!=null){
            return singleExpression.CodeGen();
        }
        return "  ";
    }
//    public void AddToSymbolTable(){
//        Symbol symbol=new Symbol();
//        if(singleExpression!=null){
//            symbol.setName(singleExpression.getValue());
//        }
//    }
}

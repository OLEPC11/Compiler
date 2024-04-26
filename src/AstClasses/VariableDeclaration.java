package AstClasses;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

public class VariableDeclaration {
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
        AddToSymbolTable();
    }
    public String getValue(){
        if(assignable!=null&&singleExpression!=null) {
            return assignable.getValue()+" "+singleExpression.getValue();
        }
        return "No Value";
    }
    public void AddToSymbolTable(){
        Symbol symbol=new Symbol();
        if(assignable!=null){
            symbol.setName(assignable.getValue());
        }
        if(singleExpression!=null){
            symbol.setValue(singleExpression.getValue());
        }
        SymbolTable.list.add(symbol);
    }
}

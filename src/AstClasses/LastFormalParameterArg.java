package AstClasses;

import SymbolTable.Symbol;

public class LastFormalParameterArg {
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
        if(Ellipsis!=null){
            System.out.print(Ellipsis+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        AddToSymbolTable();
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        return "No Value";
    }
    public void AddToSymbolTable(){
        Symbol symbol=new Symbol();
        if(singleExpression!=null){
            symbol.setName(singleExpression.getValue());
        }
    }
}

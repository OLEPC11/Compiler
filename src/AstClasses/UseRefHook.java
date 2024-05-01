package AstClasses;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import java.util.ArrayList;

public class UseRefHook {
    String useRef;
    SingleExpression singleExpression;
    Eos eos;

    public String getUseRef() {
        return useRef;
    }

    public void setUseRef(String useRef) {
        this.useRef = useRef;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    public void PrintAst() {
        if (useRef != null) {
            System.out.print(useRef + " ");
        }
        if (singleExpression != null) {
            singleExpression.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }

    public String getValue(){
        if(useRef!=null) {
            return useRef;
        }
        if(singleExpression !=null){
         return  singleExpression.getValue();
        }
        return "No Value";
    }
    public void AddToSymbolTable(){
        Symbol symbol=new Symbol();
        if(useRef!=null){
            symbol.setName(useRef);
        }
        if(singleExpression!=null){
            symbol.setValue(singleExpression.getValue());
        }
        SymbolTable.list.add(symbol);
    }
}

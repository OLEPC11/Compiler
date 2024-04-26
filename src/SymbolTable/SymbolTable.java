package SymbolTable;

import java.util.ArrayList;

public class SymbolTable {
    public static ArrayList<Symbol> list=new ArrayList<Symbol>();
    public String PrintSymbolTable(){
        return list.toString();
    }
}

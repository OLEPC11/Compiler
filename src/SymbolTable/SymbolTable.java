package SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {

    public static ArrayList<Symbol> list=new ArrayList<Symbol>();

    public String PrintSymbolTable(){
        return list.toString();
    }
}

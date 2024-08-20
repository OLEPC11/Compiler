package SymbolTable;

import java.util.ArrayList;

public class Scope {

    private static int contID = 0;
    //    private static int randomCounter = 0;
    private int id;
    private Scope parent;
    private ArrayList<Symbol> symbolList = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope(){}
    public Scope(Scope parent) {
        this.parent = parent;
        this.id = ++contID;
    }

    public void addSymbol(Symbol symbol) {
        this.symbolList.add(symbol);
    }

//    public void addRandomSymbol(Symbol symbol) {
//        symbol.setName("Random Var" + randomCounter++ + " | " + symbol.getName());
//        this.symbolList.add(symbol);
//    }

    public static int getContID() {
        return contID;
    }

    public static void setContID(int contID) {
        Scope.contID = contID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public ArrayList<Symbol> getSymbolList() {
        return symbolList;
    }

    public Symbol searchForSymbol(String name) {
        for (Symbol search : symbolList) {
            if (search.getName().equalsIgnoreCase(name)) {
                return search;
            }
        }
        return null;
    }

    public Scope searchForSymbolInParents(String symbol) {
        Scope currentScope = this;
        while (currentScope != null) {
            System.out.println(currentScope.getId());
            if (currentScope.searchForSymbol(symbol) != null)
                return currentScope;
            currentScope = currentScope.parent;
        }
        return null;
    }

    public Symbol removeSymbol(String symbol) {
        for (Symbol current : symbolList)
            if (current.getName().equalsIgnoreCase(symbol)) {
                this.symbolList.remove(current);
                return current;
            }
        return null;
    }
}

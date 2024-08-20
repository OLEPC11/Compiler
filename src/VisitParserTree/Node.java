package VisitParserTree;

import SymbolTable.Scope;
import SymbolTable.Symbol;
import com.company.Main;

public class Node {
    private int scopeID = -1;

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }
    protected void createScope(String name) {

        System.out.println("Create New Scope");
        Scope scope;
        if (Main.symbolTable.getScopeStack().isEmpty()) {
            scope = new Scope(null);
            scope.setName(name);
        } else {
            Scope parentScope1 = Main.symbolTable.getScopeStack().peek();
            scope = new Scope(parentScope1);
            scope.setName(name);
        }

        Main.symbolTable.getScopeStack().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    protected static void removeScope() {
        Main.symbolTable.getScopeStack().pop();
        //Scope.DecScopeCount();
        System.out.println("remove last Scope from scope stack");
    }

    protected Scope getCurrentScope() {
        if (Main.symbolTable.getScopeStack().isEmpty())
            return null;

        return Main.symbolTable.getScopeStack().peek();
    }

    protected void createSymbol(int ScopeId, String name, String type,Object value ,String nodeName) {
        System.out.println("create new Symbol ...");
        Symbol symbol;
        if (type.equalsIgnoreCase("special function"))
            symbol = new Symbol("Special Function | " + name);
        else
            symbol = new Symbol(name);
        symbol.setType(type);
        symbol.setValue(value);
        symbol.setNodeName(nodeName);
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addSymbol(symbol);
    }

//    protected void createRandomSymbol(int ScopeId, String value, String type) {
//        System.out.println("create new Random Symbol ...");
//        Symbol symbol = new Symbol(value);
//        symbol.setType(type);
//        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
//        symbol.setScope(scope);
//        scope.addRandomSymbol(symbol);
//    }

    protected String getValue() {
        return null;
    }

}

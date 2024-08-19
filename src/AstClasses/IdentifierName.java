package AstClasses;

import VisitParserTree.Node;

public class IdentifierName extends Node {
    Identifier identifier;
    ReservedWord reservedWord;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }
    public void PrintAst(){
        if(identifier!=null){
            identifier.PrintAst();
        }
        if(reservedWord!=null){
            reservedWord.PrintAst();
        }
    }
    public String getValue(){
        if(identifier!=null){
            return identifier.getValue();
        }
        else{
            return " ";
        }
    }

    public String CodeGen(){
        if(identifier!=null){
            return identifier.CodeGen();
        }
        else{
            return "    ";
        }
    }
}

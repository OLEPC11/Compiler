package AstClasses;

import VisitParserTree.Node;

public class AnoymousFunction extends Node {
    FunctionDecl functionDecl;
    AnoymousFunctionDecl anoymousFunctionDecl;
    ArrowFunction arrowFunction;

    public FunctionDecl getFunctionDecl() {
        return functionDecl;
    }

    public void setFunctionDecl(FunctionDecl functionDecl) {
        this.functionDecl = functionDecl;
    }

    public AnoymousFunctionDecl getAnoymousFunctionDecl() {
        return anoymousFunctionDecl;
    }

    public void setAnoymousFunctionDecl(AnoymousFunctionDecl anoymousFunctionDecl) {
        this.anoymousFunctionDecl = anoymousFunctionDecl;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
    public void PrintAst(){
        if(functionDecl!=null){
            functionDecl.PrintAst();
        }
        if(anoymousFunctionDecl!=null){
            anoymousFunctionDecl.PrintAst();
        }
        if(arrowFunction!=null){
            arrowFunction.PrintAst();
        }
    }
    public String getValue(){
        if(functionDecl!=null){
           return functionDecl.getValue();
        }
        if(anoymousFunctionDecl!=null){
            return anoymousFunctionDecl.getValue();
        }
        if(arrowFunction!=null){
            return arrowFunction.getValue();
        }
        return "No Value";

    }

    public String CodeGen(){
        if(functionDecl!=null){
            return functionDecl.CodeGen();
        }
        if(anoymousFunctionDecl!=null){
            return anoymousFunctionDecl.CodeGen();
        }
        if(arrowFunction!=null){
            return arrowFunction.CodeGen();
        }
        return "   ";

    }
}

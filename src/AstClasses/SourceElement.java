package AstClasses;

import VisitParserTree.Node;

public class SourceElement  extends Node {
    Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void PrintAst(){
        //System.out.println("********SourceElement********");
        if (statement!=null){
           statement.PrintAst();
        }
    }
    public String getValue(){
        if (statement!=null){
           return statement.getValue();
        }
        return " ";
    }

    public String CodeGen(){
        if (statement!=null){
            return statement.CodeGen();
        }
        return "    ";
    }
}

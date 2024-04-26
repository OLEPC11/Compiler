package AstClasses;

import java.util.ArrayList;

public class IfStatement {
    String ifToken;
    ExpressionSequence expressionSequence;
    ArrayList<Statement>statements=new ArrayList<>();
    String elseToken;

    public String getIfToken() {
        return ifToken;
    }

    public void setIfToken(String ifToken) {
        this.ifToken = ifToken;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    public String getElseToken() {
        return elseToken;
    }

    public void setElseToken(String elseToken) {
        this.elseToken = elseToken;
    }
    public void add(Statement statement){
        statements.add(statement);
    }
    public void PrintAst(){
        if(ifToken!=null){
            System.out.print(ifToken+" ");
        }
        if(expressionSequence!=null){
            expressionSequence.PrintAst();
        }
        if(statements!=null){
            for (Statement statement : statements) {
                statement.PrintAst();
            }
        }
        if (elseToken!=null){
            System.out.println(elseToken+" ");
        }
    }
}

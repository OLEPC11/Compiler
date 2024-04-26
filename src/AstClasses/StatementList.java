package AstClasses;

import java.util.ArrayList;

public class StatementList {
    ArrayList<Statement>statements=new ArrayList<>();

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }
    public void add(Statement statement){
        statements.add(statement);
    }
    public void PrintAst(){
       // System.out.println("******StatementList******");
        if (statements!=null){
            for (Statement statement : statements) {
                statement.PrintAst();
            }
        }
    }
}

package AstClasses;

public class SourceElement {
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
        return "No Value";
    }
}

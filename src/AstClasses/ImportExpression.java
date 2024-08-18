package AstClasses;

public class ImportExpression extends SingleExpression {
    String Import;
    SingleExpression singleExpression;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }
    public void PrintAst() {
        if(Import!=null){
            System.out.print(Import+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
    }
}

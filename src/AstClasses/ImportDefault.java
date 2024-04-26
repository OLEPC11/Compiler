package AstClasses;

public class ImportDefault {
    String Comma;
    AliasName aliasName;

    public AliasName getAliasName() {
        return aliasName;
    }

    public void setAliasName(AliasName aliasName) {
        this.aliasName = aliasName;
    }

    public String getComma() {
        return Comma;
    }

    public void setComma(String comma) {
        Comma = comma;
    }

    public void PrintAst(){
        //System.out.println("****ImportDefault****");
        if(aliasName!=null){
            aliasName.PrintAst();
        }
        if(Comma!=null){
            System.out.print(","+" ");
        }
    }
}

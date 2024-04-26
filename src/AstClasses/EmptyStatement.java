package AstClasses;

public class EmptyStatement {
    String semiColon;

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }
    public void PrintAst(){
        //System.out.println("******EmptyStatement******");
        if(semiColon!=null){
            System.out.println(semiColon);
        }
    }
}

package AstClasses;

public class Let {
    String strictLet;

    public String getStrictLet() {
        return strictLet;
    }

    public void setStrictLet(String strictLet) {
        this.strictLet = strictLet;
    }
    public void PrintAst() {
        if(strictLet!=null){
            System.out.print(strictLet+" ");
        }
    }
}

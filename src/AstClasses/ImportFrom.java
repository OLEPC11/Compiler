package AstClasses;

public class ImportFrom {
    String from;
    String stringLiteral;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }
    public void PrintAst(){
        if(from!=null){
            System.out.print(from+" ");
        }
        if(stringLiteral!=null){
            System.out.print(stringLiteral+" ");
        }
    }
    public void GenCode(){
        if(stringLiteral!=null){
            System.err.print("="+stringLiteral);

        }
    }
}

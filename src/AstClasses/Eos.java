package AstClasses;

public class Eos {
    String eof;
    String semiColon;

    public String getEof() {
        return eof;
    }

    public void setEof(String eof) {
        this.eof = eof;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }
    public void PrintAst(){
        if (eof!=null){
            System.out.println(eof);
        }
        if(semiColon!=null){
            System.out.println(semiColon+" ");
        }
    }
    public void GenCode(){
        if(semiColon!=null){
            System.err.print(semiColon);
        }}
}

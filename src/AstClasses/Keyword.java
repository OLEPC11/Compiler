package AstClasses;

public class Keyword {
    String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public void PrintAst(){
        if(keyword!=null){
        System.out.print(keyword+" ");
        }
    }
}

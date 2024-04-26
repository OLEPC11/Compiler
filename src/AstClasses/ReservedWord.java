package AstClasses;

public class ReservedWord {
    Keyword keyword;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }
    public void PrintAst(){
        if(keyword!=null){
            keyword.PrintAst();
        }
    }
}

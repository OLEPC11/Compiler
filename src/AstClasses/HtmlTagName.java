package AstClasses;

public class HtmlTagName {
    String TagName;
    Keyword keyword;
    String Identifier;

    public String getTagName() {
        return TagName;
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }
    public void PrintAst(){
        if(TagName!=null){
            System.out.print(TagName+" ");
        }
        if(keyword!=null){
            keyword.PrintAst();
        }
        if(Identifier!=null){
            System.out.print(Identifier+" ");
        }
    }
    public String getValue(){
        if(Identifier!=null){
            return " "+Identifier+" ";
        }
        if(TagName!=null){
            return " "+TagName+" ";
        }
        return " No Name";
    }
}

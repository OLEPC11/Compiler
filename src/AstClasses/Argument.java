package AstClasses;

public class Argument {
    String ellipsis;
    SingleExpression singleExpression;
    Identifier identifier;

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        this.ellipsis = ellipsis;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
    public void PrintAst(){
        if (ellipsis!=null){
            System.out.print(ellipsis+" ");
        }
        if(identifier !=null){
            identifier.PrintAst();
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
    }


    public String getValue(){
        if (ellipsis!=null){
            return " "+ellipsis+" ";
        }
        if(identifier !=null){
            return identifier.getValue();
        }
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        return "No Value";
    }
}

package AstClasses;

public class PropertyShorthand  extends PropertyAssignment{
String ellipsis;
SingleExpression singleExpression;

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
    public void PrintAst(){
        if(ellipsis!=null){
            System.out.print(ellipsis+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
    }
    public String getValue(){
        if(singleExpression!=null){
            return singleExpression.getValue();
        }
        return "No Value";
    }
}

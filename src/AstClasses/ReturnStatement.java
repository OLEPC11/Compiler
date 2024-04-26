package AstClasses;

public class ReturnStatement {
    String Return;
    ExpressionSequence expressionSequence;
    HtmlElements htmlElements;

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public HtmlElements getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(HtmlElements htmlElements) {
        this.htmlElements = htmlElements;
    }

    public void PrintAst(){
        //System.out.println("******ReturnStatement******");
        if(Return!=null){
            System.out.print(Return+" ");
        }
        if(expressionSequence!=null){
            expressionSequence.PrintAst();

        }
        if(htmlElements!=null){
            System.out.print("("+" ");
            htmlElements.PrintAst();
            System.out.print(")"+" ");
        }
    }
    public String getValue(){
        if(Return!=null){
            return Return+" ";
        }
        if(expressionSequence!=null){
           return expressionSequence.getValue();

        }
        if(htmlElements!=null){
           return "("+htmlElements.getValue()+")";
        }
    return "No Value";
    }
}

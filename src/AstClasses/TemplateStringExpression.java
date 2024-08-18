package AstClasses;

public class TemplateStringExpression extends SingleExpression{
    SingleExpression singleExpression;
    TemplateStringLiteral templateStringLiteral;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public TemplateStringLiteral getTemplateStringLiteral() {
        return templateStringLiteral;
    }

    public void setTemplateStringLiteral(TemplateStringLiteral templateStringLiteral) {
        this.templateStringLiteral = templateStringLiteral;
    }
    public void PrintAst(){
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(templateStringLiteral!=null){
            templateStringLiteral.PrintAst();
        }
    }
}

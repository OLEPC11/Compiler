package AstClasses;

public class TemplateStringAtom {
    String TemplateStringAtom;
    String TemplateStringStartExpression;
    SingleExpression singleExpression;


    public String getTemplateStringAtom() {
        return TemplateStringAtom;
    }

    public void setTemplateStringAtom(String templateStringAtom) {
        TemplateStringAtom = templateStringAtom;
    }

    public String getTemplateStringStartExpression() {
        return TemplateStringStartExpression;
    }

    public void setTemplateStringStartExpression(String templateStringStartExpression) {
        TemplateStringStartExpression = templateStringStartExpression;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }


    public void PrintAst(){
        if(TemplateStringAtom!=null){
            System.out.print(TemplateStringAtom+" ");
        }
        if(TemplateStringStartExpression!=null){
            System.out.print(TemplateStringStartExpression+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
    }
}

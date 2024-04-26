package AstClasses;

public class ExportDefaultDeclaration extends ExportStatement{
    String export;
    String defaultToken;
    SingleExpression singleExpression;
    Eos eos;

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getDefaultToken() {
        return defaultToken;
    }

    public void setDefaultToken(String defaultToken) {
        this.defaultToken = defaultToken;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }
    public void PrintAst(){
        if(export!=null){
            System.out.print(export+" ");
        }
        if(defaultToken!=null){
            System.out.print(defaultToken+" ");
        }
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }
}

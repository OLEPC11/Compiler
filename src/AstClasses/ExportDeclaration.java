package AstClasses;

public class ExportDeclaration extends ExportStatement {
    String export;
    Declaration declaration;
    Eos eos;

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
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
        if(declaration!=null){
            declaration.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }

}

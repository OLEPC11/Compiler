package AstClasses;

public class ExportStatement {
    ExportDeclaration exportDeclaration;
    ExportDefaultDeclaration exportDefaultDeclaration;

    public ExportDeclaration getExportDeclaration() {
        return exportDeclaration;
    }

    public void setExportDeclaration(ExportDeclaration exportDeclaration) {
        this.exportDeclaration = exportDeclaration;
    }

    public ExportDefaultDeclaration getExportDefaultDeclaration() {
        return exportDefaultDeclaration;
    }

    public void setExportDefaultDeclaration(ExportDefaultDeclaration exportDefaultDeclaration) {
        this.exportDefaultDeclaration = exportDefaultDeclaration;
    }
    public void PrintAst(){
        if(exportDeclaration!=null){
            exportDeclaration.PrintAst();
        }
        if(exportDefaultDeclaration!=null){
            exportDefaultDeclaration.PrintAst();
        }
    }
}

package AstClasses;

public class ImportStatement {
    String Import;
    ImportFromBlock importFromBlock;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public ImportFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ImportFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }
    public void PrintAst(){
        //System.out.println("****ImportStatement****");
        if(Import!=null){
            System.out.print(Import+" ");
        }
        if(importFromBlock!=null){
            importFromBlock.PrintAst();
        }
    }
    public void GenCode(){
        if(importFromBlock!=null){
            importFromBlock.GenCode();
        }
    }
}

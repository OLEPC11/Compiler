package AstClasses;

import VisitParserTree.Node;

public class ImportFromBlock extends Node {
    ImportDefault importDefault;
    ImportNamespace importNamespace;
    ModuleItems moduleItems;
    ImportFrom importFrom;
    String StringLiteral;
    Eos eos;

    public ImportDefault getImportDefault() {
        return importDefault;
    }

    public void setImportDefault(ImportDefault importDefault) {
        this.importDefault = importDefault;
    }

    public ImportNamespace getImportNamespace() {
        return importNamespace;
    }

    public void setImportNamespace(ImportNamespace importNamespace) {
        this.importNamespace = importNamespace;
    }

    public ModuleItems getModuleItems() {
        return moduleItems;
    }

    public void setModuleItems(ModuleItems moduleItems) {
        this.moduleItems = moduleItems;
    }

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }
    public void PrintAst(){
        //System.out.println("****ImportFromBlock****");
        if(importDefault!=null){
            importDefault.PrintAst();
        }
        if(importNamespace!=null){
            importNamespace.PrintAst();
        }
        if(moduleItems!=null){
            moduleItems.PrintAst();
        }
        if(importFrom!=null){
            importFrom.PrintAst();
        }
        if(StringLiteral!=null){
            System.out.print(StringLiteral+" ");
        }
        if(eos!=null){
            eos.PrintAst();
        }
    }

    String s;
    String s2;
    String s3;
    String s4;
    String s5;

    public String CodeGen() {

        if (importNamespace != null &&importFrom !=null) {
            s2=importNamespace.CodeGen();
            s3= importFrom.CodeGen();
            return " "+s2 +"  ="+s3 ;
        }
        return " ";

    }
//    public void GenCode(){
//       if(importNamespace!=null){
//           importNamespace.GenCode();
//       }
//       if(importFrom!=null){
//           importFrom.GenCode();
//       }
//       if(eos!=null){
//           eos.GenCode();
//       }
   // }
}

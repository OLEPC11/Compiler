package AstClasses;

import VisitParserTree.Node;

public class ImportStatement extends Node {
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

    public void PrintAst() {
        //setScopeID(getCurrentScope().getId());
        //System.out.println("****ImportStatement****");
        if (Import != null) {
            System.out.print(Import + " ");
        }
        if (importFromBlock != null) {
            importFromBlock.PrintAst();
        }
    }

    //    public String getValue() {
//        if (importFromBlock != null) {
//            return importFromBlock.getValue();
//        }
//        return "    ";
//    }
    public String CodeGen() {



        if (importFromBlock != null) {

            if (importFromBlock.importNamespace != null)
                if (importFromBlock.importNamespace.identifierNames != null) {
                    for (int i = 0; i < importFromBlock.importNamespace.identifierNames.size(); i++) {
                        if (importFromBlock.importNamespace.identifierNames.get(i).identifier.identifier.equals("ProductList") || importFromBlock.importNamespace.identifierNames.get(i).identifier.identifier.equals("ProductView")) {
                            return "  ";
                        } else
                            return "const " + importFromBlock.CodeGen();
                    }
                }

        }
        return "  ";
    }
}

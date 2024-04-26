package AstClasses;

public class VariableStatement {

    VariableDeclarationList variableDeclarationList;
    Eos eos;

    public VariableDeclarationList getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(VariableDeclarationList variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }
    public void PrintAst(){
        if(variableDeclarationList!=null){
            variableDeclarationList.PrintAst();
        }
        if(eos!=null){
            eos.PrintAst();
        }

    }
    public String getValue(){
        if(variableDeclarationList!=null){
            return variableDeclarationList.getValue();
        }
       return "No Value";
    }
}

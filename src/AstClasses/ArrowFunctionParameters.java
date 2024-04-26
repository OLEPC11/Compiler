package AstClasses;

public class ArrowFunctionParameters {
    Identifier identifier;
    FormalParameterList formalParameterList;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }
    public void PrintAst(){
        if(identifier!=null){
            identifier.PrintAst();
        }
        if(formalParameterList!=null){
            System.out.print("("+" ");
            formalParameterList.PrintAst();
            System.out.print(")"+" ");
        }
    }

    public String getValue(){
        if(identifier!=null){
            return identifier.getValue();
        }
        if(formalParameterList!=null){
            return "("+formalParameterList.getValue()+")";
        }
        else{
        return "No Value";}
    }
}

package AstClasses;

import java.util.ArrayList;

public class VariableDeclarationList {
    VarModifier varModifier;
    ArrayList<VariableDeclaration>variableDeclarations=new ArrayList<>();

    public VarModifier getVarModifier() {
        return varModifier;
    }

    public void setVarModifier(VarModifier varModifier) {
        this.varModifier = varModifier;
    }

    public ArrayList<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(ArrayList<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    public void add(VariableDeclaration variableDeclaration){
        variableDeclarations.add(variableDeclaration);
    }
    public void PrintAst(){
        if(varModifier!=null){
            varModifier.PrintAst();
        }
        if(variableDeclarations!=null){
            for (int i=0;i<variableDeclarations.size();i++) {
                variableDeclarations.get(i).PrintAst();
                if(variableDeclarations.size()==1){
                    System.out.print("");
                }
                else if(i==variableDeclarations.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    String value1;
    public String getValue(){
        if(varModifier!=null){
            value1= varModifier.getValue();
        }
        if(variableDeclarations!=null){
            for (int i=0;i<variableDeclarations.size();i++) {
                if (i == variableDeclarations.size() - 1) {
                    stringBuilder.append(variableDeclarations.get(i).getValue());
                } else {
                    stringBuilder.append(variableDeclarations.get(i).getValue()+",");
                }
            }
            value="["+stringBuilder.toString()+"]";
        }
        return value1+" "+value;
    }
}

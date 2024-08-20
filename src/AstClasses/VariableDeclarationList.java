package AstClasses;

import Generator.Gen;
import VisitParserTree.Node;

import java.util.ArrayList;

public class VariableDeclarationList extends Node {
    VarModifier varModifier;
    ArrayList<VariableDeclaration> variableDeclarations = new ArrayList<>();

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

    public void add(VariableDeclaration variableDeclaration) {
        variableDeclarations.add(variableDeclaration);
    }

    public void PrintAst() {
       // setScopeID(getCurrentScope().getId());
        if (varModifier != null) {
            varModifier.PrintAst();
//            if (variableDeclarations != null) {
//                for (int i = 0; i < variableDeclarations.size(); i++) {
//                    if (variableDeclarations.get(i).assignable != null) {
//                        if (variableDeclarations.get(i).assignable.identifier != null) {
//                            if (getCurrentScope().searchForSymbol(variableDeclarations.get(i).assignable.identifier.identifier) != null) {
//                                System.err.println("Var Declare Before");
//                            } else {
//                                createSymbol(getCurrentScope().getId(), variableDeclarations.get(i).assignable.identifier.identifier, varModifier.getValue());
//                            }
//                        } else if (variableDeclarations.get(i).assignable.arrayLiteral != null) {
//                            createSymbol(getCurrentScope().getId(), variableDeclarations.get(i).assignable.arrayLiteral.getValue(), varModifier.getValue());
//                        } else if (variableDeclarations.get(i).assignable.objectLiteral != null) {
//                            createSymbol(getCurrentScope().getId(), variableDeclarations.get(i).assignable.objectLiteral.getValue(), varModifier.getValue());
//                        }
//                    }
//                }
//            }
        }

        if (variableDeclarations != null) {
            for (int i = 0; i < variableDeclarations.size(); i++) {
                variableDeclarations.get(i).PrintAst();
                if (variableDeclarations.size() == 1) {
                    System.out.print("");
                } else if (i == variableDeclarations.size() - 1) {
                    System.out.print("");
                } else {
                    System.out.print("," + " ");
                }
            }
        }
    }

    StringBuilder stringBuilder = new StringBuilder();
    String value;
    String value1;

    public String getValue() {
        if (varModifier != null) {
            value1 = varModifier.getValue();
        }
        if (variableDeclarations != null) {
            for (int i = 0; i < variableDeclarations.size(); i++) {
                if (i == variableDeclarations.size() - 1) {
                    stringBuilder.append(variableDeclarations.get(i).getValue());
                } else {
                    stringBuilder.append(variableDeclarations.get(i).getValue() + ",");
                }
            }
            value = "[" + stringBuilder.toString() + "]";
        }
        return value1 + " " + value;
    }

    public String CodeGen() {
        if (varModifier != null) {
            for (VariableDeclaration s : variableDeclarations )
                if(!(s.singleExpression instanceof FunctionExpression))
                        value1 = varModifier.CodeGen();
            else value1 = " ";
        }
        if (variableDeclarations != null) {
            for (int i = 0; i < variableDeclarations.size(); i++) {
                if (i == variableDeclarations.size() - 1) {
                    stringBuilder.append(variableDeclarations.get(i).CodeGen());
                } else {
                    stringBuilder.append(variableDeclarations.get(i).CodeGen() + ",");
                }
            }
            for (int i = 0; i < variableDeclarations.size(); i++) {
                if (variableDeclarations.get(i).assignable.identifier!=null)
                    value=stringBuilder.toString();
            else
                    value = stringBuilder.toString() ;
            }
        }
        return value1 + " " + value;
    }

}

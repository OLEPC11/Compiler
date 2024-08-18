package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class SourceElements extends Node {
ArrayList<SourceElement>sourceElements=new ArrayList<>();

    public ArrayList<SourceElement> getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(ArrayList<SourceElement> sourceElements) {
        this.sourceElements = sourceElements;
    }
    public void add(SourceElement sourceElement){
        sourceElements.add(sourceElement);
    }
    public void PrintAst(){
        if(sourceElements!=null){
            //System.out.println("*********SourceElements*********");
            for (SourceElement sourceElement : sourceElements) {
                sourceElement.PrintAst();
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(sourceElements!=null){
            for (SourceElement sourceElement : sourceElements) {
                stringBuilder.append(sourceElement.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "No Value";
    }
    StringBuilder stringBuilder2=new StringBuilder();
    String value2;
    public String CodeGen(){
        if(sourceElements!=null){
            for (SourceElement sourceElement : sourceElements) {
                stringBuilder2.append(sourceElement.CodeGen());
            }
            value2=stringBuilder2.toString();
            return value2;
        }
        return "  ";
    }
}

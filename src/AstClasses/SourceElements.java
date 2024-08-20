package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

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
       // setScopeID(getCurrentScope().getId());
        if(sourceElements!=null){
            //System.out.println("*********SourceElements*********");
            for (SourceElement sourceElement : sourceElements) {
                sourceElement.PrintAst();
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    StringBuilder stringBuilder2=new StringBuilder();
    StringBuilder stringBuilder3=new StringBuilder();
    String value;
    public String getValue(){
        if(sourceElements!=null){
            for (SourceElement sourceElement : sourceElements) {
                stringBuilder.append(sourceElement.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "    ";
    }
    public String CodeGen(){
        if(sourceElements!=null){
            if(Main.index==0){
                for (SourceElement sourceElement : sourceElements) {
                    stringBuilder3.append(sourceElement.CodeGen());
                }
                value=stringBuilder3.toString();
                return value;
            }else {
               // stringBuilder2.append("document.addEventListener('DOMContentLoaded', function() {\n");
                for (SourceElement sourceElement : sourceElements) {
                    stringBuilder2.append(sourceElement.CodeGen());
                }
                value=stringBuilder2.toString();
                return value;
            }

        }
        return "  ";
    }
}

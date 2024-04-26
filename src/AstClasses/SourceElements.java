package AstClasses;

import java.util.ArrayList;

public class SourceElements {
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
}

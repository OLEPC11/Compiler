package AstClasses;

public class FunctionBody {
    SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }
    public void PrintAst(){
        if(sourceElements!=null){
            sourceElements.PrintAst();
        }
    }
    public String getValue(){
        if(sourceElements!=null){
            return sourceElements.getValue();
        }
        return "No Value";
    }
}

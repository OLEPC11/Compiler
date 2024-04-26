package AstClasses;

public class Program {
SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }
    public void PrintAst(){
        if(sourceElements!=null){
            //System.out.println("**********Program**********");
            sourceElements.PrintAst();
        }
    }
}

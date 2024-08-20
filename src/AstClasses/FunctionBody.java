package AstClasses;

import VisitParserTree.Node;

public class FunctionBody extends Node {
    SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }
    public void PrintAst(){
       // setScopeID(getCurrentScope().getId());
        if(sourceElements!=null){
            sourceElements.PrintAst();
        }
    }
    public String getValue(){
        if(sourceElements!=null){
            return sourceElements.getValue();
        }
        return "    ";
    }
    public String CodeGen(){
        if(sourceElements!=null){
            return sourceElements.CodeGen();
        }
        return "  ";
    }
}

package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

public class Program extends Node {
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
    public String CodeGen(){

        if(Main.index==1){
       return     "document.addEventListener('DOMContentLoaded',function() {\n"+sourceElements.CodeGen();
    }
        else {
            return sourceElements.CodeGen();
        }
    }
}

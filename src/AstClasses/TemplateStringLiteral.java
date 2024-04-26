package AstClasses;

import java.util.ArrayList;

public class TemplateStringLiteral {
    String firstBackTick;
    ArrayList<TemplateStringAtom> templateStringAtoms;
    String lastBackTick;

    public String getFirstBackTick() {
        return firstBackTick;
    }

    public void setFirstBackTick(String firstBackTick) {
        this.firstBackTick = firstBackTick;
    }

    public ArrayList<TemplateStringAtom> getTemplateStringAtom() {
        return templateStringAtoms;
    }

    public void setTemplateStringAtom(ArrayList<TemplateStringAtom> templateStringAtom) {
        this.templateStringAtoms = templateStringAtom;
    }

    public String getLastBackTick() {
        return lastBackTick;
    }

    public void setLastBackTick(String lastBackTick) {
        this.lastBackTick = lastBackTick;
    }
    public void add(TemplateStringAtom templateStringAtom){
        templateStringAtoms.add(templateStringAtom);
    }
    public void PrintAst(){
        if(firstBackTick!=null){
            System.out.print(firstBackTick+" ");
        }

        if(templateStringAtoms!=null){
            for (TemplateStringAtom templateStringAtom:templateStringAtoms){
                templateStringAtom.PrintAst();
            }
        }
        if(lastBackTick!=null){
            System.out.print(lastBackTick+" ");
        }
    }
}

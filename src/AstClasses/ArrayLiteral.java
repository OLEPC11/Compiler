package AstClasses;

public class ArrayLiteral {
    ElementList elementList;

    public ElementList getElementList() {
        return elementList;
    }

    public void setElementList(ElementList elementList) {
        this.elementList = elementList;
    }
    public void PrintAst(){
        System.out.print("[");
        if(elementList!=null){
            elementList.PrintAst();
        }
        System.out.print("]");
    }
    public String getValue(){
        if(elementList!=null){
            return elementList.getValue();
        }
        else {
            return "No Value";
        }

    }
}

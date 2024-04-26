package AstClasses;

import java.util.ArrayList;

public class ElementList {
ArrayList<ArrayElement>arrayElements=new ArrayList<>();

    public ArrayList<ArrayElement> getArrayElements() {
        return arrayElements;
    }


    public void setArrayElements(ArrayList<ArrayElement> arrayElements) {
        this.arrayElements = arrayElements;
    }

    public void add(ArrayElement arrayElement){
        arrayElements.add(arrayElement);
    }
    public void PrintAst(){
        if(arrayElements!=null){
            for (int i=0;i<arrayElements.size();i++) {
                arrayElements.get(i).PrintAst();
                if(i==arrayElements.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(arrayElements!=null){
            for (int i=0;i<arrayElements.size();i++) {
                if (i == arrayElements.size() - 1) {
                    stringBuilder.append(arrayElements.get(i).getValue());
                } else {
                    stringBuilder.append(arrayElements.get(i).getValue()+",");
                }
            }
            value="["+stringBuilder.toString()+"]";
            return value;
        }
        else {
            return "No Value";
        }
    }
}

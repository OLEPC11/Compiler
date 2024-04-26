package AstClasses;

import java.util.ArrayList;

public class ObjectLiteral {
  ArrayList<PropertyAssignment>propertyAssignments=new ArrayList<>();

    public ArrayList<PropertyAssignment> getPropertyAssignments() {
        return propertyAssignments;
    }

    public void setPropertyAssignments(ArrayList<PropertyAssignment> propertyAssignments) {
        this.propertyAssignments = propertyAssignments;
    }
    public void add(PropertyAssignment propertyAssignment){
        propertyAssignments.add(propertyAssignment);
    }
    public void PrintAst(){
        if(propertyAssignments!=null){
            System.out.print("{"+" ");
            for (int i=0;i<getPropertyAssignments().size();i++) {
                propertyAssignments.get(i).PrintAst();
                if(i==propertyAssignments.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
                System.out.println();
            }
            System.out.print("}"+" ");
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(propertyAssignments!=null){
            for(int i=0;i<propertyAssignments.size();i++){
                if(i==propertyAssignments.size()-1){
                    stringBuilder.append(propertyAssignments.get(i).getValue());
                }
                else{
                    stringBuilder.append(propertyAssignments.get(i).getValue()+",");
                }
            }
            value="{"+stringBuilder.toString()+"}";
            return value;
        }
        else{
            return "No Value";
        }
    }
}

package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

import java.util.ArrayList;

public class ElementList extends Node {
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
       // setScopeID(getCurrentScope().getId());
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
    StringBuilder stringBuilder2=new StringBuilder();
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
            return "    ";
        }
    }

    StringBuilder stringBuilder1=new StringBuilder();
    String value1=" ";

    String value2;
    public String CodeGen(){

        if(!(arrayElements.get(0).singleExpression instanceof ObjectLiteralExpression)){
            if(Main.index==1){
                if(arrayElements!=null){
                    stringBuilder2.append( arrayElements.get(0).CodeGen());
                    value1=stringBuilder2.toString();
                    return value1;
                }
                else {
                    return "  ";
                }}
            else {
                if(arrayElements!=null){
                    stringBuilder1.append( arrayElements.get(0).CodeGen());
                    value1=stringBuilder1.toString();
                    return value1;
                } else {
                    return "  ";
                }
            }
        }
        else{
            if(Main.index==0){
                if(arrayElements!=null){
                    for (int i=0;i<arrayElements.size();i++) {
                        if (i == arrayElements.size() - 1) {
                            stringBuilder1.append(arrayElements.get(i).CodeGen()).append("\n");
                        } else {
                            stringBuilder1.append(arrayElements.get(i).CodeGen()+",").append("\n");
                        }
                    }
                    value="["+stringBuilder1.toString()+"]\n";
                    return value;
                }else {
                    return "    ";
                }}
            else {
                return "    ";
            }
        }
    }



}

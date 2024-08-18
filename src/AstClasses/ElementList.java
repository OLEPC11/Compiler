package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class ElementList  extends Node {
    ArrayList<ArrayElement> arrayElements = new ArrayList<>();

    public ArrayList<ArrayElement> getArrayElements() {
        return arrayElements;
    }


    public void setArrayElements(ArrayList<ArrayElement> arrayElements) {
        this.arrayElements = arrayElements;
    }

    public void add(ArrayElement arrayElement) {
        arrayElements.add(arrayElement);
    }

    public void PrintAst() {
        if (arrayElements != null) {
            for (int i = 0; i < arrayElements.size(); i++) {
                arrayElements.get(i).PrintAst();
                if (i == arrayElements.size() - 1) {
                    System.out.print("");
                } else {
                    System.out.print("," + " ");
                }
            }
        }
    }

    StringBuilder stringBuilder = new StringBuilder();
    String value;

    public String getValue() {
        if (arrayElements != null) {
            for (int i = 0; i < arrayElements.size(); i++) {
                if (i == arrayElements.size() - 1) {
                    stringBuilder.append(arrayElements.get(i).getValue());
                } else {
                    stringBuilder.append(arrayElements.get(i).getValue() + ",");
                }
            }
            value = "[" + stringBuilder.toString() + "]";
            return value;
        } else {
            return "No Value";
        }
    }

    StringBuilder stringBuilder1 = new StringBuilder();
    String value1;

    //    public String CodeGen() {
//        if (arrayElements != null) {
//            for (int i = 0; i < arrayElements.size(); i++) {
//                if (i == arrayElements.size() - 1) {
//                    stringBuilder1.append(arrayElements.get(i).getValue()).append("\n");
//                } else {
//                    stringBuilder1.append(arrayElements.get(i).getValue() + ",").append("\n");
//                }
//            }
//            value1 = "[" + stringBuilder1.toString() + "]";
//            return value1;
//        } else {
//            return " ";
//        }
//    }
    StringBuilder stringBuilder2 = new StringBuilder();
    String value2 = " ";

    public String CodeGen() {
        if (arrayElements != null) {
            stringBuilder2.append(arrayElements.get(0).CodeGen());
            value2 = stringBuilder2.toString();
            return value2;
        } else {
            return "  ";
        }
    }


}
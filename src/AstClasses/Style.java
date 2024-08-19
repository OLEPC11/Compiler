package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

import java.util.ArrayList;

public class Style extends Node {
    String style;
    Height height;
    Width width;
    ArrayList<Margin> marginArrayList=new ArrayList<>();

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public ArrayList<Margin> getMarginArrayList() {
        return marginArrayList;
    }

    public void setMarginArrayList(ArrayList<Margin> marginArrayList) {
        this.marginArrayList = marginArrayList;
    }
    public void add(Margin margin){
        marginArrayList.add(margin);
    }


    public void PrintAst(){

        if(style!=null){
            System.out.print(style);
        }
        System.out.print("="+ " {"+ " ");
        if(height!=null){
           height.PrintAst();
        }
        System.out.print(",");
        if(width!=null){
            width.PrintAst();
        }
        System.out.print(",");
        if (marginArrayList!=null){
            for (Margin margin : marginArrayList) {
                margin.PrintAst();
                System.out.print(",");
            }
        }
        System.out.print(" "+'}');
    }
    StringBuilder stringBuilder=new StringBuilder();
//    public String getValue(){
//
//
//       // stringBuilder.append(" {"+ " ");
//        if(height!=null){
//            stringBuilder.append(height.getValue());
//        }
//        stringBuilder.append(";");
//        if(width!=null){
//            stringBuilder.append(width.getValue()) ;
//        }
//        stringBuilder.append(";");
//        if (marginArrayList!=null){
//            for (Margin margin : marginArrayList) {
//                stringBuilder.append(margin.getValue());
//                stringBuilder.append(";");
//            }
//        }
//       // stringBuilder.append(" "+"}");
//        return stringBuilder.toString();
//    }

    StringBuilder stringBuilder1=new StringBuilder();
    public String getValue(){

        if(Main.index==0){
            stringBuilder.append(" {"+ " ");
            if(height!=null){
                stringBuilder.append(height.getValue());
            }
            stringBuilder.append(";");
            if(width!=null){
                stringBuilder.append(width.getValue()) ;
            }

            if (marginArrayList!=null){
                for (Margin margin : marginArrayList) {
                    stringBuilder.append(";");stringBuilder.append(margin.getValue());

                }
            }
            stringBuilder.append(" "+"}");
            return stringBuilder.toString();
        }
        else {
            if(height!=null){
                stringBuilder1.append(height.getValue());
            }
            stringBuilder1.append(";");
            if(width!=null){
                stringBuilder1.append(width.getValue()) ;
            }

            if (marginArrayList!=null){
                for (Margin margin : marginArrayList) {
                    stringBuilder1.append(";");stringBuilder1.append(margin.getValue());

                }
            }
            //stringBuilder.append(" "+"}");
            return stringBuilder1.toString();
        }
    }
}

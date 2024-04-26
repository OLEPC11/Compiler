package AstClasses;

import java.util.ArrayList;

public class Arguments {
    ArrayList<Argument>arguments=new ArrayList<>();

    public ArrayList<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Argument> arguments) {
        this.arguments = arguments;
    }
    public void add(Argument argument){
        arguments.add(argument);
    }
    public void PrintAst(){
        if (arguments!=null){
            System.out.print("(");
            for (int i=0;i<arguments.size();i++) {
                arguments.get(i).PrintAst();
                if(i==arguments.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
            System.out.print(")");
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(arguments!=null){
            for (int i=0;i<arguments.size();i++) {
                if (i == arguments.size() - 1) {
                    stringBuilder.append(arguments.get(i).getValue());
                } else {
                    stringBuilder.append(arguments.get(i).getValue()+",");
                }
            }
            value="("+stringBuilder.toString()+")";
            return value;
        }
        else {
            return "No Value";
        }
    }
}

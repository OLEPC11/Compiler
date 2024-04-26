package AstClasses;

import java.util.ArrayList;

public class FormalParameterList {
    ArrayList<FormalParameterArg>formalParameterArgs=new ArrayList<>();
    LastFormalParameterArg lastFormalParameterArg;

    public ArrayList<FormalParameterArg> getFormalParameterArgs() {
        return formalParameterArgs;
    }

    public void setFormalParameterArgs(ArrayList<FormalParameterArg> formalParameterArgs) {
        this.formalParameterArgs = formalParameterArgs;
    }

    public LastFormalParameterArg getLastFormalParameterArg() {
        return lastFormalParameterArg;
    }

    public void setLastFormalParameterArg(LastFormalParameterArg lastFormalParameterArg) {
        this.lastFormalParameterArg = lastFormalParameterArg;
    }
    public void add(FormalParameterArg formalParameterArg){
        formalParameterArgs.add(formalParameterArg);
    }
    public void PrintAst(){
        if(formalParameterArgs!=null){
            for (int i=0;i<formalParameterArgs.size();i++){
                formalParameterArgs.get(i).PrintAst();
                if(i==formalParameterArgs.size()-1){
                    System.out.print("");
                }
                else{
                    System.out.print(","+" ");
                }
            }
        }
        if(lastFormalParameterArg!=null){
            System.out.print(","+" ");
            lastFormalParameterArg.PrintAst();
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    String value1;
    public String getValue(){
        if(formalParameterArgs!=null){
            for (FormalParameterArg formalParameterArg : formalParameterArgs) {
                stringBuilder.append(formalParameterArg.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        if(lastFormalParameterArg!=null){
            return  lastFormalParameterArg.getValue();
        }
        return "No Value";
    }
}

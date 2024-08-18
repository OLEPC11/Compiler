package AstClasses;

public class ArgumentsExpression extends SingleExpression{
    SingleExpression singleExpression;
    Arguments arguments;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }
    public void PrintAst(){
        if(singleExpression!=null){
            singleExpression.PrintAst();
        }
        if(arguments!=null){
            arguments.PrintAst();
        }
    }
    public String getValue(){
        if(singleExpression!=null&&arguments!=null){
            return singleExpression.getValue() +" "+arguments.getValue();
        }
        else {
            return "No Value";
        }
    }
    public String CodeGen(){
        if(singleExpression!=null&&arguments!=null){
            if(singleExpression instanceof MemberDotExpression)
                return singleExpression.CodeGen()+ "(" +arguments.CodeGen()+")";
            else return  arguments.CodeGen();
        }
        else {
            return "    ";
        }
    }
}

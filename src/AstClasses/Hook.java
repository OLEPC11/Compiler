package AstClasses;

public class Hook extends SingleExpression {
    ReactHook reactHook;

    public ReactHook getReactHook() {
        return reactHook;
    }

    public void setReactHook(ReactHook reactHook) {
        this.reactHook = reactHook;
    }
    public void PrintAst(){
      //  setScopeID(getCurrentScope().getId());
        if (reactHook!=null){
            reactHook.PrintAst();
        }
    }
    public String CodeGen()
    {
        if (reactHook!=null)
        {
            return reactHook.CodeGen();
        }
        return "  ";
    }
}

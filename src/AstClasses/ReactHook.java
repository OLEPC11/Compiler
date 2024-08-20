package AstClasses;

import VisitParserTree.Node;

public class ReactHook extends Node {
    UseEffectHook useEffectHook;
    UseRefHook useRefHook;
    UseStateHook useStateHook;

    public UseEffectHook getUseEffectHook() {
        return useEffectHook;
    }

    public void setUseEffectHook(UseEffectHook useEffectHook) {
        this.useEffectHook = useEffectHook;
    }

    public UseRefHook getUseRefHook() {
        return useRefHook;
    }

    public void setUseRefHook(UseRefHook useRefHook) {
        this.useRefHook = useRefHook;
    }

    public UseStateHook getUseStateHook() {
        return useStateHook;
    }

    public void setUseStateHook(UseStateHook useStateHook) {
        this.useStateHook = useStateHook;
    }
    public void PrintAst() {
        //setScopeID(getCurrentScope().getId());
        if (useEffectHook != null) {
            useEffectHook.PrintAst();
        }
        if (useRefHook != null) {
            useRefHook.PrintAst();
        }
        if(useStateHook!=null){
            useStateHook.PrintAst();
        }
    }
    public String CodeGen(){
        if (useStateHook!=null)
        {
            return useStateHook.CodeGen();
        }
        return "  ";
    }
}

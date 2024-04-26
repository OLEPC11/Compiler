package AstClasses;

public class SingleExpression {
    HtmlElementExpression htmlElementExpression;
    ParenthesizedExpression parenthesizedExpression;
    FunctionExpression functionExpression;
    ImportExpression importExpression;
    Hook hook;
    AdditiveExpression additiveExpression;
    MultiplicativeExpression multiplicativeExpression;
    ArrayLiteralExpression arrayLiteralExpression;
    ObjectLiteralExpression objectLiteralExpression;
    IdentifierExpression identifierExpression;
    LiteralExpression literalExpression;
    TernaryExpression ternaryExpression;
    RelationalExpression relationalExpression;
    AssignmentExpression assignmentExpression;
    TemplateStringExpression templateStringExpression;
    MemberDotExpression memberDotExpression;
    ArgumentsExpression argumentsExpression;
    MemberIndexExpression memberIndexExpression;

    public HtmlElementExpression getHtmlElementExpression() {
        return htmlElementExpression;
    }

    public void setHtmlElementExpression(HtmlElementExpression htmlElementExpression) {
        this.htmlElementExpression = htmlElementExpression;
    }

    public ParenthesizedExpression getParenthesizedExpression() {
        return parenthesizedExpression;
    }

    public void setParenthesizedExpression(ParenthesizedExpression parenthesizedExpression) {
        this.parenthesizedExpression = parenthesizedExpression;
    }

    public FunctionExpression getFunctionExpression() {
        return functionExpression;
    }

    public void setFunctionExpression(FunctionExpression functionExpression) {
        this.functionExpression = functionExpression;
    }

    public AdditiveExpression getAdditiveExpression() {
        return additiveExpression;
    }

    public void setAdditiveExpression(AdditiveExpression additiveExpression) {
        this.additiveExpression = additiveExpression;
    }

    public MultiplicativeExpression getMultiplicativeExpression() {
        return multiplicativeExpression;
    }

    public void setMultiplicativeExpression(MultiplicativeExpression multiplicativeExpression) {
        this.multiplicativeExpression = multiplicativeExpression;
    }

    public ArrayLiteralExpression getArrayLiteralExpression() {
        return arrayLiteralExpression;
    }

    public void setArrayLiteralExpression(ArrayLiteralExpression arrayLiteralExpression) {
        this.arrayLiteralExpression = arrayLiteralExpression;
    }

    public ObjectLiteralExpression getObjectLiteralExpression() {
        return objectLiteralExpression;
    }

    public void setObjectLiteralExpression(ObjectLiteralExpression objectLiteralExpression) {
        this.objectLiteralExpression = objectLiteralExpression;
    }

    public IdentifierExpression getIdentifierExpression() {
        return identifierExpression;
    }

    public void setIdentifierExpression(IdentifierExpression identifierExpression) {
        this.identifierExpression = identifierExpression;
    }

    public LiteralExpression getLiteralExpression() {
        return literalExpression;
    }

    public void setLiteralExpression(LiteralExpression literalExpression) {
        this.literalExpression = literalExpression;
    }

    public TernaryExpression getTernaryExpression() {
        return ternaryExpression;
    }

    public void setTernaryExpression(TernaryExpression ternaryExpression) {
        this.ternaryExpression = ternaryExpression;
    }

    public AssignmentExpression getAssignmentExpression() {
        return assignmentExpression;
    }

    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    public MemberDotExpression getMemberDotExpression() {
        return memberDotExpression;
    }

    public void setMemberDotExpression(MemberDotExpression memberDotExpression) {
        this.memberDotExpression = memberDotExpression;
    }

    public ArgumentsExpression getArgumentsExpression() {
        return argumentsExpression;
    }

    public void setArgumentsExpression(ArgumentsExpression argumentsExpression) {
        this.argumentsExpression = argumentsExpression;
    }

    public MemberIndexExpression getMemberIndexExpression() {
        return memberIndexExpression;
    }

    public void setMemberIndexExpression(MemberIndexExpression memberIndexExpression) {
        this.memberIndexExpression = memberIndexExpression;
    }

    public ImportExpression getImportExpression() {
        return importExpression;
    }

    public void setImportExpression(ImportExpression importExpression) {
        this.importExpression = importExpression;
    }

    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }

    public RelationalExpression getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(RelationalExpression relationalExpression) {
        this.relationalExpression = relationalExpression;
    }

    public TemplateStringExpression getTemplateStringExpression() {
        return templateStringExpression;
    }

    public void setTemplateStringExpression(TemplateStringExpression templateStringExpression) {
        this.templateStringExpression = templateStringExpression;
    }

    public void PrintAst(){
        if(htmlElementExpression!=null){
           htmlElementExpression.PrintAst();
        }
        if(parenthesizedExpression!=null){
            parenthesizedExpression.PrintAst();
        }
        if (functionExpression!=null){
            functionExpression.PrintAst();
        }
        if (additiveExpression!=null){
            additiveExpression.PrintAst();
        }
        if (multiplicativeExpression!=null){
            multiplicativeExpression.PrintAst();
        }
        if (arrayLiteralExpression!=null){
            arrayLiteralExpression.PrintAst();
        }
        if (objectLiteralExpression!=null){
            objectLiteralExpression.PrintAst();
        }
        if (identifierExpression!=null){
            identifierExpression.PrintAst();
        }
        if (literalExpression!=null){
            literalExpression.PrintAst();
        }
        if (ternaryExpression!=null){
            ternaryExpression.PrintAst();
        }
        if (assignmentExpression!=null){
            assignmentExpression.PrintAst();
        }
        if (memberDotExpression!=null){
            memberDotExpression.PrintAst();
        }

        if (argumentsExpression!=null){
            argumentsExpression.PrintAst();
        }

        if (memberIndexExpression!=null){
            memberIndexExpression.PrintAst();
        }
        if(importExpression!=null){
            importExpression.PrintAst();
        }
        if(hook!=null){
            hook.PrintAst();
        }
        if(templateStringExpression!=null){
            templateStringExpression.PrintAst();
        }
        if(relationalExpression!=null){
            relationalExpression.PrintAst();
        }

    }
    public String getValue(){
        if(htmlElementExpression!=null){
            return htmlElementExpression.getValue();
        }
        if(parenthesizedExpression!=null){
            return parenthesizedExpression.getValue();
        }
        if(additiveExpression!=null){
            return additiveExpression.getValue();
        }
        if(multiplicativeExpression!=null){
            return multiplicativeExpression.getValue();
        }
        if(arrayLiteralExpression!=null){
            return arrayLiteralExpression.getValue();
        }
        if(objectLiteralExpression!=null){
            return objectLiteralExpression.getValue();
        }
        if(identifierExpression!=null){
            return identifierExpression.getValue();
        }
        if(literalExpression!=null){
            return literalExpression.getValue();
        }
        if(assignmentExpression!=null){
            return assignmentExpression.getValue();
        }
        if(memberDotExpression!=null){
            return  memberDotExpression.getValue();
        }
        if(ternaryExpression!=null){
            return ternaryExpression.getValue();
        }
        if(argumentsExpression!=null){
            return argumentsExpression.getValue();
        }
        if(memberIndexExpression!=null){
            return memberIndexExpression.getValue();
        }
        if(functionExpression!=null){
            functionExpression.getValue();
        }
        return "No Value";
    }

}

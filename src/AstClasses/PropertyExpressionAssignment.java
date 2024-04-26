package AstClasses;

public class PropertyExpressionAssignment extends PropertyAssignment{
    PropertyName propertyName;
    SingleExpression singleExpression;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }
    public void PrintAst(){
        if(propertyName!=null){
            propertyName.PrintAst();
        }
        if(singleExpression!=null){
            System.out.print(":"+" ");
            singleExpression.PrintAst();
        }
    }
    public String getValue(){
        if (propertyName!=null&&singleExpression!=null)
        {
            return   propertyName.getValue() +" "+":"+" "+singleExpression.getValue();
        }
        return "No Value";
    }
}

package AstClasses;

public class PropertyAssignment {
    PropertyExpressionAssignment propertyExpressionAssignment;
    ComputedPropertyExpressionAssignment computedPropertyExpressionAssignment;
    FunctionProperty functionProperty;
    PropertyShorthand propertyShorthand;

    public PropertyExpressionAssignment getPropertyExpressionAssignment() {
        return propertyExpressionAssignment;
    }

    public void setPropertyExpressionAssignment(PropertyExpressionAssignment propertyExpressionAssignment) {
        this.propertyExpressionAssignment = propertyExpressionAssignment;
    }

    public ComputedPropertyExpressionAssignment getComputedPropertyExpressionAssignment() {
        return computedPropertyExpressionAssignment;
    }

    public void setComputedPropertyExpressionAssignment(ComputedPropertyExpressionAssignment computedPropertyExpressionAssignment) {
        this.computedPropertyExpressionAssignment = computedPropertyExpressionAssignment;
    }

    public FunctionProperty getFunctionProperty() {
        return functionProperty;
    }

    public void setFunctionProperty(FunctionProperty functionProperty) {
        this.functionProperty = functionProperty;
    }

    public PropertyShorthand getPropertyShorthand() {
        return propertyShorthand;
    }

    public void setPropertyShorthand(PropertyShorthand propertyShorthand) {
        this.propertyShorthand = propertyShorthand;
    }
    public void PrintAst(){
        System.out.println();
        if(propertyExpressionAssignment!=null){
            propertyExpressionAssignment.PrintAst();
        }
        if(computedPropertyExpressionAssignment!=null){
            computedPropertyExpressionAssignment.PrintAst();
        }
        if(functionProperty!=null){
            functionProperty.PrintAst();
        }
        if(propertyShorthand!=null){
            propertyShorthand.PrintAst();
        }
    }
    public String getValue(){
        if(propertyExpressionAssignment!=null){
            return propertyExpressionAssignment.getValue();
        }
        if(propertyShorthand!=null){
            return propertyShorthand.getValue();
        }
        else{
            return "No Value";
        }
    }
}

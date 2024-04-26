package AstClasses;

public class HtmlAttributeValue {
    String AttributeValue;
    String StringLiteral;
    ObjectExpressionSequence objectExpressionSequence;

    public String getAttributeValue() {
        return AttributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        AttributeValue = attributeValue;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public ObjectExpressionSequence getObjectExpressionSequence() {
        return objectExpressionSequence;
    }

    public void setObjectExpressionSequence(ObjectExpressionSequence objectExpressionSequence) {
        this.objectExpressionSequence = objectExpressionSequence;
    }
    public void PrintAst(){
        if(StringLiteral!=null){
            System.out.print(StringLiteral+" ");
        }
        if(AttributeValue!=null){
            System.out.print(AttributeValue+" ");
        }
        if(objectExpressionSequence!=null){
            objectExpressionSequence.PrintAst();
        }
    }
    public String getValue(){
        if(StringLiteral!=null){
         return StringLiteral+" ";
        }
        if(AttributeValue!=null){
          return AttributeValue+" ";
        }
        if(objectExpressionSequence!=null){
            return objectExpressionSequence.getValue();
        }
        return "No Value";
    }
}

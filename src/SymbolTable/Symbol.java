package SymbolTable;

public class Symbol {
    private String nodeName;
    private String name;
    private String type;
    private Scope scope;
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Symbol(){}
    public Symbol(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public void print() {
        System.out.println("\u001b[34m"+"{");
        System.out.println("\u001b[34m"+"Symbol :  " + this.getName() );
        System.out.println("\u001b[34m"+"Symbol Value : "+this.getValue());
        System.out.println("\u001b[34m"+"Symbol Type : " + this.getType() );
        System.out.println("\u001b[34m"+"Scope Number of Symbol : " + this.getScope().getId() );
        System.out.println("\u001b[34m"+"Scope Name : " + this.getScope().getName());
        System.out.println("\u001b[34m"+"Node Name : "+this.getNodeName());
        System.out.println("\u001b[34m"+"}");
    }
}








//public class Symbol {
//    String nodeName;
//    String name;
//    Object value;
//
//    public Symbol() {
//    }
//
//    public Symbol(String name, Object value) {
//        this.name = name;
//        this.value = value;
//    }
//
//    public Symbol(String name) {
//        this.name = name;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Object getValue() {
//        return value;
//    }
//
//    public void setValue(Object value) {
//        this.value = value;
//    }
//
//    public String getNodeName() {
//        return nodeName;
//    }
//
//    public void setNodeName(String nodeName) {
//        this.nodeName = nodeName;
//    }
//
//    @Override
//    public String toString() {
//        return "Symbol{" +
//                "NodeName ="+nodeName+ '\''+
//                "name='" + name + '\'' +
//                ", value=" + value +
//                '}'+"\n";
//    }
//}

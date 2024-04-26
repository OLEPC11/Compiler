package SymbolTable;

public class Symbol {
    String name;
    Object value;

    public Symbol() {
    }

    public Symbol(String name, Object value) {
        this.name = name;
        this.value = value;
    }
    public Symbol(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}'+"\n";
    }
}

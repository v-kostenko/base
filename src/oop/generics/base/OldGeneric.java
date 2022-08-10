package oop.generics.base;

public class OldGeneric {
    private Object field1;

    public OldGeneric(Object field1){
        this.field1 = field1;
    }

    public Object getField1() {
        return field1;
    }

    public void setField1(Object field1) {
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "OldGeneric{" +
                "field1=" + field1 +
                '}';
    }
}

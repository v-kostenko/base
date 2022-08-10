package oop.generics.base;

public class ChildGeneric<P, Q> extends FirstGeneric<P>{
    private Q fieldQ;

    public ChildGeneric(P field1, Q fieldQ){
        super(field1);
        this.fieldQ = fieldQ;
    }

    public Q getFieldQ() {
        return fieldQ;
    }

    public void setFieldQ(Q fieldQ) {
        this.fieldQ = fieldQ;
    }

    @Override
    public String toString() {
        return super.toString() + "ChildGeneric{" +
                "fieldQ=" + fieldQ +
                '}';
    }
}

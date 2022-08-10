package oop.generics.base;

public class FirstGeneric<T> {
    private T field1;

    public FirstGeneric(T field1){
        this.field1 = field1;
    }

    public void  setField1(T field1){
        this.field1 = field1;
    }

    public T getField1(){
        return field1;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "\nField1 " + field1;
    }
}

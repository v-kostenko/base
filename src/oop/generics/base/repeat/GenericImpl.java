package oop.generics.base.repeat;

public class GenericImpl<C, U> implements GenericI<U> {
    private C fieldC;
    private U fieldU;

    public GenericImpl(C fieldC){
        this.fieldC = fieldC;
    }

    @Override
    public void method(U u){
        throw new UnsupportedOperationException();
    }

    public void setFieldU(U u){
        this.fieldU = fieldU;
    }
}

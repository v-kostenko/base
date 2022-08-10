package oop.generics.base;

public class Vova<Q> extends GenericImpl<Q>{

    @Override
    public String text(Q variable){
        return variable.toString();
    }
}

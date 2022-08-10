package oop.generics.base;

public class ClassNew<R> implements IGenericNew<R>{

    @Override
    public void method(R x){
        System.out.println(x);
    }

    @Override
    public String test(){
        return "Word";
    }
}

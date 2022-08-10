package oop.generics.base.repeat;

public class Plain implements GenericI<String>{

    @Override
    public void method(String str){
        System.out.println(str);
    }
}

package oop.generics.base;

public class Dog extends Animal{

    public Dog(int age, String nickName) {
        super(age, nickName);
    }

    public void voice(){
        System.out.println("bark...");
    }
}

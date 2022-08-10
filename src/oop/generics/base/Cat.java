package oop.generics.base;

public class Cat extends Animal{

    public Cat(int age, String nickName) {
        super(age, nickName);
    }

    public void voice(){
        System.out.println("Meeeeeuuu");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

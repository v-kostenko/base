package oop.generics.base;

public abstract class Animal {
    private int age;
    private String nickName;

    public Animal(int age, String nickName){
        this.age = age;
        this.nickName = nickName;
    }

    abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

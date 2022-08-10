package oop.interfaces.base;

public class Human {
    protected String humanName;

    public Human(String humanName){
        this.humanName = humanName;
    }

    public void eat(){
        System.out.println("I am eating...");
    }
}

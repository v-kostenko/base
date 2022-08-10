package oop.inheritance.basic;

public class Engineer extends Position {

    public Engineer(double salary, double experience, Gender gender){
        super("Engineer", salary, experience, gender);
    }

    public void descriptionWorkFlow(){
        System.out.println("1. Fix + \n 2. Play cards");
    }
}

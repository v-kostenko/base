package oop.inheritance.basic;

public class Secretarian extends Position{

    public Secretarian(double salary, double experience){
        super("Secretarian", salary, experience, Gender.FEMALE);
    }

    public void makeCoffee(){
        System.out.println("Make coffee");
    }

    @Override
    public void descriptionWorkFlow(){
        makeCoffee();
        System.out.println("1. Make up. \n + 2. Print documents. + \n 3. Call telephone");
    }
}

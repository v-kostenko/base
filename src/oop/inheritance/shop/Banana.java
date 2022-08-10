package oop.inheritance.shop;

public class Banana extends Food{
    private boolean isForFood;

    public Banana(boolean isForFood){
        super("Indian banana", 45.5, "3.06.2022", 1, 1, 30);
        this.isForFood = isForFood;
    }

    public String toString(){
        return super.toString() + "\nFor food: " + isForFood + "\n";
    }
}

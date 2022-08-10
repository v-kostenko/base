package oop.inheritance.shop;

public class Robot extends Toy{
    private String abilityManage;

    public Robot(String title, int ageFrom, double price, String material, String abilityManage){
        super(title, ageFrom, price, material);
        this.abilityManage = abilityManage;
    }

    public String toString(){
        return super.toString() + "\nManage: " + abilityManage + "\n";
    }
}

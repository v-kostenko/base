package oop.inheritance.shop;

public class Ball extends Toy{
    private double size;

    public Ball(String title, int ageFrom, double price, String material, double size){
        super(title, ageFrom, price, material);
        this.size = size;
    }

    public String toString(){
        return super.toString() + "\nSize: " + size + "sm\n";
    }
}

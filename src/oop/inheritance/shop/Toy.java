package oop.inheritance.shop;

public abstract class Toy extends Product{
    private int ageFrom;
    private String material;

    public Toy(String title, int ageFrom, double price, String material){
        super(title, price);
        this.ageFrom = ageFrom;
        this.material = material;
    }

    public String toString(){
        return super.toString() + "\nAge from: " + ageFrom + " years" +
               "\nMaterial: " + material;
    }
}

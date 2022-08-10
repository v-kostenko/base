package oop.inheritance.shop;

public class Ring extends Jewelry {
    private double diameter;

    public Ring(Material material, double weight, double price, double diameter){
        super("Wedding ring", material, weight, price);
        this.diameter = diameter;
    }

    public String toString(){
        return super.toString() + "\nDiametr: " + diameter + "\n";
    }
}

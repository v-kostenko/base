package oop.inheritance.shop;
enum Material{GOLD_585(585), GOLD_750(750), SILVER_960(960), SILVER_925(925),
    PLATINUM_900(900), PLATINUM_950(950);

    private int test; // How much precious metal in the product

    Material(int test){
        this.test = test;
    }
}

public abstract class Jewelry extends Product{
    private Material material;
    private double weight;

    public Jewelry(String title, Material material, double weight, double price){
        super(title, price);
        this.material = material;
        this.weight = weight;
    }

    public String toString(){
        return super.toString() + "\nMaterial: " + material + "\nWeight: " + weight + " gr";
    }

}

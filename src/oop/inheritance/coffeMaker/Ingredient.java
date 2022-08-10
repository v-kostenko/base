package oop.inheritance.coffeMaker;

public abstract class Ingredient {
    private String title;
    private double price;
    private double weight;

    public Ingredient(String title, double price, double weight){
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return "--" + getClass().getSimpleName() + "\nTitle: " + title + "\nPrice: " + price + "\nWeight: " + weight + "\n";
    }

    public boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (object == null){
            return false;
        }
        if (object.getClass() != this.getClass()){
            return false;
        }
        Ingredient temp = (Ingredient) object;
        return this.title.equals(temp.title) && this.price == temp.price && this.weight == temp.weight;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + title.hashCode();
        hashCode = 7 * hashCode + Double.hashCode(price);
        hashCode = 7 * hashCode + Double.hashCode(weight);
        return hashCode;
    }
}

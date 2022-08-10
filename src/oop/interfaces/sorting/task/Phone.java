package oop.interfaces.sorting.task;

public class Phone implements ItemI{
    private double price;
    private String brand;
    private double size;
    private double weight;

    public Phone(double price, String brand, double size, double weight) {
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public void showInfo(){

    }

    @Override
    public String getText(){
        return this.brand;
    }

    @Override
    public int compareTo(ItemI item){
        return this.brand.compareTo(item.getText());
    }

    @Override
    public String toString(){
        return "Price " + price + " Brand " + brand + " Size " + size + " Weight " + weight;
    }
}

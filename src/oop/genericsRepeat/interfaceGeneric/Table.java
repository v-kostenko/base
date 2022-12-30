package oop.genericsRepeat.interfaceGeneric;

public class Table implements IGeneric<String>{
    private String color;
    private double price;

    public Table(String color, double price){
        this.color = color;
        this.price = price;
    }

    @Override
    public void print(String  text){
        System.out.println(text + " " + color + " " + price);
    }
}

package oop.genericsRepeat.interfaceGeneric;

public class Car<T> implements GenericSecond<T>{
    private String color;
    private double price;

    public Car(String color, double price){
        this.color = color;
        this.price = price;
    }
    public void print(T t){
        System.out.println(t);
    }

    @Override
    public <E> E test(E e) {
        return e;
    }

    public String toString(){
        return "Color " + color + " Price " + price;
    }


}

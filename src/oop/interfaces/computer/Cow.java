package oop.interfaces.computer;

public class Cow implements UsbDevice{
    private String type;
    private double weight;
    private int age;

    public Cow(String type, double weight, int age) {
        this.type = type;
        this.weight = weight;
        this.age = age;
    }

    public String showInfo(){
        return getClass().getSimpleName() + " " + type + "\nWeight " + weight + "\nAge " + age;
    }

}

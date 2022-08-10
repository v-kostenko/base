package oop.io.text;

import java.io.Serializable;

public class Toy {
    private String title;
    private double price;
    private int ageFrom;
    private String material;
    private long serialNumber;

    public Toy(String title, double price, int ageFrom, String material, long serialNumber) {
        this.title = title;
        this.price = price;
        this.ageFrom = ageFrom;
        this.material = material;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if(!(obj instanceof Toy)){
            return false;
        }
        Toy temp = (Toy) obj;
        return this.serialNumber == temp.serialNumber;
    }

    @Override
    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + Long.hashCode(serialNumber);
        return hashCode;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + title + "\nprice - " + price + " $" +
                "\nage from - " + ageFrom + " years" + "\nmaterial - " + material + "\n" + serialNumber;
    }
}

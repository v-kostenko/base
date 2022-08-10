package oop.inheritance.shop;

import java.util.HashMap;

public class Constructor extends Toy{
    private HashMap<String, Integer> parts = new HashMap<>();

    public Constructor(String title, int ageFrom, double price){
        super(title, ageFrom, price, "Plastic");
    }

    public void addPart(String detail, int amount){
        parts.put(detail, amount);
    }

    public String toString(){
        String str = "\nConstructor contains:\n";
        for (String p: parts.keySet()) {
            str = str + "    -" + p + " " + "- " + parts.get(p) + "\n";
        }
        return super.toString() + str;
    }
}

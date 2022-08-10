package oop.inheritance.shop;

import java.util.ArrayList;

public class ToyDepartment {
    private ArrayList<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public String toString() {
        String str = "   |ToyDepartment|\n";
        for (int i = 0; i < toys.size(); i++) {
            str = str + (i+1) + ")" + toys.get(i);
        }
        return str;
    }
}

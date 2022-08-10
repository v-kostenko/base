package oop.inheritance.shop;

import java.util.ArrayList;

public class JewelryDepartment {
    private ArrayList<Jewelry> jewelries = new ArrayList<>();

    public void addJewelry(Jewelry jewelry) {
        jewelries.add(jewelry);
    }

    public String toString(){
        String str = "   |JewelryDepartment|\n";
        for (int i = 0; i < jewelries.size(); i++) {
            str = str + (i+1) + ")" + jewelries.get(i);
        }
        return str;
    }
}

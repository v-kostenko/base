package oop.inheritance.shop;

import java.util.ArrayList;

public class FoodDepartment {
    private ArrayList<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public String toString() {
        String temp = "   |Food Department|\n";
        for (int i = 0; i < foods.size(); i++) {
            temp = temp + (i+1) + ")" + foods.get(i);
        }
        return temp;
    }
}

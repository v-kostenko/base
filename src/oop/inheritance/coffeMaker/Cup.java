package oop.inheritance.coffeMaker;

import java.util.ArrayList;

public class Cup {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void addIngredientsInTheCup(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public String toString(){
        String str = "";
        double totalPrice = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            str = str + ingredients.get(i);
            totalPrice = totalPrice + ingredients.get(i).getPrice();
        }
        return str + "\nTotal price: " + totalPrice;
    }

}

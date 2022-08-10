package oop.inheritance.coffeMaker;

import java.util.HashMap;
import java.util.Scanner;

enum Drink {
    AMERICANO, CAPPUCHINO, LATTE, FLATWHITE
}

class CoffeeMaker {
    private int porcionSugar;
    private int porcionCream;
    private Scanner scanner = new Scanner(System.in);
    private HashMap<Ingredient, Integer> storage = new HashMap<>();

    public CoffeeMaker() {
        storage.put(new Coffee(), 1);
        storage.put(new Water(), 1);
        storage.put(new Cream(), 1);
        storage.put(new Sugar(), 1);
        menu();
    }

    public void menu() {

        while (true) {
            System.out.println("Menu: \n1. Chose drink \n2. Show storage \n3. Fill storage");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> chooseDrink();
                case 2 -> showStorage();
                case 3 -> fillStorage();
            }
        }
    }

    private void chooseDrink() {
        System.out.println("Menu: \nAMERICANO \nCAPPUCHINO \nLATTE \nFLATWHITE");
        Drink result = Drink.valueOf(scanner.next());

        switch (result) {
            case AMERICANO -> americanoReceipt();
            case CAPPUCHINO -> cappuchinoReceipt();
        }
    }

    private boolean checkIngridients(){
        if (storage.get(new Coffee()) < 1) {
            System.out.println("Coffee is not enough");
            return false;
        }
        if (storage.get(new Water()) < 1) {
            System.out.println("Watter is not enough");
            return false;
        }
        if (!addSugar()){
            return false;
        }
        return true;
    }

    private void americanoReceipt() {
        if (!checkIngridients()){
            return;
        }
        Cup cup = new Cup();
        Coffee coffee = new Coffee();
        Water water = new Water();
        Sugar sugar = new Sugar();

        cup.addIngredientsInTheCup(coffee);
        storage.replace(coffee, storage.get(coffee) - 1);

        cup.addIngredientsInTheCup(water);
        storage.replace(water, storage.get(water) - 1);

        for (int i = 0; i < porcionSugar; i++) {
            cup.addIngredientsInTheCup(sugar);
            storage.replace(sugar, storage.get(sugar) - 1);
        }
        System.out.println(cup);
    }

    public void cappuchinoReceipt() {
        if (!checkIngridients() || !addCream()){
            return;
        }
        Cup cup = new Cup();
        Coffee coffee = new Coffee();
        Water water = new Water();
        Sugar sugar = new Sugar();
        Cream cream = new Cream();

        cup.addIngredientsInTheCup(coffee);
        storage.replace(coffee, storage.get(coffee) - 1);

        cup.addIngredientsInTheCup(water);
        storage.replace(water, storage.get(water) - 1);

        for (int i = 0; i < porcionSugar; i++) {
            cup.addIngredientsInTheCup(sugar);
            storage.replace(sugar, storage.get(sugar) - 1);
        }

        for (int i = 0; i < porcionCream; i++) {
            cup.addIngredientsInTheCup(cream);
            storage.replace(cream, storage.get(cream) - 1);
        }
        System.out.println(cup);
    }

    private boolean addSugar() {
        System.out.println("How much sugar porcion would you like?");
        porcionSugar = scanner.nextInt();
        if (storage.get(new Sugar()) < porcionSugar) {
            System.out.println("Sugar not enough");
            return false;
        }
        return true;
    }

    private boolean addCream(){
        System.out.println("How much cream porcion would you like?");
        porcionCream = scanner.nextInt();
        if (storage.get(new Cream()) < porcionCream){
            System.out.println("Cream not enough");
            return false;
        }
        return true;
    }

    public void showStorage() {
        for (Ingredient ingr : storage.keySet()) {
            System.out.println(ingr + "Amount: " + storage.get(ingr));
        }
    }

    public void fillStorage(){
        System.out.println("Choose ingridient");
        String ingredient = scanner.next();
        System.out.println("Input amount");
        int amount = scanner.nextInt();
        switch (ingredient){
            case "Coffee"-> storage.put(new Coffee(), storage.get(new Coffee()) + amount);
            case "Water" -> storage.put(new Water(), storage.get(new Water()) + amount);
            case "Sugar" -> storage.put(new Sugar(), storage.get(new Sugar()) + amount);
            case "Cream" -> storage.put(new Cream(), storage.get(new Cream()) + amount);
        }
    }




}

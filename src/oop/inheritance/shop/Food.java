package oop.inheritance.shop;

public abstract class Food extends Product{
    private String expDate;
    private double protein;
    private double fat;
    private double carbohydrates;

    public Food(String title, double price, String expDate, double protein, double fat, double carbohydrates) {
        super(title, price);
        this.expDate = expDate;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public String toString(){
        return super.toString() +
                "\nExpDate: " + expDate + " \nProtein: " + protein + " gr\n" +
                "Fat: " + fat + " gr\n" + "Carbohydrates: " + carbohydrates + " gr";
    }




}

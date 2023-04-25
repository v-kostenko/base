package patterns.decorator.carLine.autos;

import java.util.ArrayList;
import java.util.List;

public abstract class Auto {
    private String color;
    private double price;
    private List<String> featuresList = new ArrayList<>();


    public Auto(String color, double price){
        this.color = color;
        this.price = price;
    }

    public void addFeature(String feature){
        featuresList.add(feature);
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("");
        builder.append("Color: " + color + "\nPrice: " + price + "\nFeatures: \n");
        for (String features: featuresList) {
            builder.append(features + "\n");
        }
        return builder.toString();
    }

    public double getPrice() {
        return this.price;
    }
}

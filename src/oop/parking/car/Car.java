package oop.parking.car;

import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String carPlate;

    public Car(String brand, String model, String color, String carPlate){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carPlate = carPlate;
    }

    public Car(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести бренд авто");
        this.brand = scanner.next();
        System.out.println("Ввести модель");
        this.model = scanner.next();
        System.out.println("Ввести цвет");
        this.color = scanner.next();
        System.out.println("Ввести гос. номер");
        this.carPlate = scanner.next();
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public String getCarPlate(){
        return carPlate;
    }

    public void getInfo(){
        System.out.println("Brand " + brand + "\n Model " + model +
                "\n Color " + color + "\n CarPlate " + carPlate);
    }



}

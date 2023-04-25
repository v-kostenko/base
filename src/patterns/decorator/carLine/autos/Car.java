package patterns.decorator.carLine.autos;

import java.util.List;

public class Car extends Auto{
    private int maxSpeed;

    public Car(String color, double price, int maxSpeed) {
        super(color, price);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String toString(){
        return super.toString() + "\nMax speed: " + maxSpeed;
    }



}

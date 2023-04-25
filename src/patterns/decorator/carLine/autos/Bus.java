package patterns.decorator.carLine.autos;

import java.util.List;

public class Bus extends Auto{
    private int seatAmount;

    public Bus(String color, double price, int seatAmount) {
        super(color, price);
        this.seatAmount = seatAmount;
    }


    public String toString(){
        return super.toString() + "\nSeat amount: " + seatAmount;
    }


}

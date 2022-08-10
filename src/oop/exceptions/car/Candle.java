package oop.exceptions.car;

import java.util.Random;

public class Candle {
    private int power;
    private Random random = new Random();

    public Candle(){
        power = random.nextInt(101);
    }

    public void giveSpark() throws CandleException{
        if (power < 10){
            System.out.println("Power less than 10%");
            throw new CandleException("Power less than 10%");
        }
        System.out.println("Candle gave a power");
    }
}

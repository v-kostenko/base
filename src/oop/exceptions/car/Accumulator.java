package oop.exceptions.car;

import java.util.Random;

public class Accumulator {
    private int power;
    private Random random = new Random();

    public Accumulator(){
        power = random.nextInt(101);
    }

    public int giveEnergy() throws AccumulatorException{
       if (power <= 15){
           throw new AccumulatorException("Power less than 15%");
       }
       return power;
    }
}

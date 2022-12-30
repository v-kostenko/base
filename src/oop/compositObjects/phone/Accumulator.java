package oop.compositObjects.phone;

import java.util.Random;

public class Accumulator {
    private int charge;

    public Accumulator(){
        Random random = new Random();
        charge = random.nextInt(101);
    }
}

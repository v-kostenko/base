package oop.clockMechanism;

import java.util.Random;

public class Battery {
    private int power;

    public Battery(){
        Random random = new Random();
        this.power = random.nextInt(3);
    }

    public int getPower() {
        return power;
    }

    public void discharge(int percent){
        power = power - percent;
    }


}

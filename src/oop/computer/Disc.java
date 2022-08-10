package oop.computer;

import java.util.Random;

public class Disc {
    private boolean isWorking;

    public Disc() {
        Random random = new Random();
        int result = random.nextInt(101);
        if (result > 7) {
            isWorking = true;
        }
    }

    public boolean check(){
        return isWorking;
    }
}

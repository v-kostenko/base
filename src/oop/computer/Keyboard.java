package oop.computer;

import java.util.Random;

public class Keyboard {
    private boolean isWorking;

    public Keyboard() {
        Random random = new Random();
        int result = random.nextInt(101);
        if (result > 5) {
            isWorking = true;
        }
    }

    public boolean check(){
        return isWorking;
    }
}

package oop.computer;

import java.lang.reflect.Array;
import java.util.Random;

public class Memory {
    private int volume;
    private boolean isWorking;

    public Memory(int volume){
        this.volume = volume;
        Random random = new Random();
        int result = random.nextInt(101);
        if (result > 50) {
            isWorking = true;
        }
    }

    public boolean check(){
        return isWorking;
    }
}

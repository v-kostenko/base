package oop.computer;

import java.util.Random;

public class Monitor {
    private boolean isWorking;

    public Monitor() {
        Random random = new Random();
        int result = random.nextInt(101);
        if (result > 5) {
            isWorking = true;
        }
    }

    public boolean check(){
        return isWorking;
    }

    public void showInfo(String info){
        System.out.println(info);
    }
}

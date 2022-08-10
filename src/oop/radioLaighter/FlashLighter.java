package oop.radioLaighter;

import java.util.ArrayList;

public class FlashLighter {
    private ArrayList<Lamp> lamps = new ArrayList<>();
    private boolean isTurnOn;

    public FlashLighter(){
        for (int i = 0; i < 10; i++) {
            lamps.add(new Lamp());
        }
    }

    public void turnOnOFF(){
        if (!isTurnOn){
            isTurnOn = true;
            for (int i = 0; i < lamps.size(); i++) {
                lamps.get(i).turnOn();
            }
            System.out.println("FlashLighter is ON");
        } else {
            isTurnOn = false;
            for (int i = 0; i < lamps.size(); i++) {
                lamps.get(i).turnOff();
            }
            System.out.println("FlashLighter is OFF");
        }
    }





}

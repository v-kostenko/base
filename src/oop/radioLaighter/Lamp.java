package oop.radioLaighter;

import java.util.ArrayList;

public class Lamp {
    private boolean isTurnOn;

    public void turnOn() {
        isTurnOn = true;
        System.out.println("Lamp is shining");
    }

    public void turnOff(){
        isTurnOn = false;
        System.out.println("Lamp is turned Off");
    }
}

package oop.clockAgregation;

import java.util.Random;

public class Clock {
    private Battery battery;
    private Display display;
    private int hours;
    private int minutes;

    public Clock() {
        battery = new Battery();
        display = new Display();
        Random random = new Random();
        minutes = random.nextInt(60);
        hours = random.nextInt(24);
        startClock();
    }

    private void startClock() {
        int counter = 0;
        int itter = 0;
        while (battery.getPower() > 0) {
            itter++;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }

            if (itter % 180 == 0) {
                battery.discharge(1);
                display.showTime("power" + battery.getPower());
            }

            if (hours == 24) {
                hours = 0;
            }
            display.showTime(hours + ":" + minutes + " power " + battery.getPower() + " i " + itter);
        }
    }

    public void changeBattery(Battery battery) {
        this.battery = battery;
    }


}

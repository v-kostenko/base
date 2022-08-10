package oop.clockInnerClass;

import oop.clockMechanism.Battery;
import oop.clockMechanism.Display;

public class Clock {
    private int hours;
    private int minutes;
    private Battery battery;
    private Display display;
    private Mechanism mechanism;

    public Clock(){
        mechanism = new Mechanism();
        battery = new Battery();
        display = new Display();
        mechanism.start();
    }

    public class Mechanism {
        private int itter;
        public void start() {
            while (battery.getPower() > 0) {
                itter++;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
                if (itter % 180 == 0) {
                    battery.discharge(1);
                }
                if (hours == 24) {
                    hours = 0;
                }
                display.showTime(hours, minutes);
            }
        }
    }

}

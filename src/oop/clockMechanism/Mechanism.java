package oop.clockMechanism;

public class Mechanism {
    private Battery battery;
    private Clock clock;
    private int itter;

    public void connectBattery(Battery battery) {
        this.battery = battery;
    }

    public void connectClock(Clock clock){
        this.clock = clock;
    }

    public void start(int hours, int minutes) {
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
            clock.setHours(hours);
            clock.setMinutes(minutes);
        }
    }



}

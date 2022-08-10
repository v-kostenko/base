package oop.clockMechanism;

import javax.security.auth.login.AccountLockedException;
import java.util.Random;

public class Clock {
    private int hours;
    private int minutes;
    private Display display;
    private Mechanism mechanism;
    private Battery battery;

    public Clock(){
        Random random = new Random();
        this.hours = random.nextInt(24);
        this.minutes = random.nextInt(60);
        display = new Display();
        mechanism = new Mechanism();
        battery = new Battery();
        mechanism.connectBattery(battery);
        mechanism.connectClock(this);
        mechanism.start(hours, minutes);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        display.showTime(hours, minutes);
    }



}

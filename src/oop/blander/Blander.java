package oop.blander;

public class Blander {
    private Cup cup;
    private boolean isOnOff;
    private double sizeBlander;
    private int currentSpeed;
    private int maxSpeed = 3;

    public Blander(double sizeBlander) {
        this.sizeBlander = sizeBlander;
        this.cup = new Cup(sizeBlander, 1);
        System.out.println(cup.getSize());
    }

    public void turnOnOFF() {
        if (!isOnOff) {
            isOnOff = true;
            System.out.println("Blander is turned On");
        } else {
            isOnOff = false;
            System.out.println("Blander is turned OFF");

        }
    }

    public void increaseSpeed() {
        if (!isOnOff || cup == null) {
            System.out.println("Blander is OFF or cup is null");
            return;
        }
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        }
        System.out.println("Current speed is " + currentSpeed);
    }

    public void decreaseSpeed() {
        if (!isOnOff || cup == null) {
            return;
        }
        if (currentSpeed > 0) {
            currentSpeed--;
        }
        System.out.println("Current speed is " + currentSpeed);
    }

    public Cup takeCup() {
        Cup bofCup;
        if (currentSpeed > 0 || this.cup == null) {
            System.out.println("Unavaliable because blander is working");
            return null;
        }
        System.out.println("Cup was taken");
        bofCup = cup;
        this.cup = null;
        return bofCup;
    }

    public void setCup(Cup cup) {
        if (this.cup != null || currentSpeed > 0 || cup.getSize() != sizeBlander) {
            System.out.println("Cup" + cup + "was not set");
            return;
        }
        this.cup = cup;
        System.out.println("Cup was set");
    }

}



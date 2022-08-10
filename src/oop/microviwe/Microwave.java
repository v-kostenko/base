package oop.microviwe;

import java.util.Scanner;

public class Microwave {
    private int time = 90;
    private int powerMin;
    private int powerMax;
    private int currentPower;
    private boolean isOnOff;
    private boolean isOpen;
    private String mode = "Cup";

    private Scanner scanner = new Scanner(System.in);

    public Microwave(int powerMin, int powerMax) {
        this.powerMin = powerMin;
        this.powerMax = powerMax;
        currentPower = (int) (powerMax * 0.75);
        menu();
    }

    private void menu() {
        for (;;){
            System.out.println("Menu: \n1 - On / Off \n2 - doorCloseOpen / close \n3 - setPower " +
                    "\n4 - setTime \n5 - changeMode \n6 - Start \n7 - Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> turnOnOff();
                case 2 -> doorCloseOpen();
                case 3 -> setCurrentPower();
                case 4 -> setTime();
                case 5 -> changeMode();
                case 6 -> start();
                case 7 -> System.exit(0); //Остановка виртуальной машины
            }
        }
    }

    private void turnOnOff() {
        //isOn = !isOn;
        System.out.println((isOnOff = !isOnOff) ? "Mode " + mode + " currentPower " + currentPower + " minutes " + time / 60 + ":" + " seconds " + time % 60 : "");
    }

    private void doorCloseOpen() {
        isOpen = (isOpen == true) ? false : true;
    }

    private void setCurrentPower() {
        if (isOnOff == false) {
            return;
        }
        if (!mode.equals("Manual")) {
            return;
        }

        System.out.println("Enter power");
        int power = scanner.nextInt();

        if (power >= powerMin && power <= powerMax) {
            this.currentPower = currentPower;
            System.out.println("Current power " + currentPower);
        }
    }

    private void setTime() {
        if (isOnOff == false) {
            return;
        }
        if (!mode.equals("Manual")) {
            return;
        }
        System.out.println("Enter minutes ");
        int minutes = scanner.nextInt();
        System.out.println("Enter minutes ");
        int seconds = scanner.nextInt();

        if (minutes <= 59 && minutes >= 0 && seconds >= 0 && seconds <= 59) {
            time = minutes * 60 + seconds;
            System.out.println("time is " + minutes + seconds);
        }

    }

    private void changeMode() {
        if (isOnOff == false) {
            return;
        }
        System.out.println("Enter mode");
        String mode = scanner.next();

        if (mode.equals("Cup")) {
            currentPower = (int) (powerMax * 0.75);
            time = 90;
        }
        if (mode.equals("Plate")) {
            currentPower = powerMax;
            time = 120;
        }
        if (mode.equals("Manual")) {
            currentPower = powerMin;
            time = 0;
        }
        //System.out.println("Current mode is " + mode + );

    }

    private void start() {
        if (!isOnOff || isOpen) {
            return;
        }

        System.out.println("Current mode " + mode + "Power " + currentPower + "Time " + time);

        while (time >= 0)
            System.out.println(time / 60 + ":" + time-- % 60);

    }


}

package oop.clock;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Clock {
    private int hours;
    private int minutes;
    private int charge;

    public Clock() {
        Random random = new Random();
        hours = random.nextInt(24);
        minutes = random.nextInt(60);
        charge = random.nextInt(101);
        start();
    }

    private void start() {
        int counters = 0;
//        System.out.println("Charge is " + charge);
//        System.out.println("hours " + hours + " | " + "minutes " + minutes);

        while (charge > 0) {
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                counters++;
                if (hours == 24) {
                    hours = 0;
                }
                if (counters == 3) {
                    charge--;
                    counters = 0;
                }
            }

//            if (hours < 10) {
//                System.out.print("0" + hours + ":");
//                if (minutes < 10) {
//                    System.out.println("0" + minutes);
//                } else {
//                    System.out.println(minutes);
//                }
//            } else {
//                System.out.print(hours + ":");
//                if (minutes < 10) {
//                    System.out.println("0" + minutes);
//                } else {
//                    System.out.println(minutes);
//                }
//            }

            System.out.println((hours < 10 ? "0" + hours + ":" : hours + ":") +
                    (minutes < 10 ? "0" + minutes : minutes));


        }


    }

    public void changeBattary(){
        Random random = new Random();
        charge = random.nextInt(101);
        start();
    }


}

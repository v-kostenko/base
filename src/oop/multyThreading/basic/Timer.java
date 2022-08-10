package oop.multyThreading.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer implements Runnable{

    @Override
    public void run(){
        SimpleDateFormat date = new SimpleDateFormat("HH-MM-SS");

        for (int i = 0; i < 5; i++) {
            System.out.println(date.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

}

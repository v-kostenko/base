package oop.computer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Computer {
    private Disc disc;
    private ArrayList<Memory> memoryArray = new ArrayList<>();
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer(){
        disc = new Disc();
        for (int i = 0; i < 4; i++) {
            memoryArray.add(new Memory(10));
        }
    }

    public void connectMonitor(Monitor m){
        this.monitor = m;
    }

    public void connectKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    public void turnOnComputer(){
        if (monitor == null || monitor.check() == false){
            System.out.println("Monitor is null OR false");
            return;
        }

        if (disc.check() == false){
            monitor.showInfo("Disk is not OK");
            return;
        }

        monitor.showInfo("Disk is OK");

        int counter = 0;
        for (int i = 0; i < memoryArray.size(); i++) {
            if(!memoryArray.get(i).check()) {
                counter++;
            }
            monitor.showInfo("Memory " + i + " is " +
                    (!memoryArray.get(i).check() ? "Memory isn't working" : " Memory is working"));
        }

        if (counter >= 2){
            monitor.showInfo("Memory can not be loaded");
            return;
        }

        if(!keyboard.check()){
            monitor.showInfo("Keyboard is not present");
        } else {
            monitor.showInfo("Keyboard is present");
        }

        monitor.showInfo("... Windows loading...");

    }






}

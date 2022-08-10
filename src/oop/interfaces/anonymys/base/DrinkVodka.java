package oop.interfaces.anonymys.base;

import oop.interfaces.anonymys.base.Action;

public class DrinkVodka implements Action {

    @Override
    public void execute(){
        System.out.println("I am drinking vodka");
    }
}

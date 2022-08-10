package oop.interfaces.anonymys.base;

import oop.interfaces.anonymys.base.Action;

public abstract class Walking implements Action {

    @Override
    public void execute(){
        System.out.println("I am walking");
    }
}

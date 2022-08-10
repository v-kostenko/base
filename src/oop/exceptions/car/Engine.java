package oop.exceptions.car;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private boolean isWork;
    private int result;
    private int turnOvers;
    private int maxTurnOvers = 2000;
    private boolean isOnOff;
    private Random random = new Random();

    public Engine(){
        result = random.nextInt(101);
    }

    public void startEngine() throws EngineException{
        if (result <= 10){
            throw new EngineException("Engine possibility of working < 10%");
        }
        turnOvers = 400;
        isOnOff = true;
    }

    public void increaseTurnOvers(int turnOvers){
        if (isOnOff){
           this.turnOvers = (this.turnOvers + turnOvers <= maxTurnOvers) ? this.maxTurnOvers + turnOvers : maxTurnOvers;
        }
    }

    public void decreaseTurnOvers(int turnOvers){
        if (isOnOff){
            this.turnOvers = (this.turnOvers - turnOvers >= 0) ? this.turnOvers - turnOvers : 0;
            isOnOff = false;
        }
    }

    public int getTurnOvers(){
        return turnOvers;
    }

    public String toString(){
        return "TurnOvers = " + turnOvers;
    }






}

package oop.interfaces.base;

import java.util.ArrayList;

public class Gym {
    private ArrayList<Sportsman> sportsmen = new ArrayList<>();

    public void addSportsman(Sportsman sportsman){
        sportsmen.add(sportsman);
    }

    public void warmSportsmen(){
        for (int i = 0; i < sportsmen.size(); i++) {
            sportsmen.get(i).warmUp();
        }
    }

    public void trainSportsmen(){
        for (int i = 0; i < sportsmen.size(); i++) {
            sportsmen.get(i).train();
        }
    }

}

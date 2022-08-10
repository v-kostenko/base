package oop.interfaces.base;

import java.util.ArrayList;

public interface Musician {
    String INSTRUMENT1 = "Guitar";
    String INSTRUMENT2 = "Piano";

    void playMusic();

    default void repetition(){
        System.out.println("Default method repetition()");
    }

    static Musician veryNosy(ArrayList<Musician> musicians){
        return musicians.get(0);
    }
}

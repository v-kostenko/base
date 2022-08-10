package oop.interfaces.base;

public interface Sportsman {
    String SPORT1 = "Football";
    String SPORT2 = "Tennis";
    String SPORT3 = "Hockey";

    void train();

    default void warmUp(){
        System.out.println("Sportsman is warming up");
    }

    static void compare(Sportsman sportsman1, Sportsman sportsman2){
        System.out.println("Lohica is not implemented");
    }
}

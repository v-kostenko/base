package oop.blander;

public class Main {
    public static void main(String[] args) {
        Blander blander = new Blander(5.5);
        blander.turnOnOFF();
        blander.increaseSpeed();
        blander.decreaseSpeed();
        Cup cup = blander.takeCup();

        System.out.println(cup);
        blander.setCup(cup);

        blander.takeCup();
        Cup cup1 = new Cup(5.5, 2);
        blander.setCup(cup1);
        System.out.println(cup1);
    }
}

package oop.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();

        computer.connectMonitor(monitor);
        computer.connectKeyboard(keyboard);
        computer.turnOnComputer();
    }
}


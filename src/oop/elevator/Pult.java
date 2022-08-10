package oop.elevator;

import java.util.Scanner;

public class Pult {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller;

    public void connectController(Controller controller){
        this.controller = controller;
        pressButton();
    }

    private void pressButton(){
        while (true) {
            System.out.println("Enter floor");
            int floor = scanner.nextInt();
            controller.checkFloor(floor);
        }
    }

}

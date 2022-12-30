package oop.compositObjects.ballBox;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(30, "Red");

        Box box = new Box(10);
        Ball ourBall = box.pressButton();
        System.out.println(ourBall);

        box.putBall(ourBall);
        box.closeDoor();

        Ball ball2 = box.pressButton();
        System.out.println(ball2);









    }
}

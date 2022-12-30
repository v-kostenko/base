package oop.compositObjects.ballBox;

import oop.compositObjects.ballBox.Ball;

public class Box {
    private int size;
    private boolean isDoorOpen;
    private Ball ball; //= new Ball(size, "Green");

    public Box(int size) {
        this.size = size;
        ball = new Ball(size, "Green");
    }

    public Ball pressButton() {
        if (ball != null && !isDoorOpen) {
            Ball temp = ball;
            ball = null;
            isDoorOpen = true;
            return temp;
        }
        return null;
    }

    public void putBall(Ball ball) {
        if (this.ball == null && isDoorOpen && this.size == ball.getDiametr()) {
            System.out.println("The ball inside");
            this.ball = ball;
        } else {
            System.out.println("Ball was not put");
        }

    }

    public void closeDoor() {
        if (isDoorOpen == true) {
            isDoorOpen = false;
            System.out.println("Door is closed");
        } else {
            System.out.println("************");
        }
    }


}

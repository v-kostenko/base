package oop.compositObjects.ballBox;

public class Ball {
    private int diametr;
    public String color;

    public Ball(int diametr, String color){
        this.diametr = diametr;
        this.color = color;
    }

    public int getDiametr(){
        return diametr;
    }

}

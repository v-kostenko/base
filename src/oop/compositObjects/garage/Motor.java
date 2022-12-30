package oop.compositObjects.garage;

public class Motor {
    private Rollete rollete;
    private int direction; // if 0 = forward \ if 1 = back

    public int getDirection(){
        return direction;
    }

    public void connectRollete(Rollete rollete){
        this.rollete = rollete;
    }

    private int forward(){
        System.out.println("Мотор вращается вперед");
        rollete.openCloseGate();
        return direction = 1;
    }

    private int back(){
        System.out.println("Мотор вращается назад");
        rollete.openCloseGate();
        return direction = 0;
    }

    public void rotateMotor(){
         direction = (getDirection() == 0) ? forward() : back();
    }


}

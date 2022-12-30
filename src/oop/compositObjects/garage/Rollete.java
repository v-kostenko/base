package oop.compositObjects.garage;

public class Rollete {
    private boolean isOpen;

    public void openCloseGate(){
        System.out.println((isOpen = !isOpen) ?  "Двери открылись" : "Двери звкрылись");
    }





}

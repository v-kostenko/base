package oop.compositObjects.phone;

public class Phone {
    private Display display;
    private Accumulator accumulator;
    private SimCart[] simCarts;
    private int isOn; // 0 = off , 1 = 0n


    public void turnOnOffPhone(){
        if (isOn == 1){
            isOn=0;
            display.showInfo("Phone was turned off");
        } else{
            isOn = 1;
            display.showInfo("Phone was turned on");
        }
    }

    public void setSim(SimCart simCart, int slot){
        if (simCarts.length < slot && simCarts.length > 0){
            simCarts[slot] = simCart;
            if (isOn == 1){
                display.showInfo("Sim carta " + simCart + " was set");
            }
        }
    }

    public void topUpBalance(int money, int slot){
        if (isOn ==1 && simCarts.length < slot && simCarts.length > 0 && simCarts[slot] != null){

        }
    }



}

package oop.interfaces.base;

public class Barber extends Person implements Musician{
    private String barberShop;
    private String instrument;

    public Barber(int personId, String address, String humanName, String barberShop, String instrument){
        super(personId, address, humanName);
        this.barberShop = barberShop;
        this.instrument = instrument;
    }

    public void cutHair(){
        System.out.println("Barber is cutting hair...");
    }

    public void playMusic(){
        System.out.println(humanName + " Barber is playing music " + instrument);
    }
}

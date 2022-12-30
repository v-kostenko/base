package oop.multyThreading.synchro.wait_notify.carFactory;

public class Car {
    private String brand;
    private int serNumber;

    public Car(String brand, int serNumber){
        this.brand = brand;
        this.serNumber = serNumber;
    }

    public String getBrand(){
        return brand;
    }

    public int getSerNumber(){
        return serNumber;
    }

    public String toString(){
        return getClass().getSimpleName() + " / Brand " + brand + " / Ser. numb " + serNumber;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (! (object instanceof Car)){
            return false;
        }
        Car temp = (Car) object;
        return this.serNumber == temp.serNumber;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = hashCode * 7 + serNumber;
        return hashCode;
    }


}
